package inheritance;

public class Person {
  String name;
  String Dob;
  
  Person(String name,String Dob){
	 this.name=name;
	 this.name=Dob;
  }
  public void showName() {
	  System.out.println("showname() in person class "+this.name);
  }
	
}
