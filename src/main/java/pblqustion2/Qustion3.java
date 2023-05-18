package pblqustion2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import base.baseclass;

public class Qustion3 extends baseclass {
	@Test

	public void tc() {

		driver.get("https://www.speedtest.net/");
		WebElement timebut = driver.findElement(By.xpath("//div[@class='start-button']/a/span[4]"));
		timebut.click();
		time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@id='container']/div/div[3]/div/div/div/div[2]/div[3]/div[3]/div/div[3]/div/div/div[2]/div[1]/div[1]/div/div[2]/span")));
		WebElement red = driver.findElement(By.xpath(
				"//div[@id='container']/div/div[3]/div/div/div/div[2]/div[3]/div[3]/div/div[3]/div/div/div[2]/div[1]/div[1]/div/div[2]/span"));
		String mn = red.getText();
		System.out.println("the result" + mn);
	}
}
