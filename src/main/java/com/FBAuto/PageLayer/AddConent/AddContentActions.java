package com.FBAuto.PageLayer.AddConent;

import org.openqa.selenium.Keys;

import com.FBAuto.BaseClass.BaseClass;

public class AddContentActions extends BaseClass {
	
	AddContentElements ace;
	
	public AddContentActions()
	{
		ace = new AddContentElements();
	}
	
	public void SelectProject(String projectname)
	{
		ace.getProjectDropdown().click();
		ace.getSearchInputBox().clear();
		ace.getSearchInputBox().sendKeys(projectname);
		ace.selectFilteredProject(projectname).click();
		
	}
	
	public void CreateNewFile(String prjName,String text,String number,String date,String option) throws InterruptedException
	{
		ace.getProjectDropdown().click();
		ace.getSearchInputBox().clear();
		ace.getSearchInputBox().sendKeys(prjName);
		ace.selectFilteredProject(prjName).click();;
		
		
		Thread.sleep(5000);
		
		ace.getTextField1().clear();
		ace.getTextField1().sendKeys(text);
		
		ace.getNumberField2().clear();
		ace.getNumberField2().sendKeys(number);
		
		ace.getDateField3().clear();
		ace.getDateField3().sendKeys(date);
		ace.getDateField3().sendKeys(Keys.TAB);
		
		ace.getSelectButton().click();
		ace.getOLSearchInput().sendKeys(option);
		ace.getSearchOLOption(option).click();
		
		ace.getSaveButton().click();
		
		
	}

}
