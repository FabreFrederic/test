/**
 * 
 */
package com.fabrefrederic.test.capdemat;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * @author Inexine : Frederic Fabre
 * 
 */
public class IndividuDemandeNotInHomeFolderChargeTest extends AbstractInexineTest {
    private static Logger logger = Logger.getLogger(IndividuDemandeNotInHomeFolderChargeTest.class);

    @Test
    public void connexionDeconnexion() {
	Integer compteur = 0;
	Date maDate = new Date(); 
	// affichage: 
	logger.info(maDate.toString()); 
	
	try {
	    AbstractInexineTest.initialisation();
	}
	catch (Exception exceptionInitilisation) {
	    logger.error(exceptionInitilisation.getMessage());
	}
	
	for (int i = 0; i < 2; i++) {
	    try {
		AbstractInexineTest.login();
		AbstractInexineTest.driver.get(baseUrl + "/frontoffice/home");
		AbstractInexineTest.driver.findElement(By.linkText("Déconnexion")).click();
	    }
	    catch (Exception e) {
		logger.error(e.getMessage());
	    }
	    compteur = compteur + 1;
	    logger.info(compteur);
	}
	maDate = new Date(); 
	// affichage: 
	logger.info(maDate.toString()); 
    }

}
