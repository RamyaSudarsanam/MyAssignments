package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter UN and P/W. ID Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click Contacts Tab
		driver.findElement(By.partialLinkText("Contacts")).click();
		//Click Create Contact
		driver.findElement(By.partialLinkText("Create Contact")).click();
		//Type First and Last name
		driver.findElement(By.id("firstNameField")).sendKeys("Ramya");
		driver.findElement(By.id("lastNameField")).sendKeys("Sudarsanam");
		//Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		//Print the First Name
		System.out.println("Ramya");
		//Print Browser title
		String title = driver.getTitle();
		System.out.println(title);

	}

}
