package kr.or.bit;


//��(����(�Ϲ�, �߻�)) >> ���� �� �� �ִ�, ���� ������
public class Bird {
	//������
	public void fly() {
		System.out.println("flying");
	}
	
	//������
	//���� ����ϴ� ����� moveFast�� �ʿ信 ���� ������ ������ ���ھ�(80%) >> ��Ӱ��迡�� .. ������ ������ ���ڴ� -> protected �� ���δ�.
	//Ÿ���� �� �� ���ݾ� --- ����ڴ� protected�� ���� moveFast�� ���� �ٲ㵵 �Ǵ°ű���.. �����ϰ� �Ǵ� ��.
	protected void moveFast() { 
		fly();
	}
}
