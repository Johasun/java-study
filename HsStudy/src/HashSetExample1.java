import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	//JAVA�� �ѹ��� �����
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: "+size);
		
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) { // ��ü ����ŭ ����
			String element = iterator.next(); // �� ���� ��ü�� �����´�
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC"); 	// �� ���� ��ü ����
		set.remove("iBATIS");	// �� ���� ��ü ����
		
		System.out.println("�� ��ü��: "+set.size()); // ����� ��ü �� ���
		
		iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear(); // ��� ��ü �����ϰ� ���
		if(set.isEmpty()) { System.out.println("��� ����"); }
		
	}

}