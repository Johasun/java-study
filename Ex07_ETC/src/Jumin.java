import java.util.Scanner;

class Jumin {
	//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ���� ��� ��� ... �ϴ� ����
	//main �Լ� Scanner ��� �ֹι�ȣ �Է¹ް�
	//��:6�ڸ� ��:7�ڸ�
	//�Է°� : 123456-1234567 
	//1. �ڸ��� üũ (���)�Լ� (14 ok) return true , false 
	//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ� return true, false
	//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ� void ���
	//3���� �Լ� static 
	
	// �Է°� : 123456-1234567
	
	static void main() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�ֹι�ȣ�� �Է����ּ���: ");
		System.out.println("��) 123456-1234567");
		String input = scanner.nextLine();
		
		while(true) {
			if(!juminCheck(input)) {
				System.out.println("�ֹι�ȣ �ڸ��� ����");
				main();
				break;
			}
			if(!backNumberCheck(input)) {
				System.out.println("�޹�ȣ ù��° �ڸ��� 1~4 ���� �ƴմϴ�.");
				main();
				break;
			} else {
				print(input);
				break;
			}
		}
	}
	
	static boolean juminCheck(String input) {
//		// �ڸ��� üũ(���)�Լ� (14 ok) return true, false
//		boolean result = false;
//		if(input.length()==14 && input.substring(6,7).equals("-")) {
//			result = true;
//		}
//		return result;
		
		return input.length() == 14?(input.charAt(6)=='-' ? true : false) : false;
	}
	
	static boolean backNumberCheck(String input) {
		// �޹�ȣ ù��° �ڸ��� 1~4 ������ ���� ��� �����Լ� return true, false
		boolean result = false; // 7��° �ڸ���
		int sevenNumber = Integer.parseInt(input.substring(7, 8));
		if(sevenNumber>=1 && sevenNumber<=4) {
			result = true;
		}
		
		return result;
	}
	
	static void print(String input) {
		// �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� 2,4 ���� ��� ����Լ�
		if(input.charAt(7)=='1' || input.charAt(7)=='3') {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		
	}
	
	
}
