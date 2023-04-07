package week5;

public class Ex6_0 {

	public static void main(String[] args) {
		// 방법1 - 노드를 먼저 생성 후 연결 리스트를 구성함
		ListNode n1 = new ListNode();
		ListNode n2 = new ListNode();
		ListNode n3 = new ListNode();
		
		n1.setData("희진");
		n1.setLink(n2);
		n2.setData("삼식");
		n2.setLink(n3);
		n3.setData("삼순");
		n3.setLink(null);

		ListNode temp = n1;
		System.out.printf("First L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
		System.out.println("");

		// 방법2 - 연결 리스트에 연결하면서 노드를 생성함
		ListNode node3 = new ListNode("삼순");
		ListNode node2 = new ListNode("삼식", node3);
		ListNode node1 = new ListNode("희진", node2);
		
		
//		ListNode temp = node1;
		temp = node1;
		System.out.printf("Second L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
		System.out.println("");

		// 방법3 - 연결리스트 헤더 주소만 유지함
		ListNode list = new ListNode("삼순");
		list = new ListNode("삼식", node3);
		list = new ListNode("희진", node2);

//		ListNode temp = list;
		temp = list;
		System.out.printf("Third L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
		System.out.println("");
		
//
//   L = (빨강, 주황, 노랑, 초록, 파랑, 남색, 보라)를 연결리스트로 만들고 출력하기
		
		ListNode rainbow = new ListNode();
		
		ListNode r1 = new ListNode();
		ListNode r2 = new ListNode();
		ListNode r3 = new ListNode();
		ListNode r4 = new ListNode();
		ListNode r5 = new ListNode();
		ListNode r6 = new ListNode();
		ListNode r7 = new ListNode();
		
		r1.setData("빨강");
		r1.setLink(r2);
		
		r2.setData("주황");
		r2.setLink(r3);
		
		r3.setData("노랑");
		r3.setLink(r4);
		
		r4.setData("초록");
		r4.setLink(r5);
		
		r5.setData("파랑");
		r5.setLink(r6);
		
		r6.setData("남색");
		r6.setLink(r7);
		
		r7.setData("보라");
		r7.setLink(null);
		
		temp = r1;
		System.out.printf("L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
		System.out.println("");
		
		
//

	}
}
