package com.FBAuto.PageLayer.CommanMenuPage;

import java.util.concurrent.TimeUnit;

import com.FBAuto.BaseClass.BaseClass;
import com.FBAuto.PageLayer.AddConent.AddContentActions;

public class CommonMenuActions extends BaseClass {
	
	CommonMenuElements cme;
	
	public CommonMenuActions()
	{
		cme = new CommonMenuElements();
		
	}
	
	public boolean isUsernameDivVisible()
	{
		
	return cme.getUsernNameDiv().isDisplayed();
		
	}
	
	public Object ClickonAddContentButton()
	{
		cme.getAddContentButton().click();
		
		return new AddContentActions();
	}

}
