package PageObjectModelForMobileApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "com.google.android.gms:id/cancel")
	private WebElement noneOfAbove;
	
	@FindBy(id="com.flipkart.android:id/custom_back_icon")
	private WebElement closeLogin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnNoneOfAboveBtn() {
		noneOfAbove.click();
		closeLogin.click();
		
	}

}
