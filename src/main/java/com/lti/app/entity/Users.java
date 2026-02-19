package com.lti.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "users")
public class Users {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "seq_user", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
	private int userid;
	private String email;
	private String password;
	private String city;
	private String state;
	private long mobile_number;
	private String college;
	private String fullname;
	@JsonFormat(pattern = "dd-MM-yyyy", shape = Shape.STRING)
	@Column(name = "Date_of_birth")
	private String dob;
	private int yearofcompletion;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userid, String email, String password, String city, String state, long mobile_number,
			String college, String fullname, String dob, int yearofcompletion) {
		super();
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.city = city;
		this.state = state;
		this.mobile_number = mobile_number;
		this.college = college;
		this.fullname = fullname;
		this.dob = dob;
		this.yearofcompletion = yearofcompletion;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getYearofcompletion() {
		return yearofcompletion;
	}

	public void setYearofcompletion(int yearofcompletion) {
		this.yearofcompletion = yearofcompletion;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", email=" + email + ", password=" + password + ", city=" + city + ", state="
				+ state + ", mobile_number=" + mobile_number + ", college=" + college + ", fullname=" + fullname
				+ ", dob=" + dob + ", yearofcompletion=" + yearofcompletion + "]";
	}

}
