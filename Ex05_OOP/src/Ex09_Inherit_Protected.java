import kr.or.bit.Bird;

//Bird 상속받아서 구현

class Bi extends Bird{
	@Override
	protected void moveFast() {
		super.moveFast(); // 부모쪽에 있는 거 부르기
	}
}

class Ostrich extends Bird{
	// 구체화 특수화
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
		//POINT bi.moveFast 어라 안보이네? - protected -> 상속관계에서만 의미가 있다.
		//bi.moveFast(); 상속관계에서만 .. 상속관계에서 재정의를 하지 않으면 쓸 수 없다. 쓰려면 재정의를 해라~!
		// 재정의 == 오버라이드
		
		//오버라이드 후
		bi.moveFast();
		
		//Ostrich
		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();
	}
}
