package com.proxy.cglib.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * ������
 * ������ǿ������Ķ������Ϊ
 * @author Celes
 *
 */
public class BookFacadeCglib implements MethodInterceptor  {

		private Object target;  
	  
	    /** 
	     * ����������� 
	     *  
	     * @param target 
	     * @return 
	     */  
	    public Object getInstance(Object target) {  
	        this.target = target;  
	        Enhancer enhancer = new Enhancer();  
	        enhancer.setSuperclass(this.target.getClass());  
	        // �ص�����  
	        enhancer.setCallback(this);  
	        // �����������  
	        return enhancer.create();  
	    }  
	  
	    @Override  
	    // �ص�����  
	    public Object intercept(Object obj, Method method, Object[] args,  
	            MethodProxy proxy) throws Throwable {  
	        System.out.println("���￪ʼ");  
	        proxy.invokeSuper(obj, args);  
	        System.out.println("�������");  
	        return null;  
	    }  
	  
}
