package com.swaglabs.testscripts;
import org.testng.annotations.Test;
import com.swaglabs.lib.General; 
public class TC001 {
@Test
public void tc001() throws Exception {
 General obj = new General();
  obj.openApplication();
  obj.login();
  obj.logout();
  Thread.sleep(2000);
  obj.closeApplication();
}
}
