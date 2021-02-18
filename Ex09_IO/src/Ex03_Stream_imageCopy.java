import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_imageCopy {
	public static void main(String[] args) {
		String orfile = "C:\\Temp\\1.jpg";
		String tarfile = "copy.jpg";
		//default 경로 : 프로젝트 폴더
		//C:\Users\whwog\Desktop\Labs\Ex09_IO\copy.jpg
		
		FileInputStream fs = null;
		FileOutputStream fo = null;
		
		try {
			fs = new FileInputStream(orfile);
			fo = new FileOutputStream(tarfile, false);//파일이 없으면 생성 , write
			
			int data = 0;
			while((data = fs.read()) != -1) {
				fo.write(data); //copy.jpg 에 byte write
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fs.close();
				fo.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
