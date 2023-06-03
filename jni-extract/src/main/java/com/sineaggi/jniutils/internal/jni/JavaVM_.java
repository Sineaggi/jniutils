// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct JavaVM_ {
 *     struct JNIInvokeInterface_* functions;
 * };
 * }
 */
public class JavaVM_ {

    public static MemoryLayout $LAYOUT() {
        return constants$96.const$2;
    }
    public static VarHandle functions$VH() {
        return constants$96.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct JNIInvokeInterface_* functions;
     * }
     */
    public static MemorySegment functions$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$96.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct JNIInvokeInterface_* functions;
     * }
     */
    public static void functions$set(MemorySegment seg, MemorySegment x) {
        constants$96.const$3.set(seg, x);
    }
    public static MemorySegment functions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$96.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void functions$set(MemorySegment seg, long index, MemorySegment x) {
        constants$96.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


