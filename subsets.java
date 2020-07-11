class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> tmp = new ArrayList();
        ans.add(tmp);

            for(int num : nums){
                int size = ans.size();
                for(int i=0; i<size;i++){
                    List<Integer> curr = new ArrayList();
                    curr.addAll(ans.get(i));
                    curr.add(num);
                    ans.add(curr);
                }
            }
        return ans;
    }
}
