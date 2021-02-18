import java.io.File;

/*
 ���ϰ� ���� �ٷ�� Ŭ����
 
 JAVA : ����, ���� �ϳ��� Ŭ���� : File
 >> a.txt ����, ����, ���� read
 >> Temp ������ ����, ����, ���� read
 
 c# : File Ŭ���� , Directory Ŭ����
 
 ������ : C:\\, D:\\ >> C:\\Temp\\a.txt
 
 ����� : ���� ������ �߽����� C:\\Test >> .. \Temp\
*/
public class Ex07_File {
	public static void main(String[] args) {
		String path = "C:\\Temp\\file.txt";
		File f = new File(path);
		//File Ŭ���� ��� : file �پ��� ���� 
		System.out.println("���ϸ� : "+f.getName());
		System.out.println("��ü��� : "+f.getPath());
		System.out.println("������ : "+f.getAbsolutePath());
		System.out.println("�� ������ : "+f.isDirectory()); //false
		System.out.println("�� �����̴� : "+f.isFile());
		System.out.println("���� ũ�� : "+f.length()+"byte");
		System.out.println("�θ��� : "+f.getParent());
		System.out.println("�����̵� ������ �� ���� ���� : "+f.exists());
		
		//f.createNewFile() ���ϻ���
		//f.delete() ���ϻ���
		//f.canRead() ���� �� ���� �� Ȯ��.. �������� ������ ����ϰ� ������ false
	}

}