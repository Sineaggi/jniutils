// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$91 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$91() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$90.const$4
    );
    static final VarHandle const$1 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("IsVirtualThread"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("functions")
    ).withName("JNIEnv_");
    static final VarHandle const$3 = constants$91.const$2.varHandle(MemoryLayout.PathElement.groupElement("functions"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("optionString"),
        RuntimeHelper.POINTER.withName("extraInfo")
    ).withName("JavaVMOption");
    static final VarHandle const$5 = constants$91.const$4.varHandle(MemoryLayout.PathElement.groupElement("optionString"));
}


