
interface Irepairable{
	
}


class Unit2{
	int hitpoint; // �⺻ ������
	final int MAX_HP; // �ִ� ������
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

// ���� ����
class GroundUnit extends Unit2{
	
	GroundUnit(int hp){
		super(hp);
	}
	
}

// ���� ����
class AirUnit extends Unit2{

	AirUnit(int hp) {
		super(hp);
	}
	
}

//�ǹ�
class CommandCenter implements Irepairable{
	
}

class Tank2 extends GroundUnit implements Irepairable{

	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "[Tank2]";
	}
}

class Marine2 extends GroundUnit{

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "[Marine2]";
	}
}

//Scv �ڿ�ä�� (����, ġ�� .. ������)
class Scv extends GroundUnit implements Irepairable{

	Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "[Scv]";
	}
	
	//Scv ��üȭ, Ư��ȭ �� ���
	//repair(�����ϴ�)
	
	/*
	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) {
			System.out.println("�ļ�.....");
			tank.hitpoint += 5;
		}
	}
	
	void repair(Scv scv) {
		if(scv.hitpoint != scv.MAX_HP) {
			System.out.println("�ļ�.....");
			scv.hitpoint += 5;
		}
	}
	
	Unit ������ 30�� (25��)
	Scv�� repair �ؾ��ϴ� Unit������ �����ϸ� �Լ��� ������ ���� ����
	��� : �ϳ��� �Լ��� Unit repair �� �� �ִٸ�
	������ǰ ... ��Ӱ��� �θ�Ÿ�� .. ������  ...������ �ƴϾ�?
	
	void repair(Unit2 unit) {} >> Marine2(X) , Scv(O), Tank(O)
	void repair(GroundUnit unit) >> Marine2(X) , Scv(O), Tank(O)
	
	CommandCenter repair ���.. ��ӵ� ���µ�.. ��� ��ġ�� ����..? (���ְ� �������� �����)
	
	���
	Marine2		Scv		Tank2	CommandCenter ���� ������ ���� ...
	
	�������̽� Irepairable �θ� ... ������ ...
	
	class Scv extends GroundUnit 	implements Irepairable
	class Tank2 extends GroundUnit 	implements Irepairable
	class CommandCenter 			implements Irepairable
	
	Irepairable�� Scv�� 			�θ�Ÿ���̴�
	Irepairable�� 				Tank2�� �θ�Ÿ���̴�
	Irepairable�� CommandCenter��	�θ�Ÿ���̴�
	*/
	
	void repair(Irepairable repairunit) {
	//repairunit parameter �� Irepairable �������̽��� �����ϰ� �ִ� ��ü�� �ּҰ��� �� �� �ִ�
	//void repair(new Tank2())
	//void repair(new CommandCenter())
	//void repair(new Scv())
	//�θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִµ� ..... �θ�͸� �� �� �ִ�
	
	//����
	//1. CommandCenter �� Tank2, Scv ���� ����� Ʋ����
	//2. Irepairable repairunit�� ������ �ڿ��� ������ ���� �ʴ�
	//�׷� 	Irepairable repairunit ���ؼ� �� 3���� Unit2 �´ٰ� �����ϰ� �з��� ����
	
	// 	CommandCenter �� Tank2, Scv ������ Unit2 �̳� �ƴϳ� ...
	// 	Ÿ�Ժ� (������ : instanceof) Ȱ��
	// http://cafe.naver.com/bit2021/141
		if(repairunit instanceof Unit2) { //Tank2 �� Unit2 Ÿ���̾� ...
			Unit2 unit = (Unit2)repairunit; //unit >> Tank2, Marine
			//Tank2���� �θ�Ÿ���� Unit2 �ڿ��� ����
			
			//�θ�Ÿ���� �ּҸ� �ڽ��� �������� �ڽ����� ĳ���� �ؾ��Ѵ� *******
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP;
			}
		}else {
			// �θ� Ÿ���� unit2 �ƴ� �ſ���
			System.out.println("�ٸ� ���� ����� ���ؼ� ... Unit2 Ÿ���� �ƴϿ���");
		}
	}
}

public class Ex04_Interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		// ����
		tank.hitpoint -= 20;
		System.out.println("��ũ : "+ tank.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(tank);
		System.out.println("��ũ ���� �Ϸ� : "+ tank.hitpoint);
		
		scv.hitpoint -= 10;
		System.out.println("scv : "+ scv.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(scv);
		System.out.println("scv ���� �Ϸ� : "+ scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
		
		scv.repair(marine);
		
	}
}
