import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {
	public static void main(String[] args) {
		//지역번호, 출석부, 우편번호, 회원가입
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//회원가입은 처리 끝났어요 (회원정보)
		//로그인 
		//id(O) . pw(O) >> 회원님 방가
		//id(O) . pw(X) >> 비밀번호 재입력
		
		//id(X) . pw(O) >>
		//id(X) . pw(x) >> id가 틀리면 pw는 안봐도 된다
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id, pwd 입력해주세요");
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase(); //공백제거 소문자로만
			
			System.out.println("PWD");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)) {
				//id(X)
				System.out.println("id 맞지 않습니다 재입력");
			} else {
				//id(O)
				if(loginmap.get(id).equals(pwd)) {
					System.out.println("회원님 방가^^");
					break;
				}else {
					System.out.println("비번확인");
				}
			}
		}
	}
}
