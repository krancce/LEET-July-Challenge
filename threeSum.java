public class threeSum{
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList();
    for(int i=0;i<nums.length;i++){
      int left = i+1;
      int right = nums.length-1;
      int comp = 0-nums[i];
      while(left<right){
        if(nums[left]+nums[right]==comp){
          List<Integer> tmp = new ArrayList();
          tmp.add(nums[i]);
          tmp.add(nums[left]);
          tmp.add(nums[right]);
          if(!ans.contains(tmp)){
            ans.add(tmp);
          }
          left++;
          right--;
        }else if(nums[left]+nums[right]>comp){
          right--;
        }else{
          left++;
        }
      }
    }
    return ans;
  }
}
