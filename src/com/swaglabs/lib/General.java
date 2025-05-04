package com.swaglabs.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class General extends Global {
public void openApplication() {
driver = new EdgeDriver();
driver.manage().window().maximize();
driver.navigate().to(url);
}
public void closeApplication() {
driver.quit();	
}
public void login() {
driver.findElement(By.xpath(textbox_username)).sendKeys(un);
driver.findElement(By.xpath(textbox_password)).sendKeys(pw);
driver.findElement(By.id(button_login)).click();
}
public void dropdown() {
	Select st = new Select(driver.findElement(By.xpath(dropdown)));
	st.selectByIndex(2);
}
public void addtocard() {
	driver.findElement(By.xpath(addtocard_button1)).click();
	driver.findElement(By.xpath(addtocard_button2)).click();
	driver.findElement(By.xpath(addtocard_button3)).click();
	driver.findElement(By.xpath(addtocard_button4)).click();
	driver.findElement(By.xpath(addtocard_button5)).click();
	driver.findElement(By.xpath(addtocard_button6)).click();
}
public void shopingcart() {
	driver.findElement(By.xpath(shoppingcart_container)).click();
}
public void checkout() {
	driver.findElement(By.linkText(checkout_button)).click();
}
public void yourinfo() {
	driver.findElement(By.xpath(textbox_fristname)).sendKeys(fn);
	driver.findElement(By.xpath(textbox_lastname)).sendKeys(ln);
	driver.findElement(By.xpath(textbox_postalcode)).sendKeys(pc);
	driver.findElement(By.xpath(continue_button)).click();
}
public void overview() {
	driver.findElement(By.linkText(overview)).click();
}
public void logout() {
driver.findElement(By.xpath(menu_button)).click();
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath(logout))).perform();
}
}
