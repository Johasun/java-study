import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {
	private static final TreeSet Integer = null;

	public static void main(String[] args) {
		//Set �������̽� : ����(X), �ߺ�(X)
		HashSet<String> hs = new HashSet<>();
		
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		hs.add("C");
		
		hs.
		
		System.out.println(hs.toString());
		//[P, A, B, C, D, F, G, K]

		//TreeSet
		//����(X) �ߺ����(X), >> ���� (O)
		//�˻��ϰų� ���� �ʿ�� �ϴ� �ڷᱸ��(������ ����)
		
		//1. ����Ʈ������
		//2. �����Ͱ� ����ɶ� ���ĵȴ�
		//��� �ζ� ..
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0; lotto.size() < 6; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto.toString());
	}

}