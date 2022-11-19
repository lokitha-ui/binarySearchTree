import java.util.LinkedList;
import java.util.Queue;

class binarySearchTree {

    class node {
        int val;
        node left, right;

        public node(int data) {
            val = data;
            left = right = null;
        }
    }

    public node root;

    void insertData(int val) {
        root = insertData_helper(root, val);
    }

    node insertData_helper(node root, int val) {

        if (root == null) { // if root is null then to create a new node with the value and return the root
            root = new node(val);
            return root;
        } else if (val < root.val) // else if value is less than the root.value, then inside the value to the left
                                   // else insert to the right
            root.left = insertData_helper(root.left, val);
        else if (val > root.val)
            root.right = insertData_helper(root.right, val);
        return root;
    }

    binarySearchTree() {
        root = null;
    }

    binarySearchTree(int val) {
        root = new node(val);
    }

    int sizeBtree(node x) {
        if (x == null) // if node value is null then return 0
            return 0;
        int ldepth = depth(x.left);
        int rdepth = depth(x.right);
        return ldepth + rdepth + 1; // taking the maximum value and return it by adding 1, that will be the size of
                                    // the binary tree
    }

    int depth(node x) {
        if (x == null) // if the node value is null return 0
            return 0;
        int ldepth = depth(x.left);
        int rdepth = depth(x.right);
        return Math.max(ldepth, rdepth) + 1; // taking the maximum value out of the depths, and then adding by 1, that
                                             // will be the depth of the tree
    }

    void inorderTraverse() {
        inorderTraverse_helper(root);
    }

    void inorderTraverse_helper(node root) { // calculation of inorder traverse
        if (root != null) {
            inorderTraverse_helper(root.left); // left
            System.out.print(root.val + " "); // root
            inorderTraverse_helper(root.right); // right
        }
    }

    void preorderTraverse() {
        preorderTraverse_helper(root);
    }

    void preorderTraverse_helper(node root) { // calculation of preorder traverse
        if (root != null) {
            System.out.print(root.val + " "); // root
            preorderTraverse_helper(root.left); // left
            preorderTraverse_helper(root.right); // right
        }
    }

    void postorderTraverse() {
        postorderTraverse_helper(root);
    }

    void postorderTraverse_helper(node root) { // calculation of postorder traverse
        if (root != null) {
            postorderTraverse_helper(root.left); // left
            postorderTraverse_helper(root.right); // right
            System.out.print(root.val + " "); // root
        }
    }

    void breadthTraverse() {
        node curr = root;

        Queue<node> q = new LinkedList<>();
        q.add(curr);

        while (q.size() != 0) {
            curr = q.peek();
            q.remove();
            System.out.print(curr.val + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }
}