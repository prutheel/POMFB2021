package com.FBAuto.PageLayer.CommanMenuPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.FBAuto.BaseClass.BaseClass;

public class CommonMenuElements extends BaseClass {

	WebDriverWait _wait;
	
	@FindBy(id="dvUserName")
	private WebElement UserNameDiv;
	
	@FindBy(id="mnuAddContent")
	private WebElement AddContentButton;
	
	public CommonMenuElements() 
	{
		super();
		PageFactory.initElements(driver, this);
		_wait = new WebDriverWait(driver, 3000000);
	}
		
	public WebElement getUsernNameDiv()
	{
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return _wait.until(ExpectedConditions.elementToBeClickable(UserNameDiv));
		//return driver.findElement(By.id("dvUserName"))
		
	}
	
	public WebElement getAddContentButton()
	{
		return _wait.until(ExpectedConditions.elementToBeClickable(AddContentButton));
		
	}
	
	
	
	
	
}
