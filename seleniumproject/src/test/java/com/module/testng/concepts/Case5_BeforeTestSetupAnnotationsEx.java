package com.module.testng.concepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Case5_BeforeTestSetupAnnotationsEx {
  
@Test // test case
  public void verifyLogin() {
	  System.out.println("This is the test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute before every Test Method");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after every Test Method");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This will execute before the Class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This will execute after the Class");

  }

  @BeforeTest //or BeforeSuite used for certain pre-conditions
  public void beforeTest() {
	  System.out.println("Open Database connection");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close Database connection");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("To generate certain test data-restassured calls");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("finally close or kill any open connections");

  }

}
