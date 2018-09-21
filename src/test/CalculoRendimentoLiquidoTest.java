package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.CalculoInvestimentoCDB;

@RunWith(Parameterized.class)
public class CalculoRendimentoLiquidoTest {
	int n;
	double p, i, d;
	float r;
	
	public CalculoRendimentoLiquidoTest (int n, double p, double i, double d, float r) {
		this.n = n;
		this.p = p;
		this.i = i;
		this.d = d;
		this.r = r;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{60, 1000.00 , 0.085 , 0.225, 1.0829f},
			{240, 3000.00 , 0.09 , 0.20, 4.7342f},
			{390, 100.00 , 0.075 , 0.175, 6.6113f}
		});
	}
	
	@Test
	public void testCalculoRendimentoLiquido() {
		assertEquals(r, CalculoInvestimentoCDB.calcularRendimentoLiquido(n, p, i, d), 0.0001f);
	}
}
