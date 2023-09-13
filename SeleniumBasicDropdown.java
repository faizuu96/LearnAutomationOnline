package learnAutomationOnline;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasicDropdown {

	public static void main(String[] arg) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"F:\\Backups\\eclipse-workspace\\Selenium_Office\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node011rio0u7m25ezf4muieryajsh181159.node0");
		driver.manage().window().maximize();
		
		WebElement uiTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		uiTool.click();
		
		WebElement selectUitool = driver.findElement(By.xpath("//option[text()='Playwright']"));
		selectUitool.click();
		
		WebElement country = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]"));
		country.click();
		
		WebElement selectCountry = driver.findElement(By.xpath("//li[text()='Brazil']"));
		selectCountry.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]")).click();
		driver.findElement(By.xpath("//li[text()='Rio de Janerio']")).click();

		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Appium']")).click();

		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
		driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();

		driver.quit();

	}
}
