package com.swaglabs.lib;
import org.openqa.selenium.WebDriver;
public class Global {
public WebDriver driver;
public String url = "https://www.saucedemo.com/v1/index.html";
public String un = "standard_user";
public String pw = "secret_sauce";
public String fn = "Siva";
public String ln = "Ch";
public String pc = "874747";

public String textbox_username     = "//*[@id=\"user-name\"]";
public String textbox_password     = "//*[@id=\"password\"]";
public String button_login         = "login-button";
public String dropdown             = "//*[@id=\"inventory_filter_container\"]/select";
public String menu_button          = "//*[@id=\"menu_button_container\"]/div/div[3]/div/button";
public String addtocard_button1    = "//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button";
public String addtocard_button2    = "//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button";
public String addtocard_button3    = "//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button";
public String addtocard_button6      = "//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button";
public String shoppingcart_container = "//*[@id=\"shopping_cart_container\"]/a";
public String textbox_continue       = "//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]";
public String addtocard_button4    = "//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button";
public String addtocard_button5    = "//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button";
public String checkout_button       = "CHECKOUT";
public String textbox_fristname     = "//*[@id=\"first-name\"]";
public String textbox_lastname     = "//*[@id=\"last-name\"]";
public String textbox_postalcode   ="//*[@id=\"postal-code\"]";
public String continue_button      ="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input";
public String overview             = "FINISH";
public String logout                 = "//*[@id=\"logout_sidebar_link\"]";
} 
