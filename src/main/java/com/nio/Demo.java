package com.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo {
	
	public static void readFileInBuffer() throws Exception {
		//��FileInputStream ��ȡͨ����
		FileInputStream fin = new FileInputStream("D:\\test.txt");
		FileChannel fc = fin.getChannel();
		
		//����������
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		
		fc.read(byteBuffer);
	}
	public static void writeFileInBuffer() throws Exception {
		//��FileInputStream ��ȡͨ����
		FileOutputStream fout = new FileOutputStream( "writesomebytes.txt" );
		FileChannel fc = fout.getChannel();
		
		//����������
		ByteBuffer buffer = ByteBuffer.allocate( 1024 );
		Byte[] message = new Byte[]{1,2,3,4,5};
		for (int i=0; i<message.length; ++i) {
		     buffer.put( message[i] );
		}
		buffer.flip();
		fc.write( buffer );
	}
}
