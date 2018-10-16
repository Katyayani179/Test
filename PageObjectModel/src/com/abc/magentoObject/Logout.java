package com.abc.magentoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver r;
	By logout=By.linkText("Log Out");
	public Logout(WebDriver r)
	{
		this.r=r;
	}
	public void clickLogout()
	{
		r.findElement(logout).click();
	}

}
