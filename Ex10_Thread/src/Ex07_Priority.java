//�������� Thread ������
//�켱���� (cpu ������ �� �֤��� Ȯ���� �����ִ� �� ��)
//���������� ���� �� : 5 (default) �����ϰ� ����

class Pth extends Thread{
	@Override
	public void run() {
		for (int i = 0; i< 1000; i++) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		}
	}
}

class Pth2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i< 1000; i++) {
			System.out.println("|||||||||||||||||||||");
		}
	}
}

class Pth3 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i< 1000; i++) {
			System.out.println("*******************");
		}
	}
}

public class Ex07_Priority {
	public static void main(String[] args) {
		Pth pth = new Pth();
		Pth2 pth2 = new Pth2();
		Pth3 pth3 = new Pth3();
		
		pth.setPriority(10); //"�ѤѤѤѤѤѤѤѤ�" ���� ������
		pth.setPriority(1);
		pth.setPriority(1);
		
		
		System.out.println(pth.getPriority()); //5
		System.out.println(pth2.getPriority()); //5
		System.out.println(pth3.getPriority()); //5
	
		pth.start();
		pth2.start();
		pth3.start();
		

	}
}
