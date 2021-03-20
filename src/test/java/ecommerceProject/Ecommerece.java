package ecommerceProject;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
















import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Ecommerece extends BaseClass {

	
	
	@Test
	public void totalValidation() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FormPage form = new FormPage(driver);
		form.getNameField().sendKeys("Ajay");
		driver.hideKeyboard();
		form.getCountryName().get(0).click();
		
		Utilities u = new Utilities(driver);
		u.scrollToText("Austrialia");
		form.letsShop().click();
		
		PurchasePage pPage = new PurchasePage(driver);
		pPage.purchasingItem1().get(0).click();
		pPage.purchasingItem2().get(0).click();
		pPage.addingToCart().click();
		Thread.sleep(3000);
		
		CheckoutPage checkoutpage = new CheckoutPage(driver);
		double sum=0;
		int count =driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		for(int i=0; i<count; i++)
		{
			String amount=	checkoutpage.productlist.get(i).getText();
			double amountv = getAmount(amount);
			 sum= sum+amountv;
		}
		System.out.println("The Sum amount is "+sum);
		String total=checkoutpage.totalamount.getText();
		total= total.substring(1);
		double totalv= Double.parseDouble(total);
		System.out.println("The total amount is "+totalv);
		
		Assert.assertEquals("Both amounts are not equal", totalv, sum, 0);
		
		TouchAction t= new TouchAction(driver);
		t.tap(tapOptions().withElement(element(checkoutpage.checkbox))).perform();
		
		t.longPress(longPressOptions().withElement(element(checkoutpage.termscondition)).withDuration(ofSeconds(2))).release().perform();
		
		checkoutpage.button1.click();
		Thread.sleep(7000);
		
		checkoutpage.visitwebsite.click();
		
		
		
	}
	public static double getAmount(String value)
	{
	
	value= value.substring(1);
	double amount= Double.parseDouble(value);
	return amount;
}
}
