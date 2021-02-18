//���� <-> ���
//��� : �ѹ����� �ʱ�ȭ(���ʰ��� �Ҵ�) �Ǹ� ���� �Ұ�
//����ڿ� : ������(�ֹε�Ϲ�ȣ) , ���� : PI = 3.141592 , ������ȣ , �ý��� ������ȣ
//����� ���������� �빮�� 

//java	: final int NUM = 10;
//c#	: const integer NUM = 10; 

//final   Ű����
// final class Car{} >> ��ӱ��� >> final Math
// �Լ��տ� >> public final void print(){} >> ��Ӱ��迡�� ������ ���� (override ����)
// public static final void print() >> ��ü�� ���� �ڿ�

class Vcard{
	final String KIND = "heart";
	final int NUM = 10;
	void method() {
		System.out.println(Math.PI);
	}
}

class Vcard2{
	final String KIND;
	final int NUM;
	
	Vcard2() {
		this.KIND = "heart";
		this.NUM = 10;
	}
	
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
	
}
public class Ex07_Final {
	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		System.out.println(vcard.KIND);
		vcard.method();
		
		Vcard2 vcard2 = new Vcard2();
		System.out.println(vcard2);
		
		Vcard2 vcard3 = new Vcard2("space", 10);
		System.out.println(vcard3);
		
	}

}
