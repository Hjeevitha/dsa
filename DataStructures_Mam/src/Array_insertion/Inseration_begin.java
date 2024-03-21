package Array_insertion;

import java.util.Arrays;
import java.util.Scanner;

public class Inseration_begin {
	public static void main(String[] args) {
		System.out.println("enter the size");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size+1];
		System.out.println("enter the elements to be inserted");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("entered elemented to be inserted at first position");
		int ele=s.nextInt();
		
		a[size]=a[0];
		a[0]=ele;
		System.out.println("after the insertion array elements are: "+Arrays.toString(a));
	}


}
