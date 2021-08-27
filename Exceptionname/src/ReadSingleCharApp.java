import java.io.IOException;

public class ReadSingleCharApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    char ch; //to represent unicode character(world language chars) -it occupies 2bytes
     System.out.println("enter a single character");
     ch=(char) System.in.read(); //returns int type
     System.out.println("the unitcode of input character"+ch);
     System.out.println("the unitcode of input character"+ch+" is "+(int)ch);
	}

}
