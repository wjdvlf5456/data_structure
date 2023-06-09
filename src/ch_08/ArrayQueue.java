package ch_08;

public class ArrayQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];

	public ArrayQueue(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}

	public boolean isEmpty() {
		if (front == rear) {
			return true;
		} else {
			return false;

		}

	}

	public boolean isFull() {
		if (rear == queueSize - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(char item) {
		if (isFull()) {
			System.out.println("Inserting fail! Array Queue is full !!");
		} else {
			rear += 1;
			itemArray[rear] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	public char deQueue() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty !!");
			return 0;
		} else {
			front += 1;
			return itemArray[front];
		}
	}

	public void delete() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty !!");
		} else {
			++front;
		}
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("Peeking fail! Array Queue is empty !!");
			return 0;
		} else
			return itemArray[front + 1];
	}

	public void printQueue() {
		if (isEmpty())
			System.out.println("Array Queue is empty !!");
		else {
			System.out.printf("Array Queue>> ");
//			교재를 참고하여 한줄 코드를 채워 프로그램을 완성하시오.
			for (int i = front + 1; i < rear; i++) {
				System.out.printf("%c ", itemArray[i]);
				System.out.println();
				System.out.println();

			}
		}
	}
}
