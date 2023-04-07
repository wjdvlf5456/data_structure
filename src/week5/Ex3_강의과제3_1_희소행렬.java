package week5;

public class Ex3_강의과제3_1_희소행렬 {

	public static void main(String[] args) {

		int[][] sparseM = new int[14][3];

		sparseM[0][0] = 0;
		sparseM[0][1] = 0;
		sparseM[0][2] = 2;

		sparseM[1][0] = 0;
		sparseM[1][1] = 6;
		sparseM[1][2] = 3;

		sparseM[2][0] = 1;
		sparseM[2][1] = 4;
		sparseM[2][2] = 2;

		sparseM[3][0] = 1;
		sparseM[3][1] = 5;
		sparseM[3][2] = 5;

		sparseM[4][0] = 2;
		sparseM[4][1] = 0;
		sparseM[4][2] = 4;

		sparseM[5][0] = 2;
		sparseM[5][1] = 3;
		sparseM[5][2] = 2;

		sparseM[6][0] = 2;
		sparseM[6][1] = 5;
		sparseM[6][2] = 1;

		sparseM[7][0] = 2;
		sparseM[7][1] = 6;
		sparseM[7][2] = 1;

		sparseM[8][0] = 3;
		sparseM[8][1] = 0;
		sparseM[8][2] = 2;

		sparseM[9][0] = 3;
		sparseM[9][1] = 3;
		sparseM[9][2] = 3;

		sparseM[10][0] = 3;
		sparseM[10][1] = 4;
		sparseM[10][2] = 2;

		sparseM[11][0] = 4;
		sparseM[11][1] = 2;
		sparseM[11][2] = 3;

		sparseM[12][0] = 4;
		sparseM[12][1] = 3;
		sparseM[12][2] = 2;

		sparseM[13][0] = 4;
		sparseM[13][1] = 5;
		sparseM[13][2] = 2;

		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sparseM[i][j]);
				System.out.print(" ");

			}
			System.out.println("");
		}

	}

}
