package main_package.linkedlist.DDoublyLinkedList;

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

	 n.adprevnode=temp; 

	 temp=n; 

	 } 

	 System.out.println("do you want to create another node:\n1.yes\n2.no"); 

	 int choice=s.nextInt(); 

	 if(choice==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 break; 

	 } 

	 System.out.println("elements present in the list are:"); 

	 temp=head; 

	 int count=0; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 count++; 

	  

	} 

	 System.out.println("````````````````````````````````````"); 

	 Node n=new Node(); 

	 System.out.println("enter the position to insert the data"); 

	 int pos=s.nextInt(); 

	 Node temp,prevnode=null; 

	 if(pos>0 && pos<=count+1) 

	 { 

	 System.out.println("enter the data to insert at position"); 

	 n.data=s.nextInt(); 

	 temp=head; 

	 int i=1; 

	 while(i<pos) 

	 { 

	 prevnode=temp; 

	 temp=temp.adnextnode; 

	 i++; 

	 } 

	 n.adprevnode=prevnode; 

	 prevnode.adnextnode=n; 

	 temp.adprevnode=n; 

	 n.adnextnode=temp; 

	 } 

	 else 

	 { 

	 System.out.println("invalid position"); 

	 } 

	 System.out.println("`````````````````````````````````````"); 

	 System.out.println("after inserting the node at position elements present in the list are:"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	  

	} 

}
