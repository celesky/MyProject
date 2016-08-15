package com.thread;

import java.lang.Thread.UncaughtExceptionHandler;

public class UncaughtExceptionDemo {
	 public static void main(String[] args) {
		    ErrHandler handle = null;
		    ThreadA a = null;
		 
		    a = new UncaughtExceptionDemo.ThreadA();
		    handle = new ErrHandler();
		    a.setUncaughtExceptionHandler(handle);// ���붨���ErrHandler
		    a.start();
		 
	}
	static class ErrHandler  implements UncaughtExceptionHandler{

		  /**
		   * ����������κ�����쳣�Ĵ���,�����¼��־�ȵ�
		   */
		  public void uncaughtException(Thread a, Throwable e) {
		    System.out.println("This is:" + a.getName() + ",Message:"+ e.getMessage());
		    e.printStackTrace();
		  }
		
	}
	/**
	 * ӵ��UncaughtExceptionHandler���߳�
	 */
	static class ThreadA extends Thread {
	 
		  public ThreadA() {
		  }
	 
		  public void run() {
			  double i = 12 / 0;// �׳��쳣�ĵط�
		  }
	 
	}
}
