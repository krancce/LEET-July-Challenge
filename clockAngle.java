public class clockAngle{
  public int angleClock(int hour,int minutes){
    double minAn = 360 * (minutes/60.0);
    double hourAn = 360 * (hour/12.0) + (360/12.0) * (minutes/60.0);
    double angle = Math.max(minAn,hourAn)-Math.min(minAn,hourAn);
    if(angle>180){
      return 360-angle;
    }else{
      return angle;
    }
  }
}
