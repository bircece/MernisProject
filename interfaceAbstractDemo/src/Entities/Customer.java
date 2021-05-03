package Entities;

import Abstract.Entity;
//nesnelerimizi bir interfaceden implemente etmezsek iþerde zaafiyet yaþarýz.

public class Customer implements Entity {

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private int yearsOfBirth;
	
	private String nationaltyId;

	public Customer(int id, String firstName, String lastName, int yearsOfBirth, String nationaltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearsOfBirth = yearsOfBirth;
		this.nationaltyId = nationaltyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getYearsOfBirth() {
		return yearsOfBirth;
	}

	public void setYearsOfBirth(int yearsOfBirth) {
		this.yearsOfBirth = yearsOfBirth;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
	
}
