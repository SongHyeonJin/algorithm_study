import java.util.LinkedList;
import java.util.Queue;

public class 넓이우선탐색 {
    Node root;
    public void Bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            System.out.print(L+" : ");
            for (int i=0; i<len; i++){
                Node cur = queue.poll();
                System.out.print(cur.data+" ");
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        넓이우선탐색 tree = new 넓이우선탐색();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.Bfs(tree.root);
    }
}
