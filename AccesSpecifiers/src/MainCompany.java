
public class MainCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee ram=new Employee(1001,"ram",48646.2f,2100.0f);
    Employee syam=new Employee(1002,"syam",44446.2f,1100.0f);
    
    System.out.println(ram.id);
    System.out.println(ram.name);
    System.out.println(ram.COMPANY_NAME);
    Employee.showcompanyname();
    
    
	}
	
}
