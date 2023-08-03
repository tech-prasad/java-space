package com.task;

public class IncrementProcessor {
	public static void main(String[] args) throws InterruptedException {

		Thread currentThread = Thread.currentThread();

		String name = currentThread.getName();

		System.out.println(name);

		SharedResource resource = new SharedResource();

		IncrementExecutor executor = new IncrementExecutor(resource);

		Thread t1 = new Thread(executor);
		t1.setName("First");
		t1.setDaemon(true);

		t1.start();

		System.out.println(resource.getSharedResourceValue());

		System.out.println("Done");
	}
}
