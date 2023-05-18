package ch_08;

class QNode {
	char data;
	QNode link;
}

public class LinkedQueue implements Queue {

	QNode front;
	QNode rear;

	public LinkedQueue() {
		this.front = null;
		this.rear = null;

	}

	public boolean isEmpty() {
		return (front == null);
	}

	public void enQueue(char item) {
		QNode newNode = new QNode();
		newNode.data = item;
		newNode.link = null;
		if (isEmpty()) {
			rear = newNode;
			front = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;

		}
		System.out.println("Inserted Item : " + item);
	}

	public char deQueue() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
			return 0;
		} else {
			char item = front.data;
			front = front.link;
			if (front == null) {
				rear = null;
			}
			return item;
		}
	}

	public void delete() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
		} else {
			front = front.link;
			if (front == null)
				rear = null;
		}
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("Peeking fail! Linked Queue is empty!!");
			return 0;
		} else
			return front.data;
	}

	public void printQueue() {
		if (isEmpty())
			System.out.printf("Linked Queue is empty!!\n", null);
		else {
			QNode temp = front;
			System.out.printf("Linked Queue>> ", null);
			while (temp != null) {
				System.out.printf("%c ", temp.data, null);
				temp = temp.link;
			}
			System.out.println();
			System.out.println();
		}
	}
}
