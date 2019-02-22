package com.durgasoft.multi;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("parent started:");
		Thread t=new Mythread();
		System.out.println("child is created");
		t.start();
		try {
			for(int i=0;i<5;i++) {
				System.out.println("parent:"+i);
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of the parent thread");
	}

}
