// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$96 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$96() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNIInvokeInterface_.AttachCurrentThreadAsDaemon.class, "apply", constants$8.const$3);
    static final VarHandle const$1 = constants$93.const$4.varHandle(MemoryLayout.PathElement.groupElement("AttachCurrentThreadAsDaemon"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("functions")
    ).withName("JavaVM_");
    static final VarHandle const$3 = constants$96.const$2.varHandle(MemoryLayout.PathElement.groupElement("functions"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "JNI_GetDefaultJavaVMInitArgs",
        constants$3.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "JNI_CreateJavaVM",
        constants$8.const$3
    );
}

