
public class Stack 
{
	int top;
	int arr[];
	private final int SIZE;
	
	public Stack(int size) 
	{
		top=size;
		SIZE= size;
		arr=new int[SIZE];
	}
	
	void push(int data) {
		top--;
		arr[top]=data;	
	}
	
	int pop( ) 
	{
		return arr[top++];	
	}
	int peek() {
		return arr[top];
	}
	
	boolean isEmpty(){
		return top==SIZE;
	}
	
	boolean isFull(){
		return top==0;
	}
	

}
