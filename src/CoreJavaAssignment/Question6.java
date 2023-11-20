package CoreJavaAssignment;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		int f=3;
		int temp=0;
		for(int i=1;i<=3;i++) {
			Scanner sc=new Scanner(System.in);
			String username=sc.next();
			String password=sc.next();
			if(username.equals("venkatesh") && password.equals("venkatesh")) {
				System.out.println("welcome " +username);
			temp=1;
				break;
			}
			
		}
		if(temp!=1)
		System.out.println("contact admin");

	}

}
