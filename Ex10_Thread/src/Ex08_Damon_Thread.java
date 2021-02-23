/*
데몬 : 보조 thread

주 thread >> 주 thread >> 보조 thread

한글  >> 글쓰기 >> 3초 마다 저장 옵션
글쓰기 작업 종료 >> 3초 마다 저장(보조 옵션) 종료

*/
public class Ex08_Damon_Thread implements Runnable{
	static boolean autosave = false;
	public static void main(String[] args) {
		
		Thread demonthread = new Thread(new Ex08_Damon_Thread());
		
		//demonthread 보조 (Damon)
		//main 함수 스레드의 보조 ...
		//나는 당신과 생명을 같이 하겠습니다
		//나는 (demonthread) , 당신 (주스레드 : main 함수)
		demonthread.setDaemon(true); //메인 함수가 끝나면 같이 끝나
		demonthread.start();
	
		//주작업(한글 쓰기)
		for(int i = 0; i <= 30; i++) {
			try {
				Thread.sleep(1000); //1초
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Main 한글 쓰기 작업" + i);
			//자동저장시점 
			if(i==5) {
				System.out.println("i: "+ i);
				autosave=true;
			}
		}
	}
	
	public void autoSave() {
		System.out.println("한글 작업이 3초 간격으로 자동 저장");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {

			}
			if(autosave) { //static boolean autosave = false;
				//작업 (저장작업)
				autoSave(); //호출
			}
		}
	}

}
