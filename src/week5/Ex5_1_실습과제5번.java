package week5;

public class Ex5_1_실습과제5번 {

	public static void main(String[] args) {

		
		// 행렬 배열로 저장
		int[][] m = new int[4][5];

		m[0][0] = 0; m[0][1] = 0; m[0][2] = 1; m[0][3] = 0; m[0][4] = 0;

		m[0][0] = 0; m[1][1] = 3; m[1][2] = 0; m[1][3] = 2; m[1][4] = 0;

		m[0][0] = 0; m[2][1] = 0; m[2][2] = 5; m[2][3] = 0; m[2][4] = 4;

		m[0][0] = 0; m[3][1] = 8; m[3][2] = 6; m[3][3] = 0; m[3][4] = 0;

		int[][] sparseM = new int[7][3];

		// 희소행렬 순서 count 라는 변수명으로 저장
		int count = 0;

		// 희소행렬로 변환
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (m[i][j] != 0) {
					sparseM[count][0] = i;
					sparseM[count][1] = j;
					sparseM[count][2] = m[i][j];
					count++;
				}

			}
		}
		
		// 희소행렬로 변환된 배열 출력 
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sparseM[i][j] + " ");
			}
			System.out.println("");

		}

	}

}
