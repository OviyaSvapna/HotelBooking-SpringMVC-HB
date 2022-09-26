package com.springproject.hotelbooking.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springproject.hotelbooking.entity.Room;


@Repository
public interface RoomDAO {
	
	public void saveRoom(Room room);
	public List<Room> getRooms();
	public void deleteRoom(int roomno);
	public List<Room> searchRooms(String roomType);
	public Room getRoom(int roomno);
	public Room bookRoom(int roomNo);
	public void updateRoom(String newdatefrom, String newdateto, String status, Integer id,int roomNo);
	public void cancelRoom(String status, Integer id, int roomNo);

}
