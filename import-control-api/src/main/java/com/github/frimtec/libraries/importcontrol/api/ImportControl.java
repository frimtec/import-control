package com.github.frimtec.libraries.importcontrol.api;

/**
 * Checks at runtime whether a package or class is exported or not.
 * @since 1.0.0
 */
public final class ImportControl {

    private ImportControl() {
    }

    /**
     * Checks at runtime whether a class is exported or not.
     * @param clazz class to check
     * @return true: class is exported; false: class is not exported
     */
    public static boolean isExported(Class<?> clazz) {
        return isExported(clazz.getPackage());
    }

    /**
     * Checks at runtime whether a package is exported or not.
     * @param pkg package to check
     * @return true: package is exported; false: package is not exported
     */
    public static boolean isExported(Package pkg) {
        return pkg.getDeclaredAnnotation(ExportPackage.class) != null;
    }
}
