package week4;

public class Ex3b_실습과제3b2 {

	
	
	public static void main(String[] args) {
		List la = new List();
		int[] b = new int[] { 1, 2, 3, 4 };
		List lb = new List(4, b);
		List lc = new List(5, new int[] { 10, 20, 30, 40, 50 });
		System.out.print("List a = ");
		la.printList();
		System.out.print("List b = ");
		lb.printList();
		System.out.print("List c = ");
		lc.printList();

		lc.insertItemToList(2, 15);
		System.out.print("List c의 2에 15 추가 = ");
		lc.printList();
		lc.insertItemToList(4, 25);
		System.out.print("List c의 4에 25 추가 = ");
		lc.printList();

		int d = lc.deleteItemFromList(5);
		System.out.print("List c 의 5번째 값 삭제 = ");
		lc.printList();

		System.out.println("리스트에서 삭제된  : " + d);

	}

}
