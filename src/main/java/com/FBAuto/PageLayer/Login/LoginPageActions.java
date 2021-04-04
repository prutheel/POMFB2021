package com.FBAuto.PageLayer.Login;

import com.FBAuto.BaseClass.BaseClass;
import com.FBAuto.PageLayer.CommanMenuPage.CommonMenuActions;

public class LoginPageActions extends BaseClass {
	LoginPageElements lpe;
	
	public LoginPageActions()
	{
		lpe = new LoginPageElements();
	}

	public Object performLogin(String username,String password)
	{
		lpe.getUserNameInput().clear();
		lpe.getUserNameInput().sendKeys(username);
		lpe.getPasswordInput().clear();
		lpe.getPasswordInput().sendKeys(password);
		lpe.getLoginButton().click();
		
		if(driver.getCurrentUrl().contains("/LogOn.aspx"))
			return lpe.getLoginFailureDiv().getText();
		else
			return new CommonMenuActions();
	}
	
}
