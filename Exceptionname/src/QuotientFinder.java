import java.util.Scanner;
public class QuotientFinder {

	int dividend,divisor,quotient;
	Scanner sc=new Scanner(System.in);
	
	public void readDividend() {
		System.out.println("enter dividend");
		dividend=sc.nextInt();
	}
	
	public void readDivisor() {
		System.out.println("enter divisor");
		divisor=sc.nextInt();
	}
	
	public void getQuotient() {
		try {
			quotient=dividend/divisor;
			System.out.println("Quotient"+quotient);
		}catch(ArithmeticException are) {
			System.out.println(are.getMessage()+"\n please enter a non-zero divisor");
			//invode readdivisor method
			readDivisor();
			getQuotient();
		}
		finally {
			System.out.println("in finally block");
		}
	}
}
