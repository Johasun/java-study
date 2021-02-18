
public class Ex06_String_Function {
	public static void main(String[] args) {
		// �ϻ������� �ٷ�� ������ : ���ڿ�, ����, ��¥ >> �Լ� ( �ý��� �Լ� != ������Լ� )
		String str = "hello";
		String concatstr = str.concat("world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("ello");
		System.out.println(bo);
		
		bo = str.contains("elo");
		System.out.println(bo);
		
		String str2 = "a b c d";
		System.out.println(str2.length());
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("j"));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("������")); //�١� �迭���� ���� ���� return -1
		// �Ź��缳 ... �ܾ� ,,, ���� ���� ,,,
		// "����".... ������ .... 0 ���� ū ���� ������ �ּ� 1�� �缳
		// - 1�� return -> ������ ������ .... ���� �ִ��� ������ Ȯ���Ҷ�
		if(filename.indexOf("wo") != -1) {
			System.out.println("woo �ϳ��� ������ �ֱ���");
		}
		
		System.out.println("lastIndexOf: "+filename.lastIndexOf("a"));
		
		//length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0)); //superman
		System.out.println(result.substring(2)); //perman
		System.out.println(result.substring(1, 2)); //u >> endindex -1 >> �ڱ��ڽ�
		System.out.println(result.substring(0, 0)); //(0, -1) �ȳ��Ϳ�
		System.out.println(result.substring(0, 1)); // s
		System.out.println(result.substring(2, 3)); // p
		
		//Quiz
		String filename2 = "h.jpeg"; // �Ǵ� ���ϸ��� hong.png �Ǵ� ���ϸ��� h.tmp
		//���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ȭ�鿡 ����ϼ���
		//1. ���ϸ� h
		//2. Ȯ���� jpeg
		int Index = filename2.indexOf(".");
		int length = filename2.length();
		
		System.out.println("���ϸ� "+filename2.substring(0, Index));
		System.out.println("Ȯ���� "+filename2.substring(Index+1, length));
		
		
		int position = filename2.indexOf(".");
		String file = filename2.substring(0, position);
		
		String extention2 = filename2.substring(position+1, filename2.length());
		String extention = filename2.substring(++position);
		
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);
		
		//replace ( ġȯ�Լ� )
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDD", "������ ������");
		System.out.println(result3);
		
		result3 = str3.replace("A", "a");
		System.out.println(result3);
		
		//ETC
		System.out.println("charAt: "+str3.charAt(0));
		System.out.println(str3.charAt(3));
		
		System.out.println(str3.endsWith("DDDA")); // TRUE
		System.out.println(str3.endsWith("BDDDA")); // false
		
		System.out.println(str3.equalsIgnoreCase("abcDADDDDDA")); // ��ҹ��� ���� ����
		
		//Today Point (Split)
		String str4 = "���۸�,��Ƽ,�����,������,������";
		String[] namearray = str4.split(",");
		for(String s : namearray) {
			System.out.println(s);
		}
		
		//Tip) 
		
		// .	>> ����ǥ���� ���� ... >> ���� �״�� \ >> 	.�� ǥ���ϴ� ����ǥ���� >> \. 	>>\\.
		//����ǥ���� .... �Ұſ��� ^^
		//����ǥ���� ���� ...
		//�ֹι�ȣ ���� 6�ڸ� - ���� 7�ڸ� : {\d6}-{\d7}
		//123-1234567 >> false
		//�ڵ���, ������ȣ, �����ȣ, �ѱ�ó��, �������ּ�, �̸��� �ּ�
		//����ǥ������ �̹� �� �־�� (����ǥ���� read ����)
		//ī�� ������ �ö󰡿� ^^
		
		
		//
		
		//�ͼ���
		String str6 = "ȫ       ��            ��";
		//"ȫ�浿"
		String result4 = str6.replace(" ", "");
		System.out.println(result4); //ȫ�浿
		
		String str7 = "         ȫ�浿         ";
		System.out.println(">"+str7+"<");
		System.out.println(">"+str7.trim()+"<");
		
		String str8 = "         ȫ     ��      ��       ";
		String result5 = str8.trim();
		String result6 = result5.replace(" ", "");
		System.out.println(result6);
		
		// �ڹٿ��� �������� �Լ��� ���� (method chain ���)
		System.out.println(str8.trim().replace(" ", "").substring(2));
		
		
		//Quiz-1
		int sum = 0;
		String[] numarr = {"1", "2", "3", "4", "5"};
		//���� : �迭�� �ִ� ���ڰ����� ���� sum ������ ��Ƽ� ��� : ��� 15
		
		for(int i = 0; i<numarr.length; i++) {
			sum+= Integer.parseInt(numarr[i]); // ���ڿ� ���� ������
			// Double.parseDouble(result6) ���ڿ� ���� �Ǽ���
		}
		System.out.println(sum);
		
		
		//Quiz-2
		String jumin="123456-1234567";
		// �� �ֹι�ȣ�� ���� ���ϼ���
		
		String[] numarr2 = jumin.replace("-", "").split("");
		int sum3=0;
		for(String i : numarr2) {
			sum3+=Integer.parseInt(i);
		}
		System.out.println(sum3);
		
		
	}

}
