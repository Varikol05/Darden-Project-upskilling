package com.lamda;

interface Lamda{
	void criteria(int price);
}
public class Order {
	public static void main(String args[]) {
		Lamda order=(a)->{
			if(a>10000) {
				System.out.println("order is more than 10000");
				System.out.println("Order completed");
			}
			else{
				System.out.println("not accepted");
			}
		};
		order.criteria(1000);
	}
}
		
