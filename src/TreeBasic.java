public class TreeBasic {
    static int heightOfTree(Node root) {
        if(root == null)
            return 0;
        return Math.max(heightOfTree(root.left),
                heightOfTree(root.right)) + 1;
    }
    //count the nodes
    static int sizeOfTree(Node root) {
        if(root == null)
            return 0;
        return sizeOfTree(root.left) + sizeOfTree(root.right) + 1;
    }
    //max value in binary tree
    static int maxInTree(Node root) {
        if(root == null)
            return Integer.MIN_VALUE;

        return Math.max(Math.max(maxInTree(root.left), maxInTree(root.right)), root.data);
    }

}
