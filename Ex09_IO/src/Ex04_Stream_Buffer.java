import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 File ó�� (Disk) : ��Ģ �� Byte ���� read, write �Դٰ��� �ؼ� �����ɸ�..
 ��� ��Ƽ� �ѹ��� ..... read, write (�������� >> 20�� Ÿ) 20�� �Դٰ����ϴ°� �ƴ϶��ѹ��� 20�� �¿���..
 ���� : buffer
 1. I/O Ƚ���� �پ��� -> ���� ����
 2. Line ���� ( ����)
 
 ���� ��Ʈ�� : BufferedInputStream (�� Ŭ���� ����)
 ������ �ǹ��� ��� ...

*/
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; // ���� ��Ʈ��
		
		try {
			fos = new FileOutputStream("data.txt"); //data.txt ������ ���ϻ���, write
			bos = new BufferedOutputStream(fos); // ����Ʈ �����ڰ� ��� ȥ�ڼ��� �����δ� fos�� �¿���...
			
			for(int i = 0 ; i < 10; i++) {
				bos.write('A'); // A ���� ���
			}
			//JAVA Buffer ũ�� : 8kbyte : 8192byte -> ���� ũ��... �� �������� �� ä��� �̵� .. 
			//1. buffer �ȿ� ������ ä������ ������ ���(���°�) : flush
			//2. buffer ������ ���� (��������� flush ȣ��) flush()
			//3. bus.colse() �ڿ����� >> �ڵ����� flush()
			// �� for���� �� ���Ƶ� 8kbyte�� ���� �ʾұ� ������ �ű��� �ʴ´� ���� �� ���(�����) ���� ����� ��������Ѵ�.
			// +) ������ close �� �ϸ� flush �� �ڵ����� �Ǳ� ������ flush�� ���� �� ������ �ʴ´�.
		} catch (Exception e) {
		} finally {
			try {
				bos.close(); //flush ���� 
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
