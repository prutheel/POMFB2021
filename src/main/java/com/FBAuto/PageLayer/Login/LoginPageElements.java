package com.FBAuto.PageLayer.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.FBAuto.BaseClass.BaseClass;

public class LoginPageElements extends BaseClass {

//	WebDriver driver;
	WebDriverWait _wait;

	@FindBy(name = "UserName")
	private WebElement username_Input;

	@FindBy(name = "Password")
	private WebElement password_Input;

	@FindBy(name = "Login")
	private WebElement login_btn;
	
	@FindBy(id="failureText")
	private WebElement Failure_Div;

	public LoginPageElements() {
		super();
		PageFactory.initElements(driver, this);
		_wait = new WebDriverWait(driver, 2000000);
	}

	public WebElement getUserNameInput() {

		return _wait.until(ExpectedConditions.elementToBeClickable(username_Input));
	}

	public WebElement getPasswordInput() {

		return _wait.until(ExpectedConditions.elementToBeClickable(password_Input));
	}

	public WebElement getLoginButton() {

		return _wait.until(ExpectedConditions.elementToBeClickable(login_btn));
	}
	
	public WebElement getLoginFailureDiv() {
		return _wait.until(ExpectedConditions.elementToBeClickable(Failure_Div));
		
	}
}
