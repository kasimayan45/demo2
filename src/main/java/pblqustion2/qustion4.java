package pblqustion2;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import base.baseclass;


@Test
public class qustion4 extends baseclass{
	
 public static void table() throws InterruptedException {
 //ChromeDriver.get("https://letcode.in/advancedtable");
 Thread.sleep(2000);
 int tot=10;
 int ind=0;
 int count=0;
 do {
 List<WebElement> th=driver.findElements(By.xpath("//table/thead/tr/th"));
 for(WebElement wb:th) {
  System.out.print(wb.getText()+" ");
  //System.out.println(" "+(wb.findElement(By.xpath("//td/span")).getText()));
 }
 System.out.println();
  
 List<WebElement> tr=driver.findElements(By.xpath("//table/tbody/tr"));
 System.out.println(tr.size());
  
 for(WebElement wb:tr) {
  List <WebElement> td=wb.findElements(By.tagName("td"));
  count++;
  int i=0;
  for(WebElement all:td) {
  if(i==0) {
   ind=Integer.parseInt( all.getText());
   i++;}
  System.out.print(all.getText()+" ");
  }
  System.out.println();
  //tot--
 }
 tot--;
 driver.findElement(By.xpath("//a[@id='advancedtable_next']")).click();
 Thread.sleep(100);
 }while(tot>0);
 assertEquals(ind, 47);
 //System.out.println(ind+" "+count );
 Thread.sleep(2000);
  
  
  
 }

}