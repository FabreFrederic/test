/**
 * 
 */
package com.fabrefrederic.test;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Inexine : Frederic Fabre
 * 
 */
public class CalendrierTest {

    /**
     * 
     * @throws java.lang.Exception
     * 
     */
    @Before
    public void setUp() throws Exception {
	
    }

    @Test
    public void test() {
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(new Date());
	// Ajout de commentaire pour tester la branche02
	calendar.add(Calendar.DAY_OF_YEAR, 0);
    }
}
