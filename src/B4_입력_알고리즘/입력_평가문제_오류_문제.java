package B4_입력_알고리즘;

import java.util.Scanner;

public class 입력_평가문제_오류_문제 {
	public static void main(String[] args) {
		
		/*
		 * [문제]
		 * 숫자 3개를 입력받는다.
		 * 그 숫자 중에 한개의 숫자라도 홀수가 있으면 오류입니다.
		 * 아래숫자들은 오류가 있나요?
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1을 입력하세요 : ");
		int n1 = scan.nextInt();
		System.out.print("숫자2를 입력하세요 : ");
		int n2 = scan.nextInt();
		System.out.print("숫자3을 입력하세요 : ");
		int n3 = scan.nextInt();
		
		System.out.println((n1%2 == 0) && (n2%2 ==0) && (n3%2 == 0));
		
	}

}
