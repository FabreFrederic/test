/**
 * 
 */
package com.fabrefrederic.test.capdemat.teleservice;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.fabrefrederic.test.capdemat.AbstractInexineTest;

public class InterventionTechniqueTest extends AbstractInexineTest {
    

    /**
     * 
     * @throws Exception
     * 
     */
    @Test
    public void interventionTechniqueCreation() throws Exception {
	String interventionType = "Nid de poule";
	String interventionDescription = "Route impraticable";
	String streetNumber = "100";
	String streetName = StringUtils.upperCase("rue des travaux");
	String city = StringUtils.upperCase("Montpellier");

	AbstractInexineTest.driver.get(AbstractInexineTest.baseUrl + "/CapDemat/frontoffice/requestType/index");
	AbstractInexineTest.driver.findElement(By.linkText("Intervention technique")).click();
	new Select(AbstractInexineTest.driver.findElement(By.name("interventionType[0].name"))).selectByVisibleText(interventionType);
	AbstractInexineTest.driver.findElement(By.id("interventionPlace_streetNumber")).clear();
	AbstractInexineTest.driver.findElement(By.id("interventionPlace_streetNumber")).sendKeys(streetNumber);
	AbstractInexineTest.driver.findElement(By.id("interventionPlace_streetName")).clear();
	AbstractInexineTest.driver.findElement(By.id("interventionPlace_streetName")).sendKeys(streetName);
	AbstractInexineTest.driver.findElement(By.id("interventionPlace_city")).clear();
	AbstractInexineTest.driver.findElement(By.id("interventionPlace_city")).sendKeys(city);
	AbstractInexineTest.driver.findElement(By.id("interventionDescription")).clear();
	AbstractInexineTest.driver.findElement(By.id("interventionDescription")).sendKeys(interventionDescription);
	AbstractInexineTest.driver.findElement(By.id("nextStep")).click();
	AbstractInexineTest.driver.findElement(By.name("useAcceptance")).click();
	AbstractInexineTest.driver.findElement(By.id("send")).click();
	AbstractInexineTest.driver.findElement(By.linkText("Voir le résumé de votre demande")).click();

	String body = AbstractInexineTest.driver.findElement(By.tagName("body")).getText();
	assertTrue("Nature de l'intervention non persistée ou incorrecte", body.contains(interventionType));
	assertTrue("Description non persistée ou incorrecte", body.contains(interventionDescription));
	assertTrue("Numéro de  la rue non persisté ou incorrect", body.contains(streetNumber));
	assertTrue("Nom de la rue non persistée ou incorrecte", body.contains(streetName));
	assertTrue("Ville non persistée ou incorrecte", body.contains(city));
    }

}