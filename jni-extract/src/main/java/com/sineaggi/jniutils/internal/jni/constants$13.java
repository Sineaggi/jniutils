// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$13 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$13() {}
    static final VarHandle const$0 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("DeleteGlobalRef"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(JNINativeInterface_.DeleteLocalRef.class, "apply", constants$10.const$5);
    static final VarHandle const$2 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("DeleteLocalRef"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(JNINativeInterface_.IsSameObject.class, "apply", constants$6.const$5);
    static final VarHandle const$4 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("IsSameObject"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(JNINativeInterface_.NewLocalRef.class, "apply", constants$4.const$3);
}

