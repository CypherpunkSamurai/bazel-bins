

package com.google.devtools.build.android.desugar.io;

import com.google.common.collect.ImmutableList;
import java.nio.file.Path;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_BootClassPathDigest extends BootClassPathDigest {

  private final ImmutableList<Path> bootClassPaths;

  $AutoValue_BootClassPathDigest(
      ImmutableList<Path> bootClassPaths) {
    if (bootClassPaths == null) {
      throw new NullPointerException("Null bootClassPaths");
    }
    this.bootClassPaths = bootClassPaths;
  }

  @Override
  ImmutableList<Path> bootClassPaths() {
    return bootClassPaths;
  }

  @Override
  public String toString() {
    return "BootClassPathDigest{"
         + "bootClassPaths=" + bootClassPaths
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BootClassPathDigest) {
      BootClassPathDigest that = (BootClassPathDigest) o;
      return (this.bootClassPaths.equals(that.bootClassPaths()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= bootClassPaths.hashCode();
    return h$;
  }

}
