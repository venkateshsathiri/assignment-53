package com.learning.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThread {

	public static void main(String[] args) {
		

		ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}