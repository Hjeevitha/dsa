package main_package.array.sorting;

import java.util.Scanner;

public class Insertion_sort {
	public static void main(String[] args) { 

		 Scanner s = new Scanner(System.in); 

		 System.out.println("enter size"); 

		 int size = s.nextInt(); 

		 int a[] = new int[size]; 

		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

		 System.out.println("enter the elements to insert in an array"); 

		 for(int i=0;i<=size-1;i++) 

		 { 

		 a[i]=s.nextInt(); 

		  

		} 

		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

		 System.out.println("entered array elements are: "); 

		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

		 for(int i=0;i<=size-1;i++) 

		 { 

		 System.out.println(a[i]); 

		  

		} 

		 int temp,j; 

		 for(int i=1;i<=size-1;i++)//unsorted array 

		 { 

		 temp=a[i];//storing first ele in unsorted array in temp 

		 j=i-1;//sorted array 

		 while(j>=0 && a[j]>temp)//comparing ele present in sorted array with ele present in temp 

		 { 

		 a[j+1]=a[j];//if ele is greater than temp then shifting 

		 j--; 

		 } 

		 a[j+1]=temp; 

		  

		} 

		 System.out.println("after sorting array elements are: "); 

		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

		 for(int i=0;i<=size-1;i++) 

		 { 

		 System.out.println(a[i]); 

		  

		} 

		} 

}
