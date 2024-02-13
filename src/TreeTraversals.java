import java.util.*;

public class TreeTraversals {
    //LDR - Inorder
    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    //DLR - Pre Order
    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //LRD - PostOrder
    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    private static void printCurrentLevel(Node root, int level) {
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.data + " ");
        else if(level > 1) {
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
    static void levelOrder(Node root) {
        int height = TreeBasic.heightOfTree(root);
        for(int i =1; i<=height; i++) {
            printCurrentLevel(root, i);
        }
    }
    static void levelOrderThroughQueue(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if(temp == null) {
                if(q.isEmpty())
                    return;
                q.offer(null);
                System.out.println();
                temp = q.poll();
            }
            System.out.print(temp.data + " ");
            if(temp.left != null) {
                q.offer(temp.left);
            }
            if(temp.right != null) {
                q.offer(temp.right);
            }
        }
    }
    static void verticalOrder(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        q.offer(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair temp = q.poll();

            if(map.containsKey(temp.hd)) {
                map.get(temp.hd).add(temp.node.data);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(temp.node.data);
                map.put(temp.hd, l);
            }

            if (temp.node.left != null) {
                q.offer(new Pair(temp.hd - 1, temp.node.left));
            }
            if (temp.node.right != null) {
                q.offer(new Pair(temp.hd + 1, temp.node.right));
            }
        }
        System.out.println(map);
        ArrayList<Integer> ans = new ArrayList<>();
        map.forEach((k, v) -> ans.addAll(v));
    }
    static void boundryOrder(Node root) {

    }
}
