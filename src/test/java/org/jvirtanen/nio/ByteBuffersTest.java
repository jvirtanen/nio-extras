package org.jvirtanen.nio;

import static org.junit.Assert.*;
import static org.jvirtanen.nio.ByteBuffers.*;

import java.nio.ByteBuffer;
import org.junit.Test;

public class ByteBuffersTest {

    @Test
    public void gettingRelativeUnsignedByte() {
        ByteBuffer buffer = ByteBuffer.allocate(1);

        buffer.put((byte)0xff);
        buffer.flip();

        assertEquals(255, getUnsigned(buffer));
    }

    @Test
    public void gettingAbsoluteUnsignedByte() {
        ByteBuffer buffer = ByteBuffer.allocate(1);

        buffer.put((byte)0xff);
        buffer.flip();

        assertEquals(255, getUnsigned(buffer, 0));
    }

    @Test
    public void puttingRelativeUnsignedByte() {
        ByteBuffer buffer = ByteBuffer.allocate(1);

        putUnsigned(buffer, (short)255);
        buffer.flip();

        assertEquals((byte)0xff, buffer.get());
    }

    @Test
    public void puttingAbsoluteUnsignedByte() {
        ByteBuffer buffer = ByteBuffer.allocate(1);

        putUnsigned(buffer, 0, (short)255);

        assertEquals((byte)0xff, buffer.get());
    }

    @Test
    public void gettingRelativeUnsignedShort() {
        ByteBuffer buffer = ByteBuffer.allocate(2);

        buffer.putShort((short)0xffff);
        buffer.flip();

        assertEquals(65535, getUnsignedShort(buffer));
    }

    @Test
    public void gettingAbsoluteUnsignedShort() {
        ByteBuffer buffer = ByteBuffer.allocate(2);

        buffer.putShort((short)0xffff);
        buffer.flip();

        assertEquals(65535, getUnsignedShort(buffer, 0));
    }

    @Test
    public void puttingRelativeUnsignedShort() {
        ByteBuffer buffer = ByteBuffer.allocate(2);

        putUnsignedShort(buffer, 65535);
        buffer.flip();

        assertEquals((short)0xffff, buffer.getShort());
    }

    @Test
    public void puttingAbsoluteUnsignedShort() {
        ByteBuffer buffer = ByteBuffer.allocate(2);

        putUnsignedShort(buffer, 0, 65535);

        assertEquals((short)0xffff, buffer.getShort());
    }

    @Test
    public void gettingRelativeUnsignedInteger() {
        ByteBuffer buffer = ByteBuffer.allocate(4);

        buffer.putInt(0xffffffff);
        buffer.flip();

        assertEquals(4294967295L, getUnsignedInt(buffer));
    }

    @Test
    public void gettingAbsoluteUnsignedInteger() {
        ByteBuffer buffer = ByteBuffer.allocate(4);

        buffer.putInt(0xffffffff);
        buffer.flip();

        assertEquals(4294967295L, getUnsignedInt(buffer, 0));
    }

    @Test
    public void puttingRelativeUnsignedInteger() {
        ByteBuffer buffer = ByteBuffer.allocate(4);

        putUnsignedInt(buffer, 4294967295L);
        buffer.flip();

        assertEquals(0xffffffff, buffer.getInt());
    }

    @Test
    public void puttingAbsoluteUnsignedInteger() {
        ByteBuffer buffer = ByteBuffer.allocate(4);

        putUnsignedInt(buffer, 0, 4294967295L);

        assertEquals(0xffffffff, buffer.getInt());
    }

}
