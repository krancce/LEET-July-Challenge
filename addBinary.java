public class binary{
  public static String addBinary(String a, String b) {
    Stack<Character> aa = new Stack();
    Stack<Character> bb = new Stack();
    Stack<String> s = new Stack();
    for(char ch : a.toCharArray()){
      aa.push(ch);
    }
    for(char ch : b.toCharArray()){
      bb.push(ch);
    }
    char carry = '0';
    while(!aa.isEmpty() || !bb.isEmpty()){
      if(aa.isEmpty()){
        if(carry!=bb.peek()){
          s.push("1");
          carry = '0';
        }else if(carry=='0'){
          s.push("0");
        }else{
          s.push("0");
          carry = '1';
        }
        bb.pop();
      }else if(bb.isEmpty()){
        if(carry!=aa.peek()){
          s.push("1");
          carry = '0';
        }else if(carry=='0'){
          s.push("0");
        }else{
          s.push("0");
          carry = '1';
        }
        aa.pop();
      }else{
        if(aa.peek()=='0' && bb.peek()=='0'){
          s.push(String.valueOf(carry));
          carry = '0';
        }else if(aa.peek()!=bb.peek()){
          if(carry=='0'){
            s.push("1");
          }else{
            s.push("0");
          }
        }else{
          if(carry=='0'){
            s.push("0");
          }else{
            s.push("1");
          }
          carry = '1';
        }
        aa.pop();
        bb.pop();
      }
    }
    if(carry=='1'){
      s.push("1");
    }
    String ans = "";
    while(!s.isEmpty()){
      ans+=s.pop();
    }
    return ans;
  }

  public static void main(String[] args) {
    String a ="1";
    String b ="1";
    addbinary(a,b);
  }
}
