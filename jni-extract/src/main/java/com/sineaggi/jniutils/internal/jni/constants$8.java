// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$8 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$8() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.Throw.class, "apply", constants$7.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$7.const$5
    );
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("Throw"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.ThrowNew.class, "apply", constants$8.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$8.const$3
    );
}


