package week5;

public class Ex3_1_강의과제 {

	public static void main(String[] args) {

		int[] m = new int[11];

		m[0] = 3;
		m[1] = 0;
		m[2] = 0;
		m[3] = 0;
		m[4] = 0;
		m[5] = 0;
		m[6] = 0;
		m[7] = 5;
		m[8] = 2;
		m[9] = 0;
		m[10] = 10;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != 0) {
				if (i == m.length - 1) {
					System.out.println(m[i]);
				} else {
					System.out.print(m[i] + "𝒙^" + (m.length - (i + 1)) + " + ");

				}

			}

		}

	}

}
