/*
this : ��ü �ڽ��� ����Ű�� this ( this.empno, this.ename )
this : �����ڸ� ȣ���ϴ� this ( this(100, "red"))


���

�θ�

�ڽ� (this)

super(���� �ڽ��� �θ��� ���� �ּҰ�) : ��Ӱ��迡�� �θ��� ���� :
�ڽ����忡�� super �θ� ��ü�� �ּ� 

1. super >> ��Ӱ��迡�� �ڽ��� �θ� ����
2. super >> ��Ӱ��迡�� �θ��� �����ڸ� ȣ��(���������) ^^

Tip)
c# >> base()
java >> super()

 */
class Base{
	String basename;
	Base(){
		System.out.println("Base  �⺻ ������ �Լ�");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename :"+this.basename);
	}
	
	void method() {
		System.out.println("�� �θ� method");
	}
}

class Derived extends Base{
	String dname;
	Derived() {
		System.out.println("Derived  �⺻ ������ �Լ�");
	}
	
	Derived(String dname){
		
		super(dname); //�θ� �����ڸ� ȣ�� (��Ӱ���)
		
		this.dname = dname;
		System.out.println("dname :"+this.dname);
	}

		@Override
		void method() {
			// TODO Auto-generated method stub
			//super.method();
			System.out.println("�θ��Լ� ������");
		}
	
	//����� �θ���� ����� ... �׸�����
	//������ ��� super 
		void parent_method() {
			super.method();
		}
}



public class Ex06_Inherit_super {

	public static void main(String[] args) {
//		Derived d = new Derived();
		Derived d = new Derived("ȫ�浿");
		d.method(); // �θ��� �Լ�
		d.parent_method();
	}

}
