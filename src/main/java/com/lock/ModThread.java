package com.lock;

public class ModThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("���������У�����asleep=false");
            LockDemo.asleep = false;
        }
    }

}
