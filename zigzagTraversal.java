public class zigzagTraversal{
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList();
    if(root==null){
      return ans;
    }
    Queue<TreeNode> q = new LinkedList();
    q.add(root);
    while(!q.isEmpty()){
      int size = q.size();
      List<Integer> list = new ArrayList();
      for(int i=0;i<size;i++){
        TreeNode tmp = q.poll();
        if(tmp.left!=null){
          q.add(tmp.left);
        }
        if(tmp.right!= null){
          q.add(tmp.right);
        }
        list.add(tmp.val);
      }
      ans.add(list);
    }
    for(int i=1;i<ans.size();i++){
      if(i%2!=0){
        Collections.reverse(ans.get(i));
      }
    }
    return ans;
  }
}
