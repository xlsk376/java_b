package B3_��������_�⺻�̷�;
/*
 * 4. ��������
 * (1) ����
 *  1) &&(and) : ���� ��� ���̾��, ��
 *  2) ||(or) : ������ ��� �����̶� ���̸�, ��
 *  3) ! (not) : ���̸� �������� ��ȯ, �����̸� ������ ��ȯ
 *  
 * (2) ��Ȱ
 *  1) �� �����ڸ� ���� �������� �񱳿����ڸ� ������ �� �ִ�.
 *  2) �� �����ڸ� ���� ���� ������ �����ϴ�.
 *  
 */
public class ��������_�⺻�̷�1 {

	public static void main(String[] args) {
		
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println("--------------------");
		
		int a = 10;
		int b = 3;
		
		System.out.println(a == a || b == b);
		System.out.println(a != a || b == b);
		System.out.println(a == a || b != b);
		System.out.println(a != a || b != b);
        
		System.out.println("--------------------");
		
		System.out.println(!true);
		System.out.println(!false);
		

	}

}
