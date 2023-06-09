// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct JavaVMAttachArgs {
 *     long version;
 *     char* name;
 *     struct _jobject* group;
 * };
 * }
 */
public class JavaVMAttachArgs {

    public static MemoryLayout $LAYOUT() {
        return constants$93.const$0;
    }
    public static VarHandle version$VH() {
        return constants$93.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long version;
     * }
     */
    public static int version$get(MemorySegment seg) {
        return (int)constants$93.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long version;
     * }
     */
    public static void version$set(MemorySegment seg, int x) {
        constants$93.const$1.set(seg, x);
    }
    public static int version$get(MemorySegment seg, long index) {
        return (int)constants$93.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void version$set(MemorySegment seg, long index, int x) {
        constants$93.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle name$VH() {
        return constants$93.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$93.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$93.const$2.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$93.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$93.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle group$VH() {
        return constants$93.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _jobject* group;
     * }
     */
    public static MemorySegment group$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$93.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _jobject* group;
     * }
     */
    public static void group$set(MemorySegment seg, MemorySegment x) {
        constants$93.const$3.set(seg, x);
    }
    public static MemorySegment group$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$93.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void group$set(MemorySegment seg, long index, MemorySegment x) {
        constants$93.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


