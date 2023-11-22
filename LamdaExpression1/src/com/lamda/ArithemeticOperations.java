package com.lamda;


@FunctionalInterface
interface Arithemetic{
	int operations(int a,int b);
}
public class ArithemeticOperations{
	public static void main(String args[]) {
		Arithemetic addition=(a,b)->(a+b);
		System.out.println("addition="+addition.operations(5, 6));
		Arithemetic subtraction=(a,b)->(a-b);
		System.out.println("subtraction="+subtraction.operations(5, 6));
		Arithemetic multiplication=(a,b)->(a*b);
		System.out.println("multiplication="+multiplication.operations(5, 6));
		Arithemetic division=(a,b)->(a/b);
		System.out.println("Division="+division.operations(30, 6));
	}
	
}
		
		
		
	

