package HocJava;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		String name;
		int score;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên của bạn:");
		name = scanner.nextLine();
		System.out.println("Nhập điểm của bạn:");
		score = scanner.nextInt();

		System.out.println(name + " có điểm = " + score);

		scanner.close();

	}
}
