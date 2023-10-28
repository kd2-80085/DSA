
import java.util.Scanner;

public class EmpSalSort {


	public static void selectionSort(Employee arr[], int N) {

		//1. count number of passes
		for(int i = 0 ; i < N - 1 ; i++) {
			//2. select one position from array - i
			//3. compare ith element with all other elements(right side)
			for(int j = i + 1 ; j < N ; j++) {
				//3.1 if selected element is greater than other element then swap
				if(arr[i].getSalary() > arr[j].getSalary()) {
					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
	}


//Create array of employees and sort employee by salary

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee e1=new Employee(1,"Sahil",22000);
		Employee e2=new Employee(2,"Akshay",12000);
		Employee e3=new Employee(3,"Akash",30000);
		Employee e4=new Employee(4,"Ajay",55000);
		Employee e5=new Employee(5,"Atul",50000);
		
		Employee arr[]={e1,e2,e3,e4};
		
		selectionSort(arr, arr.length);
		System.out.println("Employees after sort using insertion sort");
		for(Employee emp:arr) {
			System.out.println(emp);
		}

	}
}
