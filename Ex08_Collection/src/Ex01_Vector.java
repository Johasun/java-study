import java.util.Vector;

/*
Collection FrameWork //�ڹ������� ����

[�ټ��� �����͸�] �ٷ�� [ǥ��ȭ�� �������̽�]�� [�����ϰ� �ִ� Ŭ������ ����]

Collection �������̽� 	-> List �������̽� ��� -> ArrayList(���� : ������ �����)
					-> Set	�������̽� ��� -> HashSet, TreeSet (����)

Map �������̽� (key, value) -> HashMap(����) ex. (����, 02) / ������ȣ 

1.  List (���� ���ÿ� : ��ȣǥ) : ������ ����, �ߺ� ��� > ���������� ������ (�ڷ�, ��ü) >> *[�迭]���� >>
��) [ȫ�浿][ȫ�浿][ȫ�浿]

�����ϰ� �ִ� Ŭ���� - ���� ������ �����迭�� ����
1-1. Vector(������)		-> ����ȭ ����(��Ƽ ������) -> Lock (��ġ) -> ���� ���� ������ -> ������
1-2. ArrayList(�Ź���)		-> ����ȭ ����(��Ƽ������)X -> Lock (��ġ)X	: �ʿ信 ���� ��밡�� -> ���� �켱 -> ������ ���� ������

---------------------------------------------
*������ �������� ���� Ÿ���� ������ ���� : Array ����(����)
-���� ������ �ѹ� �������� (���� ũ��� ����Ұ�)
int[] arr = new int[5];
arr[0] = 100;
... 10���� ���� �ʿ��� .... [���̰ų� �ø��� �۾� �Ұ�]
int[] arr2 = new int[10];
arr �ڿ��� arr2 �̰� �迭�� ���Ҵ�

Array
1. �迭�� ũ�� ���� : Car[] cars = {new Car(), new Car()}; // �� 2��
2. ���� ��� (index) �� ��ȣ ���� : cars[0] ,,,, n����� : length-1
3. �ʱ� ���� ���� �Ұ�

<-> Collection 
List > Vector, ArrayList
1. �迭�� ũ�⸦ �������� Ȯ�� : ��� >> ���� �ȵǴ� �̾߱� >> ** ����� [�迭�� ���Ҵ�] �̿�
2. ������ ����(����������  index �迭) , �ߺ��� ���
3. ������ ���� ���� : Array


*/
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default: �뷮 :"+v.capacity()); // �迭�� ��ü �뷮 //10�� �迭
		System.out.println("size : "+ v.size()); // �迭�ȿ� ����ִ� ���� ũ�� 
		
		v.add("AA");
		v.add("AA");
		v.add("AA");
		
		System.out.println("������ ũ��: size : "+ v.size());
		System.out.println(v.toString()); //[AA, AA, AA] // to String ������
		//Array : length
		//Collection : size
		for(int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i)); 	//array[i] // �Լ� get(�ε�����)
		}
		
		for(Object obj : v) {
			System.out.println(obj);
		}
		
		//���ʸ� >> Ÿ���� ���� >> ���� ���� �н�
		Vector<String> v2 = new Vector<String>();
		v2.add("hello");
		v2.add("world");
		v2.add("king");
		
		for(String str : v2) {
			System.out.println(str);
		}
		
		////////////////////////////////////////////////
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.capacity()); // '20' ���� ������ �ִ� capacity ���� �ι�� �ø���
		System.out.println(v3.size()); // '11'
		
		
	}

}