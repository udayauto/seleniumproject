package com.module.testng.concepts;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Case6_SequencingEx {

	// Sequencing
	// -- Priority
	// dependency
	// enabled=true/ false

// -- Priority 
	// Default
	// The execution happens in alphabetical order of the way methods name are
	// defined. 
	// Set Priority to execute in your own way.


	@Test(priority=0)
	public void Login() {

		System.out.println("Test case 1: Login");
		
	//	Assert.fail("Hyderabd fail"); // force failure
	}

	@Test(priority=1, dependsOnMethods="Login")
	public void editProfile() {

		System.out.println("Test case 2: editProfile");
	}

	@Test(enabled=false)
	public void SubmitOrder() {

		System.out.println("Test case 3: SubmitOrder");
	}
	
	
	/*
	 * @Test(priority=2) public void Chennai() {
	 * 
	 * System.out.println("Test case 3: Chennai"); }
	 * 
	 * @Test(priority=3) public void Delhi() {
	 * 
	 * System.out.println("Test case 4: Delhi"); }
	 * 
	 * @Test(priority=4) public void Banglore() {
	 * 
	 * System.out.println("Test case 5 : Banglore"); }
	 * 
	 * @Test(priority=5) public void Alaska() {
	 * 
	 * System.out.println("Test case 6 : Alaska"); }
	 */
	
}
