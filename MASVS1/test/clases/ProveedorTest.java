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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sam23
 */
public class ProveedorTest {
    
    public ProveedorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mostrar method, of class Proveedor.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        int codigo = 0;
        String nombre = "";
        String apellido = "";
        String usuario = "";
        String telefono = "";
        String direccion = "";
        String contraseña = "";
        Proveedor instance = new Proveedor();
        instance.mostrar(codigo, nombre, apellido, usuario, telefono, direccion, contraseña);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
