package Stack;

import java.util.Scanner;

public class Stack_operation {
	static int top=-1; 

	 static int stack[]; 

	 static int size; 

	 static Scanner s = new Scanner(System.in); 

	 public static void creation() 

	 { 

	 System.out.println("enter the size"); 

	 size=s.nextInt(); 

	 stack=new int[size]; 

	 System.out.println("stack using array is created successfully"); 

	 } 

	 public static boolean isFull() 

	 { 

	 if(stack==null) 

	 { 

	 System.out.println("create the stack first"); 

	 return false; 

	  

	} 

	 else if(top==size-1) 

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

	 System.out.println(data+" inserted into the stack successfully"); 

	 } 

	  

	} 

	 public static boolean isEmpty() 

	 { 

	 if(stack==null) 

	 { 

	 System.out.println("create the stack first"); 

	 return false; 

	  

	} 

	 else if(top==-1) 

	 return true; 

	 else 

	 return false; 

	 } 

	 public static void pop() 

	 { 

	 if(stack==null) 

	 { 

	 System.out.println("create the stack first"); 

	 } 

	 else if(isEmpty()) 

	 { 

	 System.out.println("stack is empty,there is no elements to delete"); 

	 } 

	 else 

	 { 

	 System.out.println("data deleted from the stack successfully"); 

	 System.out.println("deleted data is: "+stack[top]); 

	 top--; 

	 } 

	 } 

	 public static void display() 

	 { 

	 if(stack==null) 

	 { 

	 System.out.println("create the stack first"); 

	 } 

	 else if(isEmpty()) 

	 { 

	 System.out.println("stack is empty insert the data"); 

	 } 

	 else 

	 System.out.println("elements present in the stack is:"); 

	 for(int i=top;i>=0;i--) 

	 { 

	 System.out.println(stack[i]); 

	 } 

	 } 

	 public static void peek() 

	 { 

	 if(stack==null) 

	 { 

	 System.out.println("create the stack first"); 

	 } 

	 else if(isEmpty()) 

	 { 

	 System.out.println("stack is empty insert the data"); 

	 } 

	 else 

	 System.out.println("top most data from the stack is: "+stack[top]); 

	  

	} 

	 public static void main(String[] args) { 

	  

	Scanner s = new Scanner(System.in); 

	 boolean flag=true; 

	 while(flag) 

	 { 

	 System.out.println("````````````````````````````````"); 

	 System.out.println("1.creation_Of_Stack_using_Array.\n2.insert_the data into stack of array\n3.delete data from the stack\n4.stack_isFull\n5.stack_isEmpty\n6.display\n7.display_topmost_data\n8.exit"); 

	 System.out.println("``````````````````````````````````"); 

	 System.out.println("enter your choice"); 

	 System.out.println("````````````````````````````````````"); 

	 int choice=s.nextInt(); 

	 switch(choice) 

	 { 

	 case 1:creation(); 

	 break; 

	 case 2: 

	 { 

	 if(stack==null) 

	 { 

	 System.out.println("create stack using array"); 

	 } 

	 else 

	 { 

	 boolean repeat=true; 

	 while(repeat) 

	 { 

	 System.out.println("enter the data to insert into the stack"); 

	 int data=s.nextInt(); 

	 push(data); 

	 System.out.println("do you want to insert another data\n1.yes\n2.no"); 

	 int ch=s.nextInt(); 

	 if(ch==1) 

	 { 

	 repeat=true; 

	 } 

	 else 

	 break; 

	 } 

	 } 

	 } 

	 break; 

	 case 3: 

	 { 

	 if(stack==null) 

	 { 

	 System.out.println("create the stack first"); 

	 } 

	 else 

	 { 

	 boolean repeat =true; 

	 while(repeat) 

	 { 

	 pop(); 

	 System.out.println("do you want to delete another data from the stack\n1.yes\n2.no"); 

	 int ch=s.nextInt(); 

	 if(ch==1) 

	 { 

	 repeat=true; 

	 } 

	 else 

	 break; 

	 } 

	 } 

	 break; 

	 } 

	 case 4:if(isFull()) 

	 System.out.println("stack is full"); 

	 else 

	 System.out.println("stack is not full you can still insert the data"); 

	 break; 

	 case 5:if(isEmpty()) 

	 System.out.println("stack is empty"); 

	 else 

	 System.out.println("stack is not empty you can still delete the data"); 

	 break; 

	 case 6:display(); 

	 break; 

	  

	case 7:peek(); 

	 break; 

	 case 8:System.out.println("Thank you:"); 

	 flag=false; 

	 break; 

	 default:System.out.println("invalid choice"); 

	  

	 

	} 

	 } 
	 }

}
