package org.jvirtanen.nio;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/**
 * This class contains methods for manipulating byte buffers.
 */
public class ByteBuffers {

    private ByteBuffers() {
    }

    /**
     * Relative <em>get</em> method for reading an unsigned byte.
     *
     * @param buffer a buffer
     * @return the unsigned byte
     * @throws BufferUnderflowException if there are no bytes remaining in
     *   the buffer
     */
    public static short getUnsigned(ByteBuffer buffer) {
        return (short)(buffer.get() & 0xff);
    }

    /**
     * Relative <em>put</em> method for writing an unsigned byte.
     *
     * @param buffer a buffer
     * @param b the unsigned byte
     * @throws BufferOverflowException if there are no bytes remaining in the
     *   buffer
     * @throws ReadOnlyBufferException if the buffer is read-only
     */
    public static void putUnsigned(ByteBuffer buffer, short b) {
        buffer.put((byte)b);
    }

    /**
     * Relative <em>get</em> method for reading an unsigned short value.
     *
     * @param buffer a buffer
     * @return the unsigned short value
     * @throws BufferUnderflowException if there are fewer than two bytes
     *   remaining in the buffer
     */
    public static int getUnsignedShort(ByteBuffer buffer) {
        return (int)(buffer.getShort() & 0xffff);
    }

    /**
     * Relative <em>put</em> method for writing an unsigned short value.
     *
     * @param buffer a buffer
     * @param value the unsigned short value
     * @throws BufferOverflowException if there are fewer than two bytes
     *   remaining in the buffer
     * @throws ReadOnlyBufferException if the buffer is read-only
     */
    public static void putUnsignedShort(ByteBuffer buffer, int value) {
        buffer.putShort((short)value);
    }

    /**
     * Relative <em>get</em> method for reading an unsigned integer value.
     *
     * @param buffer a buffer
     * @return the unsigned integer value
     * @throws BufferUnderflowException if there are fewer than four bytes
     *   remaining in the buffer
     */
    public static long getUnsignedInt(ByteBuffer buffer) {
        return (long)(buffer.getInt() & 0xffffffffL);
    }

    /**
     * Relative <em>put</em> method for writing an unsigned integer value.
     *
     * @param buffer a buffer
     * @param value the unsigned integer value
     * @throws BufferOverflowException if the are fewer than four bytes
     *   remaining in the buffer
     * @throws ReadOnlyBufferException if the buffer is read-only
     */
    public static void putUnsignedInt(ByteBuffer buffer, long value) {
        buffer.putInt((int)value);
    }

}
