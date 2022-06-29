package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_과일무게_문제 {

	public static void main(String[] args) {
		/*
		[문제]
			귤 6개의 무게는 840g, 사과 3개의 무게는 750g 입니다.
	 		귤 4개의 무개가 사과 2개의 무게보다 큽니까??
	    */
		
		int 귤 = 840/6;
		int 사과 = 750/3;
		int 귤4 = 귤 *4;
		int 사과2 = 사과 * 2;
		System.out.println(귤4);
		System.out.println(사과2);
		System.out.println(귤4 > 사과2);

	}

}
