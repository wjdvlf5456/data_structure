package ch_08;

public class ArrayCQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];

	public ArrayCQueue(int queueSize) {
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
		front = 0;
		rear = 0;
	}

	public boolean isEmpty() {
		if (front == rear) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isFull() {
		if (((rear + 1) % this.queueSize) == front) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(char item) {
		if (isFull()) {
			System.out.println("Inserting fail! Array Circular Queue is full !!");
		} else {
			rear = (rear+1)%this.queueSize;
			itemArray[rear] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	public char deQueue() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Circular Queue is empty !!");
			return 0;
		} else {
			front = front+1 % this.queueSize;
			return itemArray[front];
		}
	}

	public void delete() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Circular Queue is empty !!");
		} else {
			front = (front + 1) % this.queueSize;
		}
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("Peeking fail! Array Circular Queue is empty !!");
			return 0;
		} else
			return itemArray[(front + 1) % this.queueSize];
	}

	public void printQueue() {
		if (isEmpty())
			System.out.println("Array Circular Queue is empty !!");
		else {
			System.out.printf("Array Circular Queue>> ");
			for (int i = (front + 1) % this.queueSize; i != (rear + 1) % this.queueSize; i = ++i % this.queueSize)
				System.out.printf("%c ", itemArray[i]);
			System.out.println();
			System.out.println();
		}
	}
}
