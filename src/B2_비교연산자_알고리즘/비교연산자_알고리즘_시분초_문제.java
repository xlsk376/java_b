package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_시분초_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 321321초를 "시간" , "분" , "초" 로 표현했을때,
		 * "분" 이 홀수인가요?
		 */
		
		int 주어진초 = 321321;
		double 시간 = 주어진초/3600;
		double 분 = 주어진초%3600/60;
		double 초 = 주어진초%3600%60;
		
		System.out.println(시간);
		System.out.println(분);
		System.out.println(초);
		System.out.println(분%2 == 0);

	}

}
