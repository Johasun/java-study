import kr.or.bit.Fclass;
import kr.or.bit.Tv;



public class Ex02_MethodCall {

	public static void main(String[] args) {
		Fclass fclass = new Fclass();
	
	
		fclass.m(); //함수 호출
		fclass.m2(100);
		
		int result = fclass.m3();
		System.out.println(result);
		
		result = fclass.m4(200);
		System.out.println(result);
		
		result = fclass.sum(10,20,30);
		System.out.println(result);
		
		fclass.callSubSum();
		
		boolean bo = fclass.opSum(-1);
		System.out.println(bo);
		
	    Tv tv =fclass.tCall(); //Tv 타입을 가지는 주소값을 받는다
	    System.out.println("tv : " + tv.brandname);
	    
	    Tv tv2 = new Tv();
	    System.out.println("tv2 :" + tv2);
	    fclass.tCall2(tv2); //주소값 전달
	}

}
