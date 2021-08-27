package inheritance;

public class Employee extends Person {
int id;
String jobtitle;
float salary,hra;

Employee(String name,int id,String jobtitle,float salary,String Dob){
	super(name,Dob); 
	this.name=name;
	this.id=id;
	this.jobtitle=jobtitle;
	this.salary=salary;
	this.Dob=Dob;
}

public void computehra() {
	hra=salary*0.40f;
}

public void showDetails() {
	showName();
	System.out.println("Name: "+name+" ID:"+id+" jobtitle: "+jobtitle+" salary:"+salary+" Date of birth: "+Dob+" 40%of salary: "+hra );
}
}
