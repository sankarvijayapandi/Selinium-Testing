package org.stepdefnition;

import org.inm.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends BaseClass {
	
	@Before
	//precondition
	private void precondition() {
		launchBrowser();
		WindowMaximize();
		

	}
	
	@After
	//postcondition
	private void postcondition() {
		closeEntireBrowser();

	}

}
