package main_package.linkedlist;

import java.util.Scanner;

public class Deletion_begin {
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

	 temp=head=n; 

	 } 

	 else 

	 { 

	 temp.adnextnode=n; 

	 temp=n; 

	  

	} 

	 System.out.println("Do you want to create another node\n1.yes\n2.no"); 

	 int choice = s.nextInt(); 

	 if(choice==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 flag=false; 

	  

	} 

	 System.out.println("data in the nodes are:"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	 System.out.println("``````````````````````"); 

	 temp=head; 

	 head=head.adnextnode; 

	 temp.adnextnode=null; 

	 System.out.println("after deleting the node at beg data in the nodes are:"); 

	 System.out.println("``````````````````````````````````````````````````````"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	  

	 
}

}
