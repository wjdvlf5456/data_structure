package ch_05;

public class Ex5_5 {

	public static void main(String[] args) {
		SparseMatrix a = new SparseMatrix(new int[][] { 
			{ 8, 7, 10},
			{ 0, 2, 2 }, 
			{ 0, 6, 12}, 
			{ 1, 4, 7 },
			{ 2, 0, 23}, 
			{ 3, 3, 31}, 
			{ 4, 1, 14}, 
			{ 4, 5, 25}, 
			{ 5, 6, 6 }, 
			{ 6, 0, 52}, 
			{ 7, 4, 11}});

		System.out.println("a matrix:");
		a.printMatrix();

		SparseMatrix b = new SparseMatrix();
		b.setMatrix(a.transposeSM());

		System.out.println("\nb matrix");
		b.printMatrix();
	}
}

class SparseMatrix {
	private int[][] matrix;

	public SparseMatrix() {
	}

	public SparseMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public void printMatrix() {
		for (int[] arr : matrix) {
			for (int i : arr)
				System.out.print(i + " ");
			System.out.println();
		}
	}

	public int[][] transposeSM() {
		int[][] b = new int[matrix.length][matrix[0].length];
		int m = matrix[0][0];
		int n = matrix[0][1];
		int v = matrix[0][2];

		//
		// 교재에 있는 내용을 채워서 프로그램을 완성하시오.
		//

		return b;
	}

	public int[][] getMatrix() {
		return this.matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
}
