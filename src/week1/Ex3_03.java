package week1;

import java.util.Scanner;

public class Ex3_03 {

	public static void main(String[] args) {

		int a, n = 0, sum = 0;
		float avg;
		Scanner input = new Scanner(System.in);

		while (true) {
			a = input.nextInt();
			if (a <= 0)
				break;
			sum = sum + a;
			n++;
		}

		System.out.printf("sum = %d, count = %d\n", sum, n);
		avg = (float) sum / (float) n;
		System.out.println("avg = " + avg);

		input.close();

	}

}
