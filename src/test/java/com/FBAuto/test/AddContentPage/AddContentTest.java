package com.FBAuto.test.AddContentPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FBAuto.BaseClass.BaseClass;
import com.FBAuto.PageLayer.AddConent.AddContentActions;
import com.FBAuto.PageLayer.CommanMenuPage.CommonMenuActions;
import com.FBAuto.PageLayer.Login.LoginPageActions;
import com.FBAuto.test.LoginPage.LoginPageTest;

public class AddContentTest extends BaseClass  {

	AddContentActions aca;
	LoginPageActions lpa;
	CommonMenuActions cma;
	
	public AddContentTest() {
		initialize();
		aca = new AddContentActions();
		lpa = new LoginPageActions();
	}

	@BeforeMethod()
	public void getLogin()
	{
		cma =(CommonMenuActions) lpa.performLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void createFile()
	{
		cma.ClickonAddContentButton();
		//aca.SelectProject("TEST Project Prutheel");
		try {
			aca.CreateNewFile("TEST Project Prutheel", "TEST SEL", "123", "04/15/2021", "Good");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
