import java.util.Scanner;

public class Ex11_do_while_Menu {
	//��� ... �Ϲ� ... ���� (����, ���� , ��ǰ(����:Ŭ����))
	Scanner sc = new Scanner(System.in); //��ǰ(����:Ŭ����)
	public int[][] seats = new int[4][5];
	
	//���
	void inputRecord() { // �����ϱ�
		System.out.println("********�¼� ��Ȳ********");
		
		// �¼���Ȳ ǥ ���̱�
		for(int i = 0; i<seats.length; i++	) {
			System.out.println(seats[i]);
			}
			
		
		
		// �¼��� �������ּ���
		
		// ����� �¼� �Է�
		
		// ���� ���� Ȯ��
		
		// ���� ���� ��� ���
		
		// ���� �Ϸ� ��� ( �¼���ȣ + ���� ��ȣ )
		
	}
	void deleteRecord() { // ������ȸ
		System.out.println("********���� ��ȸ********");
		
		// ���Ź�ȣ �Է� �ޱ�
		
		// �ùٸ��� ���� ���Ź�ȣ ���� ���
		// ���Ź�ȣ Ȯ���Ͽ� �¼� ���
		
	
	}
	void sortRecord() { // �������
		System.out.println("********���� ���********");
		
		// ���Ź�ȣ �Է� �ޱ� -> ���� ��ȸ�� �ߺ�
		
		// ���� ��ȣ ����ϱ� -> ������� ������ȸ�� ����
		
		// ���� ��� ���� �޽��� ���
		
		// ���� ����ϱ�
	}
	
	
	
	
	int displayMenu() {
		System.out.println("********************");
		System.out.println("****��ȭ ���� �ý���****");
		System.out.println("********************");
		System.out.println("1. �����ϱ�");
		System.out.println();
		System.out.println("2. ������ȸ");
		System.out.println();
		System.out.println("3. �������");
		System.out.println();
		System.out.println("4. ���α׷� ����");
		System.out.println();
		
		
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine()); // �޴� ��ȣ �Է� �ޱ�
					    
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
		return menu; // ����ڰ� ������ �޴� ��ȣ ��ȯ
	}
	
	public static void main(String[] args) {
		Ex11_do_while_Menu ex11 = new Ex11_do_while_Menu();
		while(true) {
			switch (ex11.displayMenu()) { // �޴� ȭ�� ���
			case 1 : ex11.inputRecord(); // �����ϱ�
				break;
			case 2 : ex11.deleteRecord(); // ������ȸ
				break;
			case 3 : ex11.sortRecord(); // �������
				break;
			case 4 : System.out.println("���α׷� ����");
					 //return;  //main ����
					 System.exit(0); //���α׷� ���� ���� (kill)
			}
		}
	}

}