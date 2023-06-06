package ch_10_2;

public class LinkedStack {
	StackNode top;
	int stackSize = 0; // 싸이클 찾기 함수를 위해 추가됨

	public boolean isEmpty() {
		return (top == null);
	}

	public void push(int item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		stackSize++; // 싸이클 찾기 함수를 위해 추가됨
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		} else {
			int item = top.data;
			top = top.link;
			stackSize--; // 싸이클 찾기 함수를 위해 추가됨
			return item;
		}
	}
}
