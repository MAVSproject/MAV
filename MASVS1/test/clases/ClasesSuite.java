/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author sam23
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({clases.ClienteTest.class, clases.ProveedorTest.class, clases.AdministradorTest.class, clases.PublicistaTest.class, clases.SupervisorTest.class, clases.MASVS1Test.class, clases.UsuarioTest.class})
public class ClasesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
