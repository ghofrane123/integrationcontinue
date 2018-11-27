package tn.esprit.javaee.wildfly_javaee8_webapp_ear_blank_archetype;

import org.junit.Test;

import junit.framework.TestCase;

public class TestClass extends TestCase {
	@Test
	public void test() {
		ClassTest junit = new ClassTest();
		String result = junit.afficher();
		assertEquals("welcome to ic",result);
		
	}

}
