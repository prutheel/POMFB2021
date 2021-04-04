package com.FBAuto.PageLayer.AddConent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.FBAuto.BaseClass.BaseClass;

public class AddContentElements extends BaseClass {

	WebDriverWait _wait;

	@FindBy(xpath="//select[@id='ddlProjects']//following-sibling::div/button")
	private WebElement ProjectDropdown;
	
	@FindBy(xpath="//ul[@class='multiselect-container dropdown-menu show']//input[@placeholder='Search']")
	private WebElement SearchInputbox_AddContent;
	
	@FindBy(xpath="")
	private WebElement FilteredProject;
	
	@FindBy(xpath="//input[@fieldname=\"Text\"]")
	private WebElement TextFieldInput;
	
	@FindBy(xpath="//input[@fieldname=\"Number\"]")
	private WebElement NumberFieldInput;
	
	@FindBy(xpath="//input[@fieldname=\"Date\"]")
	private WebElement DateFieldInput;
	
	@FindBy(xpath="//select[@fieldname=\"OL\"]//following-sibling::div/button")
	private WebElement selectButton;
	
	@FindBy(xpath="//ul[@class='multiselect-container dropdown-menu show']//input[@placeholder='Search']")
	private WebElement OLSearchInput;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	private WebElement SaveButton;
	
	
	
	
	public AddContentElements() {
		PageFactory.initElements(driver, this);
		_wait = new WebDriverWait(driver, 30000);
	}

	public WebElement getProjectDropdown()

	{
		return _wait.until(ExpectedConditions.elementToBeClickable(ProjectDropdown));
	}
	
	public WebElement getSearchInputBox()

	{
		return _wait.until(ExpectedConditions.elementToBeClickable(SearchInputbox_AddContent));
	}
	
	public WebElement selectFilteredProject(String projectname)

	{
		String strprojectname = "(//label[contains(.,'"+projectname+"') and @class='radio'])[2]";
		return _wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strprojectname)));
	}
	
	
	public WebElement getTextField1()
	{
		
		return _wait.until(ExpectedConditions.elementToBeClickable(TextFieldInput));
	}
	
	public WebElement getNumberField2()
	{
		
		return _wait.until(ExpectedConditions.elementToBeClickable(NumberFieldInput));
	
	}
	
	public WebElement getDateField3()
	{
		
		return _wait.until(ExpectedConditions.elementToBeClickable(DateFieldInput));
	}
	
	public WebElement getSelectButton()
	{
		return _wait.until(ExpectedConditions.elementToBeClickable(selectButton));
	}
	
	public WebElement getOLSearchInput()
	{
		return _wait.until(ExpectedConditions.elementToBeClickable(OLSearchInput)); 
	}
	
	public WebElement getSearchOLOption(String optionName)
	{
		String OLPath = "//label[normalize-space()='"+optionName+"']";
		return _wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OLPath)));
		
	}
	
	public WebElement getSaveButton()
	{
		return _wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
		
	}

}
