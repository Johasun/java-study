import java.io.FileReader;
import java.io.FileWriter;

/*
	한글처리 ....
	문자기반의 데이터 처리 (String 데이터 >> char[] 관리)

	한글 1차, 영문자 1자 >> 2byte
	
	Reader, Writer
	
	대상 : 앞에 File... File.. 

*/
public class Ex05_Reader_writer {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");//read
			fw = new FileWriter("copy_Stream.txt"); //파일 생성 그 파일 write
			
			int data = 0;
			while((data = fr.read())!=-1) {
				//System.out.print((char)data);
				
				//배포 파일 (압축: 엔터 공백 스페이스 없는 파일)
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
