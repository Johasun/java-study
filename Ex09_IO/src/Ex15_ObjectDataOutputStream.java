import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

public class Ex15_ObjectDataOutputStream {
	public static void main(String[] args) {
		String filename = "Userdata.txt"; //객체를 직렬화해서 write
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; //성능때문에
		ObjectOutputStream out = null; //object는 보조가 필요함 -> bos
		
		
		
		try {
			fos = new FileOutputStream(filename, true); //append
			bos = new BufferedOutputStream(fos);
			//직렬화 하고 싶으면 
			out = new ObjectOutputStream(bos);
			
			//직렬화 대상(객체)
			UserInfo u1 = new UserInfo("홍길동", "super", 500); //완제품
			UserInfo u2 = new UserInfo("scott", "tiger", 50); //완제품
			
			//벽에 구멍을 만들고 보낼거예요
			//직렬화 "Userdata.txt"
			out.writeObject(u1); //분해해서 Userdata 에 쓴 작업
			out.writeObject(u2); //분해해서 탱크 두대를 보냈어요
			//userdata 파일에는 탱크 두대의 정보가 들어있음. 
			//여자가 받은건 탱크의 부품들 
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				out.close(); //닫는건 역순으로 
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
