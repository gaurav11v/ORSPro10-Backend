package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PARKING")
public class ParkingDTO extends BaseDTO{
	
@Column(name = "LOCATION", length = 50)
private String location;

@Column(name = "CAPACITY")
private Integer capacity;

@Column(name = "FEE")
private Double fee;


public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Integer getCapacity() {
	return capacity;
}
public void setCapacity(Integer capacity) {
	this.capacity = capacity;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}
@Override
public String getValue() {
	// TODO Auto-generated method stub
	return location;
}
@Override
public String getUniqueKey() {
	// TODO Auto-generated method stub
	return "location";
}


@Override
public String getUniqueValue() {
	// TODO Auto-generated method stub
	return location;
}
@Override
public String getLabel() {
	// TODO Auto-generated method stub
	return "location";
}
@Override
public LinkedHashMap<String, String> orderBY() {
	LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
	map.put("location", "asc");
	
	return map;	
}
@Override
public LinkedHashMap<String, Object> uniqueKeys() {
	LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
	map.put("location", location);
	return map;
}




}
