package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By .id("username"));
		userName.sendKeys("DemoCSR");
		driver.findElement(By.id("password")) . sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")). sendKeys("Archana");
		driver.findElement(By.id("createLeadForm_lastName")) . sendKeys("Ethirajulu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")). sendKeys("Suja");
		driver.findElement(By.id("createLeadForm_departmentName")). sendKeys("Service");
		driver.findElement(By.id("createLeadForm_description")). sendKeys("Learning selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")). sendKeys("testing123@gmail.com");
		
		//driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")). sendKeys("");
		WebElement st = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select (st);
		dd. selectByVisibleText("New York");


		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The title is " +driver.getTitle());
	}

}
