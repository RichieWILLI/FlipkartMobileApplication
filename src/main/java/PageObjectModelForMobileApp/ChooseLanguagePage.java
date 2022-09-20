package PageObjectModelForMobileApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseLanguagePage {
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement chooseLang;
		
	@FindBy(id = "com.flipkart.android:id/select_btn")
	private WebElement continueBtn;
	
	
		public ChooseLanguagePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public void selectLang() {
			chooseLang.click();
			continueBtn.click();
		}

}
