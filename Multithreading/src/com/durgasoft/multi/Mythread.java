package com.durgasoft.multi;

public class Mythread extends Thread{
	public Mythread() {
		super("child");
	}
	@Override
	public void run() {
		System.out.println("child is started");
		try {
			for(int i=0;i<5;i++) {
				System.out.println("child :"+i);
				Thread.sleep(300);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of the childthread");
	}

}
