package inheritanceex;
import org.testng.annotations.Test;
public class GoogleSearch extends BaseTest {
	
	String expectedTitle = "Google Inc";
	
	public void startBrowser() {

		System.out.println("Open child Browser");

	}
	
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public void add(int a, float b)
	{
		float c = a+b;
		System.out.println(c);
	}
	
	public void add(int a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	
@Test	
public void verifyGoogleSearch() {
	System.out.println(super.expectedTitle);
	
	this.startBrowser();
	//closeBrowser();
	
	add(10, 20);
	add(10, 20.30f);
	add(10, 20.89);
	
	
}
}
