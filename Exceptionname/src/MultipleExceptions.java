
public class MultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int divisor,divident;
     int num;
     String snum;
     int scores[]={1,2,3,4,5};
     
     try {
    	 divisor=10;
    	 divident=90;
    	 int quotient=divident/divisor;
    	 System.out.println("quotient"+quotient);
    	 snum="69f";
    	 num=Integer.parseInt(snum);
    	 
    	 System.out.println(scores[6]);
     }catch(ArithmeticException | NumberFormatException |ArrayIndexOutOfBoundsException excp){
    	 System.out.println(excp.getMessage());
     }
     
     finally {
    	 System.out.println("in final block");
     }
	}
}
