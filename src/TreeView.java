import java.util.*;

public class TreeView {
    static void leftView(Node root) {
        Map<Integer, Integer> map = new HashMap();
        leftViewHelper(root, map, 0);
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }

    private static void leftViewHelper(Node root, Map<Integer, Integer> map, int level) {
        if (root == null) {
            return;
        }
        if (!map.containsKey(level)) {
            map.put(level, root.data);
        }
        leftViewHelper(root.left, map, level + 1);
        leftViewHelper(root.right, map, level + 1);
    }

    static void rightView(Node root) {
        Map<Integer, Integer> map = new HashMap();
        rightViewHelper(root, map, 0);
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }

    private static void rightViewHelper(Node root, Map<Integer, Integer> map, int level) {
        if (root == null) {
            return;
        }
        map.put(level, root.data);
        rightViewHelper(root.left, map, level + 1);
        rightViewHelper(root.right, map, level + 1);
    }

    static void topView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.offer(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.node.data);
            }
            if (temp.node.left != null) {
                q.offer(new Pair(temp.hd - 1, temp.node.left));
            }
            if (temp.node.right != null) {
                q.offer(new Pair(temp.hd + 1, temp.node.right));
            }
        }

        System.out.println(map);
    }

    static void bottomView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.offer(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair temp = q.poll();

            map.put(temp.hd, temp.node.data);

            if (temp.node.left != null) {
                q.offer(new Pair(temp.hd - 1, temp.node.left));
            }
            if (temp.node.right != null) {
                q.offer(new Pair(temp.hd + 1, temp.node.right));
            }
        }

        System.out.println(map);
    }
}

class Pair {
    int hd;
    Node node;

    public Pair(int hd, Node node) {
        this.hd = hd;
        this.node = node;
    }
}
