import java.util.Scanner;

public class Ex02_Menu {
		//��� ... �Ϲ� ... ���� (����, ���� , ��ǰ(����:Ŭ����))
		Scanner sc = new Scanner(System.in); //��ǰ(����:Ŭ����)
	
		//���
		void inputRecord() {
			System.out.println("���������� �Է� :");
		}
		void deleteRecord() {
			System.out.println("���������� ���� :");
		}
		void sortRecord() {
			System.out.println("���������� ���� :");
		}
		
		
		int displayMenu() {
			System.out.println("***************");
			System.out.println("****���� ����****");
			System.out.println("1. �л����� �Է��ϱ�");
			System.out.println();
			System.out.println("2. �л����� �����ϱ�");
			System.out.println();
			System.out.println("3. �л����� �̸��� �����ϱ�");
			System.out.println();
			System.out.println("4. ���α׷� ����");
			System.out.println();
			
			
			int menu = 0;
			do {
				  try {
						    menu = Integer.parseInt(sc.nextLine());
							if(menu >= 1 && menu <= 4) {
								break; //while Ż�� (1<= menu <=4)
							}else {
								//1���� �۰ų� 4���� ū ���� .. ���α׷����� ���� (x)
								//���� ���� ���ڴ� (���� ����� ����)
								//System.out.println("�߸� �Է� �ϼ̽��ϴ�");
								throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
							}
				  }catch (Exception e) {
					  System.out.println(e.getMessage());
					  System.out.println("�޴� ���� ���� �߻�");
					  System.out.println("�޴� 1~4������ �Է�");
				  }
			}while(true);
			//���� : ����ڰ� 1 ~ 4���� ��ȣ�߿��� �ϳ��� ����
			return menu;
		}
	
	
	
	public static void main(String[] args) {
		
		Ex02_Menu ex02 = new Ex02_Menu();
		
		while(true) {
			
			switch (ex02.displayMenu()) {
				case 1 : ex02.inputRecord();
					break;
				case 2 : ex02.deleteRecord();
					break;
				case 3 : ex02.sortRecord();
					break;
				case 4 : System.out.println("���α׷� ����");
						 //return;       //main ����
					 	System.exit(0); //���α׷� ���� ���� (kill)
			}
		}

	}

}
