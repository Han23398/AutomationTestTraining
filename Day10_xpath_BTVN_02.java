package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.testng.annotations.AfterTest;

public class Day10_xpath_BTVN_02 {
	WebDriver driver;
  @Test
  public void test1() {
	  driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	  
	  try {
			Thread.sleep(4000);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  
	  WebElement rdoMale = driver.findElement(By.xpath("//input[@value='Male' and @name='gender']"));
	  rdoMale.click();
	  
	  WebElement rdoFemale = driver.findElement(By.xpath("//input[@value='Female' and @name='gender']"));
	  rdoFemale.click();
	  
	  WebElement rdoAgeGroup = driver.findElement(By.xpath("//input[@value='0 - 5' or @value='5 - 15' or @value='15 - 50']"));
	  rdoAgeGroup.click();
	  
	  WebElement btnGetValue = driver.findElement(By.xpath("//button[@onclick='getValues();']"));
	  btnGetValue.click();
	  
	  try {
			Thread.sleep(4000);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	  driver.manage().window().maximize();
	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
  }

  @AfterTest
  public void afterTest() {
  }

}
