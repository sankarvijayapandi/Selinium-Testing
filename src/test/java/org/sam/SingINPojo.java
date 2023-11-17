package org.sam;

import org.inm.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingINPojo extends BaseClass{
	public SingINPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewacc;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement firstNameTextbox;
	
	@FindBy(name="lastname")
	private WebElement secondNameTextbox;
	
	@FindBy(name="reg_email__")
	private WebElement mobileorEmailTextbox;
	
	@FindBy(name="reg_passwd__")
	private WebElement newpassword;

	public WebElement getCreateNewacc() {
		return createNewacc;
	}

	public WebElement getFirstNameTextbox() {
		return firstNameTextbox;
	}

	public WebElement getSecondNameTextbox() {
		return secondNameTextbox;
	}

	public WebElement getMobileorEmailTextbox() {
		return mobileorEmailTextbox;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}
}
