package ecommerceProject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PurchasePage {

	public PurchasePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	@AndroidFindBy(xpath="//*[@text='ADD TO CART']")
	private List<WebElement> buy1;
	
	@AndroidFindBy(xpath="//*[@text='ADD TO CART']")
	private List<WebElement> buy2;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cart;
	
	public List<WebElement> purchasingItem1()
	{
		System.out.println("trying to purchase the first item");
		return buy1;
		
	}
	
	public List<WebElement> purchasingItem2()
	{
		System.out.println("trying to purchase the second item");
		return buy2;
		
	}
	public WebElement addingToCart()
	{
		System.out.println("Adding to Cart");
		return cart;
	}
}
