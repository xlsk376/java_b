package B4_�Է�_�⺻�̷�;

import java.util.Scanner;

//import java.util.Scanner;

/*
 * # �Է¹ޱ�
 * 1. import java.util.Scanner; // main ���� �׸��� package �Ʒ� �����ش�.(�ʼ�)
 * 
 * 2. Scanner scan = new Scanner(System.in); // main�ȿ� ������Ѵ�.(�ʼ�)
 * 
 * 3. �ȳ��� �ۼ�
 *    System.out.print("���̸� �Է��ϼ��� : "); // ln�� ���̸� �Է½� �ٹٲ��̵ȴ�.
 *    
 * 4. �Է¹ޱ�
 *    int age = scan.nextInt(); // �ܼ�â�� ���ڸ� ������ ���͸� ���������� ����Ѵ�.
 *    
 * 5. ������
 *    System.out.println("����� ���̴� " + age + "�� �̱���!");
 *    
 * 6. �ݱ�
 *    scan.close(); // Scanner �������� �ݾ�����Ѵ�. (������ ���Ŀ� ���´�.)
 *                  // scan.close(); �� �����Ѱ�� �������� ���. �Ű澲���������� �����ص� �ȴ�.
 *                  // main�� ���������ο� ���ָ� �ȴ�.
 */

public class �Է�_�⺻�̷�1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� " + num + "�Դϴ�.");
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "�� �̱���!");
		
		scan.close();
		
		
		

	}

}
