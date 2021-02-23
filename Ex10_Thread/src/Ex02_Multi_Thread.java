/*
Thread : 프로세스에서 하나의 최소 실행 단위(흐름) >> method
>> stack >> 여러개 >> 함수를 동작

Thread 생성 방법
1. Thread 클래스를 상속 >> class Test extends Thread >> 새로운 stack 에서 놀거야
>> run() 함수 >> 새로운 stack 가장 먼저 실행 
>> Thread 클래스 >> Thread 스스로 객체 생성 가능

2. Runnable 인터페이스 구현 why?
>> 다중 상속 안된다
class Test extends Car implements Runnable >> run() 강제

여기까지는 Test 클래스가 스레드가 아니다

Thread thread = new Thread(new Test());


*/

class Thread_2 implements Runnable { //run() 재정의 강제

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("Thread_2 : "+i);
		}
		System.out.println("Thread_2 run() END......");		
	}
	
}
class Thread_1 extends Thread {
	@Override
	public void run() { //함수는 main() 함수와 동일한 역할
						//새로운 stack 처음 올라가서 실행되는 함수 run()
		for(int i = 0; i < 1000; i++) {
			System.out.println("Thread_1 : "+i+this.getName());
		}
		System.out.println("Thread_1 run() END......");
		
	}
}

public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		//1번
		Thread_1 th = new Thread_1();
		th.start();
		//POINT ...memory 새로운 call stack 생성하고 run() stack 올려놓고 종료
		
		
		//2번
		//Thread_2 th2 = new Thread_2();
		//Thread thread = new Thread(th2);
		Thread thread = new Thread(new Thread_2());
		thread.start();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("main : "+i);
		}
		System.out.println("Main END");
	}
}
