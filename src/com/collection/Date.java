package com.collection;

public class Date {
Integer date;
Integer month;
Integer year;
public Integer getDate() {
	return date;
}
public void setDate(Integer date) {
	this.date = date;
}
public Integer getMonth() {
	return month;
}
public void setMonth(Integer month) {
	this.month = month;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
public Date(Integer date, Integer month, Integer year) {
	super();
	this.date = date;
	this.month = month;
	this.year = year;
}
public Date() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
}

}
