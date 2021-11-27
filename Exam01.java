import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 1차원 정수형이고 길이가 6인 배열선언 후 임의값으로 초기화 - random
		// 배열값 중 짝수인값만 출력
		Random random = new Random();

		int[] array = new int[6];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1;
		}
		System.out.print("array에 들어있는 짝수는 ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("입니다.");

		// 초기화 - Scanner
		Scanner sc = new Scanner(System.in);
		
		// 배열 6칸을 만들어서
		int[] array2 = new int[6];

		// 임의의 값으로 초기화 (Scanner)
		for (int i = 0; i < array2.length; i++) {
			System.out.print(i + "번자리 정수입력 >> ");
			array2[i] = sc.nextInt();
		}
		// array 안에 있는 수 중 짝수만 출력
		System.out.print("array에 들어있는 짝수는 ");
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0) {
				System.out.print(array2[i] + " ");
			}
		}
		System.out.println("입니다.");

		sc.close();

	}

}
