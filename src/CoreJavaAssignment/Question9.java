package CoreJavaAssignment;

public class Question9 {

	public static void main(String[] args) {
		
		int A[]= {60,61,62};
		int B[]= {60,61,62};
		int C[]= {60,61,62};
		int Atotal=A[0]+A[1]+A[2];
		int Aaverage=Atotal/3;
		int Btotal=B[0]+B[1]+B[2];
		int Baverage=Btotal/3;
		int Ctotal=C[0]+C[1]+C[2];
		int Caverage=Ctotal/3;
		int sub1Total=A[0]+B[0]+C[0];
		int sub1Average=sub1Total/3;
		int sub2Total=A[1]+B[1]+C[1];
		int sub2Average=sub2Total/3;
		int sub3Total=A[2]+B[2]+C[2];
		int sub3Average=sub3Total/3;
		System.out.println("Student A Total and A average is "+ Atotal + Aaverage);
		System.out.println("Student B Total and B average is "+ Btotal + Baverage);
		System.out.println("Student C Total and C average is "+ Ctotal + Caverage);
		System.out.println("Student Sub1 Total and Sub1 average is "+ sub1Total +sub1Average);
		System.out.println("Student Sub2 Total and Sub2 average is "+ sub2Total +sub2Average);
		System.out.println("Student Sub3 Total and Sub3 average is "+ sub3Total +sub3Average);
	}

}
