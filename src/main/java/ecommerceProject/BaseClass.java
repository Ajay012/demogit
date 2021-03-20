package ecommerceProject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
	DesiredCapabilities cap= new DesiredCapabilities();
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Devices");
	cap.setCapability(MobileCapabilityType.UDID, "49BEWSWC7HZLEMRS");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
	cap.setCapability(MobileCapabilityType.NO_RESET, "true");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
	AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}
}
