package com.mycom.collections.sortreverse.list;

public class User implements Comparable<User>{
	
	private String name;
	private String mobileNumber;
	private String city;
	
	

	public User(String name, String user, String city) {
		super();
		this.name = name;
		this.mobileNumber = user;
		this.city = city;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public int compareTo(User user) {
		//String city="some city name"
		// return(user.city.compareTo)(this.city));
		return (this.name.compareTo(user.name));
		// return (user.city.compareTo(city));
	}
	
	public String toString() {
		return String.format("%-30s%-30s%-30s", getName(),getMobileNumber(),getCity());
		
	}

}
