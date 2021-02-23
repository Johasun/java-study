import javax.swing.JOptionPane;

//�ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰� �ϰ� �;��
//hint) �����ڿ�

class WordInputProcess extends Thread {
	@Override
	public void run() {
		String dan="2";
		String inputdata = JOptionPane.showInputDialog(dan + "�� ���� �Է�");
		if(inputdata != null && !inputdata.equals("")) {
			Ex05_WordGame.inputcheck=true; // ��������
		}
		System.out.println("�Է��� ���� : "+inputdata);
	}
}

class WordTimeOut extends Thread {
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			if(Ex05_WordGame.inputcheck) return; //run �Լ� ���������� ���� stack ����
			System.out.println("���� �ð� : "+i);
			try {
				Thread.sleep(1000);//���ǿ��� 1�ʰ� �����ٰ� �ٽ� ���ϱ�
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex05_WordGame {
	static boolean inputcheck = false; //����
	public static void main(String[] args) {
		
		WordInputProcess word = new WordInputProcess();
		WordTimeOut time = new WordTimeOut();
		
		word.start();
		time.start();
		
		try {
				//join : �ٸ� �������� ���Ḧ ��ٸ�(�ްԽ�)
				//join ��û�� �����尡 ����Ǹ� �׶� ����...
				word.join(); // main ���� word ���������� ��ٷ� �ٷ�
				time.join(); // main ���� time ���������� ��ٷ� �ٷ�
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		System.out.println("Main END");
		
	}

}
