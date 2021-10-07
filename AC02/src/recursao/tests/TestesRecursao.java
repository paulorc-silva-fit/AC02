package recursao.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recursao.source.Recursao;

class TestesRecursao {
	Recursao r = new Recursao();
	Integer[] A1 = {1, 2, 3, 4, 5, 6};
	Integer[] A2 = {5, 4, 3, 2, 1};
	Integer[] A3 = {9, 7, 2, 7};

	@Test
	void binaryFibTest() {
		assertEquals(0, r.binaryFib(0));
		assertEquals(1, r.binaryFib(1));
		assertEquals(1, r.binaryFib(2));
		assertEquals(2, r.binaryFib(3));
		assertEquals(3, r.binaryFib(4));
		assertEquals(5, r.binaryFib(5));
		assertEquals(8, r.binaryFib(6));
	}
	

	@Test
	void binarySumTest() {
		assertEquals(21, r.binarySum(A1, 0, 6));
		assertEquals(15, r.binarySum(A1, 0, 5));
		assertEquals(10, r.binarySum(A1, 0, 4));
	}
	

	@Test
	void iterativeReverseArrayTest() {
		assertEquals("[6, 5, 4, 3, 2, 1]", r.iterativeReverseArray(A1, 0, 5));
		assertEquals("[1, 2, 3, 4, 5]", r.iterativeReverseArray(A2, 0, 4));
		assertEquals("[7, 2, 7, 9]", r.iterativeReverseArray(A3, 0, 3));
	}
	
	@Test
	void linearFibonacciTest() {
		assertEquals("(0, 0)", r.linearFibonacci(0).toString());
		assertEquals("(1, 0)", r.linearFibonacci(1).toString());
		assertEquals("(1, 1)", r.linearFibonacci(2).toString());
		assertEquals("(2, 1)", r.linearFibonacci(3).toString());
		assertEquals("(3, 2)", r.linearFibonacci(4).toString());
		assertEquals("(5, 3)", r.linearFibonacci(5).toString());
		assertEquals("(8, 5)", r.linearFibonacci(6).toString());
	}

	@Test
	void linearSumTest() {
		assertEquals(21, r.linearSum(A1, 6));
		assertEquals(15, r.linearSum(A2, 5));
		assertEquals(25, r.linearSum(A3, 4));
	}
	
	@Test
	void recursiveFactorialTest() {
		assertEquals(1, r.recursiveFactorial(0));
		assertEquals(1, r.recursiveFactorial(1));
		assertEquals(2, r.recursiveFactorial(2));
		assertEquals(6, r.recursiveFactorial(3));
		assertEquals(24, r.recursiveFactorial(4));
		assertEquals(120, r.recursiveFactorial(5));
	}

	@Test
	void reverseArrayTest() {
		assertEquals("[6, 5, 4, 3, 2, 1]", r.reverseArray(A1, 0, 5));
		assertEquals("[1, 2, 3, 4, 5]", r.reverseArray(A2, 0, 4));
		assertEquals("[7, 2, 7, 9]", r.reverseArray(A3, 0, 3));
	}
}
