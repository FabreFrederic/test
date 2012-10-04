/**
 * 
 */
package com.fabrefrederic.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Inexine : Frederic Fabre
 *
 */
public class StringTest {

    private String libelle;

    /**
     * 
     * @throws java.lang.Exception
     * 
     */
    @Before
    public void setUp() throws Exception {
	this.setLibelle("test");
    }
	
    @Test
    public void test() {
	assertTrue("libellé incorrect", "test".equals(this.getLibelle()));
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
	return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
	this.libelle = libelle;
    }

}
