/*
 * 1. static member field (��ü�� �����ڿ�)
 * 
 * 2. static method : ���� ���̴ϱ�(����) >> ���ϰ� ����ϰ� >> ��ü���� ���̵� >> static
 * 	  why : Math.random() >> Math m = new Math(); m.random() �̷��� ���� �ʾ�����
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		// �Ϲ��Լ����� 
		// cv ���� ������ �� �� �ִ�
		// ���� ... 
		// static �ڿ��� �Ϲ��ڿ����� �׻� �޸𸮿� ���� ����
		cv = 1000;
	}
	
	static void sm() {
		// static �Լ����� 
		// �Ϲ��ڿ��� iv���� ������ �� �� ����
//		iv = 100;
		// error �� ���� �Ϸ��� ( static ���� ��ƶ� )
		cv = 2222;
	}
}

public class Ex09_Static_Method {

	public static void main(String[] args) {

		System.out.println(StaticClass.cv);
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		//�Ϲ��ڿ� (��ü ����)
		 StaticClass sc = new StaticClass();
		 sc.m();
		 sc.sm();
		 System.out.println(sc.iv);
		 System.out.println(sc.cv);
		
		
	}

}
