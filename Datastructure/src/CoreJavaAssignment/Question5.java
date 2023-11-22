package CoreJavaAssignment;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double ic=sc.nextDouble();
		Double it=0.0;
		
		if(ic>=0 && ic<=180000) {
			it=0.0;
		}
		else if(ic>181000 && ic<=300000) {
			it= 0.1*(ic-1800000);
		}
		else if(ic>300001 && ic<=500000) {
			it=0.2*(ic-300000);
		}
		else if(ic>500001 && ic<=1000000) {
			it =0.3*(ic-500000);
		}
		System.out.println("the income tax for the given income is : "+ it);

	}

}
