package B4_�Է�_�˰���;

import java.util.Scanner;

public class �Է�_�˰���_Ȧ��_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * ���� 1���� �Է¹޴´�. �� ���ڰ� Ȧ���ΰ���?
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int n1 = scan.nextInt();
		
		int n2 = n1%2;
		
		System.out.println(n2 == 0);
		System.out.println();
		System.out.println(n2);
		
		scan.close();

	}

}
