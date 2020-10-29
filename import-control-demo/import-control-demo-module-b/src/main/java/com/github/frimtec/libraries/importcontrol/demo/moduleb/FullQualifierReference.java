package com.github.frimtec.libraries.importcontrol.demo.moduleb;

public class FullQualifierReference {

    // import ok, exported
    private final com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA classA;

    // import nok, not exported
    private final com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA internal1ClassA;

    public FullQualifierReference(
            com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA classA,
            com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA internal1ClassA) {
        this.classA = classA;
        this.internal1ClassA = internal1ClassA;
    }

    public String method1() {
        // import ok, exported
        com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA.functionA();
        // import ok, exported
        return com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA.CONST_A;
    }

    public String method2() {
        // import nok, not exported
        com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA.functionIA();

        // import nok, not exported
        return com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA.CONST_IA;
    }

}
