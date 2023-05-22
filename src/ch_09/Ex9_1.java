package ch_09;

public class Ex9_1 {

	public static void main(String[] args) {

		LinkedTree T = new LinkedTree();

		TreeNode n11 = T.makeBT(null, 'K', null);
		TreeNode n10 = T.makeBT(null, 'F', null);
		TreeNode n9 = T.makeBT(null, 'J', null);
		TreeNode n8 = T.makeBT(null, 'I', null);
		TreeNode n7 = T.makeBT(null, 'H', null);
		TreeNode n6 = T.makeBT(null, 'G', n11);
		TreeNode n5 = T.makeBT(n8, 'E', n9);
		TreeNode n4 = T.makeBT(n7, 'D', null);
		TreeNode n3 = T.makeBT(n10, 'C', n6);
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
