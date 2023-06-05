package ch_09;

public class Ex9_1 {

	public static void main(String[] args) {

		LinkedTree T = new LinkedTree();

		TreeNode n9 = T.makeBT(null, 'I', null);
		TreeNode n8 = T.makeBT(null, 'H', null);
		TreeNode n7 = T.makeBT(null, 'G', null);
		TreeNode n6 = T.makeBT(n9, 'F', null);
		TreeNode n5 = T.makeBT(null, 'E', n8);
		TreeNode n4 = T.makeBT(null, 'D', n7);
		TreeNode n3 = T.makeBT(n6, 'C', null);
		TreeNode n2 = T.makeBT(n4, 'B', n5);
		TreeNode n1 = T.makeBT(n2, 'A', n3);
		
		
		System.out.print("Preorder : ");
		T.preorder(n1);
		
		System.out.print("\nInorder : ");
		T.inorder(n1);
	
		System.out.print("\nPostorder : ");
		T.postorder(n1);

	}

}
