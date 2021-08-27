

package com.mycom.collections.set.removeduplicates;

public class Employee {
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//override hascode() and equals() methods to avoid adding duplicate objects
	
	public int hashCode() {
		//current objects id is hashcode  and returns to equals() method
		return this.id;
	}

	public boolean equals(Object obj) {
		Employee employee=(Employee) obj;//reference casting
		if(employee.getId()==this.id) {
			return true; //duplicate object is found -so need to create new object
		}else {
				return false; // unique object is created
			}
		
	}
}
