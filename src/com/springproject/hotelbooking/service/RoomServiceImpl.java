package com.springproject.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.hotelbooking.dao.RoomDAO;
import com.springproject.hotelbooking.entity.Room;

@Service
public class RoomServiceImpl implements RoomService {
	
	
	@Autowired
	private  RoomDAO roomsDAO;
	
	@Override
	@Transactional
	public void saveRoom(Room room) {
		roomsDAO.saveRoom(room);
		
	}

	@Override
	@Transactional
	public List<Room> getRooms() {
		return roomsDAO.getRooms();
	}

	@Override
	@Transactional
	public void deleteRoom(int roomno) {
		 roomsDAO.deleteRoom(roomno);
		
	}

	@Override
	@Transactional
	public List<Room> searchRooms(String roomType) {
		   return roomsDAO.searchRooms(roomType);
	}

	@Override
	@Transactional
	public Room getRoom(int roomno) {
		return roomsDAO.getRoom(roomno);
	}

	@Override
	@Transactional
	public Room bookRoom(int roomNo) {
		return roomsDAO.bookRoom(roomNo);
	}

	@Override
	@Transactional
	public void updateRoom(String newdatefrom, String newdateto, String status, Integer id,int roomNo) {
		roomsDAO.updateRoom(newdatefrom,newdateto,status,id,roomNo);
		
	}

	@Override
	@Transactional
	public void cancelRoom(String status, Integer id, int roomNo) {
		roomsDAO.cancelRoom(status,id,roomNo);
	}





}
