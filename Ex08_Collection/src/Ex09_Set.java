import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 인터페이스를 구현하고 있는 클래스
//Set 원안에 들어가세요 (순서 보장(X), 중복(X)) : 순서가 없고 중복을 허락하지 않는 데이터 집합 : Set
//HashSet, TreeSet
public class Ex09_Set {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println(bo2);
		
		bo2 = hs.add(1); //보장 : 중복값
		System.out.println(bo2);
		
		System.out.println(hs.toString());
		
		hs.add(2);
		System.out.println(hs.toString()); // 순서가 보장되지 않아요 ( 배열 아님 )
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("C");
		hs2.add("Z");
		hs2.add("A");
		hs2.add("A");
		hs2.add("A");
		
		System.out.println(hs2.toString());
		
		String[] obj = {"A", "B", "C", "D", "D", "A"};
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0; i<obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		//Quiz
		//HashSet 을 1~45 난수 6개 넣으세요
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		for(int i = 0; lotto.size()<6; i++) {
			lotto.add((int) (Math.random()*45+1));
		}
		
		System.out.println(lotto.toString());
		
		Set set2 = new HashSet(); // 다형성 Set 인터페이스 받기
		while(set2.size()<6) {
			set2.add((int)(Math.random()*45+1));
		}
		
		System.out.println("lotto : "+set2);
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FF");
		System.out.println(set3.toString());
		
		//iterator
		
		Iterator<String> it = set3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //set 배열(X) ... 순차적으로 데이터 출력 가능
		}
		
	}
}
