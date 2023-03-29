package ch3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] number = new int[3];

		char[] text = new char[3];
		text[0] = 'a';
		text[1] = 'b';
		text[2] = 'c';

		for (int i = 0; i < 3; i++) {
			System.out.print("Input " + text[i] + " : ");
			number[i] = sc.nextInt();
		}

		Arrays.sort(number);

		System.out.println("Largest Number = " + number[2]);

		sc.close();

	}

}
