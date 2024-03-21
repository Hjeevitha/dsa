package Queue_using_array;

import java.util.Iterator;
import java.util.Scanner;

public class Enqueue_Dequeue_Display {
	static int[] queue;
	static int front,rear=-1;
	static int size;
	public static void enqueue(int data) {
		Node n=new Node();
		n.data=data;
		if(rear==size-1) {
			System.out.println("queue is full");
		}else if(rear==-1 && front==-1) {
			front=0;
		    rear=0;
		    queue[rear]=data;
		    System.out.println("inserted data "+queue[rear]);
		}else {
			rear++;
			queue[rear]=data;
			System.out.println("inserted data "+queue[rear]);
		}
		
	}
	
	public static void dequeue() {
		if(rear==-1 && front==-1) {
			System.out.println("queue is empty");
		}else if(rear==front) {
			System.out.println(queue[front]);
			rear=-1;front=-1;
		}
		else {
			System.out.println("deleted data is "+queue[front]);
			front++;
		}
	}
	

	public static void display() {
		for (int i = front; i <=rear; i++) {
			System.out.println(queue[i]);
		}
		
	}
	
	public static void peek() {
		System.out.println("peek element is "+queue[front]);
	}
	
	public static void isfull() {
		if(rear==size-1) {
			System.out.println("queue is full");
		}
	}
	
	public static void isempty() {
		if(rear==-1 && front==-1) {
			System.out.println("queue is empty");
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		size=s.nextInt();
	    queue=new int[size];
	    boolean flag=true;
	    while(flag) {
	    	System.out.println("enter the data");
	    	int data=s.nextInt();
	    	enqueue(data);
	    	System.out.println("do you insert another data \n1.yes\n2.no");
	    	int ch=s.nextInt();
	    	if(ch==1) {
	    		flag=true;
	    	}else {
	    		break;
	    	}
	    }
	    peek();
	    display();
	    isfull();
	    System.out.println("============================");
	    boolean flag2=true;
	    while(flag2) {
	    	dequeue();
	    	System.out.println("do you want delete another data \n1.yes2.no");
	    	int ch2=s.nextInt();
	    	if(ch2==1) {
	    		flag2=true;
	    	}else {
	    		break;
	    	}
	    }
	    isempty();
	    display();

	}

}
