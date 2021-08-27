package inheritance;

public class Mainapp {

	public static void main(String[] args) {
		Employee ram=new Employee("Ram",101,"solution-architect",99999.00f,"09-05-1999");
		 ram.computehra(); 
		 ram.showDetails();
		 
		 Manager Ajay=new Manager("Ajay",105,"manager",149999.00f,"09-09-2021",25);
		 Ajay.computehra();
		 Ajay.showDetails();
      
         
	}

}
