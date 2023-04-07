package week5;

public class Ex3_1_강의과제2차원배열 {

	public static void main(String[] args) {

		int[][] sparseM = new int[4][2];

		sparseM[0][0] = 3;
		sparseM[0][1] = 10;

		sparseM[1][0] = 5;
		sparseM[1][1] = 3;

		sparseM[2][0] = 2;
		sparseM[2][1] = 2;

		sparseM[3][0] = 10;
		sparseM[3][1] = 0;

		for (int i = 0; i < 4; i++) {
			if (i == 3) {
				System.out.print(sparseM[i][0]);
				if (sparseM[i][1] != 0) {
					System.out.print("𝒙^" + sparseM[i][1]);
				}

			} else {
				System.out.print(sparseM[i][0] + "𝒙^" + sparseM[i][1] + " + ");

			}
		}

	}

}
