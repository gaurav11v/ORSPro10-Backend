package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_THEME")
public class ThemeDTO extends BaseDTO{

	@Column(name = "THEME_CODE", length = 50)
	private String themeCode; 
	
	@Column(name = "THEME_NAME", length = 50)
	private String themeName;
	
	@Column(name = "COLOR", length = 50)
	private String color; 
	
	@Column(name = "STATUS", length = 50)
	private String status;
	
	
	public String getThemeCode() {
		return themeCode;
	}
	public void setThemeCode(String themeCode) {
		this.themeCode = themeCode;
	}
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
		return color;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "color";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return color;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "color";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("color", "asc");
		
		return map;
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("color", color);
		return map;
		} 
	
	
}
