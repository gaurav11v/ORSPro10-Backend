package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PasswordReset")
public class PasswordResetDTO extends BaseDTO {

	@Column(name = "reset_Code", length = 50)
	private String resetCode;
	
	@Column(name = "user_Name", length = 50)
	private String userName;
	
	@Column(name = "reset_Token", length = 50)
	private String resetToken;
	
	@Column(name = "STATUS", length = 50)
	private String status;
	
	
	public String getResetCode() {
		return resetCode;
	}
	public void setResetCode(String resetCode) {
		this.resetCode = resetCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getResetToken() {
		return resetToken;
	}
	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
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
		return resetCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "resetCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return resetCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "resetCode";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("resetCode", "asc");
		
		return map;
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("resetCode", resetCode);
		return map;
		} 
	}
	

