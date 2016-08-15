package com.proxy.cglib;

import com.proxy.cglib.byproxy.BookFacadeImpl;
import com.proxy.cglib.byproxy.MsgFacadeImpl;
import com.proxy.cglib.proxy.BookFacadeCglib;

/**
 * cglib��̬����
 *1. һ��������Ϳ��Դ�������ͬ�ı��������
 *2. ������Ҫͬ������ǿ���룬ֻ��Ҫ��һ����������ʵ�־Ϳ��ԡ�
 * 
 * JDK�Ķ�̬�������ֻ�ܴ���ʵ���˽ӿڵ��࣬������ʵ�ֽӿڵ���Ͳ���ʵ��JDK�Ķ�̬����
 * cglib���������ʵ�ִ���ģ�����ԭ���Ƕ�ָ����Ŀ��������һ�����࣬���������з���ʵ����ǿ��
 * ����Ϊ���õ��Ǽ̳У����Բ��ܶ�final���ε�����д��� 
 * @author Celes
 *
 */
public class TestCglibDemo {
	
	 public static void main(String[] args) {  
		    //newһ��������
	        BookFacadeCglib cglib=new BookFacadeCglib();  
	        //���ɴ���֮���bookimpl
	        BookFacadeImpl bookProxyImpl=(BookFacadeImpl)cglib.getInstance(new BookFacadeImpl());  
	        bookProxyImpl.addBook();  
	        bookProxyImpl.delBook();
	        //���ɴ���֮���msgImpl
	        MsgFacadeImpl msgProxyImpl=(MsgFacadeImpl)cglib.getInstance(new MsgFacadeImpl());  
	        msgProxyImpl.sendMsg();
	}  
}
