package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnFacebookAccount {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		//Launch URL
		driver.get("https://en-gb.facebook.com/");
		//Max window
		driver.manage().window().maximize();
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on Create New Account Button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//Enter the first and last name
		driver.findElement(By.name("firstname")).sendKeys("Ramya");
		driver.findElement(By.name("lastname")).sendKeys("Sudarsanam");
		//Enter mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9003847041");
		//Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Chikki@2108");
		//Find the Element returns
		WebElement option = driver.findElement(By.id("day"));
		//Create object for class
		Select obj=new Select(option);
		//select method
		obj.selectByIndex(14);
		//Find the Element returns and create obj and Select Method
		WebElement option1 = driver.findElement(By.id("month"));
		Select obj1=new Select(option1);
		obj1.selectByIndex(0);
		//Find the Element returns and create obj and Select Method
				WebElement option2 = driver.findElement(By.id("year"));
				Select obj2=new Select(option2);
				obj2.selectByIndex(30);
		//Select Radio button
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
	}
}
