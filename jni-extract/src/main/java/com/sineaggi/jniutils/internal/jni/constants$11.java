// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$11 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$11() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.FatalError.class, "apply", constants$10.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$10.const$5
    );
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("FatalError"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.PushLocalFrame.class, "apply", constants$11.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$11.const$3
    );
}

