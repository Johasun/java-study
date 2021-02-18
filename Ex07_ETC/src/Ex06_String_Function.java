
public class Ex06_String_Function {
	public static void main(String[] args) {
		// 일상적으로 다루는 데이터 : 문자열, 숫자, 날짜 >> 함수 ( 시스템 함수 != 사용자함수 )
		String str = "hello";
		String concatstr = str.concat("world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("ello");
		System.out.println(bo);
		
		bo = str.contains("elo");
		System.out.println(bo);
		
		String str2 = "a b c d";
		System.out.println(str2.length());
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("j"));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("개폭망")); //☆★ 배열에서 값이 없다 return -1
		// 신문사설 ... 단어 ,,, 문자 포함 ,,,
		// "폭망".... 있을까 .... 0 보다 큰 값이 나오면 최소 1개 사설
		// - 1이 return -> 폭망이 없구나 .... 값이 있는지 없는지 확인할때
		if(filename.indexOf("wo") != -1) {
			System.out.println("woo 하나라도 가지고 있구나");
		}
		
		System.out.println("lastIndexOf: "+filename.lastIndexOf("a"));
		
		//length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0)); //superman
		System.out.println(result.substring(2)); //perman
		System.out.println(result.substring(1, 2)); //u >> endindex -1 >> 자기자신
		System.out.println(result.substring(0, 0)); //(0, -1) 안나와요
		System.out.println(result.substring(0, 1)); // s
		System.out.println(result.substring(2, 3)); // p
		
		//Quiz
		String filename2 = "h.jpeg"; // 또는 파일명이 hong.png 또는 파일명이 h.tmp
		//여기서 파일명과 확장자를 분리해서 화면에 출력하세요
		//1. 파일명 h
		//2. 확장자 jpeg
		int Index = filename2.indexOf(".");
		int length = filename2.length();
		
		System.out.println("파일명 "+filename2.substring(0, Index));
		System.out.println("확장자 "+filename2.substring(Index+1, length));
		
		
		int position = filename2.indexOf(".");
		String file = filename2.substring(0, position);
		
		String extention2 = filename2.substring(position+1, filename2.length());
		String extention = filename2.substring(++position);
		
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);
		
		//replace ( 치환함수 )
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDD", "오늘은 월요일");
		System.out.println(result3);
		
		result3 = str3.replace("A", "a");
		System.out.println(result3);
		
		//ETC
		System.out.println("charAt: "+str3.charAt(0));
		System.out.println(str3.charAt(3));
		
		System.out.println(str3.endsWith("DDDA")); // TRUE
		System.out.println(str3.endsWith("BDDDA")); // false
		
		System.out.println(str3.equalsIgnoreCase("abcDADDDDDA")); // 대소문자 구별 없이
		
		//Today Point (Split)
		String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		String[] namearray = str4.split(",");
		for(String s : namearray) {
			System.out.println(s);
		}
		
		//Tip) 
		
		// .	>> 정규표현식 문법 ... >> 문자 그대로 \ >> 	.을 표현하는 정규표현식 >> \. 	>>\\.
		//정규표현식 .... 할거예요 ^^
		//정규표현식 문법 ...
		//주민번호 숫자 6자리 - 숫자 7자리 : {\d6}-{\d7}
		//123-1234567 >> false
		//핸드폰, 차량번호, 우편번호, 한글처리, 도메인주소, 이메일 주소
		//정규표현식은 이미 다 있어요 (정규표현식 read 가능)
		//카페 과제가 올라가요 ^^
		
		
		//
		
		//넌센스
		String str6 = "홍       길            동";
		//"홍길동"
		String result4 = str6.replace(" ", "");
		System.out.println(result4); //홍길동
		
		String str7 = "         홍길동         ";
		System.out.println(">"+str7+"<");
		System.out.println(">"+str7.trim()+"<");
		
		String str8 = "         홍     길      동       ";
		String result5 = str8.trim();
		String result6 = result5.replace(" ", "");
		System.out.println(result6);
		
		// 자바에서 여러개의 함수를 적용 (method chain 기법)
		System.out.println(str8.trim().replace(" ", "").substring(2));
		
		
		//Quiz-1
		int sum = 0;
		String[] numarr = {"1", "2", "3", "4", "5"};
		//문제 : 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
		
		for(int i = 0; i<numarr.length; i++) {
			sum+= Integer.parseInt(numarr[i]); // 문자열 값을 정수로
			// Double.parseDouble(result6) 문자열 값을 실수로
		}
		System.out.println(sum);
		
		
		//Quiz-2
		String jumin="123456-1234567";
		// 위 주민번호의 합을 구하세요
		
		String[] numarr2 = jumin.replace("-", "").split("");
		int sum3=0;
		for(String i : numarr2) {
			sum3+=Integer.parseInt(i);
		}
		System.out.println(sum3);
		
		
	}

}
