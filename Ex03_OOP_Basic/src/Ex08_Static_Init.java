//static ���� 	>> ��� ��ü�� [���� ��]�� ������ �Ұž�
//instance ���� 	>> ��� ��ü�� [�ٸ� ��]�� ������ �Ұž�

class InitTest{
	static int cv = 10;
	static int cv2; // static int cv2 = cv+222; (X)
	int iv = 11;
	
	static { // static ��(static �ʱ��� ���� ��)
		cv = 10; // member field �ʱ�ȭ , ���⼭ �ʱ�ȭ�ϳ� ������ �ƴѰ�?
		cv2 = cv+222; // member field������ ������ ���� ���� ���ϱ� �����̴�. // ������(���۰�) ���� ���� ....
		// static ���� static int�� �޸𸮿� �ö� ���� �ٷ� �ö󰣴�... cv -> cv2 -> static{} -> iv
	}

	{ // instance variable �ʱ�ȭ ��
		// new ���ؼ� ��ü�� �����ǰ� �޸𸮿� int iv ������ �޸𸮿� �ö󰡰� ���� �ٷ� ȣ�� >> {	}
		System.out.println("�ʱ��� ��");
		if(iv > 10) iv  = 100; // if(iv > 10) {iv = 100}
		// ����ʵ忡���� ���ǹ��� ���� ���ϱ� ������ ���� �����Ѵ�.
	}

}


public class Ex08_Static_Init {
	public static void main(String[] args) {
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		
		// �Ϲ��ڿ�
		InitTest inittest = new InitTest();
		System.out.println(inittest.iv);
	}

}
