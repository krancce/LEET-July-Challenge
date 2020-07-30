import java.util.ArrayList;
import java.util.HashMap;

public class break2{
  public static ArrayList<String> wordBreak(String s, ArrayList<String> wordDict) {
    if(s.length()==1){
            ArrayList<String> ans  =  new ArrayList();
            if(wordDict.contains(s)){
                ans.add(s);
            }
            return ans;
        }
    HashMap<Integer,ArrayList<String>> map = new HashMap();
    ArrayList<String> first = new ArrayList();
    first.add("");
    map.put(-1,first);
    ArrayList<String> ans = new ArrayList();
    boolean[] dp = new boolean[s.length()+1];
    dp[0]=true;
    for(int i=0;i<s.length();i++){
      for(int x=i+1;x<=s.length();x++){
        String curr = s.substring(i,x);
        if(dp[i] && wordDict.contains(curr)){
          ArrayList<String> tmp = map.get(i-1);
          if(x==s.length()){
            for(int q=0;q<tmp.size();q++){
              String str = tmp.get(q)+" "+curr;
              ans.add(str.substring(1));
            }
          }else{
            ArrayList<String> list = new ArrayList();
            if(map.containsKey(x-1)){
              list = map.get(x-1);
            }
            for(int q=0;q<tmp.size();q++){
              String str = tmp.get(q)+" "+curr;
              list.add(str);
            }
            map.put(x,list);
          }
          dp[x]=true;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    String s = "catsanddog";
    ArrayList<String> wordDict = new ArrayList();
    wordDict.add("cat");
    wordDict.add("cats");
    wordDict.add("and");
    wordDict.add("sand");
    wordDict.add("dog");
    ArrayList<String> ans = new ArrayList();
    ans = wordBreak(s,wordDict);
  }
}
