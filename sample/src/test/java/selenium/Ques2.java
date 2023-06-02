package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Ques2 {
	int num1=20;
	int num2=10;
  @Test(priority=0)
  public void add() {
	  int sum=num1+num2;
	  Assert.assertEquals(sum,30);
  }
  @Test(priority=-1)
  public void subtract() {
	  int subtract=num1-num2;
	  Assert.assertEquals(subtract,10);
  }
  @Test(priority=2)
  public void multiply() {
	  int multiply=num1*num2;
	  Assert.assertEquals(multiply,200);
  }
  @Test(priority=1)
  public void division() {
	  int division=num1/num2;
	  Assert.assertEquals(division,2);
  }
}
