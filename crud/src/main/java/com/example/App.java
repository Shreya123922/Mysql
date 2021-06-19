package com.example;

public class App {

	int PersonID;
	String FirstName;
	String City;
	public App(int personID, String firstName, String city) {
		super();
		PersonID = personID;
		FirstName = firstName;
		City = city;
	}
	public int getPersonID() {
		return PersonID;
	}
	public void setPersonID(int personID) {
		PersonID = personID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "App [PersonID=" + PersonID + ", FirstName=" + FirstName + ", City=" + City + "]";
	}
	
}
