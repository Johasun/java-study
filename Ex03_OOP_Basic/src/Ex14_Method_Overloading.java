import java.io.PrintStream;

/*
 * 
 * OOP (��ü ���� ���α׷���) >> ���赵 ����� 
 * 1. ���(���뼺)
 * 2. ĸ��ȭ(����ȭ) : private (�����Ҵ�, �����Ҵ�) >> getter, setter
 * 3. ������ : �ϳ��� Ÿ������ �������� ��ü�ּҸ� ���� �� (�ڵ����� �ѱ�Ÿ�̾� �� �ƴ϶� �̽��� ���.. �ϳ��� Ʋ �ȿ� ���������� �ٲ㳥 �� �ִ� ��)
 * 
 * >> method overloading 
 * >> �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
 * System.out.println() >> println() �̸��� 1�� ����� ������
 * 1. ������� (X)
 * 2. �����ڰ� �������� ������ ���ؼ� ���� (���ϰ� ��)
 * 
 * ����)  �Լ��� �̸��� ����  parameter [����] �� [Ÿ��] �� �ٸ���
 * 1. �Լ��� �̸��� ���ƾ� �Ѵ�
 * 2. parameter ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
 * 3. return type �����ε��� �Ǵ� ������ �ƴϴ�
 * 4. parameter ������ �ٸ��� �����Ѵ�.
 * 
 * class out{
 * 		public void println(){}
 * 		public void println(int i) {}
 * 		public void println(String s) {}
 * 
 * 		public void println() {}
 * 		public void printlnint(int i) {}
 * 		public void printlnString(String s) {}
 * }
 * 
 */

class Human2{
	String name;
	int age;
}

class OverTest{
	int add(int i) {
		return 100 + i;
	}
	
	// �����ε�
	int add(int i, int j) {
		return i + j;
	}
	
//	String add(int j) { �浹
//		return "";
//	}
	
	String add(String s) {
		return "hello" + s;
	}
	
	String add(String s, int i) { // ����
		return null;
	}
	
	String add(int i, String s) { // ����(������ �ٸ��� ����)
		return null;
	}
	
	void add(Human2 human) { // ����
		human.name = "ȫ�浿";
		human.age = 100;
		System.out.println(human.name + ", " + human.age);
	}
	//Human2 add(Human2 h) {} // �浹
}

public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		OverTest ot = new OverTest();
		
		ot.add(new Human2());
		
		String result = ot.add("�氡�氡");
		System.out.println(result);
	}

}
