package B2_�񱳿�����_�˰���;

public class �񱳿�����_�˰���_�ú���_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 321321�ʸ� "�ð�" , "��" , "��" �� ǥ��������,
		 * "��" �� Ȧ���ΰ���?
		 */
		
		int �־����� = 321321;
		double �ð� = �־�����/3600;
		double �� = �־�����%3600/60;
		double �� = �־�����%3600%60;
		
		System.out.println(�ð�);
		System.out.println(��);
		System.out.println(��);
		System.out.println(��%2 == 0);

	}

}
