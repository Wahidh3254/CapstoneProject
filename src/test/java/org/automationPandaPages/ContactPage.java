package org.automationPandaPages;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ContactPage extends BaseClass {

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
	}

	@FindBy(id = "g3-name")
	private WebElement nameInput;

	@FindBy(id = "g3-email")
	private WebElement emailInput;

	@FindBy(id = "contact-form-comment-g3-message")
	private WebElement messageInput;

	@FindBy(xpath = "//button[@class='wp-block-button__link has-text-color has-black-color']")
	private WebElement submitButton;

	@FindBy(id = "contact-form-success-header")
	private WebElement messageSentLabel;

	public WebElement getNameInput() {
		return nameInput;
	}

	public WebElement getEmailInput() {
		return emailInput;
	}

	public WebElement getMessageInput() {
		return messageInput;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getMessageSentLabel() {
		return messageSentLabel;
	}
	
}