// Generated by jextract

package com.sineaggi.jniutils.internal.jni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$60 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$60() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(JNINativeInterface_.GetStaticFloatField.class, "apply", constants$42.const$2);
    static final VarHandle const$1 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetStaticFloatField"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(JNINativeInterface_.GetStaticDoubleField.class, "apply", constants$43.const$0);
    static final VarHandle const$3 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetStaticDoubleField"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(JNINativeInterface_.SetStaticObjectField.class, "apply", constants$26.const$4);
    static final VarHandle const$5 = constants$2.const$2.varHandle(MemoryLayout.PathElement.groupElement("SetStaticObjectField"));
}

