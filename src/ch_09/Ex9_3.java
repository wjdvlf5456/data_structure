package ch_09;

public class Ex9_3 {

	public static void main(String[] args) {
		int n, item;
		Heap h = new Heap();
		
		h.insertHeap(20);
		h.insertHeap(35);
		h.insertHeap(10);
		h.insertHeap(25);
		h.insertHeap(15);
		h.insertHeap(30);
		h.insertHeap(12);
		h.insertHeap(32);
		
		h.printHeap();
		
		//n = h.getHeapSize();
		n = 4;
		
		for(int i=1; i<=n; i++) {
			item = h.deleteHeap();
			System.out.printf("\n deleted Item : [%d]", item, args);
		}
		
		h.insertHeap(50);
		h.insertHeap(40);
		h.insertHeap(45);
		h.insertHeap(55);
		h.insertHeap(38);
		
		h.printHeap();
		
		
		
		n = h.getHeapSize();
		
		for(int i=1; i<=n; i++) {
			item = h.deleteHeap();
			System.out.printf("\n deleted Item : [%d]", item, args);
		}
		
		
		
	}
}
