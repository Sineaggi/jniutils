// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$19 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$19() {}
    static final VarHandle const$0 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallByteMethod"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallByteMethodV.class, "apply", constants$18.const$0);
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallByteMethodV"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(JNINativeInterface_.CallByteMethodA.class, "apply", constants$18.const$0);
    static final VarHandle const$4 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallByteMethodA"));
    static final VarHandle const$5 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallCharMethod"));
}

