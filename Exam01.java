import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 1���� �������̰� ���̰� 6�� �迭���� �� ���ǰ����� �ʱ�ȭ - random
		// �迭�� �� ¦���ΰ��� ���
		Random random = new Random();

		int[] array = new int[6];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1;
		}
		System.out.print("array�� ����ִ� ¦���� ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("�Դϴ�.");

		// �ʱ�ȭ - Scanner
		Scanner sc = new Scanner(System.in);
		
		// �迭 6ĭ�� ����
		int[] array2 = new int[6];

		// ������ ������ �ʱ�ȭ (Scanner)
		for (int i = 0; i < array2.length; i++) {
			System.out.print(i + "���ڸ� �����Է� >> ");
			array2[i] = sc.nextInt();
		}
		// array �ȿ� �ִ� �� �� ¦���� ���
		System.out.print("array�� ����ִ� ¦���� ");
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0) {
				System.out.print(array2[i] + " ");
			}
		}
		System.out.println("�Դϴ�.");

		sc.close();

	}

}
