package main_package.linkedlist;

import java.util.Scanner;

public class Counting_nodes {
	 static Node head,temp; 

	 public static void main(String[] args) { 

	 Scanner s = new Scanner(System.in); 

	 boolean flag=true; 

	 while(flag) 

	 { 

	 Node n = new Node(); 

	 System.out.println("enter the data"); 

	 n.data=s.nextInt(); 

	 if(head==null) 

	 { 

	 head=n; 

	 temp=n; 

	 } 

	 else 

	 { 

	 temp.adnextnode=n; 

	 temp=n; 

	 } 

	 System.out.println("do you want to create another node:\n1.yes\n2.No"); 

	 int choice=s.nextInt(); 

	 if(choice==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 flag=false; 

	 } 

	 System.out.println("data in the list before inserting node at beg:"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	 System.out.println("========================================"); 

	 System.out.println("Insertion at begining"); 

	 Node n= new Node(); 

	 System.out.println("enter the data to insert into node at beg"); 

	 n.data=s.nextInt(); 

	 n.adnextnode=head; 

	 head=n; 

	 System.out.println("data in the list after inserting node at beg:"); 

	 temp=head; 
     int count=0;
	 while(temp!=null) 

	 { 
     count++;
	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	  System.out.println("no of nodes present : "+count);

	 

	} 

} 


