// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$37 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$37() {}
    static final VarHandle const$0 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualDoubleMethodV"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualDoubleMethodA.class, "apply", constants$36.const$3);
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualDoubleMethodA"));
    static final VarHandle const$3 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualVoidMethod"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualVoidMethodV.class, "apply", constants$37.const$4);
}


