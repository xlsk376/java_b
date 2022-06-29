package B4_입력_알고리즘;

import java.util.Scanner;

public class 입력_알고리즘_홀수_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 숫자 1개를 입력받는다. 그 숫자가 홀수인가요?
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n1 = scan.nextInt();
		
		int n2 = n1%2;
		
		System.out.println(n2 == 0);
		System.out.println();
		System.out.println(n2);
		
		scan.close();

	}

}
