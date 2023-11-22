package CoreJavaAssignment;

public class Question2 {

	public static int  findArmStrongNumber(int number) {
		
		int i=number; 
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
		return	number;
		}
		return 0;
		
		
	}
	
	public static void main(String[] args) {
	
   System.out.println("the Armstrong numbers in the given range is :");
   for(int i=100;i<1000;i++) {
	int r=findArmStrongNumber(i);
	if(r!=0) {
		System.out.println(r);
	}
    }
	}

}
