package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_BROADCAST")
public class BroadcastDTO extends BaseDTO {
	
    @Column(name = "BROADCAST_CODE", length = 50)
	private String broadcastCode;
    
    @Column(name = "MESSAGE", length = 50)
	private String message;
    
    @Column(name = "SENTBY", length = 50)
	private String sentBy;
    
    @Column(name = "STATUS", length = 50)
	private String status;
	
	
	public String getBroadcastCode() {
		return broadcastCode;
	}
	public void setBroadcastCode(String broadcastCode) {
		this.broadcastCode = broadcastCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSentBy() {
		return sentBy;
	}
	public void setSentBy(String sentBy) {
		this.sentBy = sentBy;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return broadcastCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "broadcastCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return broadcastCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "broadcastCode";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("broadcastCode", "asc");
		
		return map;	

	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("broadcastCode", broadcastCode);
		return map;
	}
	
	
	
}
