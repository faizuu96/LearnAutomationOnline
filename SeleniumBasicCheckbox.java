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
	
	WebElement basicCheck = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"));
	basicCheck.click();
	
	WebElement notificationCheck = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]"));
	notificationCheck.click();
	
	WebElement chooseCheck = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]"));
	chooseCheck.click();
	
	WebElement tri = driver.findElement(By.id("j_idt87:ajaxTriState"));
	tri.click();
	
	WebElement toggle = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
	toggle.click();
	
	WebElement checkDisable = driver.findElement(By.id("j_idt87:j_idt102_input"));
	boolean enabled = checkDisable.isEnabled();
	System.out.println("Is Enable: "+enabled);
	
	WebElement multiCheckbox = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']"));
	multiCheckbox.click();
	WebElement optionOne = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[10]"));
	optionOne.click();
	WebElement optionTwo = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[11]"));
	optionTwo.click();
	WebElement close = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']"));
	close.click();

	driver.quit();
}
	
}
