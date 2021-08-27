import java.util.Arrays;
public class ArraySorterAndFinder {
	
	public static void main(String[] args){
		float salaries[]= {55656.2f,95995.5f,46546.8f,75545.4f};
		String cities[]= {"HYD","PUNE","BENGALURU","GURUGRAM","VIJAYAWADA"};
		
		System.out.println("Array salaries without sorting");
		
		for(float salary:salaries) {
			System.out.println(salary);
		}
		
		Arrays.sort(salaries);
		
		System.out.println("array salaries after sorting");
		
		for(float salary:salaries) {
			System.out.println(salary);
		}
		
		Arrays.sort(cities);
		for(String city:cities) {
			System.out.println(city);
		}
		
		//Binary search-pre requisite- array has to be sorted
		//Arrays.binarySearch()- returns index of the search key
		int index =Arrays.binarySearch(cities, "PUNE"); //returns index of available element
		if(index<0) {
			System.out.println("search element is not found");
			
		}else {
			System.out.println("city found at index"+index);
			
			
		}
	}

}
