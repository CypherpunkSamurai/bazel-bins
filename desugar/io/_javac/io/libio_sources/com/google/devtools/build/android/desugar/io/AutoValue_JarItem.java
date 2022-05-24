

package com.google.devtools.build.android.desugar.io;

import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_JarItem extends JarItem {

  private final JarFile jarFile;

  private final JarEntry jarEntry;

  AutoValue_JarItem(
      JarFile jarFile,
      JarEntry jarEntry) {
    if (jarFile == null) {
      throw new NullPointerException("Null jarFile");
    }
    this.jarFile = jarFile;
    if (jarEntry == null) {
      throw new NullPointerException("Null jarEntry");
    }
    this.jarEntry = jarEntry;
  }

  @Override
  public JarFile jarFile() {
    return jarFile;
  }

  @Override
  public JarEntry jarEntry() {
    return jarEntry;
  }

  @Override
  public String toString() {
    return "JarItem{"
         + "jarFile=" + jarFile + ", "
         + "jarEntry=" + jarEntry
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JarItem) {
      JarItem that = (JarItem) o;
      return (this.jarFile.equals(that.jarFile()))
          && (this.jarEntry.equals(that.jarEntry()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= jarFile.hashCode();
    h$ *= 1000003;
    h$ ^= jarEntry.hashCode();
    return h$;
  }

}
