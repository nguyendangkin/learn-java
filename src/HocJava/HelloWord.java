package HocJava;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		double canh;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh lap phuong:");
		canh = scanner.nextDouble();

		System.out.println("The tich la: " + Math.pow(3, canh));

		scanner.close();

	}
}
