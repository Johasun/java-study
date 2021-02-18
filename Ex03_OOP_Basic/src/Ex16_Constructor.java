/*
������ �Լ�(constructor)
1. �Լ� (Ư���� ����)
2. Ư���� ���� (member field �ʱ�ȭ)

Tip) {�ʱ��� �Լ�}   , static{�ʱ��� �Լ�}

3. �Ϲ��Լ��� �ٸ��� (public void m(), public String m(String s) ...)
3.1 �Լ��� �̸��� ����(class ����)
3.2 ������� : ��ü ����(new) >> heap ������ �Ҵ�ǰ� >> ����(member field) > �������Լ� �ڵ� ȣ��
3.3 ������� : return type(X) >> ������ �Լ� ������(void) >> public void Ŭ���� �̸� >> public Ŭ�����̸�

4. ���� : �����Ǵ� ��ü���� [����������] member field ���� �ʱ�ȭ �� �� �ִ�.

class Car {
	String color;
}
-- �ڵ����� ����� ������ ���� �ϳ��� ������ �Ѵ�
Car car = new Car()
-- ���� String color = "red"; -> 1�� ������ �����ϳ�, �ڵ����� ���� �ٸ� ������ ���� �� �ִٿ� ������ ����
class Car{
	public Car(String color){
		
	}
}

Car car = new Car("red");

5. ������ �Լ� (method overloading) 

6. ����� ���� overloading ������ �Լ��� �ϳ��� �����ߴٸ�
--default ������ �Լ��� �ݵ�� ������ ���ؼ��� ��밡���ϴ�


*/

// ����� ���� �ڵ����� ����ٸ� �ݵ�� �ڵ����� �̸��� �ο��ϼ���
class Car{
	String carname = "����";
	// ������ ������ default ������ �Լ��� ����
	// �����Ϸ��� �˾Ƽ� �����ؿ�
	// public Car() {} 
	
	public Car() {
		System.out.println("�� �����ھ� .. ��������");
	}
}

class Car2{
	String carname;
	public Car2() { // parameter �� ���� ������ -> default constructor
		carname = "����"; // �ʱ�ȭ
	}
}

class Car3{
	String carname;
	public Car3() {
		carname = "����";
	}
	public Car3(String name) {
		carname = name;
	}
}

class Car4{
	String carname;
	//default �������� �ʾҾ��
	//[���������� overloading] �����ڸ� �����ߴٸ� default �� �ڵ����� �������� �ʾƿ�
	//�������� �ǵ� : ������ ������ ����
	public Car4(String name) {
		carname = name;
	}
}
public class Ex16_Constructor {
	public static void main(String[] args) {
		Car car = new Car(); //()��ȣ -> �����ڸ� ȣ���ϴ� ��ȣ
		
		Car3 car3 = new Car3(); // default �ڵ�ȣ��
		System.out.println(car3.carname);
		
		Car3 car4 = new Car3("���׽ý�"); // overloading constructor
		System.out.println(car4.carname);
		
		Car4 car5 = new Car4("���");
	}
}
