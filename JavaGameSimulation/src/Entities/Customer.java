package Entities;

import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	private int customeerId;
	private String firstName;
	private String lastName;
	private Date birthOfDate;
	private String nationalityId;

	public Customer(int customeerId, String firstName, String lastName, Date birthOfDate, String nationalityId) {
		this.customeerId = customeerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.nationalityId = nationalityId;
	}

	public int getCustomeerId() {
		return customeerId;
	}

	public void setCustomeerId(int customeerId) {
		this.customeerId = customeerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
