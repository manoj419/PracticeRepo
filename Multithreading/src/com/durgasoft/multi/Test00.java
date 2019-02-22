package com.durgasoft.multi;

public class Test00 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("child thread");
		}
		
	}
	public static void main(String[] args) {
		Test00 t=new Test00();
		Thread t1=new Thread(t);
		t1.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main thread");
		}
	}

}
