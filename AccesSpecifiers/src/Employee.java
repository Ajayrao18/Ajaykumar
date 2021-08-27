
public class Employee {
int id;
String name;
float salary,hra;
//static-belongs to the class not for objects
static final String COMPANY_NAME="Tata group";
public Employee(int id, String name, float salary, float hra) {
	//super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.hra = hra;
	//companyname="Tata group";
}

public void computehra() {
	hra=salary*0.35f;
}

public static void showcompanyname() {
	System.out.println("company name "+COMPANY_NAME);
}

}
