package B4_�Է�_�˰���;

import java.util.Scanner;

public class �Է�_�˰���_�α���_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * ö���� �α����� �Ϸ��� �Ѵ�.
		 * ���̵�� ��й�ȣ�� �Է¹޴´�.
		 * ���̵�� ��й�ȣ �����ϳ��� Ʋ���� �α����� �����մϴ�.
		 * ö���� �α����� �����ұ��?
		 * joinId �� joinPw�� ö���� �̹̰����� ���̵�� ��й�ȣ�Դϴ�.
		 */
		
		int joinId = 1234;
		int joinPw = 4321;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̵� �Է��ϼ��� : ");
		int id = scan.nextInt();
		
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		int pw = scan.nextInt();
		
		System.out.println(joinId == id && joinPw == pw);
		
		
		scan.close();
	}

}
