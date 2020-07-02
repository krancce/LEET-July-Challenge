import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;

public class reverseTraversal{

  public static class Node{
    Node left,right;
    int val;
    public Node(int value,Node left,Node right){
      this.left = left;
      this.right = right;
      val = value;
    }
  }

  public static ArrayList<ArrayList<Integer>> levelOrderBottom(Node root){
    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    if(root==null){
      return ans;
    }
    Queue<Node> queue = new LinkedList();
    queue.offer(root);
    while(!queue.isEmpty()){
      ArrayList<Integer> tmp = new ArrayList<Integer>();
      int level = queue.size();
      for(int i=0; i<level; i++){
        Node curr = queue.poll();
        tmp.add(curr.val);
        if(curr.left != null){
          queue.offer(curr.left);
        }
        if(curr.right != null){
          queue.offer(curr.right);
        }
      }
      ans.add(tmp);
    }
    Collections.reverse(ans);
    return ans;
  }

  public static void main(String[] args) {
    Node root = new Node(1,null,null);
    root.left = new Node(2,null,null);
    root.right = new Node(3,null,null);
    root.left.left = new Node(4,null,null);
    root.right.right = new Node(5,null,null);
    ArrayList<ArrayList<Integer>> solution = new ArrayList<>();
    solution = levelOrderBottom(root);
    System.out.print("{");
    for( int i=0; i<solution.size(); i++){
      System.out.print("[");
      for(int x=0; x<solution.get(i).size();x++){
        System.out.print(solution.get(i).get(x));
      }
      System.out.print("]");
    }
    System.out.println("}");
  }
}
