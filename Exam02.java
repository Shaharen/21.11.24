import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 배열의 인덱스의 수만큼 별을 출력하라
		// 길이는 5, 스캐너로 입력받아 출력
		Scanner sc = new Scanner(System.in);

		int[] starcount = new int[5];

		int i = 0;
		for (; i < starcount.length; i++) {
			System.out.print("입력 받은 수 >> ");
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
