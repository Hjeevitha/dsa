package Queue_using_Linkedlist;

import java.util.Scanner;

public class All_operation_LinkedList {
	static Node front = null, rear = null; 
	static Node n; 


	public static void enqueue() { 
		if (front == null && rear == null) { 
			rear = front = n; 
		} else { 
			rear.adnextnode = n; 
			rear = n; 
			System.out.println("data inserted into the node successfully"); 
		} 
	} 

	public static void dequeue() { 

		if(front==null && rear==null) 

		{ 

			System.out.println("queue is empty"); 

		} 

		else if(front==rear) 

		{ 

			System.out.println("deleted data is: " + front.data); 

			front=rear=null; 

		} 

		else 

		{ 

			System.out.println("deleted data is: " + front.data); 

			front = front.adnextnode; 

		} 

	} 

	public static void display() { 

		Node temp; 

		temp = front; 

		System.out.println("data present in the queue using linked list are;"); 

		while (temp != null) { 

			System.out.println(temp.data); 

			temp = temp.adnextnode; 

		} 

	} 

	public static void peek() { 

		System.out.println(front.data); 

	} 

	public static void isEmpty() { 

		if (front == null && rear == null) { 

			System.out.println("queue using linked list is empty"); 

		} else { 

			System.out.println("queue using linked list is not empty we can still perform the operation"); 

		} 

	} 

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 

		boolean flag = true; 

		while (flag) { 

			System.out.println("``````````````````````````````````````"); 

			System.out.println("1.creation and insertion\n2.display\n3.deletion\n4.top most data\n5.isEmpty\n6.exit"); 

			System.out.println("enter your choice"); 

			System.out.println("````````````````````````````````````````````"); 

			int choice = s.nextInt(); 

			switch (choice) { 

			case 1: 

				boolean repeat = true; 

				while (repeat) { 

					n = new Node(); 

					System.out.println("node created successfully"); 

					System.out.println("``````````````````````````"); 

					System.out.println("enter the data to insert in node"); 

					n.data=s.nextInt(); 

					enqueue(); 

					System.out.println("do you want to create another node:\n1.yes\n2.no"); 

					int ch = s.nextInt(); 

					if (ch == 1) { 

						repeat = true; 

					} else 

						break; 

				} 

				break; 

			case 2: 

				if (n == null) { 

					System.out.println("create the node first"); 

				} else if (front == null && rear == null) { 

					System.out.println("queue is empty"); 

				} else { 

					display(); 

				} 

				break; 

			case 3: 

				if (n == null) { 

					System.out.println("create the node first"); 

				} else  

				{ 

					boolean rept = true; 

					while (rept) { 

						dequeue(); 

						System.out.println("do you want to delete another node:\n1.yes\n2.no"); 

						int ch = s.nextInt(); 

						if (ch == 1) { 

							rept = true; 

						} else 

							break; 

					} 

				} 

				break; 

			case 4: 

				if (n == null) { 

					System.out.println("create the node first"); 

				} else if (front == null && rear == null) { 

					System.out.println("queue is empty"); 

				} else { 

					peek(); 

				} 

				break; 

			case 5: 

				if (n == null) { 

					System.out.println("create the node first"); 

				} else { 

					isEmpty(); 

				} 

				break; 

			case 6: 

				System.out.println("Thank you!!!!!!!!!!!!!!!!!!!!!"); 

				flag = false; 

				break; 

			default: 

				System.out.println("Invalid choice"); 

			} 

		} 

	} 
}

