package org.test.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sasikumar\\git\\TestProject\\TestProject\\Drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jcpenney.com/");
	driver.findElement(By.xpath("(//div[@class='SecondaryNavigationPanel-menuItemLink'])[1]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Breakfast in Bed']")).click();
	Thread.sleep(3000);
	driver.quit();
	
}

}
