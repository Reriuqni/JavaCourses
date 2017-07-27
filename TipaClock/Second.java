package com.dvorskaya.Clock;


public class Second
{
  private int second;
  
  public static final String massage_error = "Second can't be more than 59 second";
  
  public Second(int second)
  {
    checkSecondField(second, "Second can't be more than 59 second");
    this.second = second;
  }
  
  public int getSeconds() {
    return second;
  }
  
  public void setSeconds(int second) {
    checkSecondField(second, "Second can't be more than 59 second");
    if ((second < 0) || (second > 59)) throw new IllegalArgumentException("Second can't be more than 59 second");
    this.second = second;
  }
  
  public String toString()
  {
    return "Second" + second;
  }
  
  private static void checkSecondField(int value, String massage_error) {
    if ((value < 0) || (value > 59)) throw new IllegalArgumentException(massage_error);
  }
}
