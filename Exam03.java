import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 5���� ���� �Է� �ް� �Է� ���� �� ���
		// �� �� ä���� ���� ���
		Scanner sc = new Scanner(System.in);

		int[] input = new int[5];
		int[] ans = { 1, 4, 3, 2, 1 };
		// �Էº�
		System.out.println("== ä���ϱ� ==");
		System.out.println("���� �Է��ϼ���");
		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + "���� >> ");
			input[i] = sc.nextInt();
		}
		// ��º�
		System.out.print("�Է��� ���� : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		// ������ ��� O ������ ��� X
		String[] OX = new String[5];
		System.out.println("����Ȯ��");
		for (int i = 0; i < input.length; i++) {
			if (input[i] == ans[i]) {
				OX[i] = "O";
				// sum += 20;
			} else {
				OX[i] = "X";
			}
			System.out.print(OX[i] + " ");
		}
		// O �� ������ŭ ���� ���
		int sum = 0;
		for (int i = 0; i < OX.length; i++) {
			if (OX[i] == "O") {
				sum = sum + 20;
			}
		}
		System.out.println("	���� : " + sum);

	}

}
