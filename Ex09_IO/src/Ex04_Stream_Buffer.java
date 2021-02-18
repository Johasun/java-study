import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 File 처리 (Disk) : 원칙 한 Byte 단위 read, write 왔다갔다 해서 오래걸림..
 모아 모아서 한번에 ..... read, write (버스대절 >> 20명 타) 20번 왔다갔다하는게 아니라한번에 20명 태워서..
 버스 : buffer
 1. I/O 횟수가 줄어든다 -> 성능 개선
 2. Line 단위 ( 엔터)
 
 보조 스트림 : BufferedInputStream (주 클래스 의존)
 개발자 의무적 사용 ...

*/
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; // 보조 스트림
		
		try {
			fos = new FileOutputStream("data.txt"); //data.txt 없으면 파일생성, write
			bos = new BufferedOutputStream(fos); // 디폴트 생성자가 없어서 혼자서는 못쓰인다 fos를 태워서...
			
			for(int i = 0 ; i < 10; i++) {
				bos.write('A'); // A 열개 담기
			}
			//JAVA Buffer 크기 : 8kbyte : 8192byte -> 한통 크기... 이 정도까지 다 채우고 이동 .. 
			//1. buffer 안에 내용이 채워지면 스스로 출발(비우는것) : flush
			//2. buffer 강제로 비우기 (명시적으로 flush 호출) flush()
			//3. bus.colse() 자원해제 >> 자동으로 flush()
			// 위 for문을 다 돌아도 8kbyte가 넘지 않았기 때문에 옮기지 않는다 따라서 위 방법(명시적) 으로 출발을 시켜줘야한다.
			// +) 어차피 close 를 하면 flush 가 자동으로 되기 때문에 flush는 따로 잘 하지는 않는다.
		} catch (Exception e) {
		} finally {
			try {
				bos.close(); //flush 동반 
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
