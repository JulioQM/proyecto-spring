/**
 * 
 */
package com.devquinchi.proyecto_spring.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devquinchi.proyecto_spring.dao.DisqueraDAO;

/**
 * @author Julio
 * Clase de prueba unitaria que permite hacer testeo de con el framework Spring
 */
class SpringTest {

	@Test
	void testContext() {
		ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
		assertNotNull(context);
		DisqueraDAO disqueraDAO=(DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		System.out.println("Contexto cargado exitosamente: "+disqueraDAO);
		
		Properties properties=(Properties) context.getBean("properties");
		
		System.out.println(properties.get("spring-username"));
	}

}
