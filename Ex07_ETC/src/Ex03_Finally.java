import java.io.IOException;

/*
 >> ���� CD PC ��ġ
 >> 1. ��ġ���� > C:\Temp ���� 
 >> 2. ������ ���� >> ���Ӽ�ġ
 >> 3. ����ġ >> C:\Temp ������ ���� ����
 >> 4. �������� �߻� (���� ����) >> ������ ���� ����


������ ���� ���� ( ���� ) ....
*/
public class Ex03_Finally {
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("FILE DELETE");
	}
	
	public static void main(String[] args) {
		// 3���� �Լ��� ���� ó��
		// ���ܸ� ����ڰ� �ʿ信 ���� ���� ....
		// �����δ� ���ܰ� �ƴ����� 
		// �����ڰ� ��� ��Ȳ�� ���ؼ� ������ ���ܷ� ��Ī ����
		// 1 �̸� ���� 2 �̸� ������ ���ܸ� �߻��ؼ� catch ....
		// throw new IOException()
		
		
		try {
			copyFiles();
			startInstall();
			throw new IOException("install ���� ������ �߻� .... "); // �������� ���Ƿ� �߻�
		}catch (Exception e) {
				System.out.println("���� �޽��� ���: "+e.getMessage()); // e�� throw�� ����
				// fileDelete(); // ���ܰ� �߻����� �ʾ��� ��� ..�׷� ���� ������
		}finally { // ���ܰ� �߻��ϴ� �߻����� �ʴ� ������ ����Ǵ� ��
				fileDelete();
				// �Լ��� ���� ���� ( return �� ������ �Լ� ����) ���������� finally ���� 
				// return �� ���ؼ� ����Ǳ� ���� ȣ��
		}
		// fileDelete(); // �̰� finally ���� �־�� �ϴ� ������ �Ϲ� ���� �ٷ� ������������ finally �� return �� �ִ��� ������ ����
		System.out.println("main end");
		
	}

}
