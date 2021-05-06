package Ders4Odev3.entities;

import java.time.LocalDate;

import Ders4Odev3.abstracts.Entity;

public class Gamer implements Entity {

	private int id;
	private String firstName;
	private String LastName;
	private LocalDate DateOfBirth;
	private String NationalityId;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
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
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
}
