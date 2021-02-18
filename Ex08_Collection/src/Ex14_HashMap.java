import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap<k,V>

HashMap<String, String>
HashMap<Integer, String>
HashMap<String, Emp>	>> values �������� ���� ������
>> put("kim", new Emp());


*/
class Student{
	int kor;
	int math;
	int eng;
	String name;
	
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + ", math=" + math + ", eng=" + eng + ", name=" + name + "]";
	}
	
	
	
	
}
public class Ex14_HashMap {
	public static void main(String[] args) {
		//������ �л����� ID�ο�
		HashMap<String, Student> sts= new HashMap<String, Student>();
		sts.put("kim", new Student(100, 99, 88, "ȫ�浿"));
		sts.put("hong", new Student(50, 40, 60, "������"));
		//�� 20�� ����
		
		Student std = sts.get("hong");
		System.out.println(std);
		
		//Tip 1
		//Map key, value ���� 
		Set set = sts.entrySet(); // key + "=" + value �ϳ��� ���ڿ� ���� ����
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Tip 2
		//�и��� key, value ȹ�� 
		// class Entry { Object key, Object value }
		//Map{ Entry[] elements } >> Map.Entry �������̽� 
		for(Map.Entry m : sts.entrySet()) {
			System.out.println(m.getKey() + "/ "+ ((Student)m.getValue()).name);
		}
		//Map.Entry Ÿ������ ������ key, value �� �и��ؼ� ���� �� �ִ�
	}

}
