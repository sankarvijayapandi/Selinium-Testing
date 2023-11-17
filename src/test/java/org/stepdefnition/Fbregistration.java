package org.stepdefnition;
import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.inm.BaseClass;
import org.openqa.selenium.WebElement;
import org.sam.SingINPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbregistration extends BaseClass {
	
SingINPojo s;
@Given("To launch the browser and maximize the window")
public void to_launch_the_browser_and_maximize_the_window() {
    launchBrowser();
    WindowMaximize();
}

@When("To launch url of fb application")
public void to_launch_url_of_fb_application() {
   launchUrl("https://en-gb.facebook.com/");
}

@When("To click the create new account button")
public void to_click_the_create_new_account_button() {
	s = new SingINPojo();
	clickBtn(s.getCreateNewacc());
    
}

@When("To pass firstname in firstname text box")
public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
	Thread.sleep(3000);
	Map<String, String> m = d.asMap(String.class, String.class);
	s = new SingINPojo();
	passText(m.get("firstname"), s.getFirstNameTextbox());
}




@When("To pass secondname in secondname text box")
public void to_pass_secondname_in_secondname_text_box() {
	s = new SingINPojo();
	passText("sankar",s.getSecondNameTextbox());
}

@When("To pass mobileno or email in email text box")
public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
	List<Map<String,String>> m = d.asMaps(getClass(), getClass());	
	s = new SingINPojo();
	passText(m.get(1).get("password"), s.getMobileorEmailTextbox());
}

@When("To create new password using newpassword textbox")
public void to_create_new_password_using_newpassword_textbox() {
	s = new SingINPojo();
	passText("sankarv", s.getNewpassword());
}


	


@Then("To close the chrome browser")
public void to_close_the_chrome_browser() {
   //closeEntireBrowser();
}



}
