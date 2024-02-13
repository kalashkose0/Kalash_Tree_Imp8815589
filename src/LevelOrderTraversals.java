import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversals {
    public static List<List<Integer>> levelOrderLoop(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<q.size(); i++) {
                Node t = q.poll();
                list.add(t.data);
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
            }
            ans.add(list);
        }
        return ans;
    }
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        dlr(ans, 0, root);
        return ans;
    }
    public static void dlr(List<List<Integer>> ans, int level, Node root) {
        if(root == null)
            return;
        if(level == ans.size())
            ans.add(0, new ArrayList<Integer>());

        ans.get(level).add(root.data);
        dlr(ans, level+1, root.left);
        dlr(ans, level+1, root.right);
    }
}
