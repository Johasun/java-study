

import java.util.Scanner;
public class Cancel {

	private Scanner scanner;

	public Cancel() {

		scanner = new Scanner(System.in);

	}

	public void Cancel() {
		
	    int reservationNumber;
		System.out.println("�����ȣ�� �Է����ּ���");

		Scanner scanner = new Scanner(System.in);
        reservationNumber = scanner.nextInt();
        System.out.println(reservationNumber);
        System.out.println("������ �����Ͻ� �¼��� "row+"-"+col+" �Դϴ�.");
        
        System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
        System.out.println("��(1), �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
        
        
		int userNumber;
		userNumber = scanner.nextInt();

			
			if(userNumber == 1) {
				seat[row][col]="___";
				System.out.println("���Ű� ��ҵǾ����ϴ�. �����մϴ�.");
			}if else(userNumber == 2) {
				
			
				//�޴��� ���ư���
				return Cinema;
			}

		}

	}
}

