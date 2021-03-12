package com.FBAuto.test.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FBAuto.BaseClass.BaseClass;
import com.FBAuto.PageLayer.CommanMenuPage.CommonMenuActions;
import com.FBAuto.PageLayer.Login.LoginPageActions;

public class LoginPageTest extends BaseClass {

	LoginPageActions pla;
	CommonMenuActions cme;

	public LoginPageTest() {
		
		  initialize();
		  pla = new LoginPageActions();
		  cme = new CommonMenuActions();
		 
	}

	@BeforeMethod()
	public void setup() {

		/*
		 * initialize(); pla = new LoginPageActions(); cme = new CommonMenuActions();
		 */
	}

	@Test()
	public void CheckValidLogin() {

//		pla.enterUsername(prop.getProperty("usernmane"));
//		pla.enterPassowrd(prop.getProperty("password"));
//		pla.clickLoginButton();
		cme = (CommonMenuActions) pla.performLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(true, cme.isUsernameDivVisible());

	}

	@AfterMethod()
	public void tearDown() {
		driver.close();
	}

}
