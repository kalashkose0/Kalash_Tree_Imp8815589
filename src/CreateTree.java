import java.util.Scanner;

public class CreateTree {
    static Scanner sc;
    static {
        sc = new Scanner(System.in);
    }
    public static Node createTreeViaInput() {
        Node root = null;
        System.out.println("Enter data : " );
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.println("Enter left for " + data);
        root.left = createTreeViaInput();
        System.out.println("Enter right for " + data);
        root.right = createTreeViaInput();
        return root;
    }
    static int index = -1;
    public static Node createTreeViaArray(int nodes[]) {
        index++;
        if(nodes[index] == -1)
            return null;
        Node root = new Node(nodes[index]);
        root.left = createTreeViaArray(nodes);
        root.right = createTreeViaArray(nodes);
        return root;
    }
}
