public class uglyNum{
  public static int nthUglyNumber(int n) {
    if(n==1){return 1;}
    int[] nums = new int[n];
    nums[0]=1;
    int ans=0,p2=0,p3=0,p5=0;
    for(int i=1;i<n;i++){
      ans = Math.min(2*nums[p2],Math.min(3*nums[p3],5*nums[p5]));
      nums[i] = ans;
      if(2*nums[p2] == ans)p2++;
      if(3*nums[p3] == ans)p3++;
      if(5*nums[p5] == ans)p5++;
    }
    return ans;
  }

  public static void main(String[] args) {
    int ans = nthUglyNumber(10);
    System.out.println(ans);
  }
}
