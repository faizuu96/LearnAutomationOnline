package learnAutomationOnline;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class SeleniumBasicTextBox {
	public static void main(String[] args) throws InterruptedException {

		

		/*WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01684aekl60pvz1kbfkvup7uw0s165597.node0");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Type Your Name
		WebElement typename = driver.findElement(By.id("j_idt88:name"));

		typename.sendKeys("Faizu");

		//Append Country to this City
		WebElement Appendcountry = driver.findElement(By.name("j_idt88:j_idt91"));

		Appendcountry.sendKeys(", India");
		
		//Verify if text box is disabled

		WebElement verifybox = driver.findElement(By.id("j_idt88:j_idt93"));

		boolean text = verifybox.isEnabled();

		System.out.println(text);
		
		//Clear the typed text.

		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']")).clear();
		
		//Retrieve the typed text
		WebElement getRetrive = driver.findElement(By.id("j_idt88:j_idt97"));
		String printText = getRetrive.getAttribute("value");
		System.out.println("The Typed Text is: "+printText);

		
		//Type email and Tab. Confirm control moved to next element
		WebElement usingtab = driver.findElement(By.name("j_idt88:j_idt99"));

		usingtab.sendKeys("mohamed@yahoo.com");

		usingtab.sendKeys(Keys.TAB);

		//Just Press Enter and confirm error message*
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys(Keys.ENTER);

		//Click and Confirm Label Position Changes
		WebElement elementposition = driver.findElement(By.id("j_idt106:float-input"));

		WebElement label = driver.findElement(By.xpath("(//label[@class='ui-outputlabel ui-widget'])[1]"));

		Point position = label.getLocation();

		Actions action = new Actions(driver);

		action.click(elementposition).perform();

		Point elepos = label.getLocation();

		if (!position.equals(elepos)) {
			System.out.println("Label position has changed");
		} else {
			System.out.println("Label position has not changed");
		}


		WebElement entername = driver.findElement(By.id("j_idt106:auto-complete_input"));
		entername.sendKeys("Faisal");

		driver.findElement(By.xpath(
				"//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']"))
				.click();

		WebElement dob = driver.findElement(By.id("j_idt106:j_idt116_input"));
		dob.sendKeys("08/25/1996");

		WebElement selectdate = driver.findElement(By.xpath("//a[text()='25']"));
		selectdate.click();

		WebElement enterspin = driver.findElement(By.name("j_idt106:j_idt118_input"));
		enterspin.sendKeys("75");

		WebElement changespin = driver.findElement(By.xpath("(//span[@class='ui-button-text'])[3]"));
		changespin.click();

		String numberValue = enterspin.getAttribute("value");
		System.out.println("New number value: " + numberValue);

		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;

		WebElement enterrandomnumbr = driver.findElement(By.id("j_idt106:slider"));
		enterrandomnumbr.sendKeys(Integer.toString(randomNumber));

		WebElement slider = driver.findElement(By.name("j_idt106:slider"));
		int sliderwidth = slider.getSize().getWidth();
		int sliderposition = (int) ((sliderwidth / 100.0) * randomNumber);
		System.out.println(sliderposition);

		String numberslidervalue = enterrandomnumbr.getAttribute("value");
		System.out.println("Entered number: " + numberslidervalue);

		WebElement inputfield = driver.findElement(By.name("j_idt106:j_idt122"));
		action.moveToElement(inputfield).click().build().perform();

		boolean keyboarddisplyed = inputfield.getAttribute("readonly") == null;
		System.out.println("Keyboard displayed: " + keyboarddisplyed);


		driver.quit();
*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement enterName = driver.findElement(By.name("j_idt88:name"));
		enterName.sendKeys("Mdsthings");
		WebElement enterCity = driver.findElement(By.id("j_idt88:j_idt91"));
		enterCity.sendKeys("Dubai, United Arab Emirtes");
		WebElement verifyDisable = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = verifyDisable.isEnabled();
		System.out.println("Verifed the text box is disable or not: "+enabled);
		WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
		clearText.clear();
		WebElement retriveText = driver.findElement(By.id("j_idt88:j_idt97"));
		String text1 = retriveText.getAttribute("value");
		System.out.println("Retrived  Typed Text is: "+text1);
		WebElement enterEmail = driver.findElement(By.id("j_idt88:j_idt99"));
		enterEmail.sendKeys("X_bjdfjd_45U@HXC.Bq");
		enterEmail.sendKeys(Keys.TAB);
		
		 /*enabled2 = WebElement conformMove = driver.findElement(By.xpath("//textarea[@class='ui-inputfield ui-inputtextarea ui-widget ui-state-default ui-corner-all ui-inputtextarea-resizable']"));
		booleanconformMove.isEnabled();
		System.out.println("About Me is Enable:"+enabled2);*/
		
		WebElement textEditor = driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"));
		textEditor.sendKeys("HelloWOrld");
		
		WebElement conformError = driver.findElement(By.id("j_idt106:thisform:age"));
		conformError.sendKeys(Keys.ENTER);

		WebElement lablechange = driver.findElement(By.id("j_idt106:float-input"));
		WebElement lable = driver.findElement(By.xpath("(//label[@class='ui-outputlabel ui-widget'])[1]"));
		Point getlocation = lable.getLocation();
		Actions action = new Actions(driver);
		action.click(lablechange).perform();
		Point getchangelocation = lable.getLocation();
		if (!getlocation.equals(getchangelocation)) {
			System.out.println("Location has been change: " + getchangelocation);
		} else {
			System.out.println("Location doesn't change: " + getlocation);
		}
		WebElement chooseOption = driver.findElement(By.id("j_idt106:auto-complete_input"));
		chooseOption.sendKeys("faisal");
		Thread.sleep(10000);
		action.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP).perform();
		action.sendKeys(Keys.ENTER).perform();
		WebElement dob = driver.findElement(By.id("j_idt106:j_idt116_input"));
		dob.sendKeys("08/25/1996");
		WebElement selectdate = driver.findElement(By.xpath("//a[text()='25']"));
		selectdate.click();
		
		WebElement enterSliderValue = driver.findElement(By.id("j_idt106:slider"));
		WebElement slider = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']"));
		Point beforeMove = slider.getLocation();
		enterSliderValue.sendKeys("55");
		Thread.sleep(10000);
		Point afterMover = slider.getLocation();
		if(!beforeMove.equals(afterMover)) {
			System.out.println("slider is moved");
		}else {
			System.out.println("slider is not moved");
		}
		WebElement conformKeyboard = driver.findElement(By.id("j_idt106:j_idt122"));
		action.click(conformKeyboard).build().perform();
		boolean enabled3 = conformKeyboard.isEnabled();
		System.out.println(enabled3);
	}

}
