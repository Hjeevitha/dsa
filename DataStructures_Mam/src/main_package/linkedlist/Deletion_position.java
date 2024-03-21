package main_package.linkedlist;

import java.util.Scanner;

public class Deletion_position {

		static Node head,temp,prevnode; 

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

		 System.out.println("do you want to create another node:\n1.yes\n2.no"); 

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

		 System.out.println("elements present in the list are:"); 

		 temp=head; 

		 int count=0; 

		 while(temp!=null) 

		 { 

		 System.out.println(temp.data); 

		 count++; 

		 temp=temp.adnextnode; 

		 } 

		 System.out.println("```````````````````````````````````"); 

		 System.out.println("enter the position to delete the node"); 

		 int pos=s.nextInt(); 

		 if(pos>1 && pos<=count) 

		 { 

		 temp=head; 

		 int i=1; 

		 while(i<pos) 

		 { 

		 prevnode=temp; 

		 temp=temp.adnextnode; 

		 i++; 

		 } 

		 prevnode.adnextnode=temp.adnextnode; 

		 temp.adnextnode=null; 

		 } 

		 else 

		 { 

		 System.out.println("invalid position"); 

		 } 

		 System.out.println("```````````````````````````````````"); 

		 System.out.println("after deleting the node,the data present in the list are:"); 

		 temp=head; 

		 while(temp!=null) 

		 { 

		 System.out.println(temp.data); 

		 temp=temp.adnextnode; 

		 } 

		 } 

}
