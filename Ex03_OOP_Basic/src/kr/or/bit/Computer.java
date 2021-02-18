package kr.or.bit;

import java.util.Scanner;

public class Computer {
	// 고유속성
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
	
	// 부품
	MainBody mainbody;
	Keyboard keyboard;
	Monitor monitor;
	
	// 상태
	boolean powerSaving;
	
	// <기능>
	// 입력
	public String input() {
		System.out.println("입력기능입니다.");
		System.out.println("입력: ");
		String userInput = scanner.nextLine();
		return userInput;
	}
	// 출력
	public void print(String s) {
		System.out.println("출력기능입니다.");
		System.out.println(s);
	}
	
	// 전원 ON
	public void powerOn() {
		System.out.println("전원이 켜집니다.");
		power = true;
	}
	// 전원 OFF
	public void powerOff() {
		System.out.println("전원이 꺼집니다.");
		power = false;
	}
	
	// 절전모드
	public void powerSavingOn() {
		System.out.println("절전모드가 켜집니다.");
		powerSaving = true;
	}
	// 절전모드 해제
	public void powerSavingOff() {
		System.out.println("절전모드가 종료됩니다.");
		powerSaving = false;
	}
	
	public void printCondition() {
		System.out.println("현재 상태");
		System.out.println("전원: "+power+", 절전모드: "+powerSaving);
	}
	
	
	// 사칙연산
	public void fourFAO(int a, int b) {
		System.out.println(a +" + " +b+"="+(a+b));
		System.out.println(a + " - " + b + "="+(a-b));
		System.out.println(a + " * " + b + "="+(a*b));
		System.out.println(a + " / " + b + "="+(a/b));
		
	}
	
	
	
	
	
}
