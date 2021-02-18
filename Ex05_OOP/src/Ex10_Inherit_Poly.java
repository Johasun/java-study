/*
Tip) C# ������ (overloading, override)

Java : [��Ӱ���]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ���� �� �ִ�
[�ϳ��� ��������] >> �θ�Ÿ��

�θ�Ŭ���� Ÿ���� ���������� �������� �ڽ�Ŭ���� ��ü�� ���� �� �ִ�
 */
class Tv2{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2{ //�ڸ��� �ִ� Tv
	//Ư��ȭ, ��üȭ �� �ڿ�
	String text;
	String captionText() {
		return this.text = "���� �ڸ� ó�� �� .....";
	}
	
}


public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		
		//���� ��� ����
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("����: "+captv.power);
		captv.chUp();
		System.out.println("ä������: "+captv.ch);
		System.out.println(captv.captionText());
		
		//Car c = new Car();
		//Car c2 = c;
		
		Tv2 tv2 = captv;
		// ��Ӱ��迡�� [�θ�Ÿ��]�� [�ڽ�Ÿ��]�� [�ּ�]�� ���� �� �ִ�. (������)
		// �� �θ�� �ڽ��� �ڿ��� ������ �� �ִ�
		// �� �����Ǵ� �� �� �ִ�. ���ǵǱ� �� ���� ���� �� �ƴ�, �����ǵ� ������ �� �� �ִ�.
		// ���α׷� ���迡�� �ڽ��� �θ� ���Ǿ��� ����� (�ڽ��� �����̹��ô� ħ������ ���� ���̶�� �ϱ� ������ ������ �ڽ� �ڿ��� �� �� ���)
		
		System.out.println(tv2.toString());
		System.out.println(captv.toString());

		//tv2.captionText();
		//�ڽ��� ���� ���� �Ұ�
		tv2.power(); // ������ ���� ����
		
	
	}
	

}
