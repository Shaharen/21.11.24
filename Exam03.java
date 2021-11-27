import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 5개의 답을 입력 받고 입력 받은 값 출력
		// 그 후 채점과 점수 계산
		Scanner sc = new Scanner(System.in);

		int[] input = new int[5];
		int[] ans = { 1, 4, 3, 2, 1 };
		// 입력부
		System.out.println("== 채점하기 ==");
		System.out.println("답을 입력하세요");
		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + "번답 >> ");
			input[i] = sc.nextInt();
		}
		// 출력부
		System.out.print("입력한 답은 : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		// 정답일 경우 O 오답일 경우 X
		String[] OX = new String[5];
		System.out.println("정답확인");
		for (int i = 0; i < input.length; i++) {
			if (input[i] == ans[i]) {
				OX[i] = "O";
				// sum += 20;
			} else {
				OX[i] = "X";
			}
			System.out.print(OX[i] + " ");
		}
		// O 의 개수만큼 총점 계산
		int sum = 0;
		for (int i = 0; i < OX.length; i++) {
			if (OX[i] == "O") {
				sum = sum + 20;
			}
		}
		System.out.println("	총점 : " + sum);

	}

}
