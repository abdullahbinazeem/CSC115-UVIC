/*
 * ArrayBasedBinaryTree.java
 *
 * An array-based BinaryTree meant to store values of type Integer
 */
public class ArrayBasedBinaryTree implements BinaryTree {
    private static final int CAPACITY = 5;
    protected Integer[] data;
    protected int root;
    protected int size;
    
	public ArrayBasedBinaryTree() {
		data = new Integer[CAPACITY];
		root = 1;
		size = 0;
	}

	/*
	 * Purpose: inserts the given value into data at next available
	 *  position in a level-order traversal
	 *  The tree remains complete after insertion.
	 * Parameters: Integer value - value to insert
	 * Returns: nothing
	 */
	public void insert(Integer value) {
		if(size == 0){
			data[root] = value;
		} else {
			if(size >= (data.length-1)){
				expandAndCopy();
			}

			data[size + 1] = value;
		}

		size++;
	}

	protected void expandAndCopy() {
		Integer[] newData = new Integer[data.length*2];
		for(int i=0; i<data.length; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}

	/*
	 * Purpose: calculates and returns the index of t's left child
	 * Parameters: int t - index of current element in this ArrayBasedBinaryTree
	 * Returns: int - index of left child
	 */
	protected int getLeft(int t) {
		return (t*2);
	}

	/*
	 * Purpose: calculates and returns the index of t's right child
	 * Parameters: int t - index of current element in this ArrayBasedBinaryTree
	 * Returns: int - index of right child
	 */
	protected int getRight(int t) {
		return ((t*2)+1);
	}


	public void inOrder(){
		inOrderRec(root);
	}

	public void inOrderRec(int t){
		if(t > size){
			return;
		}

		inOrderRec(getLeft(t));
		System.out.println(data[t]);
		inOrderRec(getRight(t));
	}

	public void preOrder(){
		preOrderRec(root);
	}

	public void preOrderRec(int t){
		if(t > size){
			return;
		}

		System.out.println(data[t]);
		preOrderRec(getLeft(t));
		preOrderRec(getRight(t));
	}

	public void postOrder(){
		postOrderRec(root);
	}
	
	public void postOrderRec(int t){
		if(t > size){
			return;
		}

		postOrderRec(getLeft(t));
		postOrderRec(getRight(t));
		System.out.println(data[t]);
	}

	public int height() {
		return height(root);
	}

	/*
	 * Purpose: computes and returns the height of a 
	 *          binary tree rooted at index t 
	 * Parameters: TreeNode t - the BinaryTree
	 * Returns: int - the height
	 * NOTE: a BinaryTree with no nodes is height -1
	 *       a BinaryTree with just a root is height 0
	 *
	 *       the height of a node in a tree is equal to 
	 *       1 + the height of its largest subtree
	 */
	protected int height(int t) {
		if (t > size) {
            return -1;
        } 
		// TODO: complete the rest
		return 1 + Math.max(height(getRight(t)), height(getLeft(t))); 
	}
	

	/*
	 * Purpose: returns a String reprensentation of a in-order traversal
	 *     of this ArrayBasedBinaryTree
	 * Parameters: none
	 * Returns: String - the representation
	 */
	// written for you - do not change
	// NOTICE: we use the helper methods to get the index of the left/right
	//   children of the current position in the tree.
	// This method will not work until you have completed those methods correctly.
	public String toString() {
		return toString(root);
	}

	private String toString(int t) {
        if (t > size) {
            return "";
        } 
        String s = "";
        s += toString(getLeft(t));
        s += = todata[t] + " ";
        s +String(getRight(t));

        return s;
	}

	public static void main(String[] args) {
		
		ArrayBasedBinaryTree myTree = new ArrayBasedBinaryTree();
		for(int i=2; i<8; i++) {
			myTree.insert(i);
		}

		
		System.out.println("in");
		myTree.inOrder();
		System.out.println("pre");
		myTree.preOrder();
		System.out.println("post");
		myTree.postOrder();
		
		
		System.out.println("toString\n" + myTree );
		System.out.println("height: " + myTree.height());
	}
    
}
