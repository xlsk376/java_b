package B1_변수_기본이론;
/*
 * # 변수의 명명규칙
 * 1. 숫자로 시작할 수 없다.
 * 2. 특수문자는 _ , $ 만을 허용한다.
 * 3. 예약어(키워드)는 사용할 수 없다. ex) public, class, static, void ...
 * 4. 자바는 알파벳의 대소문자를 구분한다.
 * ----------------------------------------------
 * 1. 패키지명과 변수명은 소문자로 시작한다.
 * 2. 클래스명은 대문자로 시작한다.
 */
public class 변수_기본이론3_변수의명명규칙 {

	public static void main(String[] args) {
		
		int test = 1; // 변수는 대소문자를 구분한다. (서로 다른변수)
		int Test = 2;
		
		System.out.println(test);
		System.out.println(Test);
		
		int $money = 1000; // 특수문자 $ 사용가능
		int _money = 2000; // 특수문자 _ 사용가능
		System.out.println($money);
		System.out.println(_money);
		
		// 노란색경고는 사소한 경고 (신경쓰지 않아도 됨)
		// 노란색 경고줄이 생긴원인 => 변수만 만들고 사용하지 않아서 생기는것
		int math_score = 35; //두번째 단어를 _로 구분하는것 (스네이크표기법)
		int koreanScore = 87;//첫번째 단어는 소문자, 두번째 단어 첫글자를 대문자 (카멜표기법)
		
		// int 1num = 10; 변수이름은 숫자로 시작할 수 없다.
		// int #test = 10; 특수기호 대부분 사용불가
		// int void = 10; 예약어 사용불가

	}

}
