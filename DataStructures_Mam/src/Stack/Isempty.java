package Stack;

import java.util.Scanner;

public class Isempty {
	static int top=-1; 

	 static int size; 

	 static int stack[]; 

	  

	public static boolean isEmpty() 

	 { 

	 if(top==-1) 

	 return true; 

	 else 

	 return false; 

	 } 

	 public static void main(String[] args) { 

	 Scanner s = new Scanner(System.in); 

	  

	System.out.println("enter the size"); 

	 size=s.nextInt(); 

	 stack=new int[size]; 

	 if(isEmpty()) 

	 { 

	 System.out.println("stack is empty"); 

	 } 

	  

	} 

}
