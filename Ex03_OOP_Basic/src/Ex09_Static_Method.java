/*
 * 1. static member field (객체간 공유자원)
 * 
 * 2. static method : 자주 쓰이니깐(많이) >> 편하게 사용하게 >> 객체생성 없이도 >> static
 * 	  why : Math.random() >> Math m = new Math(); m.random() 이렇게 하지 않았을까
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		// 일반함수에서 
		// cv 값을 가지고 놀 수 있다
		// 순서 ... 
		// static 자원은 일반자원보다 항상 메모리에 먼저 상주
		cv = 1000;
	}
	
	static void sm() {
		// static 함수에서 
		// 일반자원인 iv값을 가지고 놀 수 없다
//		iv = 100;
		// error 가 없게 하려면 ( static 끼리 놀아라 )
		cv = 2222;
	}
}

public class Ex09_Static_Method {

	public static void main(String[] args) {

		System.out.println(StaticClass.cv);
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		//일반자원 (객체 생성)
		 StaticClass sc = new StaticClass();
		 sc.m();
		 sc.sm();
		 System.out.println(sc.iv);
		 System.out.println(sc.cv);
		
		
	}

}
