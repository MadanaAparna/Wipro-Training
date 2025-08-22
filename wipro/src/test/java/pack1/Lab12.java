package pack1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab12 {
public static void main(String[] args) throws IOException {
	 Properties prob=new Properties();
	  FileInputStream fis=new FileInputStream("D:\\PROGRAMS\\wipro\\Lab12.properties");
	  prob.load(fis);
	  String url=prob.getProperty("url");
	  String email=prob.getProperty("email");
	  String password=prob.getProperty("password");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
}
}