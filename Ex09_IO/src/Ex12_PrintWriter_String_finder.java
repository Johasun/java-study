import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_finder {
	String basedir = "C:\\Temp"; //검색할 폴더
	String word = "HELLO"; //검색할 단어
	String save = "result.txt"; //HELLO 단어가 들어있는 파일목록 저장
	
	void Find() throws IOException { //당신이 나를 쓴다면 IO에 대한 예외를 나타내주삼
		File dir = new File(basedir); //c드라이브의 temp 폴더를 싹 뒤진다
		if(!dir.isDirectory()) {
			System.out.println("is not Directory");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(save));
		BufferedReader br = null;
		
		File[] files = dir.listFiles(); //목록(파일, 폴더)
		for(int i = 0; i<files.length; i++) {
			if(!files[i].isFile()) {
				continue; //파일이 아닌 경우 해당 i값 아래코드 (skip)
			}
			//파일이라면 (a.txt or aaa.txt or hello.txt)
			br =new BufferedReader(new FileReader(files[i]));
			
			//파일에 한문장 read 하면서 검색 (HELLO)
			String line = "";
			while((line = br.readLine()) != null) {
				if(line.indexOf(word) != -1) { //현재 read한 문장에 HELLO 단어가 하나라도 들어있는 것 .. *왜 -1일까..
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
			StringFineder.Find(); //예외처리 중요
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
