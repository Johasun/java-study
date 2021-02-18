/*
OOP
1. ���
2. ĸ��ȭ
3. ������

1. ���
java : child extends Base
c#   : child : Base

2. Ư¡
2-1 ���� ����� �Ұ�
2-2 ���ϻ�� ( ������ ��� : �������� Ŭ���� ��� )
2-3 ���� ����� ���� ( �� interface������ )

3. ���
3-1 ������ �ǹ� : ���뼺
3-2 ���� : �ʱ� ���� ���
3-3 ���뼺 >> ���� >> ��� (����и�(�߻�ȭ))

4. ��Ӱ���
GrandFather >>	Father	>>	Child ��Ӱ���
�θ���� heap �ö󰣴� .... 
Child child = new Child()
child�� new�� �ϸ� ��Ӱ��踦 �ľ��ؼ� �Ҿƹ����� ���� �ø��� �ƹ��� �׸��� �������� child ������ �ö󰣴�.

*/

// ��Ӱ��� Base Ŭ���� Object
class GrandFather extends Object { // extends Object { �����Ϸ��� �˾Ƽ� ó��
	public GrandFather() {
		System.out.println("GrandFather");
	}
	public int gmoney = 5000;
	private int pmoney = 1111; // ������ private (��ü , ��Ӱ���) ���ٺҰ� 
	
//	public void call() {
//		System.out.println(pmoney);
//	}
}

class Father extends GrandFather {
	public Father() {
		System.out.println("Father");
	}
	public int fmoney = 3000;
}

class Child extends Father {
	public Child() {
		System.out.println("Child");
	}
	public int cmoney = 1000;
}

//default
// ����ڰ� ����� ��� Ŭ������
// class Car extends Object
class Car{ // extends Object
	
}

// ����ڰ� ����� ��� Ŭ������ default �� Object(�ֻ���) Ŭ���� ���
// Object ���� �߻�ȭ, ���� �Ϲ�ȭ .... 
// ������ �ڿ� : ��� Ŭ������ ���� ����ϴ� �͵� .... �ּ�Ȯ��, �����Լ�


public class Ex01_Inherit {
	public static void main(String[] args) {

		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
		//child.pmoney ���� �Ұ�.. private
		
//		Car car = new Car();
		
	}

}
