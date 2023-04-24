package week4;

public class ListExample {

	public static void main(String[] args) {
		List ls = new List(7, new int[] {3, 6, 12, 15, 18, 21, 24});
		ls.printList();
		
		ls.insertItemToList(2, 9);
		ls.printList();
		int v = ls.deleteItemFromList(3);
		ls.printList();

	}
}



class List {
	int len;
	int l[] = new int[100];


	List() {
		this.len = 0;
	}

	List(int n, int[] a) {
		this.len = n;
		for (int i = 0; i < n; i++) {
			this.l[i] = a[i];

		}

	}

	public int insertItemToList(int x, int v) {
		if (x > this.len)
			return 1;
		for (int i = (this.len - 1); i >= x; i--)
			this.l[i + 1] = this.l[i];
		this.l[x] = v;
		this.len++;
		return x;

	}

	public int deleteItemFromList(int x) {
		if (x >= this.len || x < 0)
			return -1;
		int v = this.l[x];
		for (int i = x; i < this.len - 1; i++)
			this.l[i] = this.l[i + 1];
		this.len--;
		return v;

	}

	public void printList() {
		System.out.printf("[");
		if (this.len > 0) {
			for (int i = 0; i < this.len - 1; i++) {
				System.out.printf("%d, ", this.l[i]);

			}
			System.out.printf("%d", l[this.len - 1]);
		}
		System.out.printf("]\n");
	}

}
