/**
 * 
 */
package com.devquinchi.proyecto_spring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Julio
 * Clase de prueba unitaria que permite hacer testeo de con el framework Spring
 */
class SpringTest {

	@Test
	void testContext() {
		ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
		assertNotNull(context);
		System.out.println("Contexto cargado exitosamente");
	}

}
