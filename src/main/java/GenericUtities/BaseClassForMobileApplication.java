package GenericUtities;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import PageObjectModelForMobileApp.AddingToCart;
import PageObjectModelForMobileApp.ChooseLanguagePage;
import PageObjectModelForMobileApp.HomePage;
import PageObjectModelForMobileApp.LoginPage;
import PageObjectModelForMobileApp.MyCartPage;
import PageObjectModelForMobileApp.ProductPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClassForMobileApplication {
public String platformName;
public String url;
public String platformVersion;
public String deviceName;
public String deviceUdid;
public String appPackage;
public String appActivity;
public AndroidDriver driver;
public DriverMethods driverUtility;

	@BeforeSuite
	public void beforeSuitMethod() {
		System.out.println("before Suite Method is Executing");
	}
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("before test method is executing");
	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("before class method is executing");
		FileUtilities file=new FileUtilities();
		
		 
		



		file.fetchingPropertyData(Iconstant.PROPERTYFILEPATH);
		url = file.loadPropertyFile("url");
		platformName = file.loadPropertyFile("platformName");
		platformVersion = file.loadPropertyFile("platformVersion");
		deviceName = file.loadPropertyFile("deviceName");
		deviceUdid = file.loadPropertyFile("deviceUdid");
		appPackage = file.loadPropertyFile("appPackage");
		appActivity = file.loadPropertyFile("appActivity");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method executing");
		driverUtility=new DriverMethods();
		driverUtility.desiredCapabilty();
		driverUtility.setCapabilty(MobileCapabilityType.PLATFORM_NAME,platformName);
		driverUtility.setCapabilty(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		driverUtility.setCapabilty(MobileCapabilityType.DEVICE_NAME,deviceName);
		driverUtility.setCapabilty(MobileCapabilityType.UDID,deviceUdid);
		driverUtility.setCapabilty("appPackage",appPackage);
		driverUtility.setCapabilty("appActivity",appActivity);
		
		driverUtility.url(url);
		driver = driverUtility.androidDriver();
		driver.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("executing after method");
	}

	@AfterClass
	public void afterclassMethod() {
		System.out.println("after class method is executing");
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("after test method is executing");
	}

	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("after suite method is executing");
	}

}
