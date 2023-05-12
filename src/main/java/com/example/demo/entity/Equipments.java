package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipments")
public class Equipments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int equipmentId;
	@Column(length=50)
	private String equipmentName;
	@Column(length=50)
	private String ownerName;
	@Column(length=50)
	private String ownerMail;
	@Column(length=50)
	private long ownerNumber;
	@Column(length=20)
	private double cost;
	@Column(length=50)
	private String equipmentType;
	private int quantity;
	@Column(length=50)
	private String eventLocation;
	@Column(length=50)
	private String eventImage;
	
	private String eventImage1;

	private String eventImage2;
	@Column(length=50)
	private String review;
	
	private String descrption;
	
	//	@Column(name="customerId")
	//	private int customerId;




	//	@ManyToOne(targetEntity =Customer.class,fetch = FetchType.EAGER )
	//	@JoinColumn(name ="customerId",insertable = false,updatable = false)
	//	private Customer customer;
	public Equipments() {

	}

	public Equipments(int equipmentId, String equipmentName, String ownerName, String ownerMail, long ownerNumber,
			double cost, String equipmentType, int quantity, String eventLocation, String eventImage,
			String eventImage1, String eventImage2, String review, String descrption) {
		super();
		this.equipmentId = equipmentId;
		this.equipmentName = equipmentName;
		this.ownerName = ownerName;
		this.ownerMail = ownerMail;
		this.ownerNumber = ownerNumber;
		this.cost = cost;
		this.equipmentType = equipmentType;
		this.quantity = quantity;
		this.eventLocation = eventLocation;
		this.eventImage = eventImage;
		this.eventImage1 = eventImage1;
		this.eventImage2 = eventImage2;
		this.review = review;
		this.descrption = descrption;
	}

	public int getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerMail() {
		return ownerMail;
	}

	public void setOwnerMail(String ownerMail) {
		this.ownerMail = ownerMail;
	}

	public long getOwnerNumber() {
		return ownerNumber;
	}

	public void setOwnerNumber(long ownerNumber) {
		this.ownerNumber = ownerNumber;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getEventImage() {
		return eventImage;
	}

	public void setEventImage(String eventImage) {
		this.eventImage = eventImage;
	}

	public String getEventImage1() {
		return eventImage1;
	}

	public void setEventImage1(String eventImage1) {
		this.eventImage1 = eventImage1;
	}

	public String getEventImage2() {
		return eventImage2;
	}

	public void setEventImage2(String eventImage2) {
		this.eventImage2 = eventImage2;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	@Override
	public String toString() {
		return "Equipments [equipmentId=" + equipmentId + ", equipmentName=" + equipmentName + ", ownerName="
				+ ownerName + ", ownerMail=" + ownerMail + ", ownerNumber=" + ownerNumber + ", cost=" + cost
				+ ", equipmentType=" + equipmentType + ", quantity=" + quantity + ", eventLocation=" + eventLocation
				+ ", eventImage=" + eventImage + ", eventImage1=" + eventImage1 + ", eventImage2=" + eventImage2
				+ ", review=" + review + ", descrption=" + descrption + "]";
	}
	


	

}
