package pplqustion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseclass;

public class Qustion8 extends baseclass{
	@Test
	public void dropdown() {
		driver.get("https://demoqa.com/droppable");
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, dest).build().perform();
		WebElement drml = driver.findElement(By.xpath("//div[@id='droppable']/p[1]"));
		 String Actualtext = drml.getText();
		 System.out.println(Actualtext);
		 String Exptest =" Dropped";
		assertEquals(Actualtext,Exptest);
	}
//		
//	}

}

