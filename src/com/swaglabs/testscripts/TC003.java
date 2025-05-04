package com.swaglabs.testscripts;
import org.testng.annotations.Test;
import com.swaglabs.lib.General;
public class TC003 {
@Test
 public void tc003() throws Exception {
 General obj = new General();
 obj.openApplication();
 obj.login();
 obj.dropdown();
 Thread.sleep(3000);
 obj.addtocard();
 Thread.sleep(3000);
 obj.logout();
 Thread.sleep(2000);
 obj.closeApplication();
 }
}
