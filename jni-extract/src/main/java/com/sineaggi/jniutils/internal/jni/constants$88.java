// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$88 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$88() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$87.const$4
    );
    static final VarHandle const$1 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("ExceptionCheck"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(JNINativeInterface_.NewDirectByteBuffer.class, "apply", constants$88.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$88.const$2
    );
    static final VarHandle const$5 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("NewDirectByteBuffer"));
}


