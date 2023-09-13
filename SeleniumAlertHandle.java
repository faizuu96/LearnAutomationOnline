package learnAutomationOnline;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlertHandle {
	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.manage().window().maximize();

		// SimpleAlert Using ALert
		WebElement simpleAlert = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
		simpleAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// ConformAlert Using ALert
		WebElement conformAlert = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
		conformAlert.click();
		alert.dismiss();

		// SweetDialogBox Using WebElement Only
		WebElement sweetAlert = driver.findElement(By.xpath("(//span[text()='Show'])[3]"));
		sweetAlert.click();
		WebElement dialogBox = driver.findElement(By.id("j_idt88:j_idt96_content"));
		String text1 = dialogBox.getText();
		System.out.println(text1);
		WebElement dismiss = driver.findElement(By.xpath("//span[text()='Dismiss']"));
		dismiss.click();

		// SweetModal Using WebElements Only
		WebElement sweetModal = driver.findElement(By.xpath("(//span[text()='Show'])[4]"));
		sweetModal.click();
		WebElement sweettext = driver.findElement(By.id("j_idt88:j_idt101_content"));
		String text2 = sweettext.getText();
		System.out.println(text2);
		WebElement close = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]"));
		close.click();

		// AlertPrompt Using Alert Class
		WebElement alertPrompt = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		alertPrompt.click();
		String text3 = alert.getText();
		alert.sendKeys("mdsthing1996");
		alert.accept();
		System.out.println(text3);
		
		WebElement sweetAlertConfirm = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]"));
		sweetAlertConfirm.click();
		WebElement answer = driver.findElement(By.xpath("//span[text()='No']"));
		answer.click();
		
		
		//MinMaxBox Using WebElement
		WebElement minMax = driver.findElement(By.xpath("(//span[text()='Show'])[6]"));
		minMax.click();
		WebElement gettext = driver.findElement(By.id("j_idt88:j_idt112_content"));
		String text4 = gettext.getText();
		System.out.println(text4);	
		
		WebElement max = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']"));
		max.click();
		int hightmax = max.getSize().getHeight();
		int widthmax = max.getSize().getWidth();
		WebElement minBack = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-newwin']"));
		minBack.click();
		int hightmin = minBack.getSize().getHeight();
		int widthmin = minBack.getSize().getWidth();
		WebElement closeMin = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]"));
		closeMin.click();
		
		System.out.println("Max Size: "+ hightmax+ " "+widthmax+"\n"+"Min Size: "+hightmin+" "+widthmin);
  
		
		driver.quit();

	}

}
