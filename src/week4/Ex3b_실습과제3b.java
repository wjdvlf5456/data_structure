package week4;

public class Ex3b_실습과제3b {
	public static void main(String[] args) {
		List la = new List();
		System.out.print("List la = ");
		la.printList();

		la.insertItemToList(0, 3);
		la.insertItemToList(0, 6);
		la.insertItemToList(0, 12);
		la.insertItemToList(0, 15);
		System.out.print("List la에 15,12,6,3 추가 = ");
		la.printList();

		la.insertItemToList(2, 30);
		System.out.print("List la 2의 위치에 30 추가 =  ");
		la.printList();
		la.insertItemToList(1, 40);
		System.out.print("List la 1의 위치에 40 추가 =  ");
		la.printList();

		la.deleteItemFromList(4);
		System.out.print("List la 4의 위치의 값 삭제 = ");
		la.printList();
		la.deleteItemFromList(2);
		System.out.print("List la 2의 위치의 값 삭제 = ");
		la.printList();

		List lb = new List(5, new int[] { 2, 7, 4, 9, 12 });
		System.out.print("List lb = ");
		lb.printList();

		lb.insertItemToList(5, 18);
		System.out.print("List lb의 5의 위치에 18추가= ");
		lb.printList();
		lb.insertItemToList(2, 32);
		System.out.print("List lb의 2의 위치에 32추가= ");
		lb.printList();

		lb.deleteItemFromList(0);
		System.out.print("List lb의 0의 위치의 값 삭제 = ");
		lb.printList();
	}
}
