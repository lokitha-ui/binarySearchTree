public class test {
    public static void main(String args[]) {
        binarySearchTree binarySearchTree = new binarySearchTree();

        /*
         * Creating the binaryTree of:
         * 15
         * / \
         * 5 18
         * / \ / \
         * 2 7 16 30
         * 
         */

        binarySearchTree.insertData(15);
        binarySearchTree.insertData(5);
        binarySearchTree.insertData(18);
        binarySearchTree.insertData(2);
        binarySearchTree.insertData(7);
        binarySearchTree.insertData(16);
        binarySearchTree.insertData(30);

        System.out.println("Depth of tree: " + binarySearchTree.depth(binarySearchTree.root.left)); // depth of the tree

        System.out.println("Size of tree: " + binarySearchTree.sizeBtree(binarySearchTree.root.left) + "\n"); // size of
                                                                                                              // the
                                                                                                              // tree

        System.out.println("In order traverse: "); // print in order traverse of the tree
        binarySearchTree.inorderTraverse();
        System.out.println("\n");

        System.out.println("Pre order traverse: "); // print pre order traverse of the tree
        binarySearchTree.preorderTraverse();
        System.out.println("\n");

        System.out.println("Post order traverse: "); // print post order traverse of the tree
        binarySearchTree.postorderTraverse();
        System.out.println("\n");

        System.out.println("Breadth traverse: "); // print breadth traverse of the tree
        binarySearchTree.breadthTraverse();
        System.out.println("\n");
    }
}