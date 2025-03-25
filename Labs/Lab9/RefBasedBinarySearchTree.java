import java.lang.Math;
/*
 * RefBasedBinarySearchTree.java
 *
 * A ref-based BinaryTree meant to store values of type Integer
 */
public class RefBasedBinarySearchTree extends RefBasedBinaryTree {


    public static void main(String[] args) {
        // use these trees to test the methods you will implement
        RefBasedBinarySearchTree emptyTree = new RefBasedBinarySearchTree();
        RefBasedBinarySearchTree myTree = new RefBasedBinarySearchTree();
        myTree.insert(2);
        myTree.insert(1);
        myTree.insert(5);
        myTree.insert(7);
        myTree.insert(0);
        myTree.insert(4);
        myTree.insert(6);
        
        System.out.println("in");
        myTree.inOrder();
        System.out.println("pre");
        myTree.preOrder();
        System.out.println("post");
        myTree.postOrder();

       
        System.out.println("toString\n" + myTree);

        System.out.println("\nSum of Tree: " + myTree.sum());
        System.out.println("Finding num 19: " + myTree.find(19));
        System.out.println("Finding num 5: " + myTree.find(5));
        System.out.println("Max Number: " + myTree.getMax());
    }

    @Override
    public void insert(Integer value){
        if(root == null){
            root = new TreeNode(value);
            return;
        }

        insertRec(value, root);
    }

    private void insertRec(Integer value, TreeNode node){
        if(value > node.getValue()){
            if(node.getRight() == null){
                TreeNode entry = new TreeNode(value);
                node.setRight(entry);
            } else {
                insertRec(value, node.getRight());
            }
        } else if (value < node.getValue()){
             if(node.getLeft() == null){
                TreeNode entry = new TreeNode(value);
                node.setLeft(entry);
            } else {
                insertRec(value, node.getLeft());
            }
        }
    }

    @Override
    public int getMax(){
        return getMaxRec(root);
    }

    private int getMaxRec(TreeNode node){
        if(node.getRight() == null){
            return node.getValue();
        }

        return getMaxRec(node.getRight());
    }

    @Override
    public boolean find(int num){
        return findRec(root, num);
    }

    private boolean findRec(TreeNode node,int num){
        if(node == null){
            return false;
        } 

        if(node.getValue() == num){
            return true;
        }

        if(num > node.getValue()){
            return findRec(node.getRight(), num);
        } else {
            return findRec(node.getLeft(), num);
        }
    }

}
