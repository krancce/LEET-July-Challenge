import java.util.HashMap;
import java.util.Arrays;

public class prisonCell{

  public static int[] prisonAfterNDays(int[] cells, int N) {
    HashMap<String,Integer> seen = new HashMap<>();
    HashMap<Integer,int[]> ans = new HashMap<>();
    int count = 0;
    String s = Arrays.toString(cells);
    while(!seen.containsKey(s)){
      seen.put(s,count++);
      ans.put(count,cells);
      int[] tmp = cells.clone();
      tmp[0]=0;
      tmp[tmp.length-1]=0;
      for(int i=1; i<cells.length-1; i++){
        if(cells[i-1]==cells[i+1]){
          tmp[i]=1;
        }else{
          tmp[i]=0;
        }
      }
      cells=tmp.clone();
      if(count == N){
        return cells;
      }
      s = Arrays.toString(cells);
    }

    int loop = count - seen.get(s);
    int rest = (N-seen.get(s))%loop;
    int[] solution = ans.get(seen.get(s)+rest+1).clone();
    return solution;
  }

  public static void main(String[] args) {
    int[] tmp = {0,1,0,1,1,0,0,1};
    int[] test = prisonAfterNDays(tmp,1000000000);
    System.out.println(Arrays.toString(test));
  }
}
