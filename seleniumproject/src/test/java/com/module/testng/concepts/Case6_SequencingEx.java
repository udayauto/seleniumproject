package com.module.testng.concepts;
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


	@Test(priority = 0)
	public void Hyderabad() {

		System.out.println("Test case 1");
	//	Assert.fail("Hyderabd fail");
	}

	@Test(priority = 1, dependsOnMethods="Hyderabad")
	public void Pune() {

		System.out.println("Test case 2");
	}

	@Test(priority = 2)
	public void Chennai() {

		System.out.println("Test case 3");
	}

	@Test(priority = 3)
	public void Delhi() {

		System.out.println("Test case 4");
	}

	@Test(enabled=false)
	public void Banglore() {

		System.out.println("Test case 5");
	}
}
