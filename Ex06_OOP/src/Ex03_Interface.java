/*
�߻�Ŭ����: �������̽�(interface)

�������̽� : ǥ��, ���, �Ծ�, ��Ģ�� ����� ����

[�߻� Ŭ���� : �������̽� ������]
1. ������ ��ü ���� �Ұ���( new �����ڸ� ���� ��ü ���� �Ұ�)
1-1. ������ : �߻� Ŭ����(�ϼ� + �̿ϼ�), �������̽�(��� ���� �̿ϼ�)

2. ���
�߻�Ŭ���� extends
�������̽� �����ض� implements ���
class Car extends abClass{}
class Car implements la{} //�������̽��� ������ �߻��ڿ��� ������ �ض�

�߻�Ŭ���� �������̽�
1. ���� ���(����) ���� >> ��� (���� ������ ������) >> �������� ���� ��� ��� ��Ƽ� ū ���
class Test extends Object implements Ia, Ib, Ic
����� ũ�� ����� >> ��뼺 �������� >> ���� >> �ɰ�� .....

2. �߻�Ŭ������ ���Ͽ��ӿ�Ģ(������ ���)

3. �߻�Ŭ���� (�ϼ� + �̿ϼ�)

4. �������̽��� (����� ������ �������� �̿ϼ�(�߻�)�ڿ� >> JDK(Default ��, static ��)


�������̽� ����Ʈ���� ���� �ֻ��� �ܰ�
(���� .....)
� ������Ʈ ���� (ǥ�� .....)

++������(�ʱ�)++
1. �������̽� [������] �������� ���� (�������̽��� �θ� Ÿ��)
2. ���� �������� ���� Ŭ������ �ϳ��� �����ִ� ��� (�������̽� ����...���� �θ�)
3. JAVA API ���� ���� ����� ���� ������ Interface ����� ���Ҿ�� (������ ���� �͸� �ص�)
4. �������̽� (������) : (~able) : ������ �� �ִ�, �� �� �ִ� : Cloneable (������ ǥ��)
5. ��ü�� ���� ��(��ü�� ����) >> ������ >> ���� �θ�
*/
/*
interface Iable{
	String print();
	// ����ҋ� print �Լ� ��� ..... ���� ���ڿ�
}

class Test implements Iable{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
*/

// ����ǥ�� >> ���� ���� >> ������ 

/*
1. ���� �����θ� ������ ���� �ʴ� : ���� ���� ���� �Լ� : void run();
���� ���� �̵� move(int x, int y) >> �������̽� >> ��ũ, ���� >> move ����
 >>JAVA API : Collection(�����迭:�ڷᱸ��) >> Vector, [ ArrayList ], HashSet, [ HashMap ]
>> Vector, [ ArrayList ], HashSet, [ HashMap ] �ѵ��� ������ interface ����

2. ������� (interface �ڿ�)
2-1. public static final int VERSION=1; > int VERSION=1 >> �����Ϸ��� �˾Ƽ� [public static final] �־�� ���ش�


2-2. public abstract void run(); >> [public abstract] ���� >> void run()

interface Iable{
	public static final int VERSION=1; 
	public abstract void run();
}

�������
interface Iable{
	int VERSION=1;
	void run();
	String move(int x, int y);
}

interface Iable {  }
interface Bable {int NUM=0;  }
interface Cable {void run(); void move();  }

class Test extends Object implement Iable, Bable, Cable

*/

interface Humanable{
	int AGE=100;
	String GENDER="��";
	
	String print();
	void message(String str);
}

interface Iable{
	int AGE=10;
	void info();
	String val(String s);
}

class Test extends Object implements Humanable, Iable{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex03_Interface {
	public static void main(String[] args) {
		Test t = new Test();
		Humanable h = t; //������ �θ�� �ڽİ�ü�� �ּҸ� ���� �� �ִ�
		System.out.println(h.AGE);
		
		Iable ia = t;
		System.out.println(ia.AGE);
	}
}
