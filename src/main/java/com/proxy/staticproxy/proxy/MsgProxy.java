package com.proxy.staticproxy.proxy;

import com.proxy.staticproxy.MsgFacade;

public class MsgProxy implements MsgFacade{
	private MsgFacade msgFacade;  
	
	public MsgProxy(MsgFacade msgFacade){
		this.msgFacade = msgFacade;
	}
	
	
	@Override
	public void sendMsg() {
		 System.out.println("������֮ǰ");  
	        // ����ί����ķ���;  
		 msgFacade.sendMsg();
		 
	     System.out.println("������֮��");  
	}

}
