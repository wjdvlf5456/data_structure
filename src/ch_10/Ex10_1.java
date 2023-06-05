package ch_10;

public class Ex10_1 {

	public static void main(String[] args) {
		AdjMatrix MG1 = new AdjMatrix();
		for (int i = 0; i < 7; i++)
			MG1.insertVertex(i);
		MG1.insertEdge(0, 2);
		MG1.insertEdge(0, 1);
		MG1.insertEdge(1, 4);
		MG1.insertEdge(1, 3);
		MG1.insertEdge(1, 0);
		MG1.insertEdge(2, 4);
		MG1.insertEdge(2, 0);
		MG1.insertEdge(3, 6);
		MG1.insertEdge(3, 1);
		MG1.insertEdge(4, 6);
		MG1.insertEdge(4, 2);
		MG1.insertEdge(4, 1);
		MG1.insertEdge(5, 6);
		
		MG1.insertEdge(6, 5);
		MG1.insertEdge(6, 4);
		MG1.insertEdge(6, 3);
		
		System.out.printf("\n그래프 G1의 인접행렬 : ");
		MG1.printMatrix();
		System.out.println();

		AdjList LG1 = new AdjList();
		for (int i = 0; i < 7; i++)
			LG1.insertVertex(i);
		LG1.insertEdge(0, 2);
		LG1.insertEdge(0, 1);
		LG1.insertEdge(1, 4);
		LG1.insertEdge(1, 3);
		LG1.insertEdge(1, 0);
		LG1.insertEdge(2, 4);
		LG1.insertEdge(2, 0);
		LG1.insertEdge(3, 6);
		LG1.insertEdge(3, 1);
		LG1.insertEdge(4, 6);
		LG1.insertEdge(4, 2);
		LG1.insertEdge(4, 1);
		LG1.insertEdge(5, 6);
		
		LG1.insertEdge(6, 5);
		LG1.insertEdge(6, 4);
		LG1.insertEdge(6, 3);
		
		System.out.printf("\n그래프 G1의 인접리스트 : ");
		LG1.printAdjList();
		System.out.println();

	}

}
