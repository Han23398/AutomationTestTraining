package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Day10_xpath_BTVN_01 {
	WebDriver driver;
  @Test
  public void Test1() {
	  WebElement txtHovaTen = driver.findElement(By.xpath("//input[@id='txtFirstname']"));
	  txtHovaTen.clear();
	  txtHovaTen.sendKeys("Le Ngoc Han");
	  
	  WebElement txtEmail = driver.findElement(By.xpath("//input[@id='txtEmail']"));
	  txtEmail.clear();
	  txtEmail.sendKeys("akarose148@gmail.com");
	  
	  WebElement txtNhapLaiEmail = driver.findElement(By.xpath("//input[@id='txtCEmail']"));
	  txtNhapLaiEmail.clear();
	  txtNhapLaiEmail.sendKeys("akarose148@gmail.com");
	  
	  WebElement txtPass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	  txtPass.clear();
	  txtPass.sendKeys("123456");
	  
	  WebElement txtNhapLaiPass = driver.findElement(By.xpath("//input[@id='txtCPassword']"));
	  txtNhapLaiPass.clear();
	  txtNhapLaiPass.sendKeys("123456");
	  
	  WebElement txtPhone = driver.findElement(By.xpath("//input[@id='txtPhone']"));
	  txtPhone.clear();
	  txtPhone.sendKeys("0956871235");
	  
	  
	  WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
	  btnSubmit.click();
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
  }
  
  @Test
  public void Test2() {
	  
	  driver.get("https://alada.vn/thong-tin-ca-nhan");
	  WebElement txtHo = driver.findElement(By.xpath("//input[@id='member_lastname']"));
	  txtHo.clear();
	  txtHo.sendKeys("Nguyen");
	  
	  WebElement txtTen = driver.findElement(By.xpath("//input[@id='member_firstname']"));
	  txtTen.clear();
	  txtTen.sendKeys("Lan Anh");
	  
	  WebElement checkGioiTinh = driver.findElement(By.xpath("//input[@name='member_gender[]' and @value='0']"));
	  checkGioiTinh.click();
	  
	  WebElement dropdownTinhTP = driver.findElement(By.xpath("//select[@name='txtCity']//option[@value='64']"));
	  dropdownTinhTP.click();
	  
	  WebElement dateNgaySinh = driver.findElement(By.xpath("//input[@name='member_birthday']"));
	  dateNgaySinh.clear();
	  dateNgaySinh.sendKeys("05-10-2004");
	  
	  WebElement txtMobilePhone = driver.findElement(By.xpath("//input[@name='member_tel']"));
	  txtMobilePhone.clear();
	  txtMobilePhone.sendKeys("09679654321");
	  
	  WebElement txtAddress = driver.findElement(By.xpath("//input[@name='member_address']"));
	  txtAddress.clear();
	  txtAddress.sendKeys("57A KP3 Ba Ria Vung Tau");
	  
	  WebElement txtCompany = driver.findElement(By.xpath("//input[@name='member_company']"));
	  txtCompany.clear();
	  txtCompany.sendKeys("ABC");
	  
	  WebElement btnSaveInfo = driver.findElement(By.xpath("//button[normalize-space()='Lưu thông tin']"));
	  btnSaveInfo.click();
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://alada.vn/tai-khoan/dang-ky.html");
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
