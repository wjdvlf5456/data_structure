package week2;

public class Ex3_9 {

	public static void main(String[] args) {

		int average = 88;

		if (average >= 95) {
			System.out.println("평균 : " + average + "=> A+ 등급입니다.");
		} else if (average >= 90) {
			System.out.println("평균 : " + average + "=> A0 등급입니다.");
		} else if (average >= 85) {
			System.out.println("평균 : " + average + "=> B+ 등급입니다.");
		} else if (average >= 80) {
			System.out.println("평균 : " + average + "=> B0 등급입니다.");
		} else if (average >= 70) {
			System.out.println("평균 : " + average + "=> C+ 등급입니다.");
		} else if (average >= 65) {
			System.out.println("평균 : " + average + "=> D+ 등급입니다.");
		} else if (average >= 60) {
			System.out.println("평균 : " + average + "=> D0 등급입니다.");
		} else {
			System.out.println("평균 : " + average + "=> F 등급입니다.");

		}

	}

}
