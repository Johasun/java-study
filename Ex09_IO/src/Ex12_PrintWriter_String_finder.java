import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_finder {
	String basedir = "C:\\Temp"; //�˻��� ����
	String word = "HELLO"; //�˻��� �ܾ�
	String save = "result.txt"; //HELLO �ܾ ����ִ� ���ϸ�� ����
	
	void Find() throws IOException { //����� ���� ���ٸ� IO�� ���� ���ܸ� ��Ÿ���ֻ�
		File dir = new File(basedir); //c����̺��� temp ������ �� ������
		if(!dir.isDirectory()) {
			System.out.println("is not Directory");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(save));
		BufferedReader br = null;
		
		File[] files = dir.listFiles(); //���(����, ����)
		for(int i = 0; i<files.length; i++) {
			if(!files[i].isFile()) {
				continue; //������ �ƴ� ��� �ش� i�� �Ʒ��ڵ� (skip)
			}
			//�����̶�� (a.txt or aaa.txt or hello.txt)
			br =new BufferedReader(new FileReader(files[i]));
			
			//���Ͽ� �ѹ��� read �ϸ鼭 �˻� (HELLO)
			String line = "";
			while((line = br.readLine()) != null) {
				if(line.indexOf(word) != -1) { //���� read�� ���忡 HELLO �ܾ �ϳ��� ����ִ� �� .. *�� -1�ϱ�..
					writer.write("word="+files[i].getAbsolutePath() + "\n");
				}
			}
			writer.flush();
			
		}
		br.close();
		writer.close();
	}
	
	public static void main(String[] args) {
		Ex12_PrintWriter_String_finder StringFineder = new Ex12_PrintWriter_String_finder();
		try {
			StringFineder.Find(); //����ó�� �߿�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
