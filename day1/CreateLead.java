package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

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
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company Name Field
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Enter First Name Field
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		//Enter Last Name Field
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sudarsanam");
		//Enter First Name(Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ramya S");
		//Enter Department Field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		//Enter Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Allocate");
		//Enter your Email ID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramyareddy2603@gmail.com");
		//Click Create Button
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
