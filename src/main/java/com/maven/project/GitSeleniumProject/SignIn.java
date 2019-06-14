package com.maven.project.GitSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class SignIn 
{
	
		WebDriver driver;
		public SignIn(WebDriver driver2){
			driver = driver2;
		}
		public void signinmethod(){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
			signin.click();
			/*WebElement login = driver.findElement(By.id("email"));
			login.sendKeys("prachi.kulkarni11@gmail.com");
			WebElement passwd = driver.findElement(By.id("passwd"));
			passwd.sendKeys("p@123");
			WebElement submit = driver.findElement(By.id("SubmitLogin"));
			submit.click();	*/
			
		}
}
