package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontext {
	ChromeDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test() {
	String buttontext	=driver.findElement(By.xpath("//*[@id='Register']")).getAttribute("value");
	System.out.println(buttontext);
	if(buttontext.equals("Create my account >>"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
		
		
	}

}
