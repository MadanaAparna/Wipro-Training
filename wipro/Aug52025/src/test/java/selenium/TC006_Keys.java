package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_Keys {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
							WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.automationpractice.pl/index.php");
				String Title =driver.getTitle();
				System.out.println("Page Ttile:"+Title);
				if(Title.equals("My shop"))
				{
					System.out.println("Title verified");
				}
				else
				{
					System.out.println("Title verification failed");
					
				}
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
				if(driver.findElement(By.id("email_create")).isDisplayed()){
					System.out.println("Email create is displayed");
					driver.findElement(By.id("email_create")).clear();
					driver.findElement(By.id("email_create")).sendKeys("suppu@gmail.com");
					driver.findElement(By.id("email_create")).sendKeys(Keys.TAB);
					driver.findElement(By.id("email_create")).sendKeys(Keys.ENTER);
				}
				else {
					System.out.println("Email create is not displayed");
				}
				WebElement Heading = driver.findElement(By.className("page-heading"));
				if(Heading.isDisplayed()) {
					System.out.println(" heading is displayed ");
						
					}else {
						System.out.println(" heading is not found");
				}

				Thread.sleep(3000);
				driver.findElement(By.id("id_gender1")).click();
				if(	driver.findElement(By.id("id_gender1")).isSelected())
				{
					System.out.println("gender1 is selected");
				}
				else
				{
					System.out.println("gender1 is not selected");
				}
				}
		}

