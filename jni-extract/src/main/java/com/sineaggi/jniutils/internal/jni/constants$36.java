// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$36 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$36() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualFloatMethodA.class, "apply", constants$35.const$2);
    static final VarHandle const$1 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualFloatMethodA"));
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualDoubleMethod"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_DOUBLE,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualDoubleMethodV.class, "apply", constants$36.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$36.const$3
    );
}


