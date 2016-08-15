package com.proxy.staticproxy;

import com.proxy.staticproxy.impl.BookFacadeImpl;
import com.proxy.staticproxy.impl.MsgFacadeImpl;
import com.proxy.staticproxy.proxy.BookProxy;
import com.proxy.staticproxy.proxy.MsgProxy;

/**
 * ��̬���� ��������ͱ�������� ��Ҫ�̳���ͬһ���ӿ�
 *  	       ��ͬ�ı�������� ��Ҫ����������Ӧ�Ĵ������Ҳ���� һ��������ֻ�ܴ���һ���ӿ�
 *         �����Ҫ��ǿ�Ĺ��ܴ��붼��һ���ģ���ͻ���ɴ������ظ�����
 *         
 *  ����̬����ֻ��Ҫһ��������Ϳ��Դ�������ͬ�Ľӿ�
 * @author Celes
 *
 */
public class TestSProxyDemo {
	
	 public static void main(String[] args) {  
		 //newһ����������
		 BookFacade bookFacade = new BookFacadeImpl();
		 //newһ��������
		 BookProxy bookProxy = new BookProxy(bookFacade);
		 //ִ��
		 bookProxy.addBook();
		 
		 //newһ����������
		 MsgFacade msgFacadeImpl = new MsgFacadeImpl();
		 //newһ��������
		 MsgProxy msgProxy = new MsgProxy(msgFacadeImpl);
		 //ִ��
		 msgProxy.sendMsg();
	 }
}
