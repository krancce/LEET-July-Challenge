class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }else if((p==null&&q!=null)||(p!=null&&q==null)){
            return false;
        }
        Queue<TreeNode> q1 = new LinkedList();
        Queue<TreeNode> q2 = new LinkedList();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty()){
            TreeNode tmp1 = q1.poll();
            TreeNode tmp2 = q2.poll();
            if(tmp1.val != tmp2.val){
                return false;
            }
            if(tmp1.left!=null && tmp2.left!=null){
                q1.add(tmp1.left);
                q2.add(tmp2.left);
            }
            if(tmp1.right!=null && tmp2.right!=null){
                q1.add(tmp1.right);
                q2.add(tmp2.right);
            }
            if((tmp1.left!=null&&tmp2.left==null)||(tmp1.left==null&&tmp2.left!=null)||(tmp1.right!=null&&tmp2.right==null)||(tmp1.right==null&&tmp2.right!=null)){
                return false;
            }
        }
        if(!q2.isEmpty()){
            return false;
        }
        return true;
    }
}
