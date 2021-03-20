package ecommerceProject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {

	
	AndroidDriver<AndroidElement> driver;
	
	

	public Utilities(AndroidDriver<AndroidElement> driver2) {
		this.driver=driver2;
	}



	public void scrollToText(String text)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));").click();
	}
}
