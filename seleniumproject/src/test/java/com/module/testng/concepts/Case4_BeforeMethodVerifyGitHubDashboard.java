package com.module.testng.concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case4_BeforeMethodVerifyGitHubDashboard {

	//App Git or HRM
	//Before/ After Method --Annotation
 	// multiple test cases or methods
	
	
@BeforeMethod
public void openBrowser() {
	  
	  System.out.println();
	  
}

  @Test
  public void verifyHRMLogin() {
	  
	  
	  
  }
  
  @Test
  public void verifyHRMDashboard() {
	  
	  
	  
  }
  
  
	
@AfterMethod
public void closeBrowser() {
	  
	  
	  
}
}
