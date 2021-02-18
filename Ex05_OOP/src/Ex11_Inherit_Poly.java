class Pbase{
	int p = 100;
}

class Cbase extends Pbase{
	int c = 200;
}

class Dbase extends Pbase{
	
}
public class Ex11_Inherit_Poly {
	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		//다형성
		Pbase p = cbase;
		System.out.println(p);

		Dbase dbase = new Dbase();
		p = dbase; // 다형성
		System.out.println(p);
		
		Cbase c = (Cbase)p; //부모가 객체의 주소를 다시 자식에게 줄때는 자식타입 casting
		//자식으로 내려주어야 상속관계에서 자식은 모든 자원에 대한 접근이 가능하다
		
		
	}
}
