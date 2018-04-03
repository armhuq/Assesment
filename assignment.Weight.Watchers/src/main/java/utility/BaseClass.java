package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import assignment.Weight.Watchers.Assignment1;
import assignment.Weight.Watchers.Assignment2;
import assignment.Weight.Watchers.Assignment3;

public class BaseClass {
	protected WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod(){		
		System.setProperty("webdriver.chrome.driver",TestData.CHROMEDRIVER_EXE);// chromedriver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
	
	public Assignment1 Ass1(){
		return new Assignment1();
	}
	
	public Assignment2 Ass2(){
		return new Assignment2(driver);
	}
	
	public Assignment3 Ass3(){
		return new Assignment3(driver);
	}
	
	
}
