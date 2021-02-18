/*
User ����� 		: Provider ������ 

class A{}
class B{}

����) A�� B�� ����մϴ�

�����
1. ���  A extends B
2. ����  A ��� Ŭ������ B�� member field�� ���� �� �ִ� class A { B b; }
   2-1. �κ����� 
   2-2. ��ü����
 ------------------------------------------------------------------
 >> ���� ������ ����
 class B{}
 class A{
 	int i;
 	B b; //A�� B�� ����մϴ�(����)
 	A(){
 		b = new B();
 	}
 }

>> B��� Ŭ������ �������� ����(X) >> A��� ��ü�� ��������� B�� ����
>> A a = new A() >> A��ü�� �����ǰ�, B��ü�� ����
>> ���� ����(�����ֱ� ���ƿ�)  >> ��ü���� 


// �л��� �б�����
class B{}
class A{
	int i;
	B b; // A�� B�� ����մϴ� ( ���� )
	A(){
	
	}
	A(B b){
	this.b = b;
	}
}

>> void main()
   A a = new A();
   B b = new B();
   A a2 = new A(b); //�κ�����
   
   //A, B ���� ���ü�� �ƴϴ�
   
----------------------------------------------
 class B{}
 class A{
 	int i;
	A(){
	}
	
	void m(B b){ // A�� B�� �����մϴ�(�Լ�)  ,**BŸ���� member filed �����
		b ��ü�� ������ �۾�
	}
 }
 
void main()
B b = new B();
A a = new A();
� ��Ȳ���� B��ü �ʿ�
a.m(b);


*/
class B{
	
}
class A{
	void method(B b) {
		
	}
}
//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
//�������� ���α׷��� ����� : �������̽� Ȱ��
interface Icallable{
	void m();
}

class D implements Icallable{

	@Override
	public void m() {
		System.out.println("D Icallable �������̽��� m() ������");
	}
	
}

class F implements Icallable{

	@Override
	public void m() {
		System.out.println("F Icallable �������̽��� m() ������");
	}
	
}

//interface  POINT >> �����ϰ� >> Ȯ���� >> ������ ����
class User{
	
	void method(Icallable ic) {
		ic.m();
	}
	/*
	void method(D d) {
		d.m();
	}
	void method(F f) {
		f.m();
	}
	*/
	
}


public class Ex05_User_Provider {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		a.method(b); //B Ÿ���� ��ü �ּ� //B ��ü�� �������� ������ method �����ؿ� ��
		
		D d = new D();
		F f = new F();
		User user = new User();
		user.method(f);
		
	}

}
