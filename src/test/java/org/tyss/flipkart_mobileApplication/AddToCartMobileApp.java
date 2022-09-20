package org.tyss.flipkart_mobileApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtities.BaseClassForMobileApplication;
import PageObjectModelForMobileApp.AddingToCart;
import PageObjectModelForMobileApp.ChooseLanguagePage;
import PageObjectModelForMobileApp.HomePage;
import PageObjectModelForMobileApp.LoginPage;
import PageObjectModelForMobileApp.MyCartPage;
import PageObjectModelForMobileApp.ProductPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class AddToCartMobileApp extends BaseClassForMobileApplication {

	@Test
	public void addToCartMobileApp()  {
		System.out.println("hi");

		ChooseLanguagePage langPg=new ChooseLanguagePage(driver);
		LoginPage loginPg=new LoginPage(driver);
		HomePage hmpg=new HomePage(driver);
		ProductPage proPg=new ProductPage(driver);
		AddingToCart addCartpg=new AddingToCart(driver);
		MyCartPage myCartPg=new MyCartPage(driver);


		langPg.selectLang();
		loginPg.clickOnNoneOfAboveBtn();
		hmpg.nextbtnclick(driverUtility);
		hmpg.clickonsearchbox();
		hmpg.enterProduct();
		String expected = proPg.getTextOfProduct(driverUtility);
		System.out.println(expected);
		proPg.selectProduct();
		addCartpg.clickOnAddToCart();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		addCartpg.checkCart();
		String actualText = myCartPg.getTextOfAddedProduct();
		System.out.println(expected);
		
		Assert.assertEquals(actualText, expected);
		System.out.println("yes the product is present in the cart");



	}

}
