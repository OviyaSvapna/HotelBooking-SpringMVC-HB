package com.springproject.hotelbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hb_Room")
public class Room 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "Beds")
	private int beds;
	
	@Column(name = "no_person")
	private int noOfPerson;
	
	@Column(name = "room_fare")
	private float roomFare;
	
	@Column(name = "room_type")
	private String roomType;
	
	@Column(name = "room_no")
	private int roomNo;

	@Column(name = "status")
	private String status;
	
	@Column(name = "Fromdate")
	private String fromDate;
	
	@Column(name = "Todate")
	private String toDate;
	
	@Column(name = "userid")
	private Integer userid;
	
	public Room(){
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getNoOfPerson() {
		return noOfPerson;
	}

	public void setNoOfPerson(int noOfPerson) {
		this.noOfPerson = noOfPerson;
	}

	public float getRoomFare() {
		return roomFare;
	}

	public void setRoomFare(float roomFare) {
		this.roomFare = roomFare;
	}

	public int getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", beds=" + beds + ", noOfPerson=" + noOfPerson + ", roomFare=" + roomFare
				+ ", roomType=" + roomType + ", roomNo=" + roomNo + ", status=" + status + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", userid=" + userid + "]";
	}


}
