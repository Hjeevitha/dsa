package StackusingLinkedList;

import java.util.Scanner;

public class Stack_operation {
	 static Node top, temp; 

	 static Node n; 

	 public static void push(int ele) { 

	 n = new Node(); 

	 n.data = ele; 

	 if (top == null) { 

	 top = n; 

	 } else { 

	 n.adnextnode = top; 

	 top = n; 

	 } 

	 } 

	 public static void pop() { 

	 System.out.println("deleted data from the stack is: " + top.data); 

	 top = top.adnextnode; 

	 } 

	 public static void display() { 

	 Node temp; 

	 temp = top; 

	 System.out.println("elements present int the stack are"); 

	 while (temp != null) { 

	 System.out.println(temp.data); 

	 temp = temp.adnextnode; 

	 } 

	 } 

	 public static void peek() { 

	 System.out.println(top.data); 

	 } 

	 public static void isEmpty() { 

	 if (top == null) { 

	 System.out.println("stack is empty"); 

	 } 

	 else 

	 { 

	 System.out.println("stack is not empty,you can perform the operations"); 

	 } 

	 } 

	 public static void main(String[] args) { 

	 Scanner s = new Scanner(System.in); 

	 boolean flag = true; 

	 while (flag) { 

	 System.out.println("````````````````````````"); 

	 System.out.println("1.creation and insertion\n2.display\n3.deletion\n4.view top most data\n5.isEmpty\n6.exit"); 

	 System.out.println("`````````````````````````"); 

	 System.out.println("enter your choice:"); 

	 int choice = s.nextInt(); 

	 switch (choice) { 

	 case 1: 

	 boolean repeat = true; 

	 while (repeat) { 

	 System.out.println("enter the data to insert into the node of stack"); 

	 int data = s.nextInt(); 

	 push(data); 

	 System.out.println("do you want to create another node:\n1.yes\n2.no"); 

	 int ch = s.nextInt(); 

	 if (ch == 1) { 

	 repeat = true; 

	 } else { 

	 break; 

	 } 

	 } 

	 break; 

	 case 2: 

	 if (top == null) { 

	 System.out.println("stack is empty create the stack using linked list first"); 

	 } else 

	 display(); 

	 break; 

	 case 3: 

	 if (top == null) { 

	 System.out.println("stack is empty"); 

	 } else 

	 pop(); 

	 break; 

	 case 4: 

	 if (top == null) { 

	 System.out.println("stack is empty"); 

	 } else 

	 peek(); 

	 break; 

	 case 5: 

	 isEmpty(); 

	 break; 

	 case 6: 

	 System.out.println("Thank You!!!!11"); 

	 flag = false; 

	 break; 

	  

	default:System.out.println("invalid choice"); 

	 break; 

	 } 

	 } 

	 } 

}
