package assignment.Weight.Watchers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.TestData;

public class Assignment2 {

	protected WebDriver driver = null;
	
	public Assignment2(WebDriver driver){
		this.driver= driver;
	}
	
	public void assigmentTwoA(){
		
		driver.get(TestData.food_Path);
		List<WebElement> food = driver.findElements(By.xpath("//span[@class='title ng-binding']"));
		for(int i=0;i<food.size();i++){
			if(i==2){
				System.out.println(food.get(i).getText());
			}else if( i==4){
				System.out.println(food.get(i).getText());
			}
		}
		driver.quit();
	}
	
	public void Assignment2b(){
		
		HashMap<String,String> foodName = new HashMap<String,String>();
		driver.get(TestData.food_Path);
		List<WebElement> food = driver.findElements(By.xpath("//span[@class='title ng-binding']"));
		List<WebElement> servings = driver.findElements(By.xpath("//span[@class='description ng-binding']"));
		for(int i=0;i<food.size();i++){
			foodName.put(food.get(i).getText(), servings.get(i).getText());
		}
		for ( Map.Entry<String, String> entry : foodName.entrySet()) {
		    
		    System.out.println(entry.getKey()+" "+entry.getValue());
		}
		driver.quit();
	
	}
}
