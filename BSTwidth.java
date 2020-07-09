import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BSTwidth{

  public static class TreeNode {
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


    public static int widthOfBinaryTree(TreeNode root){
      if(root == null){
        return 0;
      }
      Queue<TreeNode> q = new LinkedList();
      q.add(root);
      HashMap<TreeNode,Integer> map = new HashMap();
      map.put(root,1);
      int max =0;
      while(!q.isEmpty()){
        int qsize = q.size();
        TreeNode curr = null;
        for(int i=0;i<qsize;i++){
          curr = q.poll();
          if(curr.left!=null){
            q.add(curr.left);
            map.put(curr.left,2*map.get(curr));
          }
          if(curr.right!=null){
            q.add(curr.right);
            map.put(curr.right,2*map.get(curr)+1);
          }
        }
        max = Math.max(max,map.get(curr)-map.get(head)+1);
      }
      return max;
    }


    public static void main(String[] args) {
      TreeNode root = new TreeNode(1,null,null);
      root.left = new TreeNode(3,null,null);
      root.right = new TreeNode(2,null,null);
      root.left.left = new TreeNode(5,null,null);
      //root.left.right = new TreeNode(3,null,null);
    //  root.right.right = new TreeNode(9,null,null);
      int ans = widthOfBinaryTree(root);
      System.out.println(ans);
    }
  }
