package com.swaglabs.testscripts;

import org.testng.annotations.Test;
import com.swaglabs.lib.General;
public class TC005 {
@Test
public void tc005() throws Exception { 
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
 obj.logout();
 Thread.sleep(2000);
 obj.closeApplication();
 }

}

