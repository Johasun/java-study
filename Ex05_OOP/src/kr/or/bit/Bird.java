package kr.or.bit;


//새(공통(일반, 추상)) >> 새는 날 수 있다, 새는 빠르다
public class Bird {
	//공통기능
	public void fly() {
		System.out.println("flying");
	}
	
	//설계자
	//나를 상속하는 당신은 moveFast를 필요에 따라서 재정의 했으면 좋겠어(80%) >> 상속관계에서 .. 재정의 했으면 좋겠다 -> protected 를 붙인다.
	//타조는 날 수 없잖아 --- 사용자는 protected를 보고 moveFast는 내가 바꿔도 되는거구나.. 생각하게 되는 것.
	protected void moveFast() { 
		fly();
	}
}
