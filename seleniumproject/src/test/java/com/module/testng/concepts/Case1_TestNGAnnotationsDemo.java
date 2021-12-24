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

public class Case1_TestNGAnnotationsDemo {
	
  @Test
  public void Test1() {
	  System.out.println("This is the test case");
  }
  
  @Test
  public void Test2() {
	  System.out.println("This is the test case");
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

  @BeforeTest
  public void beforeTest() {
	  System.out.println("open database connection");

  }

 

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This will execute before the Test Suite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This will execute after the Test Suite");

  }
  @AfterTest
  public void afterTest() {
	  System.out.println("This will execute after the Test");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute before every Test Method");

  }

}
