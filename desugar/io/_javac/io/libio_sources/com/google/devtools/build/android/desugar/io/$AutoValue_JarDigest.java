

package com.google.devtools.build.android.desugar.io;

import java.util.jar.JarFile;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_JarDigest extends JarDigest {

  private final JarFile jarFile;

  $AutoValue_JarDigest(
      JarFile jarFile) {
    if (jarFile == null) {
      throw new NullPointerException("Null jarFile");
    }
    this.jarFile = jarFile;
  }

  @Override
  JarFile jarFile() {
    return jarFile;
  }

  @Override
  public String toString() {
    return "JarDigest{"
         + "jarFile=" + jarFile
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JarDigest) {
      JarDigest that = (JarDigest) o;
      return (this.jarFile.equals(that.jarFile()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= jarFile.hashCode();
    return h$;
  }

}
