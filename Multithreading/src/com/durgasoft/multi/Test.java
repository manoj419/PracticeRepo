package com.durgasoft.multi;

public class Test {
		private static Test t;
		private Test() {
			
		}
		public static Test getInstance() {
			if(t==null) {
				t=new Test();
			}
			return t;
		}
		public Object clone() {
			return this;
		}
		Test t1=Test.getInstance();
		
}
