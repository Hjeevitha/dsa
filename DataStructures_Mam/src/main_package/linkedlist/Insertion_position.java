package main_package.linkedlist;

import java.util.Scanner;

public class Insertion_position {
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

	 temp=head=n; 

	 } 

	 else 

	 { 

	 temp.adnextnode=n; 

	 temp=n; 

	 } 

	 System.out.println("do you want to create another node.\n1.yes\n2.No"); 

	 int ch=s.nextInt(); 

	 if(ch==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 break; 

	 } 

	 System.out.println("elements in the list are:"); 

	 temp=head; 

	 int count=0; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 count++; 

	 } 

	 System.out.println("====================================="); 

	 System.out.println("enter the position"); 

	 int pos = s.nextInt(); 

	 if(pos<=0 || pos>count+1) 

	 { 

	 System.out.println("invalid position"); 

	 } 

	 else 

	 {  

	 

	if(pos==1) 

	 { 

	 Node n=new Node(); 

	 System.out.println("enter the data to insert at beg"); 

	 n.data=s.nextInt(); 

	 n.adnextnode=head; 

	 head=n; 

	 } 

	 else if(pos==count+1) 

	 { 

	 Node n=new Node(); 

	 System.out.println("enter the data to insert at last"); 

	 n.data=s.nextInt(); 

	 temp=head; 

	 while(temp.adnextnode!=null) 

	 { 

	 temp=temp.adnextnode; 

	 } 

	 temp.adnextnode=n; 

	 } 

	 else 

	 { 

	 Node n=new Node(); 

	 System.out.println("enter the data to insert at position"); 

	 n.data=s.nextInt(); 

	 temp=head; 

	 int i=1; 

	 while(i<pos-1) 

	 { 

	 temp=temp.adnextnode; 

	 i++; 

	 } 

	 n.adnextnode=temp.adnextnode; 

	 temp.adnextnode=n; 

	 } 

	 System.out.println("after insertion elements present in the list are:"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	 } 

	 } 



}
