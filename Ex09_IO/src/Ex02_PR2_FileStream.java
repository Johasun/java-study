import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 
 ��� read, wrote (File) >> 1. txt, 2. �޸�
 
 >>FileInputSream
 >>FileOutputSream


*/
public class Ex02_PR2_FileStream {
	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path="C:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt", true);
			//FileOutputStream
			//1. write �ϴ� ���� �������� ������ >> ���� ����
			//new FileOutputStream("C:\\Temp\\new.txt", false);
			//�ڿ� �ƹ��͵� �Ⱦ��� (default) ����� �ڿ� false�� �پ� ���� -> overwrite (�����)
			
			//append >> true ... ��� �̾��...
			
			int data = 0;
			while((data=fs.read()) != -1){
				System.out.println("����: "+data); //char ���� ��ȯ�ؼ�
				//���ڰ�
				System.out.println("����: "+(char)data);
				fos.write(data);
				//new.txt ���Ͽ� data ���� write 
				//FileOutputStream write �Ϸ��� �ϴ� ���� ������
				//���ϵ� ����(���� ���)
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			//����, ������ �ڵ� ���� (������ ���� ) return �־ ����
			//�ڿ�����
			//������� �ڿ� ���� (��ü) >> ������ �÷��� ����
			//�������� ���ϴ� �ڿ�
			//I/O, NetWork ... �ڿ� ������ ���� (���������) �ڿ� ����
			//�������� �۾� �ϰ� ������ �ٸ� ����� ���� .. �б� �����̶� �аڽ��ϱ�.. ���������..
			//������ <-> �Ҹ��� ȣ��
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
