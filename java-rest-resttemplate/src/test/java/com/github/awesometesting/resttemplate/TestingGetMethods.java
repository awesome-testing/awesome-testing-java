package com.github.awesometesting.resttemplate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestingGetMethods {

	@BeforeAll
	public static void setup() {
		System.out.println("Setup");
	}

	@Test
	public void testListContains() {
		System.out.println("Test");
	}

}
