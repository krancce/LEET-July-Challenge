public class plusOne{
  public int[] plusOne(int[] digits) {
    if(digits[digits.length-1]!=9){
      digits[digits.length-1]+=1;
      return digits;
    }else{
      int count = 1;
      int index = digits.length-1;
      while(count!=0){
        digits[index]=0;
        if(index==0){
          int[] ans = new int[digits.length+1];
          ans[0]=1;
          for(int i=1;i<ans.length;i++){
            ans[i]=digits[i-1];
          }
          return ans;
        }else{
          index--;
          if(digits[index]<9){
            digits[index]++;
            return digits;
          }
        }
      }
    }
    return digits;
  }
}
