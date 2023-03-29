package week2;

import java.io.IOException;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		int[] nArr = { 3, 6, 12, 15, 18, 21, 24, 0 };

		nArr[nArr.length - 1] = 9;

		int twelve = Arrays.binarySearch(nArr, 12);

		for (int i = twelve; i < nArr.length - 1; i++) {
			nArr[i] = nArr[i + 1];
		}
		nArr[nArr.length - 1] = 0;

		System.out.println(Arrays.toString(nArr));

	}

}
