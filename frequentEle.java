import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class frequentEle{
  public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap();
      ArrayList<Integer> list = new ArrayList();
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
          list.add(nums[i]);
          map.put(nums[i],1);
        }else{
          map.replace(nums[i],map.get(nums[i])+1);
        }
      }
      int[][] ans = new int[list.size()][2];
      for(int i=0;i<list.size();i++){
        ans[i][0] = list.get(i);
        ans[i][1] = map.get(list.get(i));
      }
      Arrays.sort(ans, (a,b)->a[1]-b[1]);
      int[] solution = new int[k];
      int index = ans.length-1;
      for(int i=0;i<k;i++){
        solution[i] = ans[index][0];
        index--;
      }
      return solution;
    }
}
