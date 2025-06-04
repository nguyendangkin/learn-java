package HocJava;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
//		String name;
//		int score;
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Nhập tên của bạn:");
//		name = scanner.nextLine();
//		System.out.println("Nhập điểm của bạn:");
//		score = scanner.nextInt();
//
//		System.out.println(name + " có điểm = " + score);
//
//		scanner.close();
		float height;
		float width;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều cao:");
		height = scanner.nextFloat();
		System.out.println("Nhập chiều rộng:");
		width = scanner.nextFloat();
		System.out.println("Chu vi hình chữ nhật là:");
		System.out.println((height + width) * 2);

		System.out.println("Diện tích hình chữ nhật là:");
		System.out.println(height * width);

		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là:");
		System.out.println(Math.min(width, height));

		scanner.close();

	}
}
