package Array_insertion;

import java.util.Scanner;

public class Insertation {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size+1];
//		step 4
		System.out.println("enter the elements in array");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
//		step 5
		System.out.println("enter the position of element ");
		int pos=s.nextInt();
//		step 6
		if(pos>0&& pos<=size+1) {
			System.out.println("enter the element to insert at user");
			int ele=s.nextInt();
			for(int i=size-1;i>=pos-1;i--) {
				a[i+1]=a[i];
			}
			a[pos-1]=ele;
			size++;
			System.out.println("after inserting the element the array elements is:");
			for(int i=0;i<size;i++) {
				System.out.println(a[i]);
			}
		}else {
			System.out.println("invalid position");
		}
		
	}


}
