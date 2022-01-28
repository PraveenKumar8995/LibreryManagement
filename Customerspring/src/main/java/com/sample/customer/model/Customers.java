package com.sample.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="customer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customers {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer cust_id;
	@NotBlank(message="name should not be blank")
	@Size (min=4,max=20,message="size is not valid")
	private String cust_name;
	//@Pattern (regexp="^[0-9]{10}")
	private String mobile_no;
	//@Pattern (regexp="^[0-9]{10}")
	private String alt_mobile_no;
	private String email_id;
	private String address1;
	private String address2;
	@NotBlank(message="city should mentioned")
	private String city;
	private String state;
	//@Pattern (regexp="^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$")
	private Integer pincode;
	
	
	public Customers() {
		super();
	}


	public Customers(Integer cust_id,
			@NotBlank(message = "name should not be blank") @Size(min = 4, max = 20, message = "size is not valid") String cust_name,
			String mobile_no, String alt_mobile_no, String email_id, String address1, String address2,
			@NotBlank(message = "city should mentioned") String city, String state,
			@Pattern(regexp = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$") Integer pincode) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.mobile_no = mobile_no;
		this.alt_mobile_no = alt_mobile_no;
		this.email_id = email_id;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public Integer getCust_id() {
		return cust_id;
	}


	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public String getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}


	public String getAlt_mobile_no() {
		return alt_mobile_no;
	}


	public void setAlt_mobile_no(String alt_mobile_no) {
		this.alt_mobile_no = alt_mobile_no;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Integer getPincode() {
		return pincode;
	}


	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Customers [cust_id=" + cust_id + ", cust_name=" + cust_name + ", mobile_no=" + mobile_no
				+ ", alt_mobile_no=" + alt_mobile_no + ", email_id=" + email_id + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	
	}


	
