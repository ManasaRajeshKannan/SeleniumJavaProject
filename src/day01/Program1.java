package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Register.html");	
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("selenium");
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("test");
		 driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Bangalore");
		 driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("test@testing.com");
		 
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		 
		 driver.findElement(By.xpath("//input[@value='Male']")).click();
		 
		 
		}
	}
	


