import java.util.Scanner;

public class Check {
	private Scanner scanner;
	private String[][] str;

	
	Check(String[][] str){
		scanner = new Scanner(System.in);
		this.str = str;

	}
	
	void checkSystem() {
		// ���Ź�ȣ ��ȸ
		scanner.nextLine();
		
		// ���� ��ȣ �ޱ�
		System.out.println("���Ź�ȣ�� �Է����ּ���");
		String serialNumber = scanner.nextLine(); 
		
		// ���� ��ȣ Ȯ��
		for(int row = 0; row<str.length; row++) {
			for(int col = 0; col<str[row].length; col++) {
				if(str[row][col].equals(serialNumber)) { // ������ �¼� ���
					System.out.printf("������ �����Ͻ� �¼��� %d-%d �Դϴ�.\n", row+1, col+1);
					return;
				}
				else {
					System.out.println("���Ź�ȣ�� �ùٸ��� �ʽ��ϴ�.");
					System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�? 1. �� 2. �ƴϿ�");
					int userAnswer = scanner.nextInt();
					if (userAnswer==1) {
						checkSystem();
						return;
					} else {
						return;
					}
				}
			}
		}
	}
}
