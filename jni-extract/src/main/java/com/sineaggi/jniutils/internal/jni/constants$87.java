// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$87 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$87() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.NewWeakGlobalRef.class, "apply", constants$4.const$3);
    static final VarHandle const$1 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("NewWeakGlobalRef"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(JNINativeInterface_.DeleteWeakGlobalRef.class, "apply", constants$10.const$5);
    static final VarHandle const$3 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("DeleteWeakGlobalRef"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_BYTE,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(JNINativeInterface_.ExceptionCheck.class, "apply", constants$87.const$4);
}


