import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class S0215_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Setvlet/JSP");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println("\t"+iterator.next());
		}
		
		String s = set.toString();
		System.out.println(set);
		
	}
}
