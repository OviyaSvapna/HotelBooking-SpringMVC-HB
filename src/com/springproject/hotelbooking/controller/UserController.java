package com.springproject.hotelbooking.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springproject.hotelbooking.entity.Room;
import com.springproject.hotelbooking.entity.UserEntity;
import com.springproject.hotelbooking.service.RoomService;
import com.springproject.hotelbooking.service.UserService;

@Controller
public class UserController 
{

	@Autowired
	private UserService userService; 
	
	@Autowired
	private RoomService roomService; 
	
	Integer id;
	
	@RequestMapping("/home")
	public String homepage()
	{
//		User user=new User();
//		m.addAttribute(user);
		return "home-page";
	}
		
	@GetMapping("/registerForm")
	public String registerForm(Model m)
	{
		UserEntity userprofile=new UserEntity();
		m.addAttribute("userprofileobj",userprofile);
		return "registerForm";
	}
	
	@PostMapping("/register")
	public String saveUser(@ModelAttribute("user") UserEntity user)
	{
		userService.saveUser(user);
		return "redirect:/loginForm";	
	}
	
	
	@RequestMapping("/loginForm")
	public String loginForm(Model m)
	{
		User user=new User();
		m.addAttribute("userobj",user);
		return "loginForm";
	}
	
	@RequestMapping("/success")
	public String mainForm(@RequestParam("username")String username,Model model)
	{
		UserEntity userid=userService.getUserId(username);
		model.addAttribute("userid",userid);
		id=userid.getId();
		if(username.equals("oviya_svapna"))
			return "main-page";
		
		return "user-mainpage";
	}
	
	@RequestMapping("/addRoomForm")
	public String addRoomForm(@ModelAttribute("room") Room room)
	{
		
		return "addRoomForm";
	}
	
	
	@PostMapping("/addroom")
	public String saveRoom(@ModelAttribute("room") Room room)
	{
		roomService.saveRoom(room);
		return "main-page";	
	}
	
	@GetMapping("/list")
	public String listRoom(Model model)
	{
		List<Room> rooms=roomService.getRooms();
		model.addAttribute("rooms",rooms);
		return "viewroom";
	}
	
	@GetMapping("/delete")
	public String deleteRoom(@RequestParam("roomNo") int roomNo)
	{
		roomService.deleteRoom(roomNo);
		return "redirect:/list";
	}
	
	@GetMapping("/showUpdateForm")
	public String updateRoomForm(@RequestParam("roomNo") int roomNo, Model model)
	{
		Room roomupdate=roomService.getRoom(roomNo);
		model.addAttribute("roomupdate",roomupdate);
		return "updateForm";
	}
	
	@GetMapping("/search")
    public String searchRoom(@RequestParam("roomType") String roomType,
                                    Model theModel) {
        List<Room> rooms= roomService.searchRooms(roomType);
        theModel.addAttribute("rooms", rooms);
        return "viewroom";        
    }
	
	@GetMapping("/searchroom")
    public String searchRooms(@RequestParam("roomType") String roomType,
                                    Model theModel) {
        List<Room> rooms= roomService.searchRooms(roomType);
        theModel.addAttribute("rooms", rooms);
        return "bookRoom";        
    }
	
	@GetMapping("/bookroom")
    public String bookRoom(Model model) {
		List<Room> rooms=roomService.getRooms();
		model.addAttribute("rooms",rooms);
        return "bookRoom";        
    }	

		
	@GetMapping("/checkdate")
	public String  checkDate(@RequestParam("roomNo") int roomNo,Model model) {
		Room bookroom=roomService.getRoom(roomNo);
		model.addAttribute("bookroom",bookroom);
		String status=bookroom.getStatus();
		
		if(status.equals("available"))
		{
			return "dateform";
		}
		
		return "availability";
		
	}
	

	@RequestMapping("/roombooking")
	public String  roomBooking(@RequestParam("roomNo") int roomNo,@RequestParam("fromDate") String newdatefrom,@RequestParam("toDate") String newdateto,Model model) throws ParseException 
	{
		Room booked=roomService.getRoom(roomNo);
		model.addAttribute("booked",booked);
		String status="occupied";		 
		roomService.updateRoom(newdatefrom,newdateto,status,id,roomNo);
	    return "confirmbooking";
	}
	
	@GetMapping("/cancel")
	public String cancelBooking(@RequestParam("roomNo") int roomNo,Model model)
	{
		Room cancel=roomService.getRoom(roomNo);
		model.addAttribute("cancel",cancel);
		String status="available";
		roomService.cancelRoom(status,id,roomNo);
		return "cancelmsg";
	}
	
	
	
}
