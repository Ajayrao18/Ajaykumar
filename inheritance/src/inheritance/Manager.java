package inheritance;

public class Manager extends Employee {
int teamSize;

 Manager(String name,int id,String jobtitle,float salary,String Dob,int teamSize){
	super(name,id,jobtitle,salary,Dob);
	this.teamSize=teamSize;
 }
 
 public void computehra() { //method overriding- using super class method signature and changing business logic.
		hra=salary*0.45f;
	}
 
 public void showTeamSize() {
	 System.out.println("Manager handles:"+teamSize+"employees");
 }
	
}
