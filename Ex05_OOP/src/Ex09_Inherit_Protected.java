import kr.or.bit.Bird;

//Bird ��ӹ޾Ƽ� ����

class Bi extends Bird{
	@Override
	protected void moveFast() {
		super.moveFast(); // �θ��ʿ� �ִ� �� �θ���
	}
}

class Ostrich extends Bird{
	// ��üȭ Ư��ȭ
	void run() {
		System.out.println("run^^");
	}
	
	@Override
	protected void moveFast() {
		run();
	}
}



public class Ex09_Inherit_Protected {
	public static void main(String[] args) {
		Bi bi = new Bi();
		bi.fly();
		//POINT bi.moveFast ��� �Ⱥ��̳�? - protected -> ��Ӱ��迡���� �ǹ̰� �ִ�.
		//bi.moveFast(); ��Ӱ��迡���� .. ��Ӱ��迡�� �����Ǹ� ���� ������ �� �� ����. ������ �����Ǹ� �ض�~!
		// ������ == �������̵�
		
		//�������̵� ��
		bi.moveFast();
		
		//Ostrich
		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();
	}
}
