package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganisationsTest {
	@Test
	public void CreateContactsTest() 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
		
	}
}
