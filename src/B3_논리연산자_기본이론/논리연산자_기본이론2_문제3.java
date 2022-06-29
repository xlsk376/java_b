package B3_논리연산자_기본이론;

public class 논리연산자_기본이론2_문제3 {

	public static void main(String[] args) {
		// 문제1) 아래 값이 전부 true 가 나오도록 수를 변경해보세요.
		int a = 3;
		int b = 2;
		int c = 10;
		int d = 4;

		System.out.println(a * d == c + b && a > b);
		
		// 문제2) 아래 값이 전부 true 가 나오도록 수를 변경해보세요.
		a = 4;
		b = 2;
		c = 6;
		d = 4;
		System.out.println(a / d + 3 == c - b && a > b);
		
		// 문제3) 아래 값이 전부 true 가 나오도록 수를 변경해보세요.
		a = 4;
		b = 2;
		c = 2;
		d = 4;
		System.out.println(a % d == c % b && a > b);
		
		// 문제4) 아래 값이 전부 true 가 나오도록 수를 변경해보세요.
		a = 5;
		b = 2;
		c = 3;
		d = 4;
		System.out.println((a - d) * 3 == c / 3 + b && a > b);

	}

}
