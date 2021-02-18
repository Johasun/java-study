/*
String >> Ŭ���� > new ���ؼ� ��밡�� > �Ϲ����� ��Ÿ�� ó�� ����ص� ������ ���� 
String ������ �ִ� �� ���� �Լ� (���ڿ� .. �����ϴ� ���� ( ��ġ�� �ڸ��� ���̰� ) 
String ������ �پ��� �Լ� Ȱ��  (static �Լ� + �Ϲ� �Լ�) 
�ּ� 15�� ~ 20 �ϱ� ���� �������� ....

*/
public class Ex05_String_Class2 {
	public static void main(String[] args) {
		String str = "";
		System.out.println(">"+str+"<");
		// ����� : int, double �� ���� ���
		
		String[] strarr = {"aaa", "bbb", "ccc"};
		for(String s : strarr) {
			System.err.println(s);
		}
		
		//////////////////////////////���ݱ���///////////
		String str2 = "ȫ�浿";
		System.out.println(str2.length());
		System.out.println(str2.toString()); // Object >> toString() ������ 
		System.out.println(str2); //toString() ����
		
		String str3 = new String("������"); // ������ �̷��� ��� �ϴ� ��.
		
		// 1. String name = "�����ٶ�";
		// String Ŭ������ ���������� ����Ǵ� �ڷᱸ�� char[] >> [��][��][��][��][��]
		// class String extends Object {char[] value .... toString() .. length()}
		
		String str4 = "AAA";
		String str5 = "AAA";
		System.out.println(str4);
		System.out.println(str5.toString());
		System.out.println(str4 == str5);
		// String �ϱ����� ���� ���� ������ ��Ȱ���� �Ѵ�.
		// ���� �ΰ��� ���� ��Ȱ�� �߱� ������ ���� ���� ����.
		// == ������ ���� �� (str4 (�ּҰ�), str5 (�ּҰ�)
		// ���� �ּ�
		// �ּҰ� �ƴ϶� ���� ������ �ִ� ���� �� (���ڿ�)
		// String �񱳸� == ���� �ٺ� ... why
		
		String str6 = new String("BBB");
		String str7 = new String("BBB");
		System.out.println(str6==str7); //false
		// String ���鶧 new ����ϸ� ���������� �޸� �Ҵ� 
		// ���⼱ new�� ������ ������ ���� ���̶�
		// ��Ȱ���� �ƴ϶� ���ο� �޸𸮸� ����� ��.
		System.out.println(str6.equals(str7));
		//equals�� ���� �޸𸮿� �ִ� ���� ���Ѵ�. //**********~~~~~~~~~~ �ڡڡڡ١١١ڡڡڡ١١١ڡڡڡ١١�
		
		// ���ڿ��� �񱳴� equals ���
		
		// �ͼ���
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		s = "A";
		// ���� (����)
		// String 1000���� ���ڸ� �����ض� ? => ���ɻ� ���� ����.
		// �̰� �����ϱ� ����
		// ���� ������ ....
		//StringBuffer
		//StringBuilder
		// ������ ���� ������ ������ �˰� �ִٸ� �� �ΰ��� ����.
		
	}

}
