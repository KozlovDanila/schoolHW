package lesson5.hw.zerosAndOnes.test;

import lesson5.hw.zerosAndOnes.ZeroAndOnesStateMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZeroAndOnesStateMachineTest {

	@Test
	public void whenSuccess() {
		ZeroAndOnesStateMachine stateMachine = new ZeroAndOnesStateMachine("10110101001");
		assertEquals("работает", stateMachine.execute());
	}

	@Test
	public void whenAllEven() {
		ZeroAndOnesStateMachine stateMachine = new ZeroAndOnesStateMachine("01101100");
		assertEquals("не работает", stateMachine.execute());
	}

	@Test
	public void whenAllNotEven() {
		ZeroAndOnesStateMachine stateMachine = new ZeroAndOnesStateMachine("101010");
		assertEquals("не работает", stateMachine.execute());
	}

	@Test
	public void whenOneNotEvenButZeroEven() {
		ZeroAndOnesStateMachine stateMachine = new ZeroAndOnesStateMachine("010");
		assertEquals("не работает", stateMachine.execute());
	}
}
