package com.java8.lambada;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pan on 16/8/22.
 */
public class TestLambada {
    static FunctionalInterface functionalInterface;

    public static void runThreadWithLambada(){
        new Thread(()-> {
            System.out.println("thread begin...");
            System.out.println("heihei");
            }).start();
    }
    public static void runThreadUseInnerClass() {
        //���ַ�ʽ�Ͳ��ི�ˣ���ǰ�ɰ汾�Ƚϳ���������
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("�ڲ���ʵ�ֵ��߳�");
            }
        }).start();
    }
    public static void addPrint(FunctionalInterface fi){
        functionalInterface = fi;
    }
    public static void runPrint(String str,String name){
        functionalInterface.justPrint(str,name);
    }

    public static void operList(){
        List list = new ArrayList<String>();
        list.add("abc");
        list.add("efg");
        list.add("hij");

        //list.forEach(str-> System.out.println("str = " + str));
        list.forEach(System.out::println);
    }





    public static void main(String[] args) {
        TestLambada.runThreadWithLambada();

        TestLambada.addPrint((String str,String name)->{
            System.out.println(str+":"+name);
        });

        TestLambada.runPrint("hello ","jim");

        TestLambada.operList();
    }
}
