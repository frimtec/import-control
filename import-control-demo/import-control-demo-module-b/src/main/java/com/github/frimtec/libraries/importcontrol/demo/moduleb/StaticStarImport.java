package com.github.frimtec.libraries.importcontrol.demo.moduleb;

// import ok, exported
import static com.github.frimtec.libraries.importcontrol.demo.modulea.ClassA.*;
// import nok, not
import static com.github.frimtec.libraries.importcontrol.demo.modulea.internal.InternalClassA.*;

@SuppressWarnings("unused")
public class StaticStarImport {

    public String method1() {
        functionA();
        return CONST_A;
    }

    public String method2() {
        functionIA();
        return CONST_IA;
    }

}
