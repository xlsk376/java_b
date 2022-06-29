package B3_논리연산자_알고리즘;

public class 논리연산자_알고리즘_과일무게_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 귤 6개의 무게는 840g, 사과 3개의 무게는 750g 입니다.
		 * 귤 5개의 무게가 4의 배수이고, 사과 4개의 무게가 5의 배수입니까?
		 */
		
		double 귤 = 840/6;
		double 사과 = 750/3;
		double 귤5 = 귤 * 5;
		double 사과4 = 사과 * 4;
		
		System.out.println(귤);
		System.out.println(귤5%4 == 0 && 사과4%5 == 0);

	}

}
