package pplqustion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseclass;

public class qustion10 extends baseclass {
	@Test
  public void  click() throws InterruptedException {
		driver.get("//http://the-internet.herokuapp.com/context_menu");
WebElement cli=driver.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
act.moveToElement(cli).click().build().perform();
		Thread.sleep(3000);
	}
}
