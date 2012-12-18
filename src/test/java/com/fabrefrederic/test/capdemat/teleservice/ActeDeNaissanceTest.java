package com.fabrefrederic.test.capdemat.teleservice;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.fabrefrederic.test.capdemat.AbstractInexineTest;

/**
 * Test du téléservice acte de naissance
 * 
 * @author Inexine : Frederic Fabre
 * 
 */
public class ActeDeNaissanceTest extends AbstractInexineTest {
    private static Logger logger = Logger.getLogger(ActeDeNaissanceTest.class);
    
    /**
     * 
     * @throws java.lang.Exception
     * 
     */
    @BeforeClass
    public static void setUp() throws Exception {
	try {
	    AbstractInexineTest.initialisation();
	}
	catch (Exception exceptionInitilisation) {
	    logger.error(exceptionInitilisation.getMessage());
	}
	AbstractInexineTest.login();
    }

    @Test
    public void acteDeNaissanceCreation() throws Exception {
	AbstractInexineTest.driver.get(baseUrl + "/frontoffice/requestType/index");
	driver.findElement(By.linkText("Acte de naissance")).click();
	new Select(driver.findElement(By.id("requesterQuality"))).selectByVisibleText("Titulaire de l'acte");
	driver.findElement(By.id("birthLastName")).clear();
	driver.findElement(By.id("birthLastName")).sendKeys("MonNomDeNaissance");
	driver.findElement(By.id("birthFirstNames")).clear();
	driver.findElement(By.id("birthFirstNames")).sendKeys("Fred");
	new Select(driver.findElement(By.id("birthDate_day"))).selectByVisibleText("21");
	new Select(driver.findElement(By.id("birthDate_month"))).selectByVisibleText("juin");
	driver.findElement(By.id("birthDate_year")).clear();
	driver.findElement(By.id("birthDate_year")).sendKeys("1979");
	driver.findElement(By.id("nextStep")).click();
	driver.findElement(By.id("format_EXTRACT_WITH_RELATIONSHIP")).click();
	driver.findElement(By.id("fatherLastName")).clear();
	driver.findElement(By.id("fatherLastName")).sendKeys("NomPere");
	driver.findElement(By.id("fatherFirstNames")).clear();
	driver.findElement(By.id("fatherFirstNames")).sendKeys("PrenomPere");
	driver.findElement(By.id("motherMaidenName")).clear();
	driver.findElement(By.id("motherMaidenName")).sendKeys("NomMere");
	driver.findElement(By.id("motherFirstNames")).clear();
	driver.findElement(By.id("motherFirstNames")).sendKeys("PrenomMere");
	driver.findElement(By.id("copies")).clear();
	driver.findElement(By.id("copies")).sendKeys("5");
	new Select(driver.findElement(By.id("motive"))).selectByVisibleText("Acte de notaire");
	driver.findElement(By.id("comment")).clear();
	driver.findElement(By.id("comment")).sendKeys("Mon commentaire");
	driver.findElement(By.id("nextStep")).click();
	driver.findElement(By.id("requestNote")).clear();
	driver.findElement(By.id("requestNote")).sendKeys("Ma note sur ma demande");
	driver.findElement(By.name("useAcceptance")).click();
	driver.findElement(By.id("send")).click();
    }

    @After
    public void tearDown() throws Exception {
	AbstractInexineTest.driver.quit();
	String verificationErrorString = verificationErrors.toString();
	if (!"".equals(verificationErrorString)) {
	    fail(verificationErrorString);
	}
    }
}
