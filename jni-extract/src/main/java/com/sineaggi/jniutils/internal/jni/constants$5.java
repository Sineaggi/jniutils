// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$5 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$5() {}
    static final VarHandle const$0 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("FindClass"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(JNINativeInterface_.FromReflectedMethod.class, "apply", constants$4.const$3);
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("FromReflectedMethod"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(JNINativeInterface_.FromReflectedField.class, "apply", constants$4.const$3);
    static final VarHandle const$4 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("FromReflectedField"));
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_BYTE
    );
}


