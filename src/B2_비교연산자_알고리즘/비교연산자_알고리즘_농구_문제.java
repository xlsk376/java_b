package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_농구_문제 {

	public static void main(String[] args) {
		/*
		 * 문제)
		 * 철수는 농구공을 12번던져서 7번 성공했다.
		 * 영희는 농구공을 17번던져서 9번 성공했다.
		 * 영희의 성공확률이 철수의 성공확률보다 더 높나요?
		 */
		
		double 철수 = 7.0/12.0*100;
		double 영희 = 9.0/17.0*100.0;
		System.out.println(철수);
		System.out.println(영희);
		System.out.println(철수 < 영희);

	}

}
