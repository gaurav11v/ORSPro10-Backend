package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_POLICY")
public class PolicyDTO extends BaseDTO {

	@Column(name = "POLICY_NAME", length = 50)
	private String policyName;
	
	@Column(name = "PREMIUM_AMOUNT")
	private Integer premiumAmount;
	
	@Column(name = "START_DATE")
	private Date startDate;
	
	
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public Integer getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(Integer premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return policyName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "policyName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return policyName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return policyName;
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("policyName", "asc");
		
		return map;

	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("policyName", policyName);
		return map;
	}
	
	
}
