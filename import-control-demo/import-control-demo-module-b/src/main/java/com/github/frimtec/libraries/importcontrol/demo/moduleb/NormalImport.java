package com.github.frimtec.libraries.importcontrol.demo.moduleb;

// Import ok, exported
import com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA;
// Import nok, not exported
import com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA;

public class NormalImport {
    private final ClassA classA;
    private final InternalClassA internalClassA;

    public NormalImport(ClassA classA, InternalClassA internalClassA) {
        this.classA = classA;
        this.internalClassA = internalClassA;
    }

    public String method1() {
        ClassA.functionA();
        return ClassA.CONST_A;
    }

    public String method2() {
        InternalClassA.functionIA();
        return InternalClassA.CONST_IA;
    }
}
