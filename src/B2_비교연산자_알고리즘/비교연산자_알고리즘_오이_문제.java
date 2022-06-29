package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_오이_문제 {
	public static void main(String[] args) {
		
		/*
		 * [문제]
		 * 돈 20000원에서 오이(1200원) 을 9개 사고,
		 * 남은 거스름돈이 10000원 이하입니까?
		 */
		
		int money = 20000;
		int 오이 = 1200;
		System.out.println(money - (오이*9) <= 10000);
		System.out.println(money - (오이*9));
	}

}
