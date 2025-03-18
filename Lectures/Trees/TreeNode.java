public class TreeNode {


	private int data;
	// 1. What other fields will we need in a TreeNode?
	private TreeNode right;
	private TreeNode left;
	// 2. Write constructor(s) for a TreeNode
	public TreeNode(int data){
		this.data = data;
		this.right = null;
		this.left = null;
	}

	public TreeNode(int data, TreeNode right, TreeNode left){
		this.data = data;
		this.right = right;
		this.left = left;
	}
	
	public static void main(String[] args) {
		
		// 3. Create an instance of a TreeNode (call it a) with int value 5
		TreeNode a = TreeNode(5);

		// 4a. Create another instance of a TreeNode (call it b) with int value 8
		//     and make it the right child of the TreeNode a that you created above.
		TreeNode b = TreeNode(8)
		a.right = b;
		// 4b. Print out the value of the TreeNode b without using b in the print statement
		printf(a.right);

		// 5. Create a tree with the following structure:
		//            5
		//          /   \  
		//         2     8
		//       /   \
		//      1     4
		
		// 6. How could we print out the contents of the tree? What is the expected output?
	}
	

}