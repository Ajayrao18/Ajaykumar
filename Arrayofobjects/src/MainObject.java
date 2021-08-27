
public class MainObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Customer customers[]=new Customer[5];  //just created the array but no objects in the array 
      //5 customer reference are in array
      
      //creation of customer objects
	
customers[0]=new Customer(101,"Ajay",9505785658L,"ajaykumarvala@gmail.com");
customers[1]=new Customer(102,"shazam",9666855658L,"shazam123@gmail.com");
customers[2]=new Customer(103,"billy",954125658L,"billywatson45@gmail.com");
customers[3]=new Customer(104,"malena",9464665658L,"malena143@gmail.com");
customers[4]=new Customer(105,"mallana",9505785658L,"ajaykumarvala@gmail.com");

System.out.println("customer details");
customers[0].showDetails();
customers[1].showDetails();
customers[2].showDetails();
customers[3].showDetails();
customers[4].showDetails();

System.out.println("customer details using for loop");
for(int index=0; index<customers.length;index++) {//instance constant
   customers[index].showDetails();
}

//for each loop or iterator version of for loop -useful only when u want to access all element of the array

System.out.println("customer details using for each loop");
for(Customer customer:customers) {
	customer.showDetails();
}
}
}