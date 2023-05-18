package pblqustion2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseclass;

public class qustion2 extends baseclass {
  @Test
  public void pop() {
	  driver.get("https://demoqa.com/alerts");
	  driver.findElement(By.xpath("//*[@id='alertButton']")).click();
	  driver.switchTo().alert().accept();
  }
}
