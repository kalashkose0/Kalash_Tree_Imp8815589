public class CreateBST {
    public static Node insertNode(Node root, int d) {
        if(root == null){
            return new Node(d);
        }
        if(d > root.data)
            root.right = insertNode(root.right, d);
        else
            root.left = insertNode(root.left, d);
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {6,4,5,1,2,3,10};
        Node root = null;
        for(int i : arr) {
            root = insertNode(root, i);
        }
        System.out.println(root.data);
        TreeTraversals.inOrder(root);
    }
}
