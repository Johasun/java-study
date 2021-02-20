import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 보조
 DataOutPutStream, DataInPutStream (한쌍)
 장점: Java 8가지 기본타입 형식(write, read) 
 단 지들끼리만 ...
 >>txt 기록 >> 규칙적인 방법 >> 80,100,22,65 >> split > 배열 > 정수 > 연산


*/
public class Ex13_DataOutPutStream {
	public static void main(String[] args) {
		int[] score = {100,60,55,94,23};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("socre.txt");
			dos = new DataOutputStream(fos);
			for(int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]); // 단 무조건 read -> DataInputStream
				//dos.writeUTF(null); 한글, 영문 2또느3byte 기준으로 파일을 씀
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
