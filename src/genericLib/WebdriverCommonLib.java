package genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class WebdriverCommonLib {
	
	public String getPageTitle() {
		String pageTitle=BaseTest.driver.getTitle();
		return pageTitle;
		
	}
	public void verfiy(String actual, String excepted, String page) {
		Assert.assertEquals(actual, excepted);
		Reporter.log(page+" is Displayed, PASS", true);
		
	}
	public void selectOption(WebElement eleAdd, String value) {
		Select sel= new Select(eleAdd);
		sel.selectByValue(value);
	}
	
	public void selectOption(WebElement eleAdd, int index) {
		Select sel= new Select(eleAdd);
		sel.selectByIndex(index);;
	}
	
	public void selectOption(String text, WebElement eleAdd) {
		Select sel= new Select(eleAdd);
		sel.selectByValue(text);
	}
	
	public void mouseHover(WebElement eleAdd) {
		Actions ac = new Actions(BaseTest.driver);
		ac.moveToElement(eleAdd).perform();
		
	}
	public void rightClick(WebElement eleAdd) {
		Actions ac = new Actions(BaseTest.driver);
		ac.contextClick(eleAdd).perform();
	}
	
	public void actionsClass() {
		Actions ac = new Actions(BaseTest.driver);
	}
}





























