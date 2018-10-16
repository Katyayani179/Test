package com.abc.magentoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver r;
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	public Login(WebDriver r)
	{
		this.r=r;
	}
	public void typeEmail(String data)
	{
		r.findElement(email).sendKeys(data);
	}
	public void typePwd(String data)
	{
		r.findElement(pwd).sendKeys(data);
	}
	public void clickLogin()
	{
		r.findElement(login).click();
	}

}
