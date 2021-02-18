package kr.or.bit;
// 디자인 패턴 ( 생성 패턴 ) >> new ( 객체 )
// 객체 하나를 만들어 공유 ...
// 의도 : 하나의 객체를 공유하겠다

// 활용
// 공유프린터 
// 공유 와이파이 

// JDBC 에서 활용예제 할게요 ^^
public class Singleton {
	private static Singleton p;
	private Singleton() { // private
		// 직접 객체 생성 불가 ... new ( x ) ... heap 객체 생성 불가 ( 생성자를 통해서 ) 
		
	}
	
	public static Singleton getInstance() {
		if(p==null) {
			p = new Singleton(); // 생성자 호출 객체 만든것
		}
		return p;
	}
}

// 1. new 하지 못하게 하자 -> 생성자를 막겠다. 
// 2. 나머지 자원은 static . 
// 3. null 이면 싱글톤 타입 new
// 4. null 이 아니면 기존 생성되었던 주소값을 반환한다. -> 새로 만들지 않고
