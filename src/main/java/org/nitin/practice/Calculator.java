package org.nitin.practice;

import java.util.Scanner;

public class Calculator {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("1---------- Addition");
				System.out.println("2---------- Subtraction");
				System.out.println("3---------- Division");
				System.out.println("4---------- Multiplication");
				System.out.println("0---------- Exit");

				System.out.println("Please Enter Your Choice :");
				int ch = sc.nextInt();

				int num1 = 0, num2 = 0;
				if (ch != 0) {
					System.out.println("Please enter Number 1 ");
					num1 = sc.nextInt();
					System.out.println("Please enter Number 2 ");
					num2 = sc.nextInt();
				}
				switch (ch) {

				case 1:
					System.out.println("Addition :" + add(num1, num2));
					break;
 
				case 2:
					System.out.println("Subtraction :" + sub(num1, num2));
					break;
				case 3:
					System.out.println("Division :" + div(num1, num2));
					break;
				case 4:
					System.out.println("Multiplication :" + mul(num1, num2));
					break;
				case 0:
					System.out.println("Thank you for using Calculator");
					System.exit(0);
				}

			}

		} finally {

		}
	}

}
