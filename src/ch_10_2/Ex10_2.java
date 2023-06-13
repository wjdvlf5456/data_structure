package ch_10_2;

public class Ex10_2 {

	public static void main(String args[]) {
		AdjList G9 = new AdjList();

		for (int i = 0; i < 7; i++)
			G9.insertVertex(i);

		// 교재에 있는 그래프
		G9.insertEdge(0, 2);
		G9.insertEdge(0, 1);

		G9.insertEdge(1, 4);
		G9.insertEdge(1, 3);
		G9.insertEdge(1, 0);

		G9.insertEdge(2, 4);
		G9.insertEdge(2, 0);
		G9.insertEdge(3, 6);
		G9.insertEdge(3, 1);
		G9.insertEdge(4, 6);
		G9.insertEdge(4, 2);
		G9.insertEdge(4, 1);
		G9.insertEdge(5, 6);
		G9.insertEdge(6, 5);
		G9.insertEdge(6, 4);
		G9.insertEdge(6, 3);

// 교재에 없는 새로운그래프
//		G9.insertEdge(0,1);
//		G9.insertEdge(0,2);
//		G9.insertEdge(1,0);
//		G9.insertEdge(2,0);
//		G9.insertEdge(2,4);
//		G9.insertEdge(2,5);
//		G9.insertEdge(3,4);
//		G9.insertEdge(4,2);
//		G9.insertEdge(4,3);
//		G9.insertEdge(4,5);	
//		G9.insertEdge(5,2);
//		G9.insertEdge(5,4);

		System.out.printf("\n 그래프 G9의 인접리스트 : ");
		G9.printAdjList();
		System.out.println();

		/*
		 * System.out.printf("\n\n 깊이우선탐색 0 >> "); G9.DFS(0);
		 * 
		 * System.out.printf("\n 깊이우선탐색 1 >> "); G9.DFS(1);
		 * 
		 * System.out.printf("\n 깊이우선탐색 2 >> "); G9.DFS(2);
		 * 
		 * System.out.printf("\n 깊이우선탐색 3 >> "); G9.DFS(3);
		 * 
		 * System.out.printf("\n 깊이우선탐색 4 >> "); G9.DFS(4);
		 * 
		 * System.out.printf("\n 깊이우선탐색 5 >> "); G9.DFS(5);
		 * 
		 */

		// DFSnew 함수를 완성한 후에 아래 문장들을 실행하시오.
		System.out.printf("\n\n 새로운 깊이우선탐색 0 >> ");
		G9.DFSnew(0);

		System.out.printf("\n 새로운 깊이우선탐색 1 >> ");
		G9.DFSnew(1);

		System.out.printf("\n 새로운 깊이우선탐색 2 >> ");
		G9.DFSnew(2);

		System.out.printf("\n 새로운 깊이우선탐색 3 >> ");
		G9.DFSnew(3);

		System.out.printf("\n 새로운 깊이우선탐색 4 >> ");
		G9.DFSnew(4);

		System.out.printf("\n 새로운 깊이우선탐색 5 >> ");
		G9.DFSnew(5);

		System.out.printf("\n\n 너비우선탐색 0 >> ");
		G9.BFS(0);

		System.out.printf("\n 너비우선탐색 1 >> ");
		G9.BFS(1);

		System.out.printf("\n 너비우선탐색 2 >> ");
		G9.BFS(2);

		System.out.printf("\n 너비우선탐색 3 >> ");
		G9.BFS(3);

		System.out.printf("\n 너비우선탐색 4 >> ");
		G9.BFS(4);

		System.out.printf("\n 너비우선탐색 5 >> ");
		G9.BFS(5);

		
		// findCycle 함수를 완성한 후에 아래 문장들을 실행하시오.
		/*
		 * System.out.printf("\n\n Cycle 찾기 0 >> "); G9.findCycle(0);
		 * 
		 * System.out.printf("\n Cycle 찾기 1 >> "); G9.findCycle(1);
		 * 
		 * System.out.printf("\n Cycle 찾기 2 >> "); G9.findCycle(2);
		 * 
		 * System.out.printf("\n Cycle 찾기 3 >> "); G9.findCycle(3);
		 * 
		 * System.out.printf("\n Cycle 찾기 4 >> "); G9.findCycle(4);
		 * 
		 * System.out.printf("\n Cycle 찾기 5 >> "); G9.findCycle(5);
		 */

// findCycleNew 함수를 완성한 후에 아래 문장들을 실행하시오.
//
//		System.out.printf("\n\n Cycle 찾기 0 >> ");
//		G9.findCycleNew(0);
//		
//		System.out.printf("\n Cycle 찾기 1 >> ");
//		G9.findCycleNew(1);
//		
//		System.out.printf("\n Cycle 찾기 2 >> ");
//		G9.findCycleNew(2);
//		
//		System.out.printf("\n Cycle 찾기 3 >> ");
//		G9.findCycleNew(3);
//		
//		System.out.printf("\n Cycle 찾기 4 >> ");
//		G9.findCycleNew(4);
//		
//		System.out.printf("\n Cycle 찾기 5 >> ");
//		G9.findCycleNew(5);

	}
}
