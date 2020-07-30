public int maxProfit(int[] prices) {
    List<Integer> list = new ArrayList();
    helper(prices,0,0,list,0,false,false);
    Collections.sort(list);
    return list.get(list.size()-1);
}

public void helper(int[] prices, int index, int total, List<Integer> list, int last, boolean cooldown, boolean bought){
    if(index==prices.length){
        list.add(total+last);
        return;
    }
    if(cooldown==false){
        if(bought==true && last<prices[index]){
            int newtotal = total+prices[index];
            helper(prices,index+1,newtotal,list,0,true,false);
        }else if(bought==false){
            int newLast = prices[index];
            helper(prices,index+1,total-newLast,list,newLast,false,true);
        }

    }
    helper(prices,index+1,total,list,last,false,bought);
}
