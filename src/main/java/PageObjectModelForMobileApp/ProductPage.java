package PageObjectModelForMobileApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtities.DriverMethods;

public class ProductPage {

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]")
	private WebElement product;
	
	@FindBy(id = "com.flipkart.android:id/allow_button")
	private WebElement continuebtn;
	
	@FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement allowbtn;
	
	
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String getTextOfProduct(DriverMethods utility) {
		continuebtn.click();
		allowbtn.click();
		utility.explicitWait(product);
		String text = product.getAttribute("text").trim();
		return text;
	}
	
	public void selectProduct() {
		
		product.click();
	}
	
	
	
}
