package learnAutomationOnline;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowHandle {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01gkrvefe6ojdkiw6ark20tiz484105.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String windowHandle = driver.getWindowHandle();
		WebElement openOneWindow = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		openOneWindow.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String newWindow : windowHandles) {
			driver.switchTo().window(newWindow);
		}
		WebElement enterEmail = driver.findElement(By.id("email"));
		enterEmail.sendKeys("jalma@filt.tzr");
		driver.close();
		driver.switchTo().window(windowHandle);

		WebElement findNoWindow = driver.findElement(By.id("j_idt88:j_idt91"));
		findNoWindow.click();
		int size = driver.getWindowHandles().size();
		System.out.println("No Of Window Open: " + size);

		WebElement waitWindow = driver.findElement(By.id("j_idt88:j_idt95"));
		waitWindow.click();

		WebElement closeAllWinow = driver.findElement(By.id("j_idt88:j_idt93"));
		closeAllWinow.click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String newWindow2 : windowHandles2) {
			if (!newWindow2.equals(windowHandle)) {
				driver.switchTo().window(newWindow2);
				driver.close();
			}
		}

		driver.switchTo().window(windowHandle);
		driver.quit();

	}

}
