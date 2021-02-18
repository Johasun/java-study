//static 변수 	>> 모든 객체가 [같은 값]을 가지게 할거야
//instance 변수 	>> 모든 객체가 [다른 값]을 가지게 할거야

class InitTest{
	static int cv = 10;
	static int cv2; // static int cv2 = cv+222; (X)
	int iv = 11;
	
	static { // static 블럭(static 초기자 설정 블럭)
		cv = 10; // member field 초기화 , 여기서 초기화하나 같은거 아닌가?
		cv2 = cv+222; // member field에서는 변형된 값을 쓰지 못하기 때문이다. // 변형된(조작값) 값을 제공 ....
		// static 블럭은 static int가 메모리에 올라간 직후 바로 올라간다... cv -> cv2 -> static{} -> iv
	}

	{ // instance variable 초기화 블럭
		// new 통해서 객체가 생성되고 메모리에 int iv 변수가 메모리에 올라가고 나서 바로 호출 >> {	}
		System.out.println("초기자 블럭");
		if(iv > 10) iv  = 100; // if(iv > 10) {iv = 100}
		// 멤버필드에서는 조건문을 쓰지 못하기 때문에 블럭이 존재한다.
	}

}


public class Ex08_Static_Init {
	public static void main(String[] args) {
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		
		// 일반자원
		InitTest inittest = new InitTest();
		System.out.println(inittest.iv);
	}

}
