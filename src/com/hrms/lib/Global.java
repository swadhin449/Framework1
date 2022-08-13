package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
public WebDriver driver;
//Standard rule: To Provide Test Data & Objects Related to Whole Application
//*********Test Data
public String url = "http://183.82.103.245/nareshit/login.php";
public String un  = "nareshit";
public String pw  = "nareshit";
public String FN  = "Swadhins";
public String LN  = "Jena";
public String Nfn = "Bhubhan";
public String Nln = "Jena";
//*********Objects
public String txt_username = "txtUserName";
public String txt_password  = "txtPassword";
public String btn_login     = "Submit";
public String link_logout   = "Logout";
public String frm_frame     = "rightMenu";
public String btn_Add       = "//input[@value = 'Add']";
public String txt_LN        = "txtEmpLastName";
public String txt_FN        = "txtEmpFirstName";
public String clk_save      = "//input[@name='EditMain']";
public String clk_Empname   = "AT MT";
public String btn_edit      = "EditMain";
public String btn_Save      = "btnEdit";//id
}
