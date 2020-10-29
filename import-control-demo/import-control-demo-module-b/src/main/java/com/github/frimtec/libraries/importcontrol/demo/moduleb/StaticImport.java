package com.github.frimtec.libraries.importcontrol.demo.moduleb;

// import ok, exported
import static com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA.functionA;
// import ok, exported
import static com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA.CONST_A;

// import nok, not exported
import static com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA.functionIA;
// import nok, not exported
import static com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA.CONST_IA;

public class StaticImport {

    public String method1() {
        functionA();
        return CONST_A;
    }

    public String method2() {
        functionIA();
        return CONST_IA;
    }

}
