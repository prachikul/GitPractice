package com.maven.project.GitSeleniumProject;

import org.testng.annotations.Test;

import com.maven.project.GitSeleniumProject.SignIn;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class GitTest {
	WebDriver driver;

	@Test
	public void f() {
		SignIn signin = new SignIn(driver);
		signin.signinmethod();

	}

	@Parameters("myBrowser")
	@BeforeTest
	public void beforeTest(String browservalue) {
		String browser = browservalue;
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			throw new RuntimeException("Browser not found");

		}
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
