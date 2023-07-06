package org.automationPandaPages;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }
	
    @FindBy(xpath = "//a[text()='Contact']")
    private WebElement contactTab;

	public WebElement getContactTab() {
		return contactTab;
	}
    
}
