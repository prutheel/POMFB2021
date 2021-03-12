package com.FBAuto.PageLayer.CommanMenuPage;

import com.FBAuto.BaseClass.BaseClass;

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

}
