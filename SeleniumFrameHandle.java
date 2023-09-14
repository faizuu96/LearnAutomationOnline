package learnAutomationOnline;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrameHandle {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		WebElement clickMe = driver.findElement(By.id("Click"));
		String beforeClick = clickMe.getText();
		clickMe.click();
		String afterClick = clickMe.getText();
		System.out.println(beforeClick + "\n" + afterClick);

		driver.switchTo().defaultContent();

		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		int frameCount = frame.size();
		System.out.println("Number of frames on the page: " + frameCount);

		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement clickMeInside = driver.findElement(By.id("Click"));
		clickMeInside.click();
		String text1 = clickMeInside.getText();
		System.out.println(text1);

		driver.quit();
	}
}
