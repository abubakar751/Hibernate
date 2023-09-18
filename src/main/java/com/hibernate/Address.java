package com.hibernate;

import java.util.Date;

import javax.xml.crypto.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="address_details")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	@Column(unique =  true)
	private String name;
	
	private String cityName;
	private String stateName;
	///@Transient
	private boolean isOpen;
	@Temporal(TemporalType.DATE)
	private Date addeDate;
	@Lob
	byte [] image;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Date getAddeDate() {
		return addeDate;
	}
	public void setAddeDate(Date addeDate) {
		this.addeDate = addeDate;
	}
	
	public String toString() {
		return "Address [addressId=" + addressId + ", cityName=" + cityName + ", stateName=" + stateName + ", isOpen="
				+ isOpen + ", addeData=" + addeDate + "]";
	}
	
	
	
	
	
}
