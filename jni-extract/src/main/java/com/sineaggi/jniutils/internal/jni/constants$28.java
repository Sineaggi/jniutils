// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$28 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$28() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualObjectMethodV.class, "apply", constants$27.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$27.const$5
    );
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualObjectMethodV"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallNonvirtualObjectMethodA.class, "apply", constants$27.const$5);
    static final VarHandle const$4 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualObjectMethodA"));
    static final VarHandle const$5 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallNonvirtualBooleanMethod"));
}


