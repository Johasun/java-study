import kr.or.bit.Mouse;
import kr.or.bit.NoteBook;

public class Ex04_MethodCall {

	public static void main(String[] args) {
		
		NoteBook notebook = new NoteBook();
		notebook.setColor("red");
		notebook.setYear(-2000);
		
		System.out.println(notebook.getColor());
		System.out.println(notebook.getYear());
		
		Mouse mouse = new Mouse();
		notebook.handle(mouse);
		System.out.println(mouse.x);
		System.out.println(mouse.y);
		
		//notebook 3대 생성하고
		//2000 , red
		//2010 , blue
		//2020 , white
		//명시하고 정보를 출력하세요
		//Array ...
		
		//TODAY POINT
		//[[ 객체배열은 [방의 생성]과 [객체 생성] 2번 작업  ]]
		
		
		NoteBook[] notebooks = new NoteBook[3];
		//배열의  notebook 객체의 주소를 담을 수 있는 방 생성 
		
		notebooks[0] = new NoteBook();
		notebooks[1] = new NoteBook();
		notebooks[2] = new NoteBook();
		
		notebooks[0].setYear(2000);
		notebooks[0].setColor("red");
		notebooks[0].noteBookInfo();
		
		notebooks[1].setYear(2010);
		notebooks[1].setColor("blue");
		notebooks[1].noteBookInfo();
		
		notebooks[2].setYear(2020);
		notebooks[2].setColor("white");
		notebooks[2].noteBookInfo();
		
		for(int i = 0 ; i < notebooks.length ;i++) {
			notebooks[i].noteBookInfo();
		}
		//개선된 for 문
		for(NoteBook no : notebooks) {
			no.noteBookInfo();
		}
		
		
		
		
		//2. int[] arr = new int[]{1 , 2, 3}
		NoteBook[] notebooks2 = 
				   new NoteBook[] {new NoteBook(), new NoteBook() , new NoteBook() };
		
		//3. 사용빈도 ( int[] arr = {1,2,3} )
		NoteBook[] notebooks3 = {new NoteBook(), new NoteBook() , new NoteBook()};
		
	}

}
