package com.mallika.pojo;

public class UserInformation {
String city;
String state;
String country;
int zip;
public UserInformation(){
	
}
public UserInformation(String city, String state, String country, int zip) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
	this.zip = zip;
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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}

}
