public class trees{
  int postorderIndex;
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    this.postorderIndex = postorder.length-1;
    HashMap<Integer,Integer> inorderMap = new HashMap<Integer,Integer>();
    for(int i=0;i<postorder.length;i++){
      inorderMap.put(inorder[i],i);
    }
    TreeNode root  = new TreeNode();
    root = helper(inorder,postorder,0,inorder.length-1,inorderMap);
    return root;
  }

  public TreeNode helper(int[] inorder, int[] postorder, int left, int right, HashMap<Integer,Integer> inorderMap){
    if(left>right){
      return null;
    }

    int val = postorder[this.postorderIndex];
    TreeNode root = new TreeNode(val);
    int index = inorderMap.get(val);
    this.postorderIndex--;

    root.right = helper(inorder,postorder,index+1,right,inorderMap);
    root.left = helper(inorder,postorder,left,index-1,inorderMap);
    return root;

  }
}
