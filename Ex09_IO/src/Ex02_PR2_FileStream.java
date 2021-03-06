import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 
 대상 read, wrote (File) >> 1. txt, 2. 메모
 
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
			//1. write 하는 파일 존재하지 않으면 >> 파일 생성
			//new FileOutputStream("C:\\Temp\\new.txt", false);
			//뒤에 아무것도 안쓰면 (default) 사실은 뒤에 false가 붙어 있음 -> overwrite (덮어쓰기)
			
			//append >> true ... 계속 이어쓴다...
			
			int data = 0;
			while((data=fs.read()) != -1){
				System.out.println("정수: "+data); //char 정수 변환해서
				//문자값
				System.out.println("문자: "+(char)data);
				fos.write(data);
				//new.txt 파일에 data 값을 write 
				//FileOutputStream write 하려고 하는 파일 없으면
				//파일도 생성(생성 기능)
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			//정상, 비정상 코드 수행 (강제적 실행 ) return 있어도 실행
			//자원해제
			//명시적인 자원 해제 (객체) >> 가비지 컬렉터 관리
			//관리하지 못하는 자원
			//I/O, NetWork ... 자원 개발자 직접 (명시적으로) 자원 해제
			//엑셀파일 작업 하고 있으면 다른 사람이 열면 .. 읽기 전용이라도 읽겠습니까.. 수정없어요..
			//생성자 <-> 소멸자 호출
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
