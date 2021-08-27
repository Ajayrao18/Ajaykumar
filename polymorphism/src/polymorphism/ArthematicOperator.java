package polymorphism;

public class ArthematicOperator {
	
	public void add(int num1,int num2) {
		int sum;
		
		sum=num1+num2;
		System.out.println("integer values sum"+sum);
	}
	
	public void add(float num1,float num2) {
		float sum;
		
		sum=num1+num2;
		System.out.println("float values sum"+sum);
	}

	public void add(int num1,int num2,int num3) {
		int sum;
		
		sum=num1+num2+num3;
		System.out.println("3 integer values sum"+sum);
	}
}
