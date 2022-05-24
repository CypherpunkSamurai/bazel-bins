

package com.google.devtools.build.android;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DependencyInfo extends DependencyInfo {

  private final String label;

  private final DependencyInfo.DependencyType dependencyType;

  AutoValue_DependencyInfo(
      String label,
      DependencyInfo.DependencyType dependencyType) {
    if (label == null) {
      throw new NullPointerException("Null label");
    }
    this.label = label;
    if (dependencyType == null) {
      throw new NullPointerException("Null dependencyType");
    }
    this.dependencyType = dependencyType;
  }

  @Override
  public String label() {
    return label;
  }

  @Override
  public DependencyInfo.DependencyType dependencyType() {
    return dependencyType;
  }

  @Override
  public String toString() {
    return "DependencyInfo{"
         + "label=" + label + ", "
         + "dependencyType=" + dependencyType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DependencyInfo) {
      DependencyInfo that = (DependencyInfo) o;
      return (this.label.equals(that.label()))
          && (this.dependencyType.equals(that.dependencyType()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= label.hashCode();
    h$ *= 1000003;
    h$ ^= dependencyType.hashCode();
    return h$;
  }

}
