package Bsictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GHJJ {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\DELL\\Documents\\SIVA.reume1.docx");
		

	}

}
