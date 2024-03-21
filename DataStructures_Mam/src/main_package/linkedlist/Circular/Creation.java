package main_package.linkedlist.Circular;

import java.util.Scanner;



public class Creation {
	static Node head,tail,temp;  

	static Scanner s= new Scanner( System.in); 

	 public static void main(String[] args) { 

	 boolean flag=true; while(flag) {  

	Node n= new Node(); 

	 System.out.println("enter data"); 

	 n.data=s.nextInt();   

	if(head==null) { 

	 head=n; temp=n;  

	n.adnext_node=head; } 

	 else { 

	 tail.adnext_node=n;  

	n.adnext_node=head; 

	 tail=n; }  

	System.out.println("Do you want to create node\n1:Yes\n2:No");  

	int choice=s.nextInt(); 

	 if(choice==1) { flag=true; } else { flag=false; break; } }  

	System.out.println("Elements are");  

	temp=head;  

	do { System.out.println(temp.data);  

	temp=temp.adnext_node; 

	 }  

	while(temp!=head); }  

	 
}
