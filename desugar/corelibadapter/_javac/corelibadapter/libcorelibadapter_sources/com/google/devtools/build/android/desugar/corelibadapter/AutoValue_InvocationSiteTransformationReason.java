

package com.google.devtools.build.android.desugar.corelibadapter;

import com.google.devtools.build.android.desugar.langmodel.MethodKey;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_InvocationSiteTransformationReason extends InvocationSiteTransformationReason {

  private final InvocationSiteTransformationReason.InvocationSiteTransformationKind kind;

  private final MethodKey method;

  AutoValue_InvocationSiteTransformationReason(
      InvocationSiteTransformationReason.InvocationSiteTransformationKind kind,
      MethodKey method) {
    if (kind == null) {
      throw new NullPointerException("Null kind");
    }
    this.kind = kind;
    if (method == null) {
      throw new NullPointerException("Null method");
    }
    this.method = method;
  }

  @Override
  InvocationSiteTransformationReason.InvocationSiteTransformationKind kind() {
    return kind;
  }

  @Override
  MethodKey method() {
    return method;
  }

  @Override
  public String toString() {
    return "InvocationSiteTransformationReason{"
         + "kind=" + kind + ", "
         + "method=" + method
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InvocationSiteTransformationReason) {
      InvocationSiteTransformationReason that = (InvocationSiteTransformationReason) o;
      return (this.kind.equals(that.kind()))
          && (this.method.equals(that.method()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= kind.hashCode();
    h$ *= 1000003;
    h$ ^= method.hashCode();
    return h$;
  }

}
