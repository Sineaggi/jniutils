// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$34 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$34() {}
    static final VarHandle const$0 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualLongMethod"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualLongMethodV.class, "apply", constants$34.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$34.const$1
    );
    static final VarHandle const$4 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualLongMethodV"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualLongMethodA.class, "apply", constants$34.const$1);
}


