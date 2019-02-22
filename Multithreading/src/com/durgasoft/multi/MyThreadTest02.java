package com.durgasoft.multi;

public class MyThreadTest02 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			
			System.out.println("child thread");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MyThreadTest02 mt2=new MyThreadTest02();
		
		mt2.start();
		mt2.join();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}

	}

}
