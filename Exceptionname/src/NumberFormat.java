
public class NumberFormat {

	public static void main(String[] args) {
		int num;
     String snum="555dd";
     
     try {
    	 num=Integer.parseInt(snum);
    	 System.out.println("Num"+num);
     }catch(NumberFormatException numfrmex){
    	 System.err.println(numfrmex.getMessage());
     }
     finally {
    	 System.out.println("inside final block");
     }
	}

}
