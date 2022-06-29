package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_삼각형_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 가로가 3이고 세로가 6인 삼각형 넓이가 홀수 인가요?
		 */
		
		int 가로 = 3;
		int 세로 = 6;
		int 삼각형 = 가로 * 세로 /2 ;
		
		System.out.println(삼각형%2 == 0); // 나누어떨어지지 않음. 홀수!
		

	}

}
