package ecommerceProject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {

	public FormPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter name here']")
	public WebElement nameField;
	
	public WebElement getNameField(){
	
	System.out.println("trying to get the nameField");
	return nameField;
	}
	
	@AndroidFindBy(className="android.widget.Spinner")
	public List<WebElement> getCountryName;
	
	public List<WebElement> getCountryName()
	{
		System.out.println("trying to get the getCountryName");
		return getCountryName;
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement shop;
	
	public WebElement letsShop(){
		
		System.out.println("LetsShop");
		return shop;
		}
	
}
