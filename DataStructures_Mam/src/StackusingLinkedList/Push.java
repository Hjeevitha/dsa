package StackusingLinkedList;

import java.util.Scanner;

public class Push {
	static Node top;
	static public void push(int data) {
		Node n=new Node();
		n.data=data;
		if(top==null) {
			top=n;
			System.out.println(top.data);
		}else {
			n.adnextnode=top;
			top=n;
			System.out.println(top.data);
		}
		
	}
	
	private static void pop() {
		if(top==null) {
			System.out.println("stack is empty");
		}else {
			System.out.println(top.data);
			top=top.adnextnode;
		}
	}
	
	static void isEmpty() {
		if(top==null) {
			System.out.println("stack is empty");
		}
	}
	
	static public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
		
	}
	
	public static void peek() {
		System.out.println("top element is : "+top.data);
	}
	
	public static void main(String[] args) {
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		while(flag) {
			System.out.println("enter the data");
			int data=s.nextInt();
			push(data);
			System.out.println("do you want another node\n1.yes\n2.no");
			int choice=s.nextInt();
			if(choice==1) {
				flag=true;
			}else {
				break;
			}
		}
		display();
		peek();
		boolean flag2=true;
		while(flag2) {
			pop();
			System.out.println("do you want delete another one\n1.yes2.no");
			int ch=s.nextInt();
			if(ch==1) {
				flag2=true;
			}else {
				break;
			}
		}
		isEmpty();
	}


}
