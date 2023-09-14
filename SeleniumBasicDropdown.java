package learnAutomationOnline;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicDropdown {

	public static void main(String[] arg) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node011rio0u7m25ezf4muieryajsh181159.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement uiTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		uiTool.click();
		WebElement selectUitool = driver.findElement(By.xpath("//option[text()='Playwright']"));
		selectUitool.click();
		
		WebElement country = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]"));
		country.click();
		WebElement selectCountry = driver.findElement(By.xpath("//li[text()='Brazil']"));
		selectCountry.click();
		
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]"));
		city.click();
		WebElement selectCity = driver.findElement(By.xpath("//li[text()='Rio de Janerio']"));
		selectCity.click();

		WebElement course = driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']"));
		course.click();
		//Thread.sleep(3000);
		WebElement selectCourse = driver.findElement(By.xpath("//li[text()='Appium']"));
		selectCourse.click();

		WebElement language = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]"));
		language.click();
		WebElement selectLanguage = driver.findElement(By.xpath("//li[text()='Tamil']"));
		selectLanguage.click();

		Thread.sleep(3000);

		WebElement languageOption = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]"));
		languageOption.click();
		WebElement selectLanguageOption = driver.findElement(By.xpath("//li[text()='இரண்டு']"));
		selectLanguageOption.click();

		driver.quit();

	}
}
