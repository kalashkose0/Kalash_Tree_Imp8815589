import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TreeImpl {

    public static void main(String[] args) {
      //  Node n = CreateTree.createTreeViaInput();
       // System.out.println("INORDER - LDR");
        //TreeTraversals.inOrder(n);
//        System.out.println();
//        System.out.println("PREORDER - DLR");
//        TreeTraversals.preOrder(n);
//        System.out.println();
//        System.out.println("POSTORDER - LRD");
//        TreeTraversals.postOrder(n);

        int[] nodes = {2, 4, 7, -1, -1, -1, 1, 8, -1, -1, 3, 5, -1, -1, -1};
//        int[] nodes = {20, 10, 50, -1, -1, 60, -1, -1, 30, 5, -1, -1, 40, -1, -1};
        Node root = CreateTree.createTreeViaArray(nodes);
//        TreeTraversals.inOrder(root);
        //System.out.println(TreeBasic.heightOfTree(root));
        //System.out.println(TreeBasic.sizeOfTree(root));
        //System.out.println(TreeBasic.maxInTree(root));
        for (List<Integer> list :LevelOrderTraversals.levelOrder(root)) {
            System.out.println(list);
        }
        //TreeTraversals.levelOrderThroughQueue(root);
        //TreeView.leftView(root);
        //TreeView.rightView(root);
        //TreeView.topView(root);
        //TreeView.bottomView(root);
        //TreeTraversals.verticalOrder(root);


    }


}
