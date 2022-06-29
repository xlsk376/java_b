package B3_논리연산자_알고리즘;

public class 논리연산자_프로젝트_과일가격_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 사과1개와 바나나3개의 값은 5500원이고
		 * 사과1개와 바나나5개의 값은 8500원이다.
		 * 각각의 과일가격을 구하시오.
		 */
		
		int apple = 0;
		int banana = 0;
		
		System.out.println(apple + (banana*3) == 5500 && apple + (banana*5) == 8500);
		System.out.println();

	}

}
