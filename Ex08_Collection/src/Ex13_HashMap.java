import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {
	public static void main(String[] args) {
		//������ȣ, �⼮��, �����ȣ, ȸ������
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//ȸ�������� ó�� ������� (ȸ������)
		//�α��� 
		//id(O) . pw(O) >> ȸ���� �氡
		//id(O) . pw(X) >> ��й�ȣ ���Է�
		
		//id(X) . pw(O) >>
		//id(X) . pw(x) >> id�� Ʋ���� pw�� �Ⱥ��� �ȴ�
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id, pwd �Է����ּ���");
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase(); //�������� �ҹ��ڷθ�
			
			System.out.println("PWD");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)) {
				//id(X)
				System.out.println("id ���� �ʽ��ϴ� ���Է�");
			} else {
				//id(O)
				if(loginmap.get(id).equals(pwd)) {
					System.out.println("ȸ���� �氡^^");
					break;
				}else {
					System.out.println("���Ȯ��");
				}
			}
		}
	}
}
