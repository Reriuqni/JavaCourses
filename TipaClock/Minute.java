package com.dvorskaya.Clock;

public class Minute extends Second
{
  int minute;
  public static final String massage_error = "Minutes can't be more than 59 second";
  
  public Minute(int minute)
  {
    super(minute);
  }
  
  public void setMinutes(int minute) {
    this.minute = minute;
  }
  


  public int getMinutes() { return minute; }
  
  private static void checkSecondField(int value, String massage) {
    if ((value < 0) || (value > 59)) throw new IllegalArgumentException("Minutes can't be more than 59 second");
  }
  
  public void addSecond(int second) { int d = (second + getSeconds()) / 60;
    minute += d;
    
    setSeconds(d % 60);
  }
}
