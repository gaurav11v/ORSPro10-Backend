package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_USAGE")
public class UsageDTO extends BaseDTO  {

	@Column(name = "USAGE_CODE", length = 50)
	private String usageCode;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "USAGE_TYPE", length = 50)
	private String usageType;
	
	@Column(name = "STATUS", length = 50)
	private String status;
	
	
	public String getUsageCode() {
		return usageCode;
	}
	public void setUsageCode(String usageCode) {
		this.usageCode = usageCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUsageType() {
		return usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
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
		return usageCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "usageCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return usageCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "usageCode";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("usageCode", "asc");
		
		return map;
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("usageCode", usageCode);
		return map;
	}

	
	
}
