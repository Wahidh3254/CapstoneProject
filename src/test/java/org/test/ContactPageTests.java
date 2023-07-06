package org.test;

import org.automationPandaPages.ContactPage;
import org.automationPandaPages.HomePage;
import org.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactPageTests extends BaseClass {
    
	@Test
    public void verifyAutomationPandaContactPage() {
        
        Assert.assertEquals(driver.getTitle(), "Want to practice test automation? Try these demo sites! | Automation Panda");
        
        HomePage homePage=new HomePage(driver);
        homePage.getContactTab().click();
        
        Assert.assertEquals(driver.getTitle(), "Contact | Automation Panda");
        
        ContactPage contactPage = new ContactPage(driver);
        contactPage.getNameInput().sendKeys("Test Name");
        contactPage.getEmailInput().sendKeys("test@example.com");
        contactPage.getMessageInput().sendKeys("This is a test comment");
        contactPage.getSubmitButton().click();
        
        Assert.assertEquals("Your message has been sent", contactPage.getMessageSentLabel().getText());
    }
}