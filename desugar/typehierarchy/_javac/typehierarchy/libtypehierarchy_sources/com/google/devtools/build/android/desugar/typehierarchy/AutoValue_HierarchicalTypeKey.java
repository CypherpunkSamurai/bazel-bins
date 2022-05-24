

package com.google.devtools.build.android.desugar.typehierarchy;

import com.google.devtools.build.android.desugar.langmodel.ClassName;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_HierarchicalTypeKey extends HierarchicalTypeKey {

  private final ClassName type;

  AutoValue_HierarchicalTypeKey(
      ClassName type) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
  }

  @Override
  public ClassName type() {
    return type;
  }

  @Override
  public String toString() {
    return "HierarchicalTypeKey{"
         + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HierarchicalTypeKey) {
      HierarchicalTypeKey that = (HierarchicalTypeKey) o;
      return (this.type.equals(that.type()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    return h$;
  }

}
