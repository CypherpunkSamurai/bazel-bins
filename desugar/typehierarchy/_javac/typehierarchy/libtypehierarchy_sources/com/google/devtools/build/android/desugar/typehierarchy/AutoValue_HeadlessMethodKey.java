

package com.google.devtools.build.android.desugar.typehierarchy;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_HeadlessMethodKey extends HeadlessMethodKey {

  private final String name;

  private final String descriptor;

  AutoValue_HeadlessMethodKey(
      String name,
      String descriptor) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (descriptor == null) {
      throw new NullPointerException("Null descriptor");
    }
    this.descriptor = descriptor;
  }

  @Override
  String name() {
    return name;
  }

  @Override
  String descriptor() {
    return descriptor;
  }

  @Override
  public String toString() {
    return "HeadlessMethodKey{"
         + "name=" + name + ", "
         + "descriptor=" + descriptor
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HeadlessMethodKey) {
      HeadlessMethodKey that = (HeadlessMethodKey) o;
      return (this.name.equals(that.name()))
          && (this.descriptor.equals(that.descriptor()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= descriptor.hashCode();
    return h$;
  }

}
