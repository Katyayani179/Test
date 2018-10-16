package com.abc.magentoTest;

import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoObject.Login;
import com.abc.magentoObject.Logout;
import com.abc.magentoObject.Main;

public class MagentoApp {

	public static void main(String[] args) throws Exception {
		String url="http://www.magento.com";
ChromeDriver r=new ChromeDriver();
r.manage().window().maximize();
r.get(url);
Main m=new Main(r);
m.clickMyAcc();
Thread.sleep(3000);
Login l=new Login(r);
l.typeEmail("subramanyaraj87@gmail.com");
l.typePwd("Welcome123");
l.clickLogin();
Thread.sleep(3000);
Logout t=new Logout(r);
t.clickLogout();
Thread.sleep(3000);
r.quit();
	}

}
