package pblqustion2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import base.baseclass;

public class qustion1 extends baseclass{
	@Test
	public void scroll() {
		driver.get("https://demoqa.com/links");
	JavascriptExecutor js=(JavascriptExecutor)	driver;
	js.executeScript("window.svrollBy(0,1000)");
	WebElement scrol =driver.findElement(By.xpath("(//div[contains(@class,'header-wrpper')])"));
	time.until(ExpectedConditions.visibilityOf(scrol));
	scrol.click();

}
}