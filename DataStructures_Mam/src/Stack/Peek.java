package Stack;
import java.util.*;

public class Peek {
	  

	static int top=-1; 

	 static int stack[]; 

	 static int size; 

	  

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

	 } 

	 } 

	 public static int peek() 

	 { 

	 return stack[top]; 

	 } 

	  

	public static void main(String[] args) { 

	  

	Scanner s = new Scanner(System.in); 

	 System.out.println("enter the size:"); 

	 size=s.nextInt(); 

	 stack=new int[size]; 

	 boolean flag=true; 

	 while(flag) 

	 { 

	 System.out.println("enter the data to insert into stack"); 

	 int data=s.nextInt(); 

	 push(data); 

	 System.out.println("do you want to insert another data into stack:\n1.yes\n2.no"); 

	 int choice=s.nextInt(); 

	 if(choice==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 break; 

	 } 

	 System.out.println("top most element in the stack is:"+ peek()); 
	 

	} 

}
