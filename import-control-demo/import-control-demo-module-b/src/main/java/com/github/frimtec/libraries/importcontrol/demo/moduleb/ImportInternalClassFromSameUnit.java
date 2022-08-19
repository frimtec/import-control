package com.github.frimtec.libraries.importcontrol.demo.moduleb;

import com.github.frimtec.libraries.importcontrol.demo.moduleb.subpackage.InternalClassB; // import ok, same module

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class ImportInternalClassFromSameUnit {
    private final InternalClassB internalClassB;

    public ImportInternalClassFromSameUnit(InternalClassB internalClassB) {
        this.internalClassB = internalClassB;
    }
}
