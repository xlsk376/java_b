package B4_�Է�_�˰���;

import java.util.Scanner;

public class �Է�_�򰡹���_����_���� {
	public static void main(String[] args) {
		
		/*
		 * [����]
		 * ���� 3���� �Է¹޴´�.
		 * �� ���� �߿� �Ѱ��� ���ڶ� Ȧ���� ������ �����Դϴ�.
		 * �Ʒ����ڵ��� ������ �ֳ���?
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1�� �Է��ϼ��� : ");
		int n1 = scan.nextInt();
		System.out.print("����2�� �Է��ϼ��� : ");
		int n2 = scan.nextInt();
		System.out.print("����3�� �Է��ϼ��� : ");
		int n3 = scan.nextInt();
		
		System.out.println((n1%2 == 0) && (n2%2 ==0) && (n3%2 == 0));
		
	}

}
