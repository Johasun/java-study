import kr.or.bit.Pclass;

/*
private, default, public, [��Ӱ���]���� protected

protected : ���� (��鼺) > default, public

>> ����� ���� Ŭ���� �ȿ��� protected �����ڴ� default�� ���ƿ�
>> �ᱹ ��Ӱ��迡���� �ǹ̸� ������

 */
class Dclass{
	public int i;
	private int p;
	int s; // default
	protected int k; //default (�Ϲ� Ŭ������ ����� ���� ����)
	
}

class Child2 extends Pclass{
	void method() {
		this.k = 100; // ��Ӱ��� protected public ó��
		System.out.println(this.k);
	}
	
}

public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.method();
	}

}
