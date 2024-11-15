package com.decisionLoop;

import java.util.Scanner;

public class pensionContriCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner sc = new Scanner(System.in);
			double salary = 0, eec = 0, erc = 0;
			int age;
			System.out.println("Enter the monthly salary (or -1 to end) ");
			salary = sc.nextInt();
			while (salary != -1) {

				System.out.println("Enter age : ");
				age = sc.nextInt();
				if (age <= 55) {
					eec = salary * 0.2;
					erc = salary * 0.17;
				}
				if (age > 55 && age <= 60) {
					eec = salary * 0.13;
					erc = salary * 0.13;
				}
				if (age > 60 && age <= 65) {
					eec = salary * 0.075;
					erc = salary * 0.09;
				}
				if (age > 65) {
					eec = salary * 0.05;
					erc = salary * 0.75;
				}
				System.out.printf("The employee's contribution is: %.2f\n", eec);
				System.out.printf("The employer's contribution is: %.2f\n", erc);
				System.out.printf("The total contribution is: %.2f\n", (eec + erc));
				System.out.println("Enter the monthly salary (or -1 to end) ");
				salary = sc.nextInt();
			}
		}

		System.out.println("Good Byee!!!");
	}

}
