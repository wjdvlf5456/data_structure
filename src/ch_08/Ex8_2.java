package ch_08;

public class Ex8_2 {

	public static void main(String[] args) {
		int queueSize = 5;
		char deletedItem;
		ArrayCQueue cQ = new ArrayCQueue(queueSize);
		
		cQ.enQueue('A');
		cQ.printQueue();
		
		cQ.enQueue('B');
		cQ.printQueue();
		
		deletedItem = cQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		cQ.printQueue();
		
		cQ.enQueue('C');
		cQ.enQueue('D');
		cQ.enQueue('E');
		cQ.printQueue();
		
	
		// 1. 위 프로그램을 큐 아이즈를 5로 변경한 후에 다시 한번 더 실행하면 마직 enQueue('E')까지 잘 실행되는 것을 확인해 보시오.
		

		
		
		// 4. 3번의 deQueue, printQueue, 3번의 enQueue, printQueue 연산을 차례로 실행하여, 원형 큐에 빈 공간이 생기면 계속 enQueue를 
		// 할 수 있음을 확인하시오.
		cQ.deQueue();
		cQ.deQueue();
		cQ.deQueue();
		cQ.printQueue();
		
		cQ.enQueue('H');
		cQ.enQueue('I');
		cQ.enQueue('J');
		cQ.printQueue();
		
	}

}
