package main_package.array;

import java.util.Scanner;

public class Creation_insertion {
	static int a[]; 
	static int size; 



	public static void main(String[] args) 

	{ 

		Scanner s = new Scanner(System.in);  

		//System.out.println(a); 

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

		while(true) 

		{ 

			System.out.println("1.creation and Insertion\n2.display\n3.Insertion at beg\n4.Insertion at position\n5.Insertion at end\n6.exit\n"); 

			System.out.println("enter your choice"); 

			int choice=s.nextInt(); 

			switch(choice) 

			{ 

			case 1: 

			{ 

				System.out.println("enter the size"); 

				size=s.nextInt(); 

				a=new int[size+10]; 

				System.out.println("enter array elements"); 

				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

				System.out.println("enter the elements to insert in an array"); 

				for(int i=0;i<=size-1;i++) 

				{ 

					a[i]=s.nextInt(); 



				} 

			} 

			break; 

			case 2: 

			{ 

				if(a!=null) 

				{ 

					System.out.println("array elements are: "); 

					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

					for(int i=0;i<=size-1;i++) 

					{ 

						System.out.println(a[i]); 



					} 

				} 

				else 

				{ 

					System.out.println("create the array first"); 

				} 



			} 

			break; 

			case 3: 

			{ 

				if(a!=null) 

				{ 

					//size++; 

					System.out.println("enter the element to insert at beginning"); 

					int ele = s.nextInt(); 

					a[size]=a[0]; 

					a[0]=ele; 

					size++; 

				} 

				else 

				{ 

					System.out.println("create the array first"); 

				} 

			} 

			break; 

			case 4: 

			{ 

				if(a!=null) 

				{ 

					System.out.println("enter the position"); 

					int pos = s.nextInt(); 

					if(pos>0&&pos<=size+1) 

					{ 

						System.out.println("enter the element to insert the position"); 

						int ele = s.nextInt(); 

						for(int i =size-1;i>=pos-1;i--) 

						{ 

							a[i+1]=a[i]; 

						} 

						a[pos-1]=ele; 

						size++; 

					} 

					else 

					{ 

						System.out.println("invalid position"); 

					} 

				} 

				else 

				{ 

					System.out.println("create the array first"); 

				} 



			} 

			break; 

			case 5: 

			{ 

				if(a!=null) 

				{ 

					//size++; 

					System.out.println("enter the element to insert the last"); 

					int ele = s.nextInt(); 

					a[size]=ele; 

					size++; 

				} 

				else 

				{ 

					System.out.println("create the array first"); 

				} 

			} 

			break; 

			case 6: 

			{ 

				System.exit(0); 

			} 

			} 

		} 

	} 

} 


