// ���� : Unit

// Unit : ����⵿ (�̵���ǥ, �̵�, �����) : �߻�ȭ, �Ϲ�ȭ
// Unit : �̵� ����� �ٸ��� ( �̵� ����� Unit ���� ������ ����)
// �߻�Ŭ���� 

abstract class Unit{
	int x, y;
	
	void stop() {
		System.out.println("Unit stop");
	}
	
	abstract void move(int x, int y); // �߻��ڿ� //��������
}

//Tank
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank �̵�: "+this.x + ", "+this.y);
	}
	
	//Tank ��üȭ, Ư��ȭ
	void changeMode() {
		System.out.println("��ũ ��ȯ ���");
	}
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine �̵�: "+this.x + ", "+this.y);
	}
	
	// Ư��ȭ, ��üȭ
	void stimpack() {
		System.out.println("������ ���");
	}
	
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip �̵�: "+this.x + ", "+this.y);
	}
	
	//Ư��ȭ, ��üȭ
	void load() {
		System.out.println("Unit Load..");
	}
	
	void unload() {
		System.out.println("Unit Unload..");
	}
	
}
public class Ex_02_abstract_class {
	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(500, 200);
		t.stop();
		t.changeMode();
		
		Marine m = new Marine();
		m.move(500, 200);
		m.stop();
		m.stimpack();
		
		//1. ��ũ 3�븦 ����� [���� ��ǥ] �̵� ��Ű���� (555, 444)
		Tank[] tankarr = {new Tank(), new Tank(), new Tank()};
			for(Tank tank : tankarr) {
				tank.move(555, 444);
			}
		
		//2. ��ũ 1, ���� 1, ����� 1 ���� ��ǥ�� �̵� ��Ű���� (666, 444)
		Unit[] unitlist = {new Tank(), new Marine(), new DropShip()};
			for(Unit unit : unitlist) {
				unit.move(666, 444);
			}
	}

}
