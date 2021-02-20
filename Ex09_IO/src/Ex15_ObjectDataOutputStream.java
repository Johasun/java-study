import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

public class Ex15_ObjectDataOutputStream {
	public static void main(String[] args) {
		String filename = "Userdata.txt"; //��ü�� ����ȭ�ؼ� write
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; //���ɶ�����
		ObjectOutputStream out = null; //object�� ������ �ʿ��� -> bos
		
		
		
		try {
			fos = new FileOutputStream(filename, true); //append
			bos = new BufferedOutputStream(fos);
			//����ȭ �ϰ� ������ 
			out = new ObjectOutputStream(bos);
			
			//����ȭ ���(��ü)
			UserInfo u1 = new UserInfo("ȫ�浿", "super", 500); //����ǰ
			UserInfo u2 = new UserInfo("scott", "tiger", 50); //����ǰ
			
			//���� ������ ����� �����ſ���
			//����ȭ "Userdata.txt"
			out.writeObject(u1); //�����ؼ� Userdata �� �� �۾�
			out.writeObject(u2); //�����ؼ� ��ũ �δ븦 ���¾��
			//userdata ���Ͽ��� ��ũ �δ��� ������ �������. 
			//���ڰ� ������ ��ũ�� ��ǰ�� 
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				out.close(); //�ݴ°� �������� 
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
