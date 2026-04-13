package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CERTIFICATETEMPLATE")
public class CertificateTemplateDTO extends BaseDTO{

	
	@Column(name = "TEMPLATE_NAME", length = 50)
	private String templateName;
	
	@Column(name = "FORMAT", length = 50)
	private String format;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	
	
	
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return templateName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "templateName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return templateName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "templateName";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("templateName", "asc");
		
		return map;	
		
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("templateName", templateName);
		return map;
	}
	
}
