package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the screen
		driver.manage().window().maximize();
		//Enter UN and P/W. ID Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on Leads Link
		driver.findElement(By.linkText("Leads")).click();
		//Click on Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click Phone Link Tab
		driver.findElement(By.xpath("(//span[text()='Phone'])[1]")).click();
		//Enter Phone Number
		driver.findElement(By.name("phoneNumber")).sendKeys("9003847041");
		//click find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		//Click first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//Click delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10039");
		//Click Find Lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

}
