package kr.or.bit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	static final int SIZE = 6; // �ζ��� ����
	static final int MAX = 45; // ���� ���� ����
	private int[] numbers;
	private Scanner scanner;
	private Random r;
	
	public Lotto() {
		numbers = new int[SIZE];
		scanner = new Scanner(System.in);
		r = new Random();
	}
	
	public void mainLotto() {
		while(true) {
			switch (menu()) {
			case 1 : selectLottoNumbers();
			break;
			case 2 : System.out.println("Good Lucky");
			System.exit(0);
			}
		}
	}
	
	
	public int menu() {
		System.out.println(" ");
		System.out.println("*******************");
		System.out.println("**1. ��÷ �����ȣ �����ϱ�**");
		System.out.println("**2. ���α׷� ���� ^^! ^^!**");
		System.out.println("*******************");

		System.out.println("���ϴ� �޴���ȣ�� �Է��ϼ���: ");
		
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(scanner.nextLine());
						if(menu >= 1 && menu <= 2) {
							break;
						}else {
							throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("1�� Ȥ�� 2�� ���� �Է����ּ���: ");
			  }
		}while(true);
		return menu;
		
	}
	
	public void selectLottoNumbers() { // �����ϱ�

		for(int i = 0; i<numbers.length; i++) {
			int random = (int)(Math.random()*MAX)+1; // ������ȣ ����
			
			boolean extract = removeOverlap(random); // true / false �� �ޱ�
			
			if(!extract) { // �̹� �迭�� �ִ� ���ڶ�� (false��)
				i--; 
				
			} else  { // ������ 
				numbers[i] = random; // �迭�� �־��ֱ�
			}
		}
		sortLotto(numbers);
		print(numbers);
	}
	
	private boolean removeOverlap(int randomNumbers) { // �ߺ�����
		boolean result = true;
		
		for(int i = 0; i<numbers.length; i++) {
			if(randomNumbers == numbers[i]) {
				result = false;
			}
		}
		
		return result; 
	}
	
	private void sortLotto(int[] numbers) { // ����
		for(int i = 0; i<numbers.length-1; i++) {
			if(numbers[i]>numbers[i+1]) {
				int temp = numbers[i];
				numbers[i]=numbers[i+1];
				numbers[i+1]=temp;
				i=-1;
			}
		}
	}
	
	private void print(int[] numbers) { // ����ϱ�
		int average = 0;
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			sum += numbers[i];
			if( i == numbers.length-1) {
				average = sum / numbers.length;
			}
		}
		System.out.println("��� : "+average);
		System.out.println("[ ������ Lotto ��ȣ ]");
		for(int i = 0; i<numbers.length; i++) {
			System.out.printf("[%2d]", numbers[i]);
		}
	}
}
	
