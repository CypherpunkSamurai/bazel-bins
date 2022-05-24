

package com.google.devtools.build.android.desugar.typehierarchy;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_HierarchicalMethodQuery extends HierarchicalMethodQuery {

  private final HierarchicalMethodKey method;

  private final TypeHierarchy typeHierarchy;

  $AutoValue_HierarchicalMethodQuery(
      HierarchicalMethodKey method,
      TypeHierarchy typeHierarchy) {
    if (method == null) {
      throw new NullPointerException("Null method");
    }
    this.method = method;
    if (typeHierarchy == null) {
      throw new NullPointerException("Null typeHierarchy");
    }
    this.typeHierarchy = typeHierarchy;
  }

  @Override
  public HierarchicalMethodKey method() {
    return method;
  }

  @Override
  public TypeHierarchy typeHierarchy() {
    return typeHierarchy;
  }

  @Override
  public String toString() {
    return "HierarchicalMethodQuery{"
         + "method=" + method + ", "
         + "typeHierarchy=" + typeHierarchy
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HierarchicalMethodQuery) {
      HierarchicalMethodQuery that = (HierarchicalMethodQuery) o;
      return (this.method.equals(that.method()))
          && (this.typeHierarchy.equals(that.typeHierarchy()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= method.hashCode();
    h$ *= 1000003;
    h$ ^= typeHierarchy.hashCode();
    return h$;
  }

}
