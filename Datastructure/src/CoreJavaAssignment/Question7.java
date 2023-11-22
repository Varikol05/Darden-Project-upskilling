package CoreJavaAssignment;

import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]==number) {
				System.out.println("yes the number is present");
				temp=1;
				break;
			}
			
		}
		if(temp!=1)
		System.out.println("number is not found");
		

	}

}
