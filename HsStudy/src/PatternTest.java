import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternTest {
	public static void main(String[] args) {
		
		String pattern = "^\\d{3}-\\d{3}$";
		/*
		�� �����ȣ �ּ�
		ex) 100-111
		1) ^ : ����
		2) \\d{3} :���� 3�ڸ��� �� �� ����
		3) - : ��� '-'�� ���ߵȴ�.
		4) \\d{3} : ���� 3�ڸ��� �� �� ����
		5) $ : ��
		
		*/
		System.out.println("�����ȣ�� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		boolean i = Pattern.matches(pattern, input);
		if(i==true) {
			System.out.println("�ùٸ� �����ȣ�Դϴ�.");
		} else {
			System.out.println("�ùٸ������� �����ȣ�Դϴ�.");
		}
		
	}
}
