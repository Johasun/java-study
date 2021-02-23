/*
Thread : ���μ������� �ϳ��� �ּ� ���� ����(�帧) >> method
>> stack >> ������ >> �Լ��� ����

Thread ���� ���
1. Thread Ŭ������ ��� >> class Test extends Thread >> ���ο� stack ���� ��ž�
>> run() �Լ� >> ���ο� stack ���� ���� ���� 
>> Thread Ŭ���� >> Thread ������ ��ü ���� ����

2. Runnable �������̽� ���� why?
>> ���� ��� �ȵȴ�
class Test extends Car implements Runnable >> run() ����

��������� Test Ŭ������ �����尡 �ƴϴ�

Thread thread = new Thread(new Test());


*/

class Thread_2 implements Runnable { //run() ������ ����

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
	public void run() { //�Լ��� main() �Լ��� ������ ����
						//���ο� stack ó�� �ö󰡼� ����Ǵ� �Լ� run()
		for(int i = 0; i < 1000; i++) {
			System.out.println("Thread_1 : "+i+this.getName());
		}
		System.out.println("Thread_1 run() END......");
		
	}
}

public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		//1��
		Thread_1 th = new Thread_1();
		th.start();
		//POINT ...memory ���ο� call stack �����ϰ� run() stack �÷����� ����
		
		
		//2��
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
