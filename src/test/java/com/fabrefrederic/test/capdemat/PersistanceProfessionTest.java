/**
 * 
 */
package com.fabrefrederic.test.capdemat;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

public class PersistanceProfessionTest extends AbstractInexineTest {
    CharSequence profession01 = "analyste";
    CharSequence profession02 = "developpeur";

    @Test
    public void persistanceProfessionTest() throws Exception {
	Integer compteur = 0;
	driver.findElement(By.linkText("Compte")).click();
	driver.findElement(By.linkText("Voir la fiche")).click();

	for (int i = 0; i < Integer.parseInt(properties.getProperty("persistanceProfessionTest.nombreTests")); i++) {
	    driver.findElement(By.linkText("Modifier")).click();
	    driver.findElement(By.name("profession")).clear();
	    driver.findElement(By.name("profession")).sendKeys(profession01);
	    driver.findElement(By.name("submit")).click();
	    String body = driver.findElement(By.tagName("body")).getText();
	    assertTrue("Problème de persistance - La profession " + profession01 + " n'a pas été trouvée",
		    body.contains(profession01));

	    driver.findElement(By.linkText("Modifier")).click();
	    driver.findElement(By.name("profession")).clear();
	    driver.findElement(By.name("profession")).sendKeys(profession02);
	    driver.findElement(By.name("submit")).click();

	    body = driver.findElement(By.tagName("body")).getText();
	    assertTrue("Problème de persistance - La profession " + profession02 + " n'a pas été trouvée",
		    body.contains(profession02));
	    compteur = compteur + 1;
	    System.out.println(compteur);
	}
	driver.findElement(By.linkText("Déconnexion")).click();
    }
}