package kr.or.bit;

import java.util.Scanner;

public class Computer {
	// �����Ӽ�
	private int price;
	private String brandname;
	private int serialNumber;
	private String color;
	
	boolean power;
	Scanner scanner = new Scanner(System.in);
	
	Computer(int price, String brandname, int serialNumber, String color){
		this.price = price;
		this.brandname = brandname;
		this.serialNumber = serialNumber;
		this.color = color;
	}
	
	// ��ǰ
	MainBody mainbody;
	Keyboard keyboard;
	Monitor monitor;
	
	// ����
	boolean powerSaving;
	
	// <���>
	// �Է�
	public String input() {
		System.out.println("�Է±���Դϴ�.");
		System.out.println("�Է�: ");
		String userInput = scanner.nextLine();
		return userInput;
	}
	// ���
	public void print(String s) {
		System.out.println("��±���Դϴ�.");
		System.out.println(s);
	}
	
	// ���� ON
	public void powerOn() {
		System.out.println("������ �����ϴ�.");
		power = true;
	}
	// ���� OFF
	public void powerOff() {
		System.out.println("������ �����ϴ�.");
		power = false;
	}
	
	// �������
	public void powerSavingOn() {
		System.out.println("������尡 �����ϴ�.");
		powerSaving = true;
	}
	// ������� ����
	public void powerSavingOff() {
		System.out.println("������尡 ����˴ϴ�.");
		powerSaving = false;
	}
	
	public void printCondition() {
		System.out.println("���� ����");
		System.out.println("����: "+power+", �������: "+powerSaving);
	}
	
	
	// ��Ģ����
	public void fourFAO(int a, int b) {
		System.out.println(a +" + " +b+"="+(a+b));
		System.out.println(a + " - " + b + "="+(a-b));
		System.out.println(a + " * " + b + "="+(a*b));
		System.out.println(a + " / " + b + "="+(a/b));
		
	}
	
	
	
	
	
}
