// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct JNINativeMethod {
 *     char* name;
 *     char* signature;
 *     void* fnPtr;
 * };
 * }
 */
public class JNINativeMethod {

    public static MemoryLayout $LAYOUT() {
        return constants$1.const$4;
    }
    public static VarHandle name$VH() {
        return constants$1.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$1.const$5.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle signature$VH() {
        return constants$2.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* signature;
     * }
     */
    public static MemorySegment signature$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* signature;
     * }
     */
    public static void signature$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$0.set(seg, x);
    }
    public static MemorySegment signature$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void signature$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fnPtr$VH() {
        return constants$2.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* fnPtr;
     * }
     */
    public static MemorySegment fnPtr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* fnPtr;
     * }
     */
    public static void fnPtr$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$1.set(seg, x);
    }
    public static MemorySegment fnPtr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void fnPtr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

