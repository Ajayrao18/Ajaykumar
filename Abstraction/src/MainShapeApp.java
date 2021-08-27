
 public class MainShapeApp {

		public static void main(String[] args) {
			
			Square squares=new Square();
			squares.computeArea();//abstract class concrete method
			squares.showArea();
			
			Circle shapes=new Circle();
			shapes.computeArea();
			shapes.showArea();
			
			System.out.println(IShape.side);
		}

	}
   