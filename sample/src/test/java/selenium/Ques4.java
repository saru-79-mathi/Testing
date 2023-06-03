package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ques4 {
	WebDriver driver;
	@BeforeTest
  public void beforeMethod() throws Exception {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  @Test
  public void userNamePass() {
  }
}
