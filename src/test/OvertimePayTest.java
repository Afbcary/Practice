package test;

import org.junit.Test;

import main.OvertimePay;

public class OvertimePayTest {

	private OvertimePay overtimePay = new OvertimePay();
	private double salary = 7.5;
	private int hours = 12;

	@Test
	public void runAndTimeAllTests() {
		long startTime = System.nanoTime();
		testPay();
		long endTime = System.nanoTime();
		System.out.println("time: " + (endTime - startTime));
		System.out.println();

		startTime = System.nanoTime();
		testPay2();
		endTime = System.nanoTime();
		System.out.println("time: " + (endTime - startTime));
		System.out.println();

		startTime = System.nanoTime();
		testPay3();
		endTime = System.nanoTime();
		System.out.println("time: " + (endTime - startTime));
		System.out.println();

		startTime = System.nanoTime();
		testPayWithIF();
		endTime = System.nanoTime();
		System.out.println("time: " + (endTime - startTime));
		System.out.println();

	}

	@Test
	public void testPay() {
		double total = overtimePay.paywithMATH(salary, hours);
		System.out.println("paywithMATH: " + total);
	}

	@Test
	public void testPay2() {
		double total = overtimePay.payWithWhile(salary, hours);
		System.out.println("payWithWhile: " + total);
	}

	@Test
	public void testPay3() {
		double total = overtimePay.payPrimitive(salary, hours);
		System.out.println("payPrimitive: " + total);
	}

	@Test
	public void testPayWithIF() {
		double total = overtimePay.payWithIf(salary, hours);
		System.out.println("payWithIf: " + total);
	}
}
