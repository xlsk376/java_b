package B3_��������_�˰���;

public class ��������_������Ʈ_����_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 3������ ����� 60�� �̻��̸� �հ��Դϴ�.
		 * ��, ����� �հ�������, ��� �Ѱ����� 50�� �̸��̸� ���հ��Դϴ�.
		 * �Ʒ� ���������� �հ��ΰ���?
		 */
		
		int kor = 100;
		int eng = 87;
		int math = 49;
		int total = kor + eng + math;
		double ��� = total/3.0;
		
		System.out.println(��� >= 60 && kor < 50 && eng < 50 && math < 50);

	}

}
