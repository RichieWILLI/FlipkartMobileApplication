package GenericUtities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

/**
 * The Class DriverMethods contains the method most commonly used in developing the script for mobile application testing
 * @author Richard William
 *
 */

public class DriverMethods {
	public AndroidDriver driver;
	DesiredCapabilities dc;
	URL url;


	public void desiredCapabilty() {
		dc=new DesiredCapabilities();
	}

	public void setCapabilty(String capabiltyName,String value) {
		dc.setCapability(capabiltyName,value);
	}

	public void url(String serverUrl) {
		try {
			url=new URL(serverUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public AndroidDriver androidDriver() {
		driver=new AndroidDriver(url,dc);
		return driver;
	}

	/**
	 * The launchingApp Method is used to launch the Application
	 * prior to this we need to mention all desired capabilties and url
	 * @param driver
	 */
	public void launchingApp() {
		driver.launchApp();
	}

	/**
	 *The closeApp Method will used to close the application 
	 *whenever the application is opened through script make sure to close it to utilize the memory for later use 
	 */

	public void closeApp() {
		driver.closeApp();
	}
	/**
	 * The Method InstallApp is used to install the app into the device which is to be tested
	 * we can also install by giving desired capabilties as well 
	 * whenever we use intallApp method provide the app apk path for android and app ipa path for ios
	 * @param appPath
	 */

	
	public void swipe(int startX,int startY,int endX,int endY,int time) {
		driver.swipe(startX, startY, endX, endY, time);
	}


	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void explicitWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void explicitWait(String xpath,long time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	
	

}
