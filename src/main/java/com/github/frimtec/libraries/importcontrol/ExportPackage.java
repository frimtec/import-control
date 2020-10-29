package com.github.frimtec.libraries.importcontrol;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this package of a module is designed to be exported.
 * All contained public classes are allowed to be imported from other modules.
 *
 * @since 1.0.0
 */
@Target({ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface ExportPackage {
}
