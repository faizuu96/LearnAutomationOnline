package learnAutomationOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCheckbox {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "F:\\Backups\\eclipse-workspace\\Selenium_Office\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/checkbox.xhtml");
	driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
	WebElement tri = driver.findElement(By.id("j_idt87:ajaxTriState"));
	tri.click();
	driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	
	WebElement dis = driver.findElement(By.id("j_idt87:j_idt102"));
	boolean txt = dis.isEnabled();
	System.out.println("check box is " +txt);
	
	WebElement multiCheckbox = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']"));
	multiCheckbox.click();
	driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[10]")).click();
	driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[11]")).click();

	//driver.quit();
}
	
}
