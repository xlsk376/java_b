package B4_�Է�_�˰���;

import java.util.Scanner;

public class �Է�_�˰���_��_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * ���� 2���� �Է¹޴´�. �μ����� ���� ���Ͻÿ�.
		 */
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int ����1 = scan.nextInt();
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int ����2 = scan.nextInt();
		
		System.out.println("���� : " + (����1+����2));
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1 : ");		
		int n1 =scan.nextInt();
		
		System.out.print("����2 : ");
		int n2 = scan.nextInt();
		
		int sum = n1 + n2;
		System.out.println(sum);
		
		scan.close();

	}

}
