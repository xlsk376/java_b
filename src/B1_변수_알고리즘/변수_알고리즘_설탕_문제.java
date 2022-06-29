package B1_변수_알고리즘;

public class 변수_알고리즘_설탕_문제 {
	
	public static void main(String[] args) {
		/*
		 [문제]
			 설탕 15kg 을 6명이서 똑같이 나누어 줄려고합니다.
			 한명씩 차례대로 설탕을 나눠갖는다고했을때
			 4번째 사람이 받아가면 남은 설탕량은 얼마인가?
			 
			 15/6 = 2.5kg -> 1명 = 2.5kg
			 4 *2.5 = 10kg 배분
			 15 - 10 = 5kg
		*/
		
		System.out.println(15/6.0);
		System.out.println(4*2.5);
		System.out.printf("%.3f", 5/15*100.0);
		
		double 설탕 = 15 * 1000;
		int 전체인원 = 6;
		double 한명 = 설탕/전체인원;
		double 두명 = 한명*2;
		System.out.println(두명);
		
	}
	
}