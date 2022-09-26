package com.springproject.hotelbooking.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springproject.hotelbooking.entity.Room;


@Repository
public class RoomDAOImpl implements RoomDAO 
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveRoom(Room room) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(room);
	}

	@Override
	public List<Room> getRooms() {
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Room> query=currentSession.createQuery("from Room",Room.class);
		List<Room> rooms=query.getResultList();
		System.out.println(rooms);
		return rooms;
	}

	@Override
	public void deleteRoom(int roomno) {
		Session currentSession=sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Room where roomNo=:roomNo");
		theQuery.setParameter("roomNo",roomno);
		theQuery.executeUpdate();	
		
	}

	@Override
	public List<Room> searchRooms(String roomType) {
		  Session currentSession = sessionFactory.getCurrentSession();
	        
	        Query theQuery = null;
	        if (roomType != null && roomType.trim().length() > 0) {
	            theQuery =currentSession.createQuery("from Room where lower(roomType) like :theName or lower(beds) like :theName", Room.class);
	            theQuery.setParameter("theName", "%" + roomType.toLowerCase() + "%");
	        }
	        else {
	            theQuery =currentSession.createQuery("from Room", Room.class);            
	        }
	        
	        List<Room> rooms = theQuery.getResultList();
 
	        return rooms;
	}

	@Override
	public Room getRoom(int roomno) {
		
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Room> theQuery = currentSession.createQuery("from Room where roomNo=:roomno");
		theQuery.setParameter("roomno",roomno);
		List<Room> rooms = theQuery.getResultList();
		Room room = rooms.get(0);
		return room;
	}

	@Override
	public Room bookRoom(int roomNo) {
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Room> theQuery = currentSession.createQuery("from Room where roomNo=:roomNo");
		theQuery.setParameter("roomNo",roomNo);
		List<Room> rooms = theQuery.getResultList();
		Room room = rooms.get(0);
		return room;
	}

	@Override
	public void updateRoom(String newdatefrom, String newdateto, String status, Integer id,int roomNo) {
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Room> theQuery = currentSession.createQuery("from Room where roomNo=:roomNo");
		theQuery.setParameter("roomNo",roomNo);
		List<Room> rooms = theQuery.getResultList();
		Room room = rooms.get(0);
		room.setFromDate(newdatefrom);
		room.setToDate(newdateto);
		room.setStatus(status);
		room.setUserid(id);
		currentSession.saveOrUpdate(room);			
	}

	@Override
	public void cancelRoom(String status, Integer id, int roomNo) {
		
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Room> theQuery = currentSession.createQuery("from Room where roomNo=:roomNo");
		theQuery.setParameter("roomNo",roomNo);
		List<Room> rooms = theQuery.getResultList();
		Room room = rooms.get(0);
		room.setFromDate(null);
		room.setToDate(null);
		room.setStatus(status);
		room.setUserid(null);
		currentSession.saveOrUpdate(room);	
		
	}


}
