package kr.or.bit;

public class Book {
	private String name;
	private int price;
	
	public Book(String n, int p) {
		name = n;
		price = p;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void bookInfo() {
		System.out.println("å �̸�: "+name+",å ����: "+price);
	}
	
}
