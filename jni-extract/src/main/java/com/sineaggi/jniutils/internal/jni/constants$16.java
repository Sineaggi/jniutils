// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$16 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$16() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.GetObjectClass.class, "apply", constants$4.const$3);
    static final VarHandle const$1 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetObjectClass"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(JNINativeInterface_.IsInstanceOf.class, "apply", constants$6.const$5);
    static final VarHandle const$3 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("IsInstanceOf"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.GetMethodID.class, "apply", constants$15.const$0);
    static final VarHandle const$5 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetMethodID"));
}


