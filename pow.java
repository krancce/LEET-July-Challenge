public class pow{
  public double myPow(double x, int n) {
    long exp = n;
    if(n==0||x==1.0){
      return 1;
    }else if(n<0){
      x= 1/x;
      exp=-n;
    }
    double ans = helper(x,exp);
    return ans;
  }

  public double helper(double x, long n){
    double tmp;
    if(n==0){
      return 1;
    }else{
      tmp = helper(x,n/2);
      if(n%2==0){
        return tmp*tmp;
      }else{
        return tmp * tmp * x;
      }

    }
  }

}
