package mavenproject_day06;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG1 {
//	suite
//	test
//	class
//	method
//	test
	
//	Trong khoa nay hoc
//	BeforeTest  AfterTest
//	BeforeMethod AfterMethod
//	Test
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	@Test(priority = 1)
	public void Testcase1() {
		System.out.println("Test f1 class");
	}
	@Test(priority = 4)
	public void Testcase2() {
		System.out.println("Test f2 class");
	}
	@Test(priority = 2, dependsOnMethods = "Testcase1")
	public void Testcase3() {
		System.out.println("Test f3 class");
	}
	@Test(priority = 3)
	@Ignore
	public void Testcase4() {
		System.out.println("Test f4 class");
	}
	@AfterMethod
	public void afterMethod() {
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

}
