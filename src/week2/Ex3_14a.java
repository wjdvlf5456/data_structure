package week2;

import java.util.Arrays;

public class Ex3_14a {
	
	public static void main(String[] args) {
		
		int[] arr = {56,34,23,12,12,45,34,23,67,56,45,34,24,87,45,34,32,99,65,99};
//		
//		for (int i = 0; i < 20; i++) {
//			arr[i] = (int) ((Math.random()*100)+1);
//			System.out.println(arr[i]);
//		}
//		
		int sum = 0;	// 합
		double avg = 0;	// 평균
		int min = 0;	// 최소값
		int max = 0;	// 최대값
		
		// 합 구하기
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		// 평균 구하기
		avg = (double)sum/arr.length;
		
		// 배열 내 정수들 오름차순으로 정렬
		Arrays.sort(arr);
		
		// 최소값 구하기
		min = arr[0];
		// 최대값 구하기
		max = arr[arr.length-1];
		
		// 결과값 출력
		System.out.println("합 = " + sum);
		System.out.println("평균 = " + avg);
		System.out.println("최소값 = " + min);
		System.out.println("최대값 = " + max);
	}

}
