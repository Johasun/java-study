import java.io.File;

public class Ex08_File_Directory {
	public static void main(String[] args) {
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);
		if(args.length != 1) {
			System.out.println("���� : java ���ϸ� [���丮��]");
			System.exit(0); //���α׷� ���� ���� 
		}
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) { //�������� �ʰų� �Ǵ� ���丮�� �ƴ϶��
			System.out.println("��ȿ���� ���� ���");
			System.exit(0); //���α׷� ���� ����
		}
		
		//���� �����ϴ� ����� �������
		File[] files = f.listFiles(); //C:\\Temp >> �ȿ� ���ϵ� �ְ� ������ �ִ�
		//Temp >> a.txt=>File, ��������=>File
		//files[0] >> a.txt
		//files[1] >> ��������
		for(int i = 0; i < files.length; i++) {
			String name = files[i].getName(); //���� �Ǵ� ������ �̸� return 
			System.out.println(files[i].isDirectory() ? "[DIR]"+name : name);
		}
	}
}
