package B3_��������_�⺻�̷�;

public class ��������_�⺻�̷�2_����3 {

	public static void main(String[] args) {
		// ����1) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
		int a = 3;
		int b = 2;
		int c = 10;
		int d = 4;

		System.out.println(a * d == c + b && a > b);
		
		// ����2) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
		a = 4;
		b = 2;
		c = 6;
		d = 4;
		System.out.println(a / d + 3 == c - b && a > b);
		
		// ����3) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
		a = 4;
		b = 2;
		c = 2;
		d = 4;
		System.out.println(a % d == c % b && a > b);
		
		// ����4) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
		a = 5;
		b = 2;
		c = 3;
		d = 4;
		System.out.println((a - d) * 3 == c / 3 + b && a > b);

	}

}
