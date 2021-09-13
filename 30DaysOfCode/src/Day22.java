import java.util.*;

class BinaryNode{
    BinaryNode left,right;
    int data;
    BinaryNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day22 {

    //static List<Integer> edges = new ArrayList<>();
    public static int getHeight(BinaryNode root){
        //Write your code here
        Queue<BinaryNode> queue = new ArrayDeque<>();
        queue.add(root);
        BinaryNode front = null;
        int height = 0;
        // loop till queue is empty
        while (!queue.isEmpty())
        {
            // calculate the total number of nodes at the current level
            int size = queue.size();
            // process each node of the current level and enqueue their
            // non-empty left and right child
            while (size-- > 0)
            {
                front = queue.poll();

                if (front.left != null) {
                    queue.add(front.left);
                }

                if (front.right != null) {
                    queue.add(front.right);
                }
            }
            // increment height by 1 for each level
            height++;
        }
        return --height;
    }

    public static BinaryNode insert(BinaryNode root,int data){
        if(root==null){
            return new BinaryNode(data);
        }
        else{
            BinaryNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BinaryNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
