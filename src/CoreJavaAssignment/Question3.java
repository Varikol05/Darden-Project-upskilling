package CoreJavaAssignment;

public class Question3 {
	public static Double simpleInterest(Double p,int t,int r) {
	
	return (p*t*r)/100;
	
	}
	public static Double compoundInterest(Double p,int t,int r) {
		double CI=p*Math.pow(1.0+r/100.0, t)-p; 
		return CI;
	}
	public static void main(String[] args) {
		Double principal=1000.0;
		int time=2;
		int rate=2;
		System.out.println("the simple interest for given Principal = "
		+principal+": Rate of interest ="+rate+" : numeber of years = "
				+ time+"is :"+simpleInterest(principal, time, rate));
		System.out.println("the compound interest for given Principal = "
				+principal+": Rate of interest ="+rate+" : numeber of years = "
						+ time+"is :"+compoundInterest(principal, time, rate));

	}

}
