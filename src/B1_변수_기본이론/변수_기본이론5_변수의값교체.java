package B1_변수_기본이론;

public class 변수_기본이론5_변수의값교체 {

	public static void main(String[] args) {
		
		// a와 b 값 교체하기
		
		int a = 5;
		int b = 7;
		a = b;
		b = a;
		
		//두 값이 서로 같아진다.
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------------------------");
		//교환은 아래와 같이 해야함
		// x와 y의 값 교체하기
		int x = 10;
		int y = 20;
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
