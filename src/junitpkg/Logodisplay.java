package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logodisplay {

	ChromeDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test() {
		boolean logo = driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		if (logo) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo is not displayed");
		}
	}

	@Test
	public void buttonenable()
	{
	
		Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).isEnabled();
		
		if (b) {
			System.out.println("button is enabled");
		} else {
			System.out.println("button is disabled");
		}
		
		
	}
	
	
}
