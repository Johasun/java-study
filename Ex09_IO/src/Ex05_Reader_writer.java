import java.io.FileReader;
import java.io.FileWriter;

/*
	�ѱ�ó�� ....
	���ڱ���� ������ ó�� (String ������ >> char[] ����)

	�ѱ� 1��, ������ 1�� >> 2byte
	
	Reader, Writer
	
	��� : �տ� File... File.. 

*/
public class Ex05_Reader_writer {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");//read
			fw = new FileWriter("copy_Stream.txt"); //���� ���� �� ���� write
			
			int data = 0;
			while((data = fr.read())!=-1) {
				//System.out.print((char)data);
				
				//���� ���� (����: ���� ���� �����̽� ���� ����)
				if(data != '\n' && data !='\r' && data !='\t' && data != ' ') {
					fw.write(data);
				}
			}
			
		} catch (Exception e) {
			
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}
}