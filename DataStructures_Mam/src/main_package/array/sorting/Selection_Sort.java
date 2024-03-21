package main_package.array.sorting;

import java.util.Scanner;

public class Selection_Sort {
	 public static void main(String[] args) 
	 { 

	 Scanner s = new Scanner(System.in); 

	 System.out.println("enter the size"); 

	 int size=s.nextInt(); 

	 int a[] = new int[size]; 

	 System.out.println("enter array elements"); 

	 System.out.println("~~~~~~~~~~~~~~~~~~~~~``"); 

	 for(int i=0;i<size;i++) 

	 { 

	 a[i]=s.nextInt(); 

	 } 

	 System.out.println("~~~~~~~~~~~~~~~~~~~~~``"); 

	 System.out.println("entered array elements are:"); 

	 System.out.println("~~~~~~~~~~~~~~~~~~~~~``"); 

	 for(int i=0;i<size;i++) 

	 { 

	 System.out.println(a[i]); 

	 } 

	 System.out.println("~~~~~~~~~~~~~~~~~~~~~``"); 

	 //iteration for sorting 

	 int min,temp; 

	 for(int i=0;i<size-1;i++) 

	 { 

	 min=i; 

	 //comparision 

	 for(int j=i+1;j<=size-1;j++) 

	 { 

	 if(a[j]<a[min]) 

	 { 

	 min=j; 

	 } 

	 } 

	 if(i!=min) 

	 { 

	 temp=a[i]; 

	 a[i]=a[min]; 

	 a[min]=temp; 

	 } 

	 } 

	 System.out.println("~~~~~~~~~~~~~~~~~~~~~``"); 

	 System.out.println("array elements after sorting are:"); 

	 System.out.println("~~~~~~~~~~~~~~~~~~~~~``"); 

	 for(int i=0;i<size;i++) 

	 { 

	 System.out.println(a[i]); 

	 } 

	  

	} 

}
