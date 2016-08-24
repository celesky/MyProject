package com.netty;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.*;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

public class Client {
	
	public static void main(String args[]) {  
        // Client����������  
        ClientBootstrap bootstrap = new ClientBootstrap(  
                new NioClientSocketChannelFactory(  
                        Executors.newCachedThreadPool(),  
                        Executors.newCachedThreadPool()));  
        // ����һ������������Ϣ�͸�����Ϣ�¼�����(Handler)  
//        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
//            @Override
//            public ChannelPipeline getPipeline() throws Exception {
//                return Channels.pipeline(new HelloClientHandler());
//            }
//        });
        bootstrap.setPipelineFactory(()->Channels.pipeline(new HelloClientHandler()));

        // ���ӵ����ص�8000�˿ڵķ����  
        bootstrap.connect(new InetSocketAddress(  
                "127.0.0.1", 8000));
    }  
  
    private static class HelloClientHandler extends SimpleChannelHandler {  
  
  
        /** 
         * ���󶨵�����˵�ʱ�򴥷�����ӡ"Hello world, I'm client." 
         *  
         * @alia OneCoder 
         * @author lihzh 
         */  
        @Override  
        public void channelConnected(ChannelHandlerContext ctx,  
                ChannelStateEvent e) {  
            System.out.println("Hello world, I'm client.");  
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e){
            System.out.println("�����쳣��");
        }
    }  
}
