package kr.or.bit;
/*
	Ŭ���� ������� (�ʵ� + �Լ�)
	
	*���(����) ����� ���
	*�Լ�(function , method)
	*method : ���� �Ǵ� ����� ���� (�ּ� ����) : �ϳ��� �Լ��� �ϳ��� ��ɸ� ����
	ex) �Դ´� , �ܴ� , �ȴ´�  
	*�Լ��� ȣ�⿡ ���ؼ��� ���� (������ ���� �̸�)
	
	JAVA)
	1. void , parameter(0)         >> void print(String str) { �����ڵ� }
	2. void , parameter(x)         >> void print(){ �����ڵ� }
	3. return type , parameter(0)  >> int  print(int data) {return data + 10;}
	4. return type , parameter(x)  >> int  print(){return 100;}

	void : �����ִ� ���� ���� >>  return value �� ����
	return type    >> 8���� �⺻ Ÿ�� , Array , class , ....Collection , Interface
	parameter type >> 8���� �⺻ Ÿ�� , Array , class , ....Collection , Interface
	
	parameter ������ ������ ����
	void print(int a , int b , int c  , int d){}
	>>����  print(10,20,30)(x) ,,, print(10,20,30,40)(0)
	
	ex)
	boolean print(boolean b) {return b};
	print(false);
	
	������ ǥ�� (����... �� ���Ҵ��� ���� ...)
	�Լ��� �̸�
	void a(){} ...(x)
	�ǹ��ִ� �ܾ��� ����
	getChnnelNumber()
	getEmpListByEmpno()
*/
public class Fclass {
	public int data;
	
	//������ ���� >> default void m()
	public void m() {
		System.out.println("�Ϲ��Լ� : void , parameter(x)");
	}
	
	public void m2(int i) {
		System.out.println("�Ϲ��Լ� : void , parameter(0)");
		System.out.println("parameter value : " + i);
	}
	
	public int m3() {
		return 100; //return type  �����ϸ� �ݵ�� return Ű���带 ��� ...
	}
	
	public int m4(int data) {
		return 100+data;
	}
	//4���� �⺻ ����
	
	//Ȯ��
	public int sum(int i , int j , int k) {
		return i + j + k;
	}
	
	//�Լ� (������ : public ���� ...) 
	//�Լ� ������ private
	//���� �������� �ǵ��� : �ܺο����� ��� >> ���ο����� ��� >> "�ٸ� �Լ��� �����ִ� ����" 
	//���ο��� ���Ǵ� "�����Լ�"
	private int subSum(int i) {
		return i + 100;
	}
	
	public void callSubSum() {
		int result = subSum(100); //���ο��� ȣ��
		System.out.println("call result : " + result);
	}
	
	private int operationMethod(int data) { //���� �Լ�
		return data * 200;
	}
	
	public boolean opSum(int data) {
		//���� �ٸ� �Լ����� ����
		//������ �� �Ǵ� 
		boolean bo;
		int result =operationMethod(data);
		if(result > 0) {
			bo = true;
		}else {
			bo = false;
		}
		return bo;
	}
	
		// Quiz
		// a �� b ���߿� ū ���� return �ϴ� �Լ��� ���弼��
		// ex) max(300,100) return ���� 300
		// public int max(int a, int b) {}
	
		// 30�� : return �� �ּ� (�ݺ��� ��� (x)
		/*
		  public int max(int a , int b) { 
		  		if(a > b) {
		  		 	return a; 
		  		 }else { 
		  		 	return b; 
		  		 } 
		  }
		 */

		//60��
		/*
		public int max(int a, int b) {
			int result = 0;
			if (a > b) {
					result = a;
			} else {
					result = b;
			}
			return result;
		}
		*/
	    //90��
		// int max = (a > b) ?  a  :  b ;
		// return max;
		
		//100��
		//return  (a > b) ?  a  :  b ;
		
		public int max(int a, int b) {
			return (a > b) ?  a  :  b;
		}
		
		//�Լ���  return type  or  parameter  >> Array , class(����� ���� Ÿ��)
		public Tv tCall() {  //Tv Ÿ���� ���� [�ּҰ�:���� Ÿ���� ���� �ּ�]�� ����
			//return null; //�� Tv Ÿ���� ��ü�� ���� (0)
			
			Tv t = new Tv(); //t ��� ������  Tv Ÿ�� ��ü�� �ּҸ� ������ �ִ�
			t.brandname ="LG";
			System.out.println("t : " + t);
			return t;
			//�� �ڵ�� ������ � ������ ������ ... ��ü�� � ������ �����ؼ� ������
			
			
			//return new Tv(); //Tv��� ��ü�� �ּҰ��� �ٷ� ����
			//��� �ʱ�ȭ�� ���� �ּҸ� ������ ���
		}
		
		public void tCall2(Tv t) { //Tv Ÿ���� ���� �ּҰ��� parameter
			System.out.println("t �ּ� �� : " + t);
		}
		
		
}

