package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static  String chromedriverpath ="/Users/KA20463795/Downloads/chromedriver_mac_arm64/chromedriver";
	public static String URL= "https://demoqa.com/tool-tips";
	public static WebDriver driver;
	public static Actions act;
	public static WebDriverWait  time;
	@BeforeTest
	public static void start() {
		System.setProperty("webdriver.chrome.driver",chromedriverpath);
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		act=new Actions(driver);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		time=new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	@AfterTest
	public static void end() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}
}
