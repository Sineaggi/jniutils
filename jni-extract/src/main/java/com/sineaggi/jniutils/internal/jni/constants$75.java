// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$75 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$75() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.ReleaseByteArrayElements.class, "apply", constants$46.const$0);
    static final VarHandle const$1 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("ReleaseByteArrayElements"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(JNINativeInterface_.ReleaseCharArrayElements.class, "apply", constants$46.const$0);
    static final VarHandle const$3 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("ReleaseCharArrayElements"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.ReleaseShortArrayElements.class, "apply", constants$46.const$0);
    static final VarHandle const$5 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("ReleaseShortArrayElements"));
}


