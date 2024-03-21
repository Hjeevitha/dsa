package Queue_using_array;
import java.util.Scanner;
public class Dequeue {
	 static int front=-1,rear=-1; 
	 public static void main(String[] args) { 
	 Scanner s = new Scanner(System.in); 
	 System.out.println("enter the size"); 
	 int size=s.nextInt(); 	 //creation 
	 int queue [] = new int[size]; 
	 boolean flag=true; 
	 while(flag) 
	 { 
	 System.out.println("enter the data to insert into queue"); 
	 int data=s.nextInt(); 
	 //insertion 
	 if(rear==size-1) 
	 { 
	 System.out.println("queue is full"); 
	 } 
	 else if(front == -1 && rear==-1) 
	 { 
	 front=rear=0; 
	 queue[rear]=data; 
	 } 
	 else 
	 { 
	 rear++; 
	 queue[rear]=data; 
	 } 
	 System.out.println("do you want to insert another data into the queue using array:\n1.yes\n2.no"); 
	 int choice=s.nextInt(); 
	 if(choice==1) 
	 { 
	 flag=true; 
	 } 
	 else 
	 break; 
	 } 
	 System.out.println("``````````````````````````````````"); 
	 System.out.println("elements present in the queue is:"); 
	 for(int i=front;i<=rear;i++) 
	 { 
	 System.out.println(queue[i]); 
	 } 
	 //deletion 
	 System.out.println("````````````````````````````````````````"); 
	 boolean repeat=true; 
	 while(repeat) 
	 { 
	 System.out.println("do you want to delete the data from the queue using array\n1.yes\n2.no"); 
	 int ch=s.nextInt(); 
	 if(ch==1) 
	 { 
	 if(front==-1 && rear==-1) 
	 { 
	 System.out.println("queue is empty"); 
	 } 
	 else if(front == rear) 
	 { 
	 System.out.println("deleted data is: "+queue[front]); 
	 front=rear=-1; 
	 } 
	 else 
	 { 
	 System.out.println("deleted data is: "+queue[front]); 
	 front++; 
	 } 
	repeat=true; 
	} 

	 else 

	 { 

	 break; 

	 } 

	  

	} 

	 } 

}
