/*
���� : ���� thread

�� thread >> �� thread >> ���� thread

�ѱ�  >> �۾��� >> 3�� ���� ���� �ɼ�
�۾��� �۾� ���� >> 3�� ���� ����(���� �ɼ�) ����

*/
public class Ex08_Damon_Thread implements Runnable{
	static boolean autosave = false;
	public static void main(String[] args) {
		
		Thread demonthread = new Thread(new Ex08_Damon_Thread());
		
		//demonthread ���� (Damon)
		//main �Լ� �������� ���� ...
		//���� ��Ű� ������ ���� �ϰڽ��ϴ�
		//���� (demonthread) , ��� (�ֽ����� : main �Լ�)
		demonthread.setDaemon(true); //���� �Լ��� ������ ���� ����
		demonthread.start();
	
		//���۾�(�ѱ� ����)
		for(int i = 0; i <= 30; i++) {
			try {
				Thread.sleep(1000); //1��
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Main �ѱ� ���� �۾�" + i);
			//�ڵ�������� 
			if(i==5) {
				System.out.println("i: "+ i);
				autosave=true;
			}
		}
	}
	
	public void autoSave() {
		System.out.println("�ѱ� �۾��� 3�� �������� �ڵ� ����");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {

			}
			if(autosave) { //static boolean autosave = false;
				//�۾� (�����۾�)
				autoSave(); //ȣ��
			}
		}
	}

}
