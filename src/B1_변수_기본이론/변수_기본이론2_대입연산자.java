package B1_변수_기본이론;
/*
 * [대입 연산자] 
 * 변수는 오직 대입 연산자를 통해서만 값의 변경이 가능하다.
 */
public class 변수_기본이론2_대입연산자 {
	public static void main(String[] args) {
		
		int num = 8;
		
		System.out.println(num + 1);
		System.out.println(num);
		
		int temp = num;
		num = (temp + 1);
		
		System.out.println(num);
		
		int b = 10;
		b = b + 1;
		System.out.println(b);
	}
}
