package main_package.array;

import java.util.Scanner;

public class Binary_Search {
	
	public static void main(String[] args) 

	 { 

	 Scanner s = new Scanner(System.in); 

	 System.out.println("enter the size"); 

	 int size = s.nextInt(); 

	 int a[]=new int[size]; 

	 System.out.println("enter array elements"); 

	 System.out.println("-----------------------"); 

	 for(int i=0;i<size;i++) 

	 { 

	 a[i]=s.nextInt(); 

	 } 

	 System.out.println("array elements are:"); 

	 System.out.println("-----------------------"); 

	 for(int i=0;i<size;i++) 

	 { 

	 System.out.println(a[i]); 

	 } 

	 System.out.println("-----------------------"); 

	 System.out.println("enter the element to search"); 

	 int ele=s.nextInt(); 

	 int start_index=0; 

	 int end_index=size-1; 

	 int mid; 

	 boolean found=false; 

	 while(start_index<=end_index) 

	 { 

	 mid=(start_index+end_index)/2; 

	  

	//case1 

	 if(ele==a[mid]) 

	 { 

	 System.out.println("element found"); 

	 found=true; 

	 break; 

	 } 

	 else if(ele>a[mid]) 

	 { 

	 start_index=mid+1; 

	 } 

	 else if(ele<a[mid]) 

	 { 

	 end_index = mid-1; 

	  

	} 

	 } 

	 if(found==false) 

	 { 

	 System.out.println("element not found"); 

	 } 

	  

	 

	} 

}
