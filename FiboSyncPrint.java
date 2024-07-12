package com.exe;

public class FiboSyncPrint extends Thread {
	FiboSync f;
	public FiboSyncPrint(FiboSync f) {
		super();
		this.f=f;
	}
	public void run() {
		f.series();
	}

	public static void main(String[] args) {
		int x=0,y=1;
		FiboSync fs=new FiboSync(x,y);
		FiboSyncPrint fp= new FiboSyncPrint(fs);
		fp.start();
		FiboSyncPrint fp1= new FiboSyncPrint(fs);
		fp1.start();
		FiboSyncPrint fp2= new FiboSyncPrint(fs);
		fp2.start();

	}

}
