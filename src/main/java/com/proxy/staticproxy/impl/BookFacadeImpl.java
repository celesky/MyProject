package com.proxy.staticproxy.impl;

import com.proxy.staticproxy.BookFacade;

/**
 * �鼮����ʵ����
 * ���������
 * @author Celes
 *
 */
public class BookFacadeImpl implements BookFacade{

	@Override
	public void addBook() {
		System.out.println("����ͼ�����ͨ����...");  
	}

}
