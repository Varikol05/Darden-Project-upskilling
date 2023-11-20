package CoreJavaAssignment;

public class Question4 {

	public static void main(String[] args) {
		int arr[]= {60,63,65};
		int f=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>60) {
		f++;	
		}	
		}
		switch(f) {
		case 3:System.out.println("the student is passed");
				break;
		case 2 :System.out.println("the student is promoted");
					break;
		case 1 : System.out.println("the student failed");	
					break;
		default :System.out.println("no data");			
					
		
		}
		}

}
