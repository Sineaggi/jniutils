// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$92 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$92() {}
    static final VarHandle const$0 = constants$91.const$4.varHandle(MemoryLayout.PathElement.groupElement("extraInfo"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("version"),
        JAVA_INT.withName("nOptions"),
        RuntimeHelper.POINTER.withName("options"),
        JAVA_BYTE.withName("ignoreUnrecognized"),
        MemoryLayout.paddingLayout(56)
    ).withName("JavaVMInitArgs");
    static final VarHandle const$2 = constants$92.const$1.varHandle(MemoryLayout.PathElement.groupElement("version"));
    static final VarHandle const$3 = constants$92.const$1.varHandle(MemoryLayout.PathElement.groupElement("nOptions"));
    static final VarHandle const$4 = constants$92.const$1.varHandle(MemoryLayout.PathElement.groupElement("options"));
    static final VarHandle const$5 = constants$92.const$1.varHandle(MemoryLayout.PathElement.groupElement("ignoreUnrecognized"));
}


