package com.javapb.firstAutomatedTest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class CalculatorTeste {
	
	@Test
	public void  testSum() {
		Calculator calculator = new Calculator();
		assertThat(calculator.sum(1, 3)).isEqualTo(4);
	}
}