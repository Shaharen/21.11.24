import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// �迭�� �ε����� ����ŭ ���� ����϶�
		// ���̴� 5, ��ĳ�ʷ� �Է¹޾� ���
		Scanner sc = new Scanner(System.in);

		int[] starcount = new int[5];

		int i = 0;
		for (; i < starcount.length; i++) {
			System.out.print("�Է� ���� �� >> ");
			starcount[i] = sc.nextInt();
		}
		
		for (i = 0; i < starcount.length; i++) {
			System.out.print(starcount[i] + " : ");
			for (int j = 1; j <= starcount[i]; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		sc.close();
		

	}

}
