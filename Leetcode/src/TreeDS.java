import java.util.ArrayList;
import java.util.List;


 // Definition for a binary tree node.
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> vals = new ArrayList<>();
        if(root == null)return vals;

        vals.add(root.val);
        vals = preOrder(root.left,vals);
        vals = preOrder(root.right,vals);
        return vals;

    }

    public List<Integer> preOrder(TreeNode tnode,List<Integer> vals){
        if(tnode == null) return vals;
        vals.add(tnode.val);
        vals = preOrder(tnode.left,vals);
        vals = preOrder(tnode.right,vals);
        return vals;
    }


}
public class TreeDS {


}
