

package com.google.devtools.build.android.desugar.langmodel;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FieldKey extends FieldKey {

  private final ClassName owner;

  private final String name;

  private final String descriptor;

  AutoValue_FieldKey(
      ClassName owner,
      String name,
      String descriptor) {
    if (owner == null) {
      throw new NullPointerException("Null owner");
    }
    this.owner = owner;
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
  public ClassName owner() {
    return owner;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String descriptor() {
    return descriptor;
  }

  @Override
  public String toString() {
    return "FieldKey{"
         + "owner=" + owner + ", "
         + "name=" + name + ", "
         + "descriptor=" + descriptor
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FieldKey) {
      FieldKey that = (FieldKey) o;
      return (this.owner.equals(that.owner()))
          && (this.name.equals(that.name()))
          && (this.descriptor.equals(that.descriptor()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= owner.hashCode();
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= descriptor.hashCode();
    return h$;
  }

}
