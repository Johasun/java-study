import java.util.Properties;

/*
Map �������̽��� ������ Ŭ����
Ư���� ���� : <String, String> (key, value) ����
������ 
DB �������� (id=kglim, pwd=1004(
App ��ü�� ���Ǵ� �ڿ� ����
ȯ�溯�� 
���α׷� ����
���� ���� ���
���� ����
 */
public class Ex16_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin", "bit@bit.co.kr");
		prop.setProperty("version", "1.x.x.x");
		prop.setProperty("path", "C:\\Temp\\images");
		// ������ ���� ������
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("version"));
		
		
	}
}
