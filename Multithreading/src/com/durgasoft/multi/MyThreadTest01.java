package com.durgasoft.multi;
/* this is second upadte*/
public class MyThreadTest01 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("prdhas");
		System.out.println(Thread.currentThread().getName());

	}

}
