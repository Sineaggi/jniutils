// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$48 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$48() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_DOUBLE
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(JNINativeInterface_.SetDoubleField.class, "apply", constants$48.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$48.const$0
    );
    static final VarHandle const$3 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("SetDoubleField"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.GetStaticMethodID.class, "apply", constants$15.const$0);
    static final VarHandle const$5 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetStaticMethodID"));
}


