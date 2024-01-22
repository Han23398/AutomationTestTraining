package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Day12_BTVN {
	WebDriver driver;
  @Test
  public void testState() {
	  WebElement optAlaska = driver.findElement(By.xpath("//select[@name='state']//option[3]"));
	  optAlaska.click();
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  WebElement checkHost = driver.findElement(By.xpath("//input[@name='hosting' and @value='yes']"));
	  checkHost.click();
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
