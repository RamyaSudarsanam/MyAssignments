package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLeads {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the screen
		driver.manage().window().maximize();
		Thread.sleep(3000);
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
		//Enter First Name
		driver.findElement(By.id("ext-gen248")).sendKeys("Ramya");
		//Click Find Leads Button
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on first Resulting lead
		driver.findElement(By.xpath("//a[contains(@href,'partyId=10195')]")).click();
		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//Change the Company Name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Tech Squeeze");
		//Click on update
		driver.findElement(By.name("submitButton")).click();	
		//Close the Browser
		driver.close();
	}

}
