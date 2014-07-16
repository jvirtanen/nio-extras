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
     * Absolute <em>get</em> method for reading an unsigned byte.
     *
     * @param buffer a buffer
     * @param index the index from which the unsigned byte will be read
     * @return the unsigned byte at the given index
     * @throws IndexOutOfBoundsException if the index is negative or not
     *   smaller than the buffer's limit
     */
    public static short getUnsigned(ByteBuffer buffer, int index) {
        return (short)(buffer.get(index) & 0xff);
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
     * Absolute <em>put</em> method for writing an unsigned byte.
     *
     * @param buffer a buffer
     * @param index the index at which the unsigned byte will be written
     * @param b the unsigned byte
     * @throws IndexOutOfBoundsException if the index is negative or not
     *   smaller than the buffer's limit
     * @throws ReadOnlyBufferException if the buffer is read-only
     */
    public static void putUnsigned(ByteBuffer buffer, int index, short b) {
        buffer.put(index, (byte)b);
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
     * Absolute <em>get</em> method for reading an unsigned short value.
     *
     * @param buffer a buffer
     * @param index the index from which the unsigned short value will be
     *   read
     * @return the unsigned short value at the given index
     * @throws IndexOutOfBoundsException if the index is negative or not
     *   smaller than the buffer's limit, minus one
     */
    public static int getUnsignedShort(ByteBuffer buffer, int index) {
        return (int)(buffer.getShort(index) & 0xffff);
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
     * Absolute <em>put</em> method for writing an unsigned short value.
     *
     * @param buffer a buffer
     * @param index the index at which the unsigned short value will be
     *   written
     * @param value the unsigned short value
     * @throws IndexOutOfBoundsException if the index is negative or not
     *   smaller than the buffer's limit, minus one
     * @throws ReadOnlyBufferException if the buffer is read-only
     */
    public static void putUnsignedShort(ByteBuffer buffer, int index, int value) {
        buffer.putShort(index, (short)value);
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
     * Absolute <em>get</em> method for reading an unsigned integer value.
     *
     * @param buffer a buffer
     * @param index the index from which the unsigned integer value will be
     *   read
     * @return the unsigned integer value at the given index
     * @throws IndexOutOfBoundsException if the index is negative or not
     *   smaller than the buffer's limit, minus three
     */
    public static long getUnsignedInt(ByteBuffer buffer, int index) {
        return (long)(buffer.getInt(index) & 0xffffffffL);
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

    /**
     * Absolute <em>put</em> method for writing an unsigned integer value.
     *
     * @param buffer a buffer
     * @param index the index at which the unsigned integer value will be
     *   written
     * @param value the unsigned integer value
     * @throws IndexOutOfBoundsException if the index is negative or not
     *   smaller than the buffer's limit, minus three
     * @throws ReadOnlyBufferException if the buffer is read-only
     */
    public static void putUnsignedInt(ByteBuffer buffer, int index, long value) {
        buffer.putInt(index, (int)value);
    }

}
