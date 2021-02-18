import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;


public class Hw02_Dos {
	public static void main(String[] args) {
		
		if(args.length !=1) {
			System.out.println("사용법 : java [실행할 파일명] [읽을 파일경로] ");
			System.out.println("예시 : java Hw02_Dos C:\\Temp\\Ex01_Stream.java");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isFile()) {
			System.out.println("유효하지 않은 경로");
			System.exit(0);
		}
		
		//정상적인 경로, 폴더
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
