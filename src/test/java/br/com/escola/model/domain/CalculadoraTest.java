package br.com.escola.model.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

  private Calculadora calc;

  @Before
  public void setUp() {
    this.calc = new Calculadora();
  }

  @Test
  public void testSomarSuccess() {
    assertEquals(this.calc.somar(2, 2), 4);
  }

  @Test
  public void testSomarFail() {
    assertNotEquals(this.calc.somar(2, 2), 3);
  }

  @Test
  public void testMultiplicarSuccess() {
    assertEquals(this.calc.multiplicar(5, 5), 25);
  }

  @Test
  public void testMultiplicarFail() {
    assertNotEquals(this.calc.multiplicar(5, 5), 20);
  }
}