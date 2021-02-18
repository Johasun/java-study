import java.io.File;

/*
 파일과 폴더 다루는 클래스
 
 JAVA : 파일, 폴더 하나의 클래스 : File
 >> a.txt 생성, 삭제, 정보 read
 >> Temp 폴더도 생성, 삭제, 정보 read
 
 c# : File 클래스 , Directory 클래스
 
 절대경로 : C:\\, D:\\ >> C:\\Temp\\a.txt
 
 상대경로 : 현재 파일을 중심으로 C:\\Test >> .. \Temp\
*/
public class Ex07_File {
	public static void main(String[] args) {
		String path = "C:\\Temp\\file.txt";
		File f = new File(path);
		//File 클래스 사용 : file 다양한 정보 
		System.out.println("파일명 : "+f.getName());
		System.out.println("전체경로 : "+f.getPath());
		System.out.println("절대경로 : "+f.getAbsolutePath());
		System.out.println("너 폴더니 : "+f.isDirectory()); //false
		System.out.println("너 파일이니 : "+f.isFile());
		System.out.println("파일 크기 : "+f.length()+"byte");
		System.out.println("부모경로 : "+f.getParent());
		System.out.println("파일이든 폴더든 실 존재 여부 : "+f.exists());
		
		//f.createNewFile() 파일생성
		//f.delete() 파일삭제
		//f.canRead() 읽을 수 있을 지 확인.. 누군가가 파일을 사용하고 있으면 false
	}

}
