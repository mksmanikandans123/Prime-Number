package com.multithreading;

import java.util.Scanner;

public class PrimeNumbersUsingThreads 
{
	public static void main( String[] args )
	{
		int NumberOfThreads = 2;
		for (int i = 0; i < NumberOfThreads; i++) {
			Thread ThreadObject = new Thread(new PrimeNumberCheck());
			ThreadObject.start();
		}
	}
}

class PrimeNumberCheck implements Runnable{
	@SuppressWarnings("resource")
	public synchronized void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thread " + Thread.currentThread().getId() + " -> Enter the values: ");

		int ArraySize = scanner.nextInt();
		int [] ArrayValues = new int[ArraySize]; 

		for (int i = 0; i < ArrayValues.length; i++) {
			ArrayValues[i] = i + 1;
		}

		System.out.println("Printing prime numbers using Thread "+ Thread.currentThread().getId());

		for (int i = 0; i < ArrayValues.length; i++) {
			if (CheckForPrime(ArrayValues[i])) {
				System.out.println(ArrayValues[i]);
			}
		}
		System.out.println("Runtime for thread " + Thread.currentThread().getId() +" is " + System.currentTimeMillis());
	}

	boolean CheckForPrime(int number) {
		// TODO Auto-generated method stub
		if (number <= 1) {
			return false;
		}

		int IterationValue = 2;
		while (IterationValue < number / 2) {
			if ((number % IterationValue) == 0) {
				return false;
			}
			IterationValue++;
		}
		return true;
	}
}
