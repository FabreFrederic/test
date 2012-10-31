/**
 * 
 */
package com.fabrefrederic.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Inexine : Frederic Fabre
 *
 */
public class propertiesTest {

    /**
     *
     * @throws java.lang.Exception 
     *
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     *
     * @throws java.lang.Exception 
     *
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     *
     * @throws java.lang.Exception 
     *
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     *
     * @throws java.lang.Exception 
     *
     */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    /**
     * Chargement d'un fichier de config properties
     *
     */
    public void test() {
	Properties properties = new Properties();
	try {
	    properties.load(new FileInputStream("src/test/resources/config.properties"));
	    assertNotNull(properties.getProperty("url.principale"));
	    System.out.println(properties.getProperty("url.principale"));
	}
	catch (IOException e) {
	    System.out.println(e);
	    System.out.println("Unable to load config file.");
	}
    }

}
