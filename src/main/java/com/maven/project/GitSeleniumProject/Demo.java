package com.maven.project.GitSeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static WebDriver driver;
	public String frame;
	public static void main(String[] args) throws InterruptedException {
		//Demo refd = new Demo();
		//refd.launchBrowser();
		SignIn signin = new SignIn(driver);
		signin.signinmethod();
		//refd.signin();
		//refd.dress();
		//refd.quickview();
		//Registration refr = new Registration(driver);
		//refr.createaccount();
		//refr.registration();
	}
public void launchBrowser(){
		
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();		
	        driver.manage().window().maximize();
	        driver.get("http://automationpractice.com");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
	}
/*public void signin(){
	WebElement signin = driver.findElement(By.linkText("Sign in"));
	signin.click();
	WebElement login = driver.findElement(By.id("email"));
	login.sendKeys("prachi.kulkarni11@gmail.com");
	WebElement passwd = driver.findElement(By.id("passwd"));
	passwd.sendKeys("p@123");
	WebElement submit = driver.findElement(By.id("SubmitLogin"));
	submit.click();	
}*/

/*public void dress() throws InterruptedException{
	WebElement women = driver.findElement(By.xpath("//a[@title ='Women']"));
	women.click();
	WebElement selectdress = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	selectdress.click();	
	WebElement quickview = driver.findElement(By.xpath("//a[@class='quick-view']/span"));
	quickview.click();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(frame1);
	WebElement addtocart = driver.findElement(By.name("Submit"));
	addtocart.click();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	proceedtocheckout.click();
	WebElement proceedtocheckout1 = driver.findElement(By.xpath("//a[@class ='button btn btn-default standard-checkout button-medium']"));
	proceedtocheckout1.click();
	WebElement proceedtocheckout2 = driver.findElement(By.name("processAddress"));
	proceedtocheckout2.click();
	WebElement checkbox = driver.findElement(By.id("cgv"));
	checkbox.click();
	WebElement proceed = driver.findElement(By.name("processCarrier"));
	proceed.click();

}*/	
}
