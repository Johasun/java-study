package test;

import java.util.Scanner;

public class Cinema {
	Scanner scanner;
	private String[][] seat;
	String cerealNumber = "10000000";
	
	Cinema(){
		seat = new String[4][5];
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				seat[i][j]="__";
			}
		}
		scanner = new Scanner(System.in);
	}
	
	// �޴�ȭ��
	private int CinemaMenu() {
		int menu = 0;
		System.out.println("***********************");
		System.out.println("******��ȭ ���� �ý���******");
		System.out.println("***********************");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ������ȸ");
		System.out.println("3. �������");
		System.out.println("4. ���α׷�����");
		menu = scanner.nextInt();
		return menu;
	}
	
	// ���α׷� ����(�ݺ�)
	public void menuWhile() {
		loop_1: while(true) {
			switch(CinemaMenu()) {
			case 1 : // �����ϱ�
				booking();
				break;
			case 2 : // ������ȸ
				checkSystem();
				break;
			case 3 : // �������
				break;
			case 4 :
				break loop_1;
			default :
				System.out.println("�ùٸ� �޴����� �ƴմϴ�.");
				System.out.println("�ٽ� �Է����ּ���");
				break;
			}
		}
	}
	
	// �����ϱ�
	private void booking() {
		
		System.out.println("******�¼� ��Ȳ******");
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				String seatNumber = "["+(i+1)+"-"+(j+1)+"]";
				System.out.print((seat[i][j].equals("__")) ? seatNumber : "����");
			}
			System.out.print("\n");
		}
		System.out.println("-------------------");
		System.out.println("�¼��� �������ּ���. ��)1-1");
		System.out.println("�̹� ���ŵ� �¼��� \"����\"��� ǥ�õ˴ϴ�.");
		scanner.nextLine();
		String userNumber = scanner.nextLine();
		

		boolean result = true;
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				String choiceNumber = (i+1)+"-"+(j+1);
				if(userNumber == choiceNumber && seat[i][j]=="__") {
					result = true;
				}
			}
		}
		if(!result) {
			System.out.println("�̹� ���ŵǾ��ִ� �¼��Դϴ�.");
		}else {
			System.out.println("���� �����մϴ�. �����Ͻðڽ��ϱ�?");
			System.out.println("��(1), �ƴϿ�(2), �ʱ�ȭ��(0)�� �ϳ��� �Է����ּ���.");
			int userChoice = scanner.nextInt();
			
			switch(userChoice) {
			case 1 : 
				for(int i = 0; i<seat.length; i++) {
					for(int j = 0; j<seat[i].length; j++) {
						String choiceNumber = (i+1)+"-"+(j+1);
						if(choiceNumber == userNumber) {
							seat[i][j]=cerealNumber;
						}
					}
				}
				System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
				System.out.printf("������ �¼���ȣ:[%s] / ���Ź�ȣ:[%s]\n", userNumber, cerealNumber);
				break;
			case 2 :
				
				break;
			case 3 :
				break;
			}
		}
		
		

	}
	
	// ������ȸ
	void checkSystem() {
		// ���Ź�ȣ ��ȸ
		scanner.nextLine();
		
		// ���� ��ȣ �ޱ�
		System.out.println("���Ź�ȣ�� �Է����ּ���");
		String serialNumber = scanner.nextLine(); 
		
		// ���� ��ȣ Ȯ��
		for(int col = 0; col<seat.length; col++) {
			for(int row = 0; row<seat[col].length; row++) {
				if(seat[col][row].equals(serialNumber)) { // ������ �¼� ���
					System.out.printf("������ �����Ͻ� �¼��� %d-%d �Դϴ�.\n", col+1, row+1);
				}
			}
		}
	}
	// �������
	
}
