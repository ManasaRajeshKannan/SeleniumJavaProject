package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) {
		 WebDriver driver;	
		 
		 driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Register.html");	
		 
		 Select dropdownSkill = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		 dropdownSkill.selectByIndex(4);
		 
		 
		 Select dropdownYear = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		 dropdownYear.selectByValue("1991");
		 
		 
		 Select dropdownMonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		 dropdownMonth.selectByVisibleText("April");
		 
	}

}