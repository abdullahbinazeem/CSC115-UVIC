/*
 * BinaryTree.java
 *
 * A BinaryTree interface meant to store values of type Integer
 */
public interface BinaryTree {

	/*
	 * Purpose: inserts value into this BinaryTree
	 * Parameters: Integer value - to be in inserted
	 * Returns: Nothing
	 */
	public void insert(Integer value);


	/*
	 * Purpose: prints each value in this BinaryTree
	 *          following an in-order traversal
	 * Parameters: none
	 * Returns: Nothing
	 */
	public void inOrder();


	/*
	 * Purpose: prints each value in this BinaryTree
	 *          following a pre-order traversal
	 * Parameters: none
	 * Returns: Nothing
	 */
	public void preOrder();



	/*
	 * Purpose: prints each value in this BinaryTree
	 *          following a post-order traversal
	 * Parameters: none
	 * Returns: Nothing
	 */
	public void postOrder();



	/*
	 * Purpose: returns the height of this BinaryTree
	 *   where an empty tree is considered to be of height 0
	 * Parameters: none
	 * Returns: int - the height
	 * NOTE: a BinaryTree with no node is height 0
	 */
	 public int height();

}
