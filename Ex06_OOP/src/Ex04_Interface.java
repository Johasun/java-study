
interface Irepairable{
	
}


class Unit2{
	int hitpoint; // 기본 에너지
	final int MAX_HP; // 최대 에너지
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

// 지상 유닛
class GroundUnit extends Unit2{
	
	GroundUnit(int hp){
		super(hp);
	}
	
}

// 공중 유닛
class AirUnit extends Unit2{

	AirUnit(int hp) {
		super(hp);
	}
	
}

//건물
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

//Scv 자원채취 (광물, 치료 .. 에너지)
class Scv extends GroundUnit implements Irepairable{

	Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "[Scv]";
	}
	
	//Scv 구체화, 특수화 된 기능
	//repair(수리하다)
	
	/*
	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) {
			System.out.println("파손.....");
			tank.hitpoint += 5;
		}
	}
	
	void repair(Scv scv) {
		if(scv.hitpoint != scv.MAX_HP) {
			System.out.println("파손.....");
			scv.hitpoint += 5;
		}
	}
	
	Unit 종류가 30개 (25개)
	Scv가 repair 해야하는 Unit개수가 증가하면 함수의 개수고 같이 증가
	고민 : 하나의 함수가 Unit repair 할 수 있다면
	전자제품 ... 상속관계 부모타입 .. 다형성  ...같은거 아니야?
	
	void repair(Unit2 unit) {} >> Marine2(X) , Scv(O), Tank(O)
	void repair(GroundUnit unit) >> Marine2(X) , Scv(O), Tank(O)
	
	CommandCenter repair 대상.. 상속도 없는데.. 어떻게 고치게 하지..? (유닛과 연관성이 없어요)
	
	고민
	Marine2		Scv		Tank2	CommandCenter 서로 연관성 없다 ...
	
	인터페이스 Irepairable 부모 ... 가지고 ...
	
	class Scv extends GroundUnit 	implements Irepairable
	class Tank2 extends GroundUnit 	implements Irepairable
	class CommandCenter 			implements Irepairable
	
	Irepairable는 Scv의 			부모타입이다
	Irepairable는 				Tank2의 부모타입이다
	Irepairable는 CommandCenter의	부모타입이다
	*/
	
	void repair(Irepairable repairunit) {
	//repairunit parameter 는 Irepairable 인터페이스를 구현하고 있는 객체의 주소값이 올 수 있다
	//void repair(new Tank2())
	//void repair(new CommandCenter())
	//void repair(new Scv())
	//부모타입은 자식타입의 주소를 받을 수 있는데 ..... 부모것만 볼 수 있다
	
	//정리
	//1. CommandCenter 와 Tank2, Scv 수리 방법이 틀리다
	//2. Irepairable repairunit는 수리할 자원을 가지고 있지 않다
	//그럼 	Irepairable repairunit 통해서 위 3가지 Unit2 온다고 가정하고 분류해 보자
	
	// 	CommandCenter 와 Tank2, Scv 구분점 Unit2 이냐 아니냐 ...
	// 	타입비교 (연산자 : instanceof) 활용
	// http://cafe.naver.com/bit2021/141
		if(repairunit instanceof Unit2) { //Tank2 나 Unit2 타입이야 ...
			Unit2 unit = (Unit2)repairunit; //unit >> Tank2, Marine
			//Tank2에서 부모타입인 Unit2 자원만 접근
			
			//부모타입의 주소를 자식이 가질려면 자식으로 캐스팅 해야한다 *******
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP;
			}
		}else {
			// 부모 타입이 unit2 아닌 거예여
			System.out.println("다른 충전 방식을 통해서 ... Unit2 타입이 아니에요");
		}
	}
}

public class Ex04_Interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		// 전투
		tank.hitpoint -= 20;
		System.out.println("탱크 : "+ tank.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(tank);
		System.out.println("탱크 수리 완료 : "+ tank.hitpoint);
		
		scv.hitpoint -= 10;
		System.out.println("scv : "+ scv.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(scv);
		System.out.println("scv 수리 완료 : "+ scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
		
		scv.repair(marine);
		
	}
}
