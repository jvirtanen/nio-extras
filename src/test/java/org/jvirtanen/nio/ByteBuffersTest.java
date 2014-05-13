package org.jvirtanen.nio;

import static org.junit.Assert.*;
import static org.jvirtanen.nio.ByteBuffers.*;

import java.nio.ByteBuffer;
import org.junit.Test;

public class ByteBuffersTest {

    @Test
    public void gettingUnsignedByte() {
        ByteBuffer buffer = ByteBuffer.allocate(1);

        buffer.put((byte)0xff);
        buffer.flip();

        assertEquals(255, getUnsigned(buffer));
    }

    @Test
    public void puttingUnsignedByte() {
        ByteBuffer buffer = ByteBuffer.allocate(1);

        putUnsigned(buffer, (short)255);
        buffer.flip();

        assertEquals((byte)0xff, buffer.get());
    }

    @Test
    public void gettingUnsignedShort() {
        ByteBuffer buffer = ByteBuffer.allocate(2);

        buffer.putShort((short)0xffff);
        buffer.flip();

        assertEquals(65535, getUnsignedShort(buffer));
    }

    @Test
    public void puttingUnsignedShort() {
        ByteBuffer buffer = ByteBuffer.allocate(2);

        putUnsignedShort(buffer, 65535);
        buffer.flip();

        assertEquals((short)0xffff, buffer.getShort());
    }

    @Test
    public void gettingUnsignedInteger() {
        ByteBuffer buffer = ByteBuffer.allocate(4);

        buffer.putInt(0xffffffff);
        buffer.flip();

        assertEquals(4294967295L, getUnsignedInt(buffer));
    }

    @Test
    public void puttingUnsignedInteger() {
        ByteBuffer buffer = ByteBuffer.allocate(4);

        putUnsignedInt(buffer, 4294967295L);
        buffer.flip();

        assertEquals(0xffffffff, buffer.getInt());
    }

}
