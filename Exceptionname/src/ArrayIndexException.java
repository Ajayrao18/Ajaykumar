
public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int score[]= {12,1,2,3,11};
    try {
    System.out.println(score[0]);
    System.out.println(score[5]);
    }catch(ArrayIndexOutOfBoundsException aioobe) {
    	System.err.println(aioobe.getMessage());
    }
    finally {
    	System.out.println("in the finally block");
    }
	}

}
