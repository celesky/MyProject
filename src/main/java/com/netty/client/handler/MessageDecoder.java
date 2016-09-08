package com.netty.client.handler;

import com.netty.bean.ChatMessage;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

/**
 * ��Ϣǰ�ĸ��ֽ�Ϊ���ĳ���,
 * Created by pan on 16/8/31.
 */
public class MessageDecoder extends FrameDecoder {

    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer) throws Exception {
        if (buffer.readableBytes() < 4) {
            return null;
        }

        //��ȡ��Ϣ����
        ChannelBuffer cb =  buffer.readBytes(4);
        //������Ϣ����
        StringBuffer lenB = new StringBuffer();
        while (cb.readable()) {
            lenB.append((char)cb.readByte());
        }
        //��Ϣ����
        int msglen = Integer.parseInt(lenB.toString());

        if (buffer.readableBytes() < msglen) {
            return null;
        }

        //��ȡ��Ϣ����
        ChannelBuffer msgcb =  buffer.readBytes(msglen);
        StringBuffer  msg = new StringBuffer();

        while(msgcb.readable()){
            msg.append((char)msgcb.readByte());
        }

        ChatMessage chatMessage = new ChatMessage();

        if(msg.toString().contains("\\|")){
            chatMessage.setFromClientId(Long.parseLong(msg.toString().split("\\|")[0]));
            chatMessage.setDestClientId(Long.parseLong(msg.toString().split("\\|")[1]));
            chatMessage.setMsg(msg.toString().split("\\|")[2]);
        }else{
            chatMessage.setMsg(msg.toString());
        }
        return chatMessage;
    }

}
