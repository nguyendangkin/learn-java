package HocJava;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("firstNumber is: ");
		int firstNumber = scanner.nextInt();
		System.out.println("lastNumber is: ");
		int lastNumber = scanner.nextInt();
		System.out.println("Min = " + Math.min(firstNumber, lastNumber));

		scanner.close();

	}
}
