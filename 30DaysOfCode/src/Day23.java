import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class NodeBST{
    NodeBST left,right;
    int data;
    NodeBST(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23 {

    public static void levelOrder(NodeBST root){
        Queue<NodeBST> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(queue.size()>0){
            NodeBST curr = queue.poll();
            System.out.print(curr.data+" ");
            if(curr.left !=null)queue.add(curr.left);
            if(curr.right!=null)queue.add(curr.right);
        }
    }

    public static NodeBST insert(NodeBST root,int data){
        // first create a root
        if(root == null){
            return new NodeBST(data);
        }
        else{
            NodeBST cur;
            if(data<=root.data){
                cur = insert(root.left,data);
                root.left = cur;
            }
            else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        NodeBST root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
