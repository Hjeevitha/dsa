package Stack;

import java.util.Scanner;

public class Isfull {
	  

	static int top=-1; 

	 static int stack[]; 

	 static int size; 

	  

	public static boolean isFull() 

	 { 

	 if(top==size-1) 

	 return true; 

	 else 

	 return false; 

	 } 

	  

	public static void push(int data) 

	 { 

	 if(isFull()) 

	 { 

	 System.out.println("stack is full"); 

	 } 

	 else 

	 { 

	 top++; 

	 stack[top]=data; 

	 } 

	 } 

	 public static void main(String[] args) { 

	 Scanner s = new Scanner(System.in); 

	 System.out.println("enter the size"); 

	 size=s.nextInt(); 

	 stack = new int[size]; 

	 boolean flag=true; 

	 while(flag) 

	 { 

	 System.out.println("enter the data to insert into the stack"); 

	 int data=s.nextInt(); 

	 push(data); 

	 System.out.println("do you want to insert another data:\n1.yes\n2.No"); 

	 int choice=s.nextInt(); 

	 if(choice==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 break; 

	 } 

	 } 

	
}

