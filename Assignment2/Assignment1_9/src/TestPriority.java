import java.util.Scanner;

//6. Write a program to implement descending stack. (Initialize top = SIZE)


public class TestPriority {

	public static int  operatorsPriority(char opr) 
	{
		switch(opr) 
		{
		case '(':
			return 1;
		case ')':
			return 1;
		case '$':
			return 2;
		case '*':
			return 3;
		case '/':
			return 3;
		case '%':
			return 3;
		case '+':
			return 4;
		case '-':
			return 4;	
		}
		return 0;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char opr;
		int priority;
		System.out.println("Enter Operator to find priority :");
		opr=sc.next().charAt(0);
		priority=operatorsPriority(opr);
		if(priority>0)
			System.out.println("Priority of "+opr+" is :"+priority);
	}
}
