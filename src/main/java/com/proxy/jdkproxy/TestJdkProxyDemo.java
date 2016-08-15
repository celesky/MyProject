package com.proxy.jdkproxy;

import com.proxy.jdkproxy.impl.BookFacadeImpl;
import com.proxy.jdkproxy.proxy.BookFacadeProxy;

/**
 * * cglib��̬����
 *1. һ��������Ϳ��Դ�������ͬ�ı��������
 *2. ������Ҫͬ������ǿ���룬ֻ��Ҫ��һ����������ʵ�־Ϳ��ԡ�
 * 
 * JDK�Ķ�̬�������ֻ�ܴ���ʵ���˽ӿڵ��࣬������ʵ�ֽӿڵ���Ͳ���ʵ��JDK�Ķ�̬����
 * cglib���������ʵ�ִ���ģ�����ԭ���Ƕ�ָ����Ŀ��������һ�����࣬���������з���ʵ����ǿ��
 * ����Ϊ���õ��Ǽ̳У����Բ��ܶ�final���ε�����д��� 
 * @author Celes
 *
 */
public class TestJdkProxyDemo {
	public static void main(String[] args) {  
        BookFacadeProxy proxy = new BookFacadeProxy();  
        BookFacade bookProxyImpl = (BookFacade) proxy.bind(new BookFacadeImpl());  
        bookProxyImpl.addBook();  
        
        //�����Դ��������Ķ���
//        MsgFacade msgProxyImpl = (MsgFacade) proxy.bind(new MsgFacadeImpl());  
//        msgProxyImpl.sendMsg();
        
    }  
}	
