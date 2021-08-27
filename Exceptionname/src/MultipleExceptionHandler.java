
public class MultipleExceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor,divident;
	     int num;
	     String snum;
	     int scores[]={1,2,3,4,5};
	     
	     try {
	    	 divisor=0;
	    	 divident=90;
	    	 int quotient=divident/divisor;
	    	 System.out.println("quotient"+quotient);
	}catch(ArithmeticException aexp) {
		System.err.println(aexp.getMessage());
	}
	     finally {
	    	 System.out.println("in final block arthimeticformatexception");
	     }

	     try {
	    	 snum="69f";
	    	 num=Integer.parseInt(snum);
	    	 }catch(NumberFormatException excp) {
	    		 System.err.println(excp.getMessage());
	    	 }
	     finally {
	    	 System.out.println("in final block numberformatexception");
	     }
	     
	     try {
	    	 System.out.println(scores[5]);
	     }catch(ArrayIndexOutOfBoundsException aioobe) {
	     	System.err.println(aioobe.getMessage());
	     }
	     finally {
	     	System.out.println("in the finally block arrayformatexception");
	     }
}
}