import javax.swing.JOptionPane;

//2�� �Լ��� ������ ���� ����
//1. �ð��� �����ϴ� Thread(stack)
//2. �ܾ� �Է��� ó���ϴ� Thread(stack) >> main �Լ�

class WordTime extends Thread {
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			try {
				System.out.println("���� �ð� : " + i);
				sleep(1000); //cpu �����ϰ� sleep ������
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex04_Multi_Thread_word_Game {
	public static void main(String[] args) {
		//2��
		//class WordTime extends Thread
		//static void main
		
		WordTime timer = new WordTime();
		timer.start();
		
		String inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("�Է°�: "+inputdata);
		System.out.println("main end");
		
		//�ܾ �Է����� �ʾƵ� �ð��� �귯����
		
		
	}
}
