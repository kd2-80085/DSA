import java.util.Scanner;

public class TestDescStack {

	
 static int menu(Scanner sc) {
	 int choice;
	 System.out.println("Menu : \n 0.EXIT \n 1.Push \n 2.Pop \n 3.Peek");
	 System.out.println("Enter Choice");
	 choice=sc.nextInt();
	 return choice;
 }
 
	public static void main(String[] args) {
		int size,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size for Stack :");
		size=sc.nextInt();
		
		Stack st=new Stack(size);
		while((choice=menu(sc))!=0) 
		{
			switch(choice)
			{
			case 1: 
				if(st.isFull())
					System.out.println("Stack is full");
				else
				{
					System.out.println("Enter element to add in stack : ");
					int data=sc.nextInt();
					st.push(data);
				}
				break;
			case 2: 
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					st.pop();
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peek element in Stack is : "+st.peek());
				break;
			}
			
		}
		
		
	}

}
