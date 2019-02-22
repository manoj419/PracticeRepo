package com.durgasoft.multi;

public class MyThreadTest extends Thread {
	@Override
	public void start() {
		super.start();
		System.out.println("start method");
	}
	@Override
	public void run() {
		
		System.out.println("run");
	}
	public static void main(String[] args) {
		MyThreadTest t=new MyThreadTest();
		t.start();
		System.out.println("main thread started");

	}

}
