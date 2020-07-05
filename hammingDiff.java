public class hammingDiff {
  public int hammingDistance(int x, int y) {
    int dif = x^y;
    char[] tmp = Integer.toBinaryString(dif).toCharArray();
    int count =0;
    for(char ch : tmp){
      if(ch=='1'){
        count++;
      }
    }
    return count;
  }
}
