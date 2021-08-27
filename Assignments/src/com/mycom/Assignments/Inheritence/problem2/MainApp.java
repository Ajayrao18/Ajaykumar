package com.mycom.Assignments.Inheritence.problem2;

public class MainApp {

	public static void main(String[] args) {
		
		Employee emp=new Employee("Varun kumar", 22, 830912551, "Gachibowli,Hyderabad", 25000, "Tester", "Test-team");
		
		emp.showEmployeeDetails();
		
		Manager manager=new Manager("Vamshi", 24, 812531212, "Godavrikhani,karimnagar", 35000, "Product-manager", "Business-Development");
		
		manager.showManagerDetails();
		
		
		Member mem=new Member("sravan", 25, 912124554, "uppal,Hyderabad", 28000);
		mem.printsalary();

}
}