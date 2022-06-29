package B4_입력_알고리즘;

import java.util.Scanner;

public class 입력_알고리즘_합_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 숫자 2개를 입력받는다. 두숫자의 합을 구하시오.
		 */
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int 숫자1 = scan.nextInt();
		
		System.out.print("숫자를 입력하세요 : ");
		int 숫자2 = scan.nextInt();
		
		System.out.println("합은 : " + (숫자1+숫자2));
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 : ");		
		int n1 =scan.nextInt();
		
		System.out.print("숫자2 : ");
		int n2 = scan.nextInt();
		
		int sum = n1 + n2;
		System.out.println(sum);
		
		scan.close();

	}

}
