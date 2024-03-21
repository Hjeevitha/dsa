package main_package.linkedlist;

import java.util.Scanner;

public class Creating_printing {
	
	static Node head,temp; 

	 public static void main(String[] args) { 

	 Scanner s = new Scanner(System.in); 

	 boolean flag=true; 

	 while(flag) 

	 { 

	 Node n = new Node(); 

	 System.out.println("Enter the data"); 

	 n.data=s.nextInt(); 

	 if(head==null) 

	 { 

	 head=n; 

	 temp=n; 

	 System.out.println(temp.adnextnode); 

	 } 

	 else 

	 { 

	  

	//System.out.println(temp.adnextnode); 

	 temp.adnextnode=n; 

	 System.out.println(temp.adnextnode); 

	 temp=n; 

	 } 

	 System.out.println("one node created successfully"); 

	 System.out.println("Do you want to create another node:\n1.Yes\n2.No"); 

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

	 temp=head; 

	 System.out.println("elements present in the list are:"); 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	  

	 

	} 

}
