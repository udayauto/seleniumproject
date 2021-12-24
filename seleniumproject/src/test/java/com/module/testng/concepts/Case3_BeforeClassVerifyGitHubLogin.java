package com.module.testng.concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Case3_BeforeClassVerifyGitHubLogin {

	//Before/ After Class --Annotation
	
	
@BeforeClass
public void openBrowser() {
	  
	  System.out.println();
	  
}

  @Test(groups="loginSmoke")
  public void verifyGitLogin() {
	  
	  
	  
  }
  
  
	
@AfterClass
public void closeBrowser() {
	  
	  
	  
}
}
