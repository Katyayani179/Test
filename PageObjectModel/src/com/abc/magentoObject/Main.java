package com.abc.magentoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
WebDriver r;
By myacc=By.linkText("My Account");
public Main(WebDriver r)
{
	this.r=r;
}
public void clickMyAcc()
{
	r.findElement(myacc).click();
}
}
