/*
오류
1. 에러 ( error ) 	: 네트워크 장애, 메모리, 하드웨어 >> 개발자가 코드적으로 해결 불가
2. 예외 ( exception )	: 개발자의 코드 실수에 의해 발생 >> 방어적인 코드 ( 예외처리 )
>> 개발 ... 예외가 발생하면 .. 프로그램은 강제 종료 >> 비정상적인 종료

try{
	 >> 문제가 발생할 수 있는 코드
	 >> 문제가 발생하면 ... catch ...
}catch(Exception e){
	 >> 문제가 생기면 catch 문제를 파악
	 >> 처리 유도
	 >> 1. 관리자에게 email 
	 >> 2. 로그파일에 문제 기록
	 >> 3. 강제 종료는 막는다 // try catch 는 해결책이 아니라 문제가 발생했을 때 알려주는 것
	 >> 개발자의 코드 수정이 필요하다 ...
}finally{
	 >> 문제가 발생하던, 발생하지 않던 강제로 수행되어야 할 코드
	 >> Db 연결 해제 

}

예외가 발생하면 개발자 예외발생건에 대해서 파악(어떤 자원에, 어떤 행위)
예외에 관련된 클래스 설계 ..... 예외가 발생하면 ..... 자동으로 예외에 맞는 클래스 객체 생성
그리고 다양한 정보를 그 객체에 넣어줍니다

*/
public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			System.out.println(0/0); //	new ArithmeticException() 정보 .. 
		}catch (Exception e) { // Exception 클래스는 ArithmeticException 의 부모 타입 (다형성)
			// 문제에 대한 파악
			e.printStackTrace();
			//System.out.println("발생 원인 : " + e.getMessage());
		}
		
		
		
		System.out.println("main end");
		
	}

}
