import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex11_PrintWriter {
	public static void main(String[] args) {
		//��������� ����
		//printf, String.format, 
		//��¹��� ���� ���� ����(������) >> txt >> �̻ڰ� 
		//���� : ������ : �� >> ����, ũ����Ż ����Ʈ ����Ʈ����
		//PrintWriter �׸�
		try {
			/*
			PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt"); //����
			pw.println("********************************************");
			pw.println("*****************HOMEWORK*******************");
			pw.println("********************************************");
			pw.printf("%3s : %5d  %5d  %5d  %5.1f","�ƹ���", 100, 90, 50, (float)((100+90+50)/3));
			pw.println();
			pw.close();
			*/
			//line ����
			//read ����
			FileReader fr = new FileReader("C:\\Temp\\homework.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			while((str = br.readLine()) !=null ) {
				System.out.println(str);
			}
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
