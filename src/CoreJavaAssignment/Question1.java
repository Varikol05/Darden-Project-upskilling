package CoreJavaAssignment;
import java.util.*;
public class Question1 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int i=sc.nextInt(); 
		int temp=i,sum=0,x=0;
		int l=String.valueOf(i).length();
		while(x<=l){
		    int r=temp%10;
		    temp=temp/10;
			sum=sum+r*r*r;
			x++;
		}
		if(sum==i) 
		{
			System.out.println(i+" is a armstrong number");
		}
		else {
			System.out.println("it is not a armstrong number");
		}
		

	}

}
