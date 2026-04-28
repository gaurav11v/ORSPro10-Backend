package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_AGREEMENT")
public class AgreementDTO extends BaseDTO{

	@Column(name = "PARTY_NAME", length = 50)
	private String partyName;
	
	@Column(name = "SIGNED_DATE")
	private Date signedDate;
	
	@Column(name = "TERMS", length = 50)
	private String terms;
	
	
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public Date getSignedDate() {
		return signedDate;
	}
	public void setSignedDate(Date signedDate) {
		this.signedDate = signedDate;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return partyName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "partyName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return partyName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "partyName";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("partyName", "asc");
		
		return map;
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("partyName", partyName);
		return map;
	}
	
	
}
