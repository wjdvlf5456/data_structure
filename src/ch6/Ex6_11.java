package ch6;

public class Ex6_11 {

	public static void main(String[] args) {
		DblLinkedList L = new DblLinkedList();
		DblNode pre = null;

		L.insertNode(L, pre, "월");
		pre = L.getHead();
		// [월]
		L.insertNode(L, pre, "금");
		// [월, 금]
		L.insertNode(L, pre, "목");
		pre = pre.rlink;				
		// [월, 금, 목]
		pre = pre.rlink;				
		// [월, 목, 금]

		L.insertNode(L, pre, "토");
		// 현재:토
		// [월, 목, 금, 토]
		
		DblNode temp = L.getHead();	// 월

		System.out.printf("Double Linked List L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			pre = temp;
			temp = temp.rlink;
			if (temp != null)
				System.out.print(", ");
		}
		System.out.println(")");
		System.out.println("");

		temp = pre;
		
		
		System.out.printf("Double Linked List Reverse L = (");
		while (temp != null) {
			System.out.printf(temp.getData());

			pre = temp;
			temp = temp.llink;
			if (temp != null)
				System.out.print(", ");
		}
		System.out.println(")");
		System.out.println("");

		// "월" 뒤에 "화", "수" 를 차례로 삽입하기, 즉, L={월,화,수,목,금,토}
		// 이 리스트 L을 순방향으로 출력하기
		//
		
		pre = L.getHead();
		L.insertNode(L, pre, "화");
		pre = pre.rlink;
		L.insertNode(L, pre, "수");
		
		
		temp = L.getHead();	// 월

		System.out.printf("Double Linked List L2 = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			pre = temp;
			temp = temp.rlink;
			if (temp != null)
				System.out.print(", ");
		}
		System.out.println(")");
		System.out.println("");

		
		
		// 이 리스트에서 "목", "토"를 차례로 삭제하기, 즉, L={월,화,수,금}
		// 이 리스트 L을 역방향으로 출력하기
		//
		pre = L.getHead();
		pre = pre.rlink;
		pre = pre.rlink;
		pre = pre.rlink;
		L.deleteNode(L, pre);
		pre = pre.rlink;
		pre = pre.rlink;
		L.deleteNode(L, pre);
		pre = pre.llink;
		
		
		temp = pre;	// 월
		
		System.out.printf("Double Linked List Reverse L2 = (");
		while (temp != null) {
			System.out.printf(temp.getData());

			pre = temp;
			temp = temp.llink;
			if (temp != null)
				System.out.print(", ");
		}
		System.out.println(")");
		System.out.println("");
		
		
	}
}

//===========================================================================================================================================
//===========================================================================================================================================
//===========================================================================================================================================

class DblLinkedList {
	private DblNode head;

	public DblLinkedList() {
		this.head = null;
	}

	public DblNode getHead() {
		return this.head;
	}

	public void insertNode(DblLinkedList L, DblNode pre, String data) {

		DblNode newNode = new DblNode(data);
		if (L.head == null) {
			L.head = newNode;

			newNode.llink = null;
			newNode.rlink = null;

		} else {
			newNode.rlink = pre.rlink;
			pre.rlink = newNode;
			newNode.llink = pre;
			if (newNode.rlink != null) {
				DblNode post = newNode.rlink;
				post.llink = newNode;
			}
		}
	}

	public void deleteNode(DblLinkedList L, DblNode old) {
		//
		// 알고리즘 6-12를 참고하여 프로그램을 완성하기
		if(L.head != null && old !=null) {
			if(old.llink != null && old != null) {
				if(old.llink != null)old.llink.rlink = old.rlink;
				else L.head = old.rlink;
				if(old.rlink != null)old.rlink.llink =old.llink;
				
			}
			
		}
		
	}

	@Override
	public String toString() {
		return "DblLinkedList [head=" + head.toString() + "]";
	}

}

//===========================================================================================================================================
//===========================================================================================================================================
//===========================================================================================================================================

class DblNode {

	DblNode llink;
	private String data;
	DblNode rlink;

	public DblNode() {
		this.llink = null;
		this.data = null;
		this.rlink = null;
	}

	public DblNode(String data) {
		this.llink = null;
		this.data = data;
		this.rlink = null;

	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String toString() {

		if (rlink == null) {
			return "DblNode [llink=" + llink.getData() + ", data=" + data + "]";

		} else if (llink == null) {
			return "DblNode [data=" + data + ", rlink=" + rlink.getData() + "]";

		} else {
			return "DblNode [llink=" + llink.getData() + ", data=" + data + ", rlink=" + rlink.getData() + "]";

		}

	}

}
