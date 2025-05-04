package com.swaglabs.testscripts;

import org.testng.annotations.Test;

import com.swaglabs.lib.General;

public class TC008 {
	@Test
public void tc008() throws Exception {
 General obj = new General();
 obj.openApplication();
 obj.login();
 obj.dropdown();
 Thread.sleep(3000);
 obj.addtocard();
 Thread.sleep(3000);
 obj.shopingcart();
 Thread.sleep(2000);
 obj.checkout();
 Thread.sleep(2000);
 obj.yourinfo();
 Thread.sleep(2000);
 obj.overview();
 Thread.sleep(2000);
 obj.logout();
 Thread.sleep(2000);
 obj.closeApplication();
 }
}

