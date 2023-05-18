package pplqustion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseclass;

public class qustion9 extends baseclass {
	@Test
	public static void tooltrip() {
//		driver.get("https://demoqa.com/tool-tips");
//		  WebElement toll= driver.findElement(By.xpath("//*[@id=\"toolTipTextField\"]"));
//		 act.moveToElement(toll).click().build().perform();
//		 driver.get("https://demoqa.com/tool-tips");
		WebElement buttonhm = driver.findElement(By.id("toolTipButton"));
		act.moveToElement(buttonhm);
		act.pause(Duration.ofMillis(4000));
		act.build().perform();
		String exp ="You hovered over the Button";
		String Aut = driver.findElement(By.className("//*[@id=\'textFieldToolTip\']/div[2]")).getText();
		assertEquals(exp,Aut);
	}

}
