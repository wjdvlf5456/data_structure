package ch_11_bubble;

public class Ex11_2 {
	public static void main(String args[]) {
		int a[] = { 20, 15, 30, 5, 25, 70, 40, 55, 10, 35};
		Sort S = new Sort();
		System.out.printf("\n정렬할 원소 : ");
		for (int i = 0; i < a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.bubbleSort(a);
	}

}
