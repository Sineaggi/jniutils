// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct jawt {
 *     long version;
 *     struct jawt_DrawingSurface* (*GetDrawingSurface)(struct JNINativeInterface_**,struct _jobject*);
 *     void (*FreeDrawingSurface)(struct jawt_DrawingSurface*);
 *     void (*Lock)(struct JNINativeInterface_**);
 *     void (*Unlock)(struct JNINativeInterface_**);
 *     struct _jobject* (*GetComponent)(struct JNINativeInterface_**,void*);
 *     struct _jobject* (*CreateEmbeddedFrame)(struct JNINativeInterface_**,void*);
 *     void (*SetBounds)(struct JNINativeInterface_**,struct _jobject*,long,long,long,long);
 *     void (*SynthesizeWindowActivation)(struct JNINativeInterface_**,struct _jobject*,unsigned char);
 * };
 * }
 */
public class jawt {

    public static MemoryLayout $LAYOUT() {
        return constants$101.const$1;
    }
    public static VarHandle version$VH() {
        return constants$101.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long version;
     * }
     */
    public static int version$get(MemorySegment seg) {
        return (int)constants$101.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long version;
     * }
     */
    public static void version$set(MemorySegment seg, int x) {
        constants$101.const$2.set(seg, x);
    }
    public static int version$get(MemorySegment seg, long index) {
        return (int)constants$101.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void version$set(MemorySegment seg, long index, int x) {
        constants$101.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * struct jawt_DrawingSurface* (*GetDrawingSurface)(struct JNINativeInterface_**,struct _jobject*);
     * }
     */
    public interface GetDrawingSurface {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetDrawingSurface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(constants$101.const$3, fi, constants$4.const$3, scope);
        }
        static GetDrawingSurface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$4.const$5.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetDrawingSurface$VH() {
        return constants$101.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct jawt_DrawingSurface* (*GetDrawingSurface)(struct JNINativeInterface_**,struct _jobject*);
     * }
     */
    public static MemorySegment GetDrawingSurface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$101.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct jawt_DrawingSurface* (*GetDrawingSurface)(struct JNINativeInterface_**,struct _jobject*);
     * }
     */
    public static void GetDrawingSurface$set(MemorySegment seg, MemorySegment x) {
        constants$101.const$4.set(seg, x);
    }
    public static MemorySegment GetDrawingSurface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$101.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void GetDrawingSurface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$101.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetDrawingSurface GetDrawingSurface(MemorySegment segment, SegmentScope scope) {
        return GetDrawingSurface.ofAddress(GetDrawingSurface$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*FreeDrawingSurface)(struct jawt_DrawingSurface*);
     * }
     */
    public interface FreeDrawingSurface {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(FreeDrawingSurface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(constants$101.const$5, fi, constants$9.const$5, scope);
        }
        static FreeDrawingSurface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    constants$10.const$1.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle FreeDrawingSurface$VH() {
        return constants$102.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*FreeDrawingSurface)(struct jawt_DrawingSurface*);
     * }
     */
    public static MemorySegment FreeDrawingSurface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$102.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*FreeDrawingSurface)(struct jawt_DrawingSurface*);
     * }
     */
    public static void FreeDrawingSurface$set(MemorySegment seg, MemorySegment x) {
        constants$102.const$0.set(seg, x);
    }
    public static MemorySegment FreeDrawingSurface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$102.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeDrawingSurface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$102.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static FreeDrawingSurface FreeDrawingSurface(MemorySegment segment, SegmentScope scope) {
        return FreeDrawingSurface.ofAddress(FreeDrawingSurface$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Lock)(struct JNINativeInterface_**);
     * }
     */
    public interface Lock {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Lock fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(constants$102.const$1, fi, constants$9.const$5, scope);
        }
        static Lock ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    constants$10.const$1.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Lock$VH() {
        return constants$102.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Lock)(struct JNINativeInterface_**);
     * }
     */
    public static MemorySegment Lock$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$102.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Lock)(struct JNINativeInterface_**);
     * }
     */
    public static void Lock$set(MemorySegment seg, MemorySegment x) {
        constants$102.const$2.set(seg, x);
    }
    public static MemorySegment Lock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$102.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Lock$set(MemorySegment seg, long index, MemorySegment x) {
        constants$102.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Lock Lock(MemorySegment segment, SegmentScope scope) {
        return Lock.ofAddress(Lock$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Unlock)(struct JNINativeInterface_**);
     * }
     */
    public interface Unlock {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Unlock fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(constants$102.const$3, fi, constants$9.const$5, scope);
        }
        static Unlock ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    constants$10.const$1.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Unlock$VH() {
        return constants$102.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Unlock)(struct JNINativeInterface_**);
     * }
     */
    public static MemorySegment Unlock$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$102.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Unlock)(struct JNINativeInterface_**);
     * }
     */
    public static void Unlock$set(MemorySegment seg, MemorySegment x) {
        constants$102.const$4.set(seg, x);
    }
    public static MemorySegment Unlock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$102.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Unlock$set(MemorySegment seg, long index, MemorySegment x) {
        constants$102.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unlock Unlock(MemorySegment segment, SegmentScope scope) {
        return Unlock.ofAddress(Unlock$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _jobject* (*GetComponent)(struct JNINativeInterface_**,void*);
     * }
     */
    public interface GetComponent {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetComponent fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(constants$102.const$5, fi, constants$4.const$3, scope);
        }
        static GetComponent ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$4.const$5.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetComponent$VH() {
        return constants$103.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _jobject* (*GetComponent)(struct JNINativeInterface_**,void*);
     * }
     */
    public static MemorySegment GetComponent$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$103.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _jobject* (*GetComponent)(struct JNINativeInterface_**,void*);
     * }
     */
    public static void GetComponent$set(MemorySegment seg, MemorySegment x) {
        constants$103.const$0.set(seg, x);
    }
    public static MemorySegment GetComponent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$103.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void GetComponent$set(MemorySegment seg, long index, MemorySegment x) {
        constants$103.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetComponent GetComponent(MemorySegment segment, SegmentScope scope) {
        return GetComponent.ofAddress(GetComponent$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _jobject* (*CreateEmbeddedFrame)(struct JNINativeInterface_**,void*);
     * }
     */
    public interface CreateEmbeddedFrame {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(CreateEmbeddedFrame fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(constants$103.const$1, fi, constants$4.const$3, scope);
        }
        static CreateEmbeddedFrame ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$4.const$5.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle CreateEmbeddedFrame$VH() {
        return constants$103.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _jobject* (*CreateEmbeddedFrame)(struct JNINativeInterface_**,void*);
     * }
     */
    public static MemorySegment CreateEmbeddedFrame$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$103.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _jobject* (*CreateEmbeddedFrame)(struct JNINativeInterface_**,void*);
     * }
     */
    public static void CreateEmbeddedFrame$set(MemorySegment seg, MemorySegment x) {
        constants$103.const$2.set(seg, x);
    }
    public static MemorySegment CreateEmbeddedFrame$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$103.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateEmbeddedFrame$set(MemorySegment seg, long index, MemorySegment x) {
        constants$103.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateEmbeddedFrame CreateEmbeddedFrame(MemorySegment segment, SegmentScope scope) {
        return CreateEmbeddedFrame.ofAddress(CreateEmbeddedFrame$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*SetBounds)(struct JNINativeInterface_**,struct _jobject*,long,long,long,long);
     * }
     */
    public interface SetBounds {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, int _x4, int _x5);
        static MemorySegment allocate(SetBounds fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(constants$103.const$4, fi, constants$103.const$3, scope);
        }
        static SetBounds ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, int __x4, int __x5) -> {
                try {
                    constants$103.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SetBounds$VH() {
        return constants$104.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*SetBounds)(struct JNINativeInterface_**,struct _jobject*,long,long,long,long);
     * }
     */
    public static MemorySegment SetBounds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$104.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*SetBounds)(struct JNINativeInterface_**,struct _jobject*,long,long,long,long);
     * }
     */
    public static void SetBounds$set(MemorySegment seg, MemorySegment x) {
        constants$104.const$0.set(seg, x);
    }
    public static MemorySegment SetBounds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$104.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SetBounds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$104.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetBounds SetBounds(MemorySegment segment, SegmentScope scope) {
        return SetBounds.ofAddress(SetBounds$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*SynthesizeWindowActivation)(struct JNINativeInterface_**,struct _jobject*,unsigned char);
     * }
     */
    public interface SynthesizeWindowActivation {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, byte _x2);
        static MemorySegment allocate(SynthesizeWindowActivation fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(constants$104.const$2, fi, constants$104.const$1, scope);
        }
        static SynthesizeWindowActivation ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, byte __x2) -> {
                try {
                    constants$104.const$3.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SynthesizeWindowActivation$VH() {
        return constants$104.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*SynthesizeWindowActivation)(struct JNINativeInterface_**,struct _jobject*,unsigned char);
     * }
     */
    public static MemorySegment SynthesizeWindowActivation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$104.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*SynthesizeWindowActivation)(struct JNINativeInterface_**,struct _jobject*,unsigned char);
     * }
     */
    public static void SynthesizeWindowActivation$set(MemorySegment seg, MemorySegment x) {
        constants$104.const$4.set(seg, x);
    }
    public static MemorySegment SynthesizeWindowActivation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$104.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void SynthesizeWindowActivation$set(MemorySegment seg, long index, MemorySegment x) {
        constants$104.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static SynthesizeWindowActivation SynthesizeWindowActivation(MemorySegment segment, SegmentScope scope) {
        return SynthesizeWindowActivation.ofAddress(SynthesizeWindowActivation$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


