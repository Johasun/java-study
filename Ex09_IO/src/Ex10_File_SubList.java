
import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class Ex10_File_SubList {
	static int totalfiles=0;
	static int totaldirs=0;
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("사용법 : java [실행할 파일명] [경로명]");
			System.out.println("예시 : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 경로");
			System.exit(0);
		}
		//정상적인 경로, 폴더
		printFileList(f);
		System.out.println("누적 총 파일 수: "+totalfiles);
		System.out.println("누적 총 폴더 수: "+totaldirs);
		
	}
	
	static void printFileList(File dir) {
		System.out.println("[Full path : ]"+dir.getAbsolutePath());
		
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		//[0] >> a.txt
		//[1] >> 1.jpg
		//[2] >> 2021폴더
		//[3] >> 2022폴더
		
		for(int i = 0; i<files.length; i++) {
				String filename = files[i].getName(); //폴더명 or 파일명
				if(files[i].isDirectory()) {
					filename="<DIR> ["+filename+"]";
					//POINT
					subdir.add(i); //WHY
					//list[0] >> 2
					//list[1] >> 3
				}else {
					filename = filename + "/"+files[i].length() + "Byte";
			}
		System.out.println("     "+filename);
			
		}
		int dirnum = subdir.size(); //폴더개수
		int filenum = files.length - dirnum; //파일개수
		
		// 함수가 종료되어도 가지고 있고 싶어요
		// static 변수
		totaldirs+=dirnum; // 총 누적된 (하위폴더)
		totalfiles+=filenum; //총 누적
		
		System.out.println("[Current dirNum] : "+dirnum);
		System.out.println("[Current fileNum] : "+filenum);
		System.out.println("*****************************");
		
		//POINT (폴더 안에 폴더(하위폴더)) 도 보고 싶어요
		for(int j = 0; j < subdir.size(); j++) {
			int index = subdir.get(j);
			//index > 2
			//printFileList(C:\\Temp\\2021)
			
			//index > 3
			//printFileList(C:\\Temp\\2022)
			printFileList(files[index]); //POINT 재귀호출 (자신을 호출)
		}
	}
}


//TODO Auto-generated method stub
		/*
		BufferedReader br = null;
		
		try {
			String s;
			File file = new File("C:\\Users\\whwog\\Desktop\\TodayHW.java");
			br = new BufferedReader(new FileReader(file));
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
		*/
