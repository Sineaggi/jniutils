// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_BYTE,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualBooleanMethodV.class, "apply", constants$29.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$29.const$0
    );
    static final VarHandle const$3 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualBooleanMethodV"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualBooleanMethodA.class, "apply", constants$29.const$0);
    static final VarHandle const$5 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualBooleanMethodA"));
}


