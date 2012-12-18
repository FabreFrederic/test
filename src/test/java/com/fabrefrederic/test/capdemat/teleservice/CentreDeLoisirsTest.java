/**
 * 
 */
package com.fabrefrederic.test.capdemat.teleservice;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.fabrefrederic.test.capdemat.AbstractInexineTest;

/**
 * 
 * @author Inexine : Frederic Fabre
 * 
 */
public class CentreDeLoisirsTest extends AbstractInexineTest {
    private static Logger logger = Logger.getLogger(CentreDeLoisirsTest.class);

    /**
     * Test du téléservice inscription centre de loisirs
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

    /**
     * Création d'une demande de type centre de loisirs
     * 
     * @throws Exception
     * 
     */
    @Test
    @Ignore
    public void centreDeLoisirsCreation() throws Exception {
	AbstractInexineTest.driver.get(baseUrl + "/frontoffice/requestType/index");
	AbstractInexineTest.driver.findElement(By.linkText("Inscription Centre de loisirs")).click();
	new Select(AbstractInexineTest.driver.findElement(By.id("subjectId"))).selectByVisibleText("FABRE Loann");
	AbstractInexineTest.driver.findElement(By.id("recreationPolyActivity.0.name")).click();
	AbstractInexineTest.driver.findElement(By.id("recreationPolyActivity.1.name")).click();
	AbstractInexineTest.driver.findElement(By.id("recreationPolyActivity.2.name")).click();
	AbstractInexineTest.driver.findElement(By.id("recreationPolyActivity.3.name")).click();
	AbstractInexineTest.driver.findElement(By.id("recreationPolyActivity.4.name")).click();
	AbstractInexineTest.driver.findElement(By.id("recreationPolyActivity.5.name")).click();
	AbstractInexineTest.driver.findElement(By.id("recreationPolyActivity.6.name")).click();
	AbstractInexineTest.driver.findElement(By.id("urgencyPolyPhone")).clear();
	AbstractInexineTest.driver.findElement(By.id("urgencyPolyPhone")).sendKeys("0601020304");
	AbstractInexineTest.driver.findElement(By.id("nextStep")).click();
	AbstractInexineTest.driver.findElement(By.linkText("Ajouter une nouvelle entrée")).click();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.lastName")).clear();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.lastName")).sendKeys("Inexine");
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.firstName")).clear();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.firstName")).sendKeys("Testeur");
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.address.streetNumber")).clear();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.address.streetNumber")).sendKeys("15");
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.address.streetName")).clear();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.address.streetName")).sendKeys(
		"rue des testeurs");
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.address.postalCode")).clear();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.address.postalCode")).sendKeys("34000");
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.address.city")).clear();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.address.city")).sendKeys("Montpellier");
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.homePhone")).clear();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.homePhone")).sendKeys("0467102030");
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.officePhone")).clear();
	AbstractInexineTest.driver.findElement(By.id("contactPolyIndividuals.0.officePhone")).sendKeys("0466231000");
	AbstractInexineTest.driver.findElement(By.id("collectionSave")).click();
	AbstractInexineTest.driver.findElement(By.id("nextStep")).click();
	AbstractInexineTest.driver.findElement(By.linkText("Ajouter une nouvelle entrée")).click();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.lastName")).clear();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.lastName")).sendKeys("Fabre");
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.firstName")).clear();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.firstName")).sendKeys("Emilie");
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.address.streetNumber")).clear();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.address.streetNumber"))
		.sendKeys("21");
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.address.streetName")).clear();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.address.streetName")).sendKeys(
		"Chemin des personnes autorisées");
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.address.postalCode")).clear();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.address.postalCode")).sendKeys(
		"30250");
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.address.city")).clear();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.address.city")).sendKeys(
		"Villevieille");
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.homePhone")).clear();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.homePhone")).sendKeys("0466234100");
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.officePhone")).clear();
	AbstractInexineTest.driver.findElement(By.id("authorizedPolyIndividuals.0.officePhone")).sendKeys("0466231478");
	AbstractInexineTest.driver.findElement(By.id("collectionSave")).click();
	AbstractInexineTest.driver.findElement(By.id("nextStep")).click();
	AbstractInexineTest.driver.findElement(By.id("rulesAndRegulationsPolyAcceptance_yes")).click();
	AbstractInexineTest.driver.findElement(By.id("classTripPolyPermission_yes")).click();
	AbstractInexineTest.driver.findElement(By.id("childPhotoExploitationPolyPermission_yes")).click();
	AbstractInexineTest.driver.findElement(By.id("hospitalizationPolyPermission_yes")).click();
	AbstractInexineTest.driver.findElement(By.id("nextStep")).click();
	AbstractInexineTest.driver.findElement(By.name("useAcceptance")).click();
	AbstractInexineTest.driver.findElement(By.id("send")).click();
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