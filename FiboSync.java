package com.exe;

public class FiboSync {
	
	int a,b;
	public FiboSync(int a, int b) {
		super();
		this.a=a;
		this.b=b;
	}
	synchronized public void series() {
		for(;b<100;) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(a+"\n"+b);
			a=a+b;
			b=b+a;
		}	
	}	

}
