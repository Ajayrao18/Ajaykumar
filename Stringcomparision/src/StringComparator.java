
public class StringComparator {
 
	public static void main(String[] args) {
		String str1="hello";
		String str2="hello";
		
		if(str1==str2) {
			System.out.println("string is same");
		}
		if(str1.equals(str2)) {//compares contenta of strings  
			System.out.println("Both strings are same");
		}
		
		String str3=new String("hello");
		String str4=new String("hello");
		if(str3==str4) {
			System.out.println("string is same");
		}
		if(str3.equals(str4)) {//compares contenta of strings  
			System.out.println("Both strings are same");
		}
	}
}
