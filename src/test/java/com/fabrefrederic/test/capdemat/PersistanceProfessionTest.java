/**
 * 
 */
package com.fabrefrederic.test.capdemat;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class PersistanceProfessionTest extends AbstractInexineTest {
    private static Logger logger = Logger.getLogger(PersistanceProfessionTest.class);
    CharSequence profession01 = "analyste";
    CharSequence profession02 = "developpeur";

    /**
     * 
     *
     * @throws Exception 
     *
     */
    @Test
    public void persistanceProfessionTest() throws Exception {
	Integer compteur = 0;
	AbstractInexineTest.driver.findElement(By.linkText("Compte")).click();
	AbstractInexineTest.driver.findElement(By.linkText("Voir la fiche")).click();

	for (int i = 0; i < Integer.parseInt(properties.getProperty("persistanceProfessionTest.nombreTests")); i++) {
	    AbstractInexineTest.driver.findElement(By.linkText("Modifier")).click();
	    AbstractInexineTest.driver.findElement(By.name("profession")).clear();
	    AbstractInexineTest.driver.findElement(By.name("profession")).sendKeys(profession01);
	    AbstractInexineTest.driver.findElement(By.name("submit")).click();
	    String body = AbstractInexineTest.driver.findElement(By.tagName("body")).getText();
	    assertTrue("Problème de persistance - La profession " + profession01 + " n'a pas été trouvée",
		    body.contains(profession01));

	    AbstractInexineTest.driver.findElement(By.linkText("Modifier")).click();
	    AbstractInexineTest.driver.findElement(By.name("profession")).clear();
	    AbstractInexineTest.driver.findElement(By.name("profession")).sendKeys(profession02);
	    AbstractInexineTest.driver.findElement(By.name("submit")).click();

	    body = AbstractInexineTest.driver.findElement(By.tagName("body")).getText();
	    assertTrue("Problème de persistance - La profession " + profession02 + " n'a pas été trouvée",
		    body.contains(profession02));
	    compteur = compteur + 1;
	    System.out.println(compteur);
	}
	AbstractInexineTest.driver.findElement(By.linkText("Déconnexion")).click();
    }
    
    /**
     * 
     * @throws java.lang.Exception
     * 
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
	try {
	    AbstractInexineTest.initialisation();
	}
	catch (Exception exceptionInitilisation) {
	    logger.error(exceptionInitilisation.getMessage());
	}
	AbstractInexineTest.login();
    }
}