package com.FBAuto.PageLayer.Login;

import com.FBAuto.BaseClass.BaseClass;
import com.FBAuto.PageLayer.CommanMenuPage.CommonMenuActions;

public class LoginPageActions extends BaseClass {
	LoginPageElements lpe;
	
	public LoginPageActions()
	{
		lpe = new LoginPageElements();
	}
	
//	public void enterUsername(String username)
//	{
//		lpe.getUserNameInput().clear();
//		lpe.getUserNameInput().sendKeys(username);
//	}
//	
//	public void enterPassowrd(String password)
//	{
//		lpe.getPasswordInput().clear();
//		lpe.getPasswordInput().sendKeys(password);
//	}
//	
//	public void clickLoginButton() {
//		lpe.getLoginButton().click();
//	}
//	
	
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
