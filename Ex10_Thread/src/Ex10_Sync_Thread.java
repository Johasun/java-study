/*
Collection (vector, ArrayList)
����ȭ����, ����ȭ�� �������� �ʴ���
�Ѱ� �������� ȭ���(�����ڿ�) : �������� �����(Thread) ���ÿ� ����
ȭ��� 1�� ��� 10(Thread) >> ���ÿ� ���

������ : LOCK ��ġ�� ����
�ذ��� : LOCK ����� (�Լ� ����)

synchronized ����ȭ ����(������ġ)

�ݴ�

����� : ���ÿ� �Դ� ���� ... �ڿ��� ��ȣ �ʿ� ���� (LOCK)
*/

class Wroom {
	synchronized void openDoor(String name) {
		System.out.println(name + "�� ȭ��� ����^^");
		for(int i = 0; i < 100; i++) {
			System.out.println(name+ " ��� "+i);
			if(i==10) {
				System.out.println(name+"�� �� ~~");
			}
		}
		System.out.println("�ÿ��Ͻ��� ^^!");
	}
}

class User extends Thread {
	Wroom wr; //ȭ��� �ּ� 
	String who;
	User(String name, Wroom w){
		this.who = name;
		this.wr = w;
	}
	
	@Override
	public void run() {
		wr.openDoor(this.who);
	}
}
public class Ex10_Sync_Thread {

	public static void main(String[] args) {
		//�̰��� �Ѱ� �������� �Դϴ�.
		Wroom w = new Wroom();
		
		//����� (Thread)
		User kim = new User("�达", w);
		User park = new User("�ھ�", w);
		User lee = new User("�̾�", w);
		
		//�谡 ���Ŀ�
		kim.start();
		park.start();
		lee.start();
		
	}

}