package B1_변수_기본이론;

public class 변수_기본이론6_변수의크기와종류 {

	public static void main(String[] args) {
		
		// 변수의 크기와 종류
		System.out.println("[정수]");
		// 1. 정수 : int , long
		
		// int 는 -21억에서 21억의 값만 저장 가능
		// 더 큰값을 저장하고 싶은 long 을 사용
		// int a = 3000000000;
		long b = 3000000000L; // long을 사용할때는 long의 약자인 L을 숫자 뒤에 붙임(int 와 구분)
		System.out.println(b);
		
		System.out.println("[실수]");
		// 2. 실수 : float, double
		// float => 작은 실수
		// double => 큰 실수
		
		//소수점은 최대한 정확히 표현하는게 좋기때문에 float 보단 double 을 사용
		float c = 1.1234567891234f; // float 도 double 과 구분위해 f를 뒤에 붙임
		double d = 1.1234567891234; // double도 한계가 있지만 float보단 큰수저장가능
		System.out.println(c);
		System.out.println(d);
		

	}

}
