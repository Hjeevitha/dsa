package main_package.linkedlist;
import java.util.*;
public class Bubble_sort {
	 static Node head,temp; 

	 public static void main(String[] args) { 

	  

	Scanner s =new Scanner(System.in); 

	  

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

	 System.out.println("Do you want to create another node:\n1.yes\n2.no"); 

	 int choice=s.nextInt(); 

	 if(choice==1) 

	 { 

	 flag=true; 

	 } 

	 else 

	 break; 

	 } 

	 System.out.println("`````````````````````````````````````````````````"); 

	 System.out.println("elements present in the list are:"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 

	 System.out.println("``````````````````````````````````````````````````"); 

	 temp=head; 

	 Node nextnode=null; 

	 int temp1; 

	 while(temp!=null) 

	 { 

	 nextnode=temp.adnextnode; 

	 while(nextnode!=null) 

	 { 

	 if(temp.data>nextnode.data) 

	 { 

	 temp1=temp.data; 

	 temp.data=nextnode.data; 

	 nextnode.data=temp1; 

	 } 

	 nextnode=nextnode.adnextnode; 

	 } 

	 temp=temp.adnextnode; 

	 } 

	 System.out.println("``````````````````````````````````````````````````"); 

	 System.out.println("data after sorting in the list are:"); 

	 System.out.println("``````````````````````````````````````````````````"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 } 
	 

	} 
}
