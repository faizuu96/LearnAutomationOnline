package learnAutomationOnline;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumBasicButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Backups\\eclipse-workspace\\Selenium_Office\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01pdo398jj3aqfsi7uykv53epv167609.node0");
		String printUrl = driver.getCurrentUrl();
		System.out.println("Print Current URL is: " + printUrl);
		String Title = driver.getTitle();
		System.out.println("The titile is : " + Title);

		WebElement click = driver.findElement(By.xpath("//span[text()='Click']"));
		String title = click.getText();
		System.out.println(title);

		WebElement is = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		boolean txt = is.isEnabled();
		System.out.println(txt);

		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
		Point loc = position.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x);
		System.out.println(y);

		WebElement colour = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
		String cssValue = colour.getCssValue("color");
		System.out.println(cssValue);

		WebElement wh = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']"));
		int height = wh.getSize().getHeight();
		int width = wh.getSize().getWidth();
		System.out.println("height is " + height);
		System.out.println("width is " + width);

		WebElement mous = driver.findElement(By.id("j_idt88:j_idt100"));
		Actions action = new Actions(driver);
		action.moveToElement(mous).perform();
		
		String cssValue2 = mous.getCssValue("color");
		if (!cssValue2.equals("initial")) {
			System.out.println("Mouseover successful colour changed " + cssValue2);
		} else
			System.out.println("Mouseover failed colour not chnaged");

		WebElement img = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		img.click();

		WebElement hidden = driver.findElement(By.id("j_idt88:j_idt102:j_idt104"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById(\'j_idt88:j_idt102:j_idt104\').click();", hidden);

		List<WebElement> round = driver.findElements(By.cssSelector("body .ui-button.rounded-button"));
		int rounded = round.size();
        System.out.println("The rounded btn is :" + rounded);
        
        //driver.quit();
		
	}
}
