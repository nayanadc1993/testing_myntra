package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bounce/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		try {

			driver.get("http://www.myntra.com");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[text()='Profile']")).click();
			driver.findElement(By.xpath("//*[contains(@href, 'login?referer')]")).click();

//			driver.close();

		} catch (Exception ex) {
			System.out.print(ex.toString());
			driver.close();
		}
	}

}
