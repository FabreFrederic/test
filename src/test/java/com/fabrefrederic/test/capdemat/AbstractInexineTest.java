/**
 * 
 */
package com.fabrefrederic.test.capdemat;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Inexine : Frederic Fabre
 * 
 */
public abstract class AbstractInexineTest {
    protected static Properties properties = new Properties();
    protected static WebDriver driver;
    protected StringBuffer verificationErrors = new StringBuffer();
    protected static String baseUrl;

    /**
     * 
     *
     * @throws Exception 
     *
     */
    public static void login() throws Exception {
	// Paramétrage
	try {
	    properties.load(new FileInputStream("src/test/resources/config.properties"));
	}
	catch (IOException e) {
	    System.out.println(e);
	    System.out.println("Unable to load config file.");
	}
	baseUrl = properties.getProperty("url.principale");

	driver = new FirefoxDriver();
	// Paramétrage du timeout
	/**
	 * An implicit wait is to tell WebDriver to poll the DOM for a certain
	 * amount of time when trying to find an element or elements if they are
	 * not immediately available. The default setting is 0. Once set, the
	 * implicit wait is set for the life of the WebDriver object instance.
	 */
	driver.manage().timeouts()
		.implicitlyWait(Integer.parseInt(properties.getProperty("driver.timeout")), TimeUnit.SECONDS);

	// Connexion au site
	driver.get(baseUrl + "/frontoffice/home/login");
	driver.findElement(By.id("login")).clear();
	driver.findElement(By.id("login")).sendKeys(properties.getProperty("login"));
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(properties.getProperty("password"));
	driver.findElement(By.cssSelector("input.button")).click();
    }

    /**
     * 
     * @throws java.lang.Exception
     * 
     */
    @After
    public void tearDown() throws Exception {
	driver.quit();
	String verificationErrorString = verificationErrors.toString();
	if (!"".equals(verificationErrorString)) {
	    fail(verificationErrorString);
	}
    }

    /**
     * 
     * 
     * @param by
     * @return
     * 
     */
    private boolean isElementPresent(By by) {
	try {
	    driver.findElement(by);
	    return true;
	}
	catch (NoSuchElementException e) {
	    return false;
	}
    }

}
