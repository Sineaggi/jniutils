// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.DefineClass.class, "apply", constants$3.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$3.const$5
    );
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("DefineClass"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.FindClass.class, "apply", constants$4.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$4.const$3
    );
}

