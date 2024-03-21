package main_package.array.sorting;

import java.util.Scanner;

public class Bubble_sort {
	 public static void main(String[] args) { 

		 Scanner s = new Scanner(System.in); 

		 System.out.println("enter size"); 

		 int size = s.nextInt(); 

		 int a[] = new int[size+1]; 

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

		 int temp; 

		 //iteration 

		 for(int i=0;i<size-1;i++) 

		 { 

		 boolean flag=false; 

		 //comparision 

		 for(int j=0;j<size-1-i;j++) 

		 { 

		 if(a[j]>a[j+1]) 

		 { 

		 temp=a[j]; 

		 a[j]=a[j+1]; 

		 a[j+1]=temp; 

		 flag=true; 

		 } 

		 } 

		 if(flag==false) 

		 { 

		 break; 

		 } 

		 } 

		 System.out.println("array elements after sorting are: "); 

		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

		 for(int i=0;i<=size-1;i++) 

		 { 

		 System.out.println(a[i]); 

		  

		} 

		  

		 

		} 

}
