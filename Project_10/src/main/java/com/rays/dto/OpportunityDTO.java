package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_OPPORTUNITY")
public class OpportunityDTO extends BaseDTO {
	
	@Column(name = "OPPORTUNITY_CODE", length = 50)
	private String opportunityCode;
	
	@Column(name = "CLIENT_NAME", length = 50)
	private String clientName;
	
	@Column(name = "AMOUNT")
	private Integer amount;
	
	@Column(name = "STATUS", length = 50)
	private String status;
	
	
	public String getOpportunityCode() {
		return opportunityCode;
	}
	public void setOpportunityCode(String opportunityCode) {
		this.opportunityCode = opportunityCode;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
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
		return opportunityCode;
	}
	@Override
	public String getUniqueKey() {
		return "opportunityCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return opportunityCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "opportunityCode";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("opportunityCode", "asc");
		
		return map;
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("opportunityCode", opportunityCode);
		return map;
	}


}
