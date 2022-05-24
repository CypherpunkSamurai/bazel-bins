

package com.google.devtools.build.android.desugar.typehierarchy;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_HierarchicalTypeQuery extends HierarchicalTypeQuery {

  private final HierarchicalTypeKey type;

  private final TypeHierarchy typeHierarchy;

  AutoValue_HierarchicalTypeQuery(
      HierarchicalTypeKey type,
      TypeHierarchy typeHierarchy) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (typeHierarchy == null) {
      throw new NullPointerException("Null typeHierarchy");
    }
    this.typeHierarchy = typeHierarchy;
  }

  @Override
  HierarchicalTypeKey type() {
    return type;
  }

  @Override
  TypeHierarchy typeHierarchy() {
    return typeHierarchy;
  }

  @Override
  public String toString() {
    return "HierarchicalTypeQuery{"
         + "type=" + type + ", "
         + "typeHierarchy=" + typeHierarchy
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HierarchicalTypeQuery) {
      HierarchicalTypeQuery that = (HierarchicalTypeQuery) o;
      return (this.type.equals(that.type()))
          && (this.typeHierarchy.equals(that.typeHierarchy()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= typeHierarchy.hashCode();
    return h$;
  }

}
