package kr.or.bit;

//class == ���赵  == Type(����� ���� Ÿ��)
//Ŭ������ ���α׷����� ���� ǥ�����ڸ� ��� ��ü�� ����(valiable) , 
//�޼ҵ�(method) �� �����̴� ǥ���Ҽ������� 
//���Ǽ��迡 ����� �����ڸ� ������  �Ӽ��� ������ �����ϴ� ��ü�� �����̴�.



//����̶�� ���赵
//����� ǥ�� (���, �̸� , ���� .....)
public class Emp {
	
	//������ ���� �� �ִ� ����
	//����� ����� ������ �ִ� (��� ����)
	//���� > ���� (����, ���� , ��ǰ) ���� �� �ִ� ������ �̸� >> instance variable >> member field
	
	//������ ����(scope : ��ȿ����) : ����Ǵ� ��ġ 
	//1.   local variable (�������� : �Լ�) class Person{ public void run(){ int speed; }}
	//1.1  �Լ��ȿ� if�� , for ���ȿ� ���� (block)
	//2.   instance variable  class Person{ public int age; }
	//3.   static variable : �����ڿ�(��ü��)
	
	//Ŭ������ ����
	//1. class Test{ } >> �������� ������ �Ұ��� >> �ٸ� Ŭ���� �����ִ� Ŭ����(Ÿ��) >> lib
    //2. class Test{public static void main(String[] args){}} >> �������� ������ ������ Ŭ����
	//2.1 >> �Լ��� �̸�(main) >> ��� >> ������(������) 
	//Tip) c# >> Main()
	
	//private ĸ��ȭ : �ڿ��� ��ȣ �ϰڴ�
	//�����Ҵ��� ���� �����Ҵ��� ���ؼ� ������ ����
	
	private int empno;
	private String ename;
	private String job;
	
	
	

	public String getEname() { //getter �Լ�
		return ename +"��";
	}
	public void setEname(String ename) { //setter �Լ�
		this.ename = ename;
	}


	private int num;
	//�Լ� (�ּ��� ���(����) ����)
	//����(�������� ���ؼ� ���� , �������� ���ؼ� �ްڴ�)
	public void setNum(int n) { //setter ����Լ�(write �Լ�)
		if(n > 0) {
			num = n;	
		}else {
			num = 0;
		}
		
	}
	public int getNum() { // getter ����Լ�(read �Լ�)
		return num;
	}
	
	
	public int number;
	
	public void print() {
		int number = 0;
		System.out.println(number);
		//int i=0;
		for(int i = 0 ; i < 10 ; i++) {
			
		}
		//System.out.println(i);
	}
	
	
	
}
