public class ArrayBasedBinarySearchTree extends ArrayBasedBinaryTree{


    
    public static void main(String[] args) {
        ArrayBasedBinarySearchTree emptyTree = new ArrayBasedBinarySearchTree();
        
        ArrayBasedBinarySearchTree myTree = new ArrayBasedBinarySearchTree();
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
    }

    @Override
    public void insert(Integer value) {
        insertRec(value, root);
    }

    private void insertRec(Integer value, Integer node){
        if(data[node] == null){
            data[node] = value;
            size++;
        }

        if(value > data[node]){
            insertRec(value, super.getRight(node));
        } else if (value < data[node]) {
            insertRec(value, super.getLeft(node));
        }

        //If code reaches here, then it is equal to value and then we don't care as BST doesn't have duplicate.
    }
}
