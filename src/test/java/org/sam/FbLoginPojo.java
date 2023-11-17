package org.sam;

import org.inm.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
	
//1 Non Parameterized Constructor
	public FbLoginPojo() {
	PageFactory.initElements(driver, this);
		
	}
	
// 2 To Find Private WebElements
//WebElement email = driver.find Element(By.id("email"));	
  
	@CacheLookup
	@FindBy(id="email")	
	private WebElement  email;	

@FindBy(xpath="//input[@aria-label='Password']")
   private WebElement password;
  
  @FindBy(name="login")
    private WebElement login;
  
  //3 Getters to access WebElements outside the class 

  public WebElement getemail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
}
  
 

