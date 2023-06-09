// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct jawt_DrawingSurfaceInfo {
 *     void* platformInfo;
 *     struct jawt_DrawingSurface* ds;
 *     struct jawt_Rectangle bounds;
 *     long clipSize;
 *     struct jawt_Rectangle* clip;
 * };
 * }
 */
public class jawt_DrawingSurfaceInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$98.const$3;
    }
    public static VarHandle platformInfo$VH() {
        return constants$98.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* platformInfo;
     * }
     */
    public static MemorySegment platformInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$98.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* platformInfo;
     * }
     */
    public static void platformInfo$set(MemorySegment seg, MemorySegment x) {
        constants$98.const$4.set(seg, x);
    }
    public static MemorySegment platformInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$98.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void platformInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$98.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ds$VH() {
        return constants$98.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct jawt_DrawingSurface* ds;
     * }
     */
    public static MemorySegment ds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$98.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct jawt_DrawingSurface* ds;
     * }
     */
    public static void ds$set(MemorySegment seg, MemorySegment x) {
        constants$98.const$5.set(seg, x);
    }
    public static MemorySegment ds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$98.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$98.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bounds$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static VarHandle clipSize$VH() {
        return constants$99.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long clipSize;
     * }
     */
    public static int clipSize$get(MemorySegment seg) {
        return (int)constants$99.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long clipSize;
     * }
     */
    public static void clipSize$set(MemorySegment seg, int x) {
        constants$99.const$0.set(seg, x);
    }
    public static int clipSize$get(MemorySegment seg, long index) {
        return (int)constants$99.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void clipSize$set(MemorySegment seg, long index, int x) {
        constants$99.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle clip$VH() {
        return constants$99.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct jawt_Rectangle* clip;
     * }
     */
    public static MemorySegment clip$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$99.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct jawt_Rectangle* clip;
     * }
     */
    public static void clip$set(MemorySegment seg, MemorySegment x) {
        constants$99.const$1.set(seg, x);
    }
    public static MemorySegment clip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$99.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void clip$set(MemorySegment seg, long index, MemorySegment x) {
        constants$99.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


