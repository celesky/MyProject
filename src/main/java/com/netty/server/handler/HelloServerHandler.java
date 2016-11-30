package com.netty.server.handler;

import com.netty.server.Server;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.*;

/**
 * Created by pan on 16/8/24.
 */
public class HelloServerHandler extends
        SimpleChannelHandler {

    /**
     * ���пͻ��˰󶨵�����˵�ʱ�򴥷�����ӡ"Hello"
     *
     * @alia OneCoder
     * @author lihzh
     */
    @Override
    public void channelConnected(
            ChannelHandlerContext ctx,
            ChannelStateEvent e) {
        //System.out.println("Hello");
        Channel ch = e.getChannel();
        ChannelBuffer time = ChannelBuffers.buffer(4);
        time.writeInt((int) (System.currentTimeMillis() / 1000L + 2208988800L));

        ChannelFuture f = ch.write(time);
        //lambada��ʽ,�Լ�дʵ��
//        f.addListener((ChannelFuture future) -> {
//            Channel chl = future.getChannel();
//            chl.close();
//            System.out.println("channel closed");
//        });
//        //��ԭ�е�ʵ��
//        f.addListener(ChannelFutureListener.CLOSE);

    }

    /**
     * Invoked when a message object (e.g: {@link ChannelBuffer}) was received
     * from a remote peer.
     */
    @Override
    public void messageReceived(
            ChannelHandlerContext ctx, MessageEvent e) throws Exception {
//        ctx.sendUpstream(e);
        ChannelBuffer buf = (ChannelBuffer) e.getMessage();
        while (buf.readable()) {
            System.out.print((char) buf.readByte());
            System.out.flush();
        }
        Channel ch = e.getChannel();
        ch.write(e.getMessage());
    }

    @Override
    public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {
        Server.allChannels.add(e.getChannel());
    }
}
