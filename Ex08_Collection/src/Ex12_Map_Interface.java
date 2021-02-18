import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map �������̽�
Map (key, value) ���� ������ ���� �迭
ex) (02,����) (031,���)
key : �ߺ�(X)
value : �ߺ�(O)
generic ���� (key, value Ÿ���� ���� ����)

Map �������̽� ����
������ : HashTable ����ȭ
�Ź��� : HashMap(����ȭ �������� �ʾƿ�): ���ɰ���
*/
public class Ex12_Map_Interface {
	public static void main(String[] args) {
		//HashMap<K, V>
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1004");
		//����� ID, PWD ����
		System.out.println(map.containsKey("tiger")); //��ҹ��ڱ��� -> false
		//�ߺ� ID �˻�
		System.out.println(map.containsKey("scott")); 
		System.out.println(map.containsValue("1004"));
		System.out.println(map.containsValue("1007"));
		
		//point
		//key�����ϸ� value ���� �˼��ִ�
		System.out.println(map.get("superman")); //value return
		System.out.println(map.get("hong")); //�ش� Ű�� �ش��ϴ� value�� ���ٸ� ... null ����
		
		map.put("Tiger", "1007"); //key �ߺ�(x) ... value ���� overwrite
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());
		
		Object value = map.remove("superman");
		System.out.println("value :"+value);
		
		System.out.println(map.toString());
		//{scott=1004, Tiger=1007} ������
		
		//���� (����)
		Set set = map.keySet(); //key ���� >> ��Ģ > ���� (X) > �ߺ�(X) Set
		Iterator it = set.iterator(); //��������
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection clist = map.values();
		System.out.println(clist.toString());
		
		//Map �ϰ� List ȥ��
		HashMap<String, List> room = new HashMap<String, List>();
		//room.add("1", new ArrayList())
	}
}