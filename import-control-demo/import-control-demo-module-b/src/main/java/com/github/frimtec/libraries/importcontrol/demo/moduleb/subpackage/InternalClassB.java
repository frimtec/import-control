package com.github.frimtec.libraries.importcontrol.demo.moduleb.subpackage;

import com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA; // import ok, exported
import com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA; // import nok, not same module
import com.github.frimtec.libraries.importcontrol.demo.moduleb.NormalImport;

public class InternalClassB {
    private final InternalClassA internal1ClassA;
    private final ClassA classA;

    public InternalClassB(InternalClassA internal1ClassA, ClassA classA) {
        this.internal1ClassA = internal1ClassA;
        this.classA = classA;
    }
}
