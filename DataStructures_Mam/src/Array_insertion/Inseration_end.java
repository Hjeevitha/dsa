package Array_insertion;

import java.util.Scanner;

public class Inseration_end {
	public static void main(String[] args) {
		   System.out.println("enter the size");
		   Scanner s=new Scanner(System.in);
		   int size=s.nextInt();
//		   step 1 
		   int a[]=new int[size+1];
//		   step 2
		   System.out.println("enter the elements");
		   for(int i=0;i<size;i++) {
			   a[i]=s.nextInt();
		   }
//		   step3
		   System.out.println("enter the element to be inserted");
		   int ele=s.nextInt();
		   
		   a[size]=ele;
		   size++;
		   for (int i = 0; i <size; i++) {
				System.out.println(a[i]);
			}
			
		}

}
