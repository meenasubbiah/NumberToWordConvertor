package com.myapp.domain;

public class Number {
	private int number;
	private int length;
	private int parts;
	private int initDigits;
	
	
	public Number(int number) {
		super();
		this.number = number;
		this.length=Integer.toString(this.number).length();
		this.parts=length/3;
		this.initDigits=length%3;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getParts() {
		return parts;
	}
	public void setParts(int parts) {
		this.parts = parts;
	}
	public int getInitDigits() {
		return initDigits;
	}
	public void setInitDigits(int initDigits) {
		this.initDigits = initDigits;
	}
	


}
