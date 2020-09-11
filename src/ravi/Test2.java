package ravi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='BUY NOW']")).click();
		Thread.sleep(2000);
		driver.findElementByName("q").sendKeys("oppo a9 2020",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@data-id='MOBFKCS5D7SUGZG5']").click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"button\"]/span::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@name='address'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Deliver Here']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("error@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='CONTINUE']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
