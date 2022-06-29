package B4_입력_알고리즘;

import java.util.Scanner;

public class 입력_알고리즘_로그인_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 철수는 로그인을 하려고 한다.
		 * 아이디와 비밀번호를 입력받는다.
		 * 아이디와 비밀번호 둘중하나만 틀려도 로그인은 실패합니다.
		 * 철수는 로그인을 성공할까요?
		 * joinId 와 joinPw는 철수가 이미가입한 아이디와 비밀번호입니다.
		 */
		
		int joinId = 1234;
		int joinPw = 4321;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		int id = scan.nextInt();
		
		System.out.print("비밀번호를 입력하세요 : ");
		int pw = scan.nextInt();
		
		System.out.println(joinId == id && joinPw == pw);
		
		
		scan.close();
	}

}
