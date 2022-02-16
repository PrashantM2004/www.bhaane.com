package bhaane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BhaaneWeb {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();	
		wd.get("https://www.bhaane.com");
	
		wd.findElement(By.xpath("//body/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		wd.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/header[1]/div[1]/div[1]/div[4]/ul[1]/li[2]")).click();
		
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/div[4]/div[1]")).click();
		
		wd.findElement(By.name("first_name")).sendKeys("Ram");
		wd.findElement(By.name("last_name")).sendKeys("mane");
		wd.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("ram123@gmail.com");
		wd.findElement(By.name("mobile")).sendKeys("8888888888");
		wd.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[1]/div[5]/div[1]/input[1]")).sendKeys("Ram123@");
		
		wd.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[2]/button[1]")).click();
		 
		wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/form[1]/div[2]/div[1]")).click();
		
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("ram123@gmail.com");
		wd.findElement(By.xpath("//body/div[@id='modal-login']/div[1]/form[1]/div[2]/input[1]")).sendKeys("Ram123@");
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();
		
		
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/header[1]/div[1]/div[1]/div[4]/ul[1]/li[2]")).click();
		wd.findElement(By.xpath("//a[contains(text(),'log out')]")).click();
		
		wd.close();


	}

}
