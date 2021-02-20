import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 ����
 DataOutPutStream, DataInPutStream (�ѽ�)
 ����: Java 8���� �⺻Ÿ�� ����(write, read) 
 �� ���鳢���� ...
 >>txt ��� >> ��Ģ���� ��� >> 80,100,22,65 >> split > �迭 > ���� > ����


*/
public class Ex13_DataOutPutStream {
	public static void main(String[] args) {
		int[] score = {100,60,55,94,23};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("socre.txt");
			dos = new DataOutputStream(fos);
			for(int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]); // �� ������ read -> DataInputStream
				//dos.writeUTF(null); �ѱ�, ���� 2�Ǵ�3byte �������� ������ ��
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
