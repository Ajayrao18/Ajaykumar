
public class ArthematicException {

	public static void main(String[] args) {
		int divident=90,divisor=0;
		int quotient;
		try {
       quotient=divident/divisor;
       System.out.println("quotient"+quotient);
		}
		catch(ArithmeticException aexp) {
			System.err.println(aexp.getMessage());
		}
		finally {
			System.out.println("inside finally block");
		}
	}

}
