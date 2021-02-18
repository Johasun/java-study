package kr.or.bit;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		Random r = new Random();
		  for (int i = 0; i < numbers.length; i++) {
              int randomNumber = r.nextInt(45) + 1;
              // randomNumber가 중복인지 확인하여
              // 중복이면 다시 만들고 다시 검사하는 j for 문
              if(randomNumber)
              for (int j = 0; j < numbers.length; j++) {
                  if (randomNumber == numbers[j]) {
                      randomNumber = r.nextInt(45) + 1;
                      j = -1;
                  }
              }

	}
		  for(int result : numbers) {
		  System.out.println(numbers[result]);
		  }
	}
}
