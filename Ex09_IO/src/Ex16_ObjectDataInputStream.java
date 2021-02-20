import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

//����ģ�� ����
//���ص� ��ũ�� ����(��ü) : ������ȭ
public class Ex16_ObjectDataInputStream {

	public static void main(String[] args) {
		String filename = "Userdata.txt";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null; //������ȭ�� �ϱ� ���� Ŭ����
		
		try {
			fis = new FileInputStream(filename); //�����ſ���
			bis = new BufferedInputStream(fis); //���۸� ���ؼ� �ѹ��� �����ſ���
			in = new ObjectInputStream(bis); //Object�� ���ؼ�.. ���ص� ��ǰ�� ���� (������ȭ)
			/*
			UserInfo r1 = (UserInfo)in.readObject(); //�ٿ�ĳ����
			UserInfo r2 = (UserInfo)in.readObject();
			
			System.out.println(r1.toString());
			System.out.println(r2.toString());
			*/
			
			//��� ���´��� �𸦶���?
			
			Object users = null;
			while((users = in.readObject()) != null){//users�� readObject�� ������
				System.out.println(((UserInfo)users).toString());
			}
		} catch (FileNotFoundException fnfe) {
				System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (EOFException eofe) {
				System.out.println("��"+eofe.getMessage());
		} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
				System.out.println(cnfe.getMessage());
		} finally {
			try {
				in.close();
				bis.close();
				fis.close();
			} catch (Exception e) {

			}
		}
	}

}
