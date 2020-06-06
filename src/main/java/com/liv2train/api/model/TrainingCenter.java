package com.liv2train.api.model;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.liv2train.api.converter.StringListConverter;

@Entity(name = "training_center")
public class TrainingCenter {
	
	@NotEmpty(message="Center name must not be empty")
	@Size(max = 40)
	private String centerName;
	@NotEmpty(message="Center code must not be empty")
	@Size(min=12,max=12,message = "Center code must be of size 12")
	@Id
	private String centerCode;
	@Embedded 
	@NotNull(message="Address must not be empty")
	private Address address;
	private Long studentCapacity;
	@Convert(converter = StringListConverter.class)
	private List<String> coursesOffered;
	private String createdOn;
	@Email
	private String contactEmail;
	@NotEmpty(message="Contact detail must not be empty")
	@Size(min=10,max=10)
	private String contactPhone;
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterCode() {
		return centerCode;
	}
	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Long getStudentCapacity() {
		return studentCapacity;
	}
	public void setStudentCapacity(Long studentCapacity) {
		this.studentCapacity = studentCapacity;
	}
	public List<String> getCoursesOffered() {
		return coursesOffered;
	}
	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	

}
