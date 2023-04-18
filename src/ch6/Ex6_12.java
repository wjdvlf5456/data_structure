package ch6;

public class Ex6_12 {

	public static void main(String[] args) {
		PolyList A = new PolyList();
		A.appendTerm(4, 3);
		A.appendTerm(3, 2);
		A.appendTerm(5, 1);

		System.out.println("Polynomiarl A 출력하기");
		A.printPoly();

		PolyList B = new PolyList();
		B.appendTerm(3, 4);
		B.appendTerm(1, 3);
		B.appendTerm(2, 1);
		B.appendTerm(1, 0);

		System.out.println("Polynomiarl B 출력하기");
		B.printPoly();

		OperateLinkedPoly optPoly = new OperateLinkedPoly();
		PolyList C = optPoly.addPoly(A, B);

		System.out.println("Polynomiarl C 출력하기");
		C.printPoly();
	}
}

class OperateLinkedPoly {

	public PolyList addPoly(PolyList A, PolyList B) {
		PolyNode p = A.getHead();
		PolyNode q = B.getHead();
		PolyList C = new PolyList();

		while (p != null && q != null) {
			if (p.getExpo() == q.getExpo()) {
				float sum = p.getCoef() + q.getCoef();
				C.appendTerm(sum, p.getExpo());

				p = p.link;
				q = q.link;
			} else if (p.getExpo() > q.getExpo()) {
				C.appendTerm(p.getCoef(), p.getExpo());
				p = p.link;

			} else {
				C.appendTerm(q.getCoef(), q.getExpo());
				q = q.link;
			}
		}

		while (p != null) {
			C.appendTerm(p.getCoef(), p.getExpo());
			p = p.link;
		}
		while (q != null) {
			C.appendTerm(q.getCoef(), q.getExpo());
			q = q.link;

		}
		return C;
	}
}

class PolyList {
	private PolyNode head;
	private PolyNode last;

	public PolyList() {
		this.head = null;
		this.last = null;
	}

	public PolyNode getHead() {
		return this.head;
	}

	public void setHead(PolyNode head) {
		this.head = head;
	}

	public void appendTerm(float coef, int expo) {
		PolyNode newNode = new PolyNode();
		newNode.setCoef(coef);
		newNode.setExpo(expo);
		newNode.setLink(null);
		if (this.head == null) {
			this.head = newNode;
			this.last = newNode;

		} else {
			this.last.link = newNode;
			this.last = newNode;
		}
	}

	public void printPoly() {
		PolyNode temp = this.head;
		System.out.printf("PL = ");
		while (temp != null) {
			System.out.printf("%2.0fX^%d ", temp.getCoef(), temp.getExpo());
			temp = temp.getLink();
			if (temp != null)
				System.out.printf("+ ");
		}
		System.out.printf("\n\n");
	}
}

class PolyNode {
	private float coef;
	private int expo;
	PolyNode link;

	public PolyNode() {
		this.coef = 0;
		this.expo = 0;
		this.link = null;
	}

	public PolyNode(float coef, int expo) {
		this.coef = coef;
		this.expo = expo;
		this.link = null;
	}

	public float getCoef() {
		return this.coef;
	}

	public void setCoef(float coef) {
		this.coef = coef;
	}

	public int getExpo() {
		return this.expo;
	}

	public void setExpo(int expo) {
		this.expo = expo;
	}

	public PolyNode getLink() {
		return this.link;
	}

	public void setLink(PolyNode link) {
		this.link = link;
	}

}
