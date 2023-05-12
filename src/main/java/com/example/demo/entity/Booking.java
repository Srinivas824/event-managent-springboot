package com.example.demo.entity;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	
	private int customerId;
	
	private int equipmentId;
	
	private Date bookingDate;
	
	
	@OneToOne(targetEntity = Customer.class)
	@JoinColumn(name = "customerId",insertable = false,updatable = false)
	private Customer customer;
	
	@OneToOne(targetEntity = Equipments.class)
	@JoinColumn(name = "equipmentId",insertable = false,updatable = false)
	private Equipments equipments;

	
	

	public Booking() {
			}




	public Booking(int bookingId, int customerId, int equipmentId, Date bookingDate, Customer customer,
			Equipments equipments) {
		super();
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.equipmentId = equipmentId;
		this.bookingDate = bookingDate;
		this.customer = customer;
		this.equipments = equipments;
	}




	public int getBookingId() {
		return bookingId;
	}




	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}




	public int getCustomerId() {
		return customerId;
	}




	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}




	public int getEquipmentId() {
		return equipmentId;
	}




	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}




	public Date getBookingDate() {
		return bookingDate;
	}




	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}




	public Customer getCustomer() {
		return customer;
	}




	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




	public Equipments getEquipments() {
		return equipments;
	}




	public void setEquipments(Equipments equipments) {
		this.equipments = equipments;
	}




	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerId=" + customerId + ", equipmentId=" + equipmentId
				+ ", bookingDate=" + bookingDate + ", customer=" + customer + ", equipments=" + equipments + "]";
	}



	
		

}
