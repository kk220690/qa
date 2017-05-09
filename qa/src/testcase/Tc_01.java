package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_01 
{
	@Test
	public void m1()
	{
		WebDriver d=new FirefoxDriver();
		d.get("http://www.facebook.com");
		d.findElement(By.id("email")).sendKeys("dckuhgjdc");
		d.findElement(By.id("pass")).sendKeys("jgjsdc");
		d.quit();
	}

}
