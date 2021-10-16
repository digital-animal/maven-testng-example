package com.zahid;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		AssertJUnit.assertEquals(13, calc.add(4, 9));
	}

	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		AssertJUnit.assertEquals(-5, calc.sub(4, 9));
	}
	
	@Test
	public void testMul() {
		Calculator calc = new Calculator();
		AssertJUnit.assertEquals(36, calc.mul(4, 9));
	}
	
	@Test
	public void testDiv() {
		Calculator calc = new Calculator();
		AssertJUnit.assertEquals(0, calc.div(4, 9));
	}
	
	@Test
	public void testMod() {
		Calculator calc = new Calculator();
		AssertJUnit.assertEquals(4, calc.mod(4, 9));
	}
}
