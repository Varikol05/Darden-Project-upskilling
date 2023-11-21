package com.springboot.bean;

public class CreditCard{
	private String cardname;
	private String cardno;
	
	
	public CreditCard() {
		
	}
	
	
	public CreditCard(String cardname,String cardno ) {
		super();
		this.cardname=cardname;
		this.cardno=cardno;
		
	}
	
	public String getCardName() {
		return cardname;
	}
	
	public void setCardName(String cardname) {
		this.cardname=cardname;
		
	}
	
	public String getCardNo() {
		return cardno;
	}
	
	public void setCardNo(String cardno) {
		this.cardno=cardno;
	}
	
	
	@Override
	public String toString() {
		return "CrediCard [cardname=" +cardname +", cardno=" +cardno +"]";
	}
}