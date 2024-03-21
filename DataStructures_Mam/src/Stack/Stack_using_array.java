package Stack;
import java.util.Scanner;
public class Stack_using_array {
	static int top=-1; 

	 static int size; 

	 static int stack[];//declaration of an array 

	  

	public static void push(int data) 

	 { 

	 if(top==size-1) 

	 { 

	 System.out.println("stack is full"); 

	 } 

	 else 

	 { 

	 top++; 

	 stack[top]=data; 

	 System.out.println("data inserted into the stack successfully"); 

	 } 

	  

	} 

	  

	public static void main(String[] args) { 

	 Scanner s = new Scanner(System.in); 

	 System.out.println("enter the size"); 

	 size=s.nextInt(); 

	 stack = new int[size];//creation of an array 

	 boolean flag=true; 

	 while(flag) 

	 { 

	 System.out.println("enter the data to insert into the stack"); 

	 int data=s.nextInt(); 

	 push(data); 

	 System.out.println("do you want to insert another data:\n1.yes\n2.no"); 

	 int choice=s.nextInt(); 

	 if(choice==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 { 

	 break; 

	 } 

	 } 
	 

	} 

}
