package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;
import com.hrms.utility.Log;

public class General extends Global{
//Standard rule: To Provide Reusable Functions:/methods

public void openApplication() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SWADHIN KUMAR JENA\\Dropbox\\My PC (LAPTOP-FBQ671D5)\\Desktop\\Adactin\\Selenium\\Drivers\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");//console
	Reporter.log("Application Opened");//html Report
	Log.info("Application Opened");//logfile
}
public void closeApplication() {
	driver.close();
	System.out.println("Application Closed");
	Reporter.log("Application Closed");
	Log.info("Application Closed");
}
public void login() {
	driver.findElement(By.name(txt_username)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login Completed");
	Reporter.log("Login Completed");
	Log.info("Login Completed");
}
public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout Completed");
	Reporter.log("Logout Completed");
	Log.info("Logout Completed");
}
public void enterFrame() {
	driver.switchTo().frame(frm_frame);
	System.out.println("Enter into Frame");
	Reporter.log("Enter into Frame");
	Log.info("Enter into Frame");
}
public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit from Frame");
	Reporter.log("Exit from Frame");
	Log.info("Exit from Frame");
}
public void addNewEmployee() {
	/*driver.findElement(By.linkText(clk_Empname)).click();
	driver.findElement(By.name(btn_edit)).click();
	driver.findElement(By.name(txt_LN)).clear();
	driver.findElement(By.name(txt_LN)).sendKeys(Nln);
	driver.findElement(By.name(txt_FN)).clear();
	driver.findElement(By.name(txt_FN)).sendKeys(Nfn);
	driver.findElement(By.xpath(clk_save)).click();*/
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(txt_LN)).sendKeys(LN);
	driver.findElement(By.name(txt_FN)).sendKeys(FN);
	driver.findElement(By.id(btn_Save)).click();
	System.out.println("New Employee Added");
	Reporter.log("New Employee Added");
	Log.info("New Employee Added");
}
}
