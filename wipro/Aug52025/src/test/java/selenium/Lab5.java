package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.openkart.com/");
		String title = driver.getTitle();
		if (title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			 System.out.println("Title is matched");
		}
		else {
			System.out.println("Title is not matched");
		}
		driver.navigate().to("https://www.yahoo.com/");
		System.out.println("url is:" +driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("url is:" +driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("url is:" + driver.getCurrentUrl());
		System.out.println("Page source is:" + driver.getPageSource());
	}

}
