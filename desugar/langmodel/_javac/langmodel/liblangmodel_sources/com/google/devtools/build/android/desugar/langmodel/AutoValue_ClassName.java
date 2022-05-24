

package com.google.devtools.build.android.desugar.langmodel;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClassName extends ClassName {

  private final String binaryName;

  AutoValue_ClassName(
      String binaryName) {
    if (binaryName == null) {
      throw new NullPointerException("Null binaryName");
    }
    this.binaryName = binaryName;
  }

  @Override
  public String binaryName() {
    return binaryName;
  }

  @Override
  public String toString() {
    return "ClassName{"
         + "binaryName=" + binaryName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClassName) {
      ClassName that = (ClassName) o;
      return (this.binaryName.equals(that.binaryName()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= binaryName.hashCode();
    return h$;
  }

}
