
import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class Ex10_File_SubList {
	static int totalfiles=0;
	static int totaldirs=0;
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("���� : java [������ ���ϸ�] [��θ�]");
			System.out.println("���� : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���");
			System.exit(0);
		}
		//�������� ���, ����
		printFileList(f);
		System.out.println("���� �� ���� ��: "+totalfiles);
		System.out.println("���� �� ���� ��: "+totaldirs);
		
	}
	
	static void printFileList(File dir) {
		System.out.println("[Full path : ]"+dir.getAbsolutePath());
		
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		//[0] >> a.txt
		//[1] >> 1.jpg
		//[2] >> 2021����
		//[3] >> 2022����
		
		for(int i = 0; i<files.length; i++) {
				String filename = files[i].getName(); //������ or ���ϸ�
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
		int dirnum = subdir.size(); //��������
		int filenum = files.length - dirnum; //���ϰ���
		
		// �Լ��� ����Ǿ ������ �ְ� �;��
		// static ����
		totaldirs+=dirnum; // �� ������ (��������)
		totalfiles+=filenum; //�� ����
		
		System.out.println("[Current dirNum] : "+dirnum);
		System.out.println("[Current fileNum] : "+filenum);
		System.out.println("*****************************");
		
		//POINT (���� �ȿ� ����(��������)) �� ���� �;��
		for(int j = 0; j < subdir.size(); j++) {
			int index = subdir.get(j);
			//index > 2
			//printFileList(C:\\Temp\\2021)
			
			//index > 3
			//printFileList(C:\\Temp\\2022)
			printFileList(files[index]); //POINT ���ȣ�� (�ڽ��� ȣ��)
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
