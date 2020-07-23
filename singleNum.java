public class singleNum{
  public int[] singleNumber(int[] nums) {
    int xor = 0;
    for(int i : nums){
      xor ^=i;
    }

    int lowbit = xor & (-xor);
    int num1 = 0;
    int num2 = 0;
    for(int i : nums){
      if((i&lowbit) == lowbit){
        num1 ^= i;
      }else{
        num2 ^= i;
      }
    }
    int[] ans = new int[2];
    ans[0] = num1;
    ans[1] = num2;
    return ans;
  }
}
