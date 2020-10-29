package com.github.frimtec.libraries.importcontrol.api;

import org.junit.jupiter.api.Test;
import com.github.frimtec.libraries.importcontrol.api.exported.Exported;
import com.github.frimtec.libraries.importcontrol.api.internal.Internal;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImportControlTest {
  @Test
  void isExportedForExportedClassReturnsTrue() {
      assertTrue(ImportControl.isExported(Exported.class));
  }

  @Test
  void isExportedForExportedPackageReturnsTrue() {
      assertTrue(ImportControl.isExported(Exported.class.getPackage()));
  }

  @Test
  void isExportedForInternaledClassReturnsFalse() {
      assertFalse(ImportControl.isExported(Internal.class));
  }

  @Test
  void isExportedForInternalPackageReturnsFalse() {
      assertFalse(ImportControl.isExported(Internal.class.getPackage()));
  }
}
