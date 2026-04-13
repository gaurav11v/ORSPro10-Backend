package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_VENUE")
public class VenueDTO extends BaseDTO {

	@Column(name = "VENUE_NAME", length = 50)
	private String venueName;
	
	@Column(name = "CITY", length = 50)
	private String city;
	
	@Column(name = "CAPACITY")
	private Integer capacity;
	
	
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	
	@Override
	public String getValue() {
		
		return city;
	}
	@Override
	public String getUniqueKey() {
		
		return "city";
	}
	
	@Override
	public String getUniqueValue() {
		
		return city;
	}
	@Override
	public String getLabel() {
		
		return "city";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("city", "asc");
		
		return map;
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("city", city);
		return map;
	}

	
}
