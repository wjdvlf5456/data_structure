package week3;

import java.util.ArrayList;
import java.util.List;

public class Ex5_3a {
	public static void main(String[] args) {

		List<Integer> aList = new ArrayList<Integer>();

		aList.add(3);
		aList.add(6);
		aList.add(12);
		aList.add(15);
		aList.add(18);
		aList.add(21);
		aList.add(24);
		System.out.println(aList.toString());		// 배열 값들 출력
		
		System.out.println("추가되는 숫자: 9");
		int nNum = 9;
		aList.add(nNum);
		System.out.println(aList.toString());	 // 9가 추가된 이후 배열값 출력

		aList.remove(Integer.valueOf(12));		 // 12 의 값을 가진 인자 전부 제거
		System.out.println("12 제거");
		System.out.println(aList.toString());	 // 12가 제거된 배열값 출력

	}
}
