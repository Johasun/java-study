import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;


public class Hw02_Dos {
	public static void main(String[] args) {
		
		if(args.length !=1) {
			System.out.println("���� : java [������ ���ϸ�] [���� ���ϰ��] ");
			System.out.println("���� : java Hw02_Dos C:\\Temp\\Ex01_Stream.java");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isFile()) {
			System.out.println("��ȿ���� ���� ���");
			System.exit(0);
		}
		
		//�������� ���, ����
		printType(f);
		
	}
	
	static void printType(File dir) {
		System.out.println("[Full path : ]"+dir.getAbsolutePath());
		
		BufferedReader br = null;
		
		try {
			String s;
			br = new BufferedReader(new FileReader(dir));
			
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
		
		
	}

	

}
