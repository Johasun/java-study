
class Human{
	String name;
	int age;
}

class Test{
	int add(int i , int j) {
		return i + j;
	}
	
	//배열은 객체다 (배열은 주소값을 가지고 있다 : heap 생성)
	int[] add2(int[] param) { //int[] 주소값을 리턴값을 리턴 ,   int[] 배열의 주소값을 받겠다)
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
	//함수안에 코드를 여러분 마음대로 작성하시고
	//main 안에서 가지고 놀아 보세요
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
	 
		 //add3() error없이 ..
	 }
}
