package PageObjectModelForMobileApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingToCart {
	
	@FindBy(xpath = "//android.widget.TextView[@text='Add to cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement cartBtn;
	
	
	public AddingToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnAddToCart() {
		addToCartBtn.click();
		
		
	}
	public void checkCart() {
		cartBtn.click();
	}

}
