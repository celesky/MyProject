package com.lock;

public class VolatileDemo extends Thread {
    //�����ྲ̬����,���̷߳�����ͬһ�������
    private volatile boolean flag = false;

    //����ѭ��,�ȴ�flag��Ϊtrueʱ������ѭ��
    public void run() {
        while (!flag) {
            System.out.println("ѭ��ִ����....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        ;

    }

    public static void main(String[] args) throws Exception {
        VolatileDemo demo = new VolatileDemo();
        demo.start();
        //sleep��Ŀ���ǵȴ��߳��������,Ҳ����˵����run������ѭ������
        Thread.sleep(5000);
        demo.flag = true;

    }
//      public void test(){
//    	  ReentrantLock rl =  new ReentrantLock();
//  		  rl.lock();
//  		  AtomicReference<Integer> ar = new AtomicReference<Integer>();
//  		  ar.compareAndSet(1, 2);
//  		  
//  		  System.out.println(11);
//      }

}
