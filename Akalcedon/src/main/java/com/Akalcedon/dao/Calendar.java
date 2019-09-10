package com.Akalcedon.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class Calendar implements Serializable{
	
	@Id @GeneratedValue
	private Long id;
	private Date startDate;
	private Date endDate;
	private String description;
	private String colorf;
	private String colorb;
	
	
	
	
	
	public Calendar(Date startDate, Date endDate, String description, String colorf, String colorb) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.colorf = colorf;
		this.colorb = colorb;
	}
	public Calendar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getColorf() {
		return colorf;
	}
	public void setColorf(String colorf) {
		this.colorf = colorf;
	}
	public String getColorb() {
		return colorb;
	}
	public void setColorb(String colorb) {
		this.colorb = colorb;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
