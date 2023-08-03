package com.task;

public class IncrementExecutor implements Runnable {

	private SharedResource sharedResource;

	public IncrementExecutor(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {

		while (sharedResource.getSharedResourceValue() < 5000) {

			synchronized (sharedResource) {
				sharedResource.increment();

				Thread currentThread = Thread.currentThread();

				String name = currentThread.getName();

				System.out.println(name + ": " + sharedResource.getSharedResourceValue());
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
