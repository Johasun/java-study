
class Human{
	String name;
	int age;
}

class Test{
	int add(int i , int j) {
		return i + j;
	}
	
	//�迭�� ��ü�� (�迭�� �ּҰ��� ������ �ִ� : heap ����)
	int[] add2(int[] param) { //int[] �ּҰ��� ���ϰ��� ���� ,   int[] �迭�� �ּҰ��� �ްڴ�)
		//return null;
		//return new int[5]; //return new Tv()
		int[] arr = new int[param.length];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = param[i]+1;
		}
		return arr;
	}
	
	int[] add3(int[] so , int[] so2) {
		return null;
	}
	//�Լ��ȿ� �ڵ带 ������ ������� �ۼ��Ͻð�
	//main �ȿ��� ������ ��� ������
}

public class Ex03_MethodCall_Array {
	 public static void main(String[] args) {
		 Test t = new Test();
		 int result = t.add(10,10);
		 System.out.println("result : " + result);
		 
		 int[] array = {10,20,30};
		 int[] resultarray = t.add2(array);
		 for(int i : resultarray) {
			 System.out.println("i : " + i);
		 }
	 
		 //add3() error���� ..
	 }
}
