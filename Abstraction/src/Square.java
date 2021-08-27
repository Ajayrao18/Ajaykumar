
//public class Square extends Shape
public  class Square implements IShape{
    int side;
    int area;
	public void computeArea() {// overriding the abstract method
		side=26;
		area=side*side;
	}
	public void showArea() {// concreate method
		System.out.println("Area ="+area);
	}
	
	
}