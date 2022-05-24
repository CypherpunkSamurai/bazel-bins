

package com.google.devtools.build.android.aapt2;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ProtoResourceUsageAnalyzer_ResourceTypeAndJavaName extends ProtoResourceUsageAnalyzer.ResourceTypeAndJavaName {

  private final String type;

  private final String javaName;

  AutoValue_ProtoResourceUsageAnalyzer_ResourceTypeAndJavaName(
      String type,
      String javaName) {
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (javaName == null) {
      throw new NullPointerException("Null javaName");
    }
    this.javaName = javaName;
  }

  @Override
  String type() {
    return type;
  }

  @Override
  String javaName() {
    return javaName;
  }

  @Override
  public String toString() {
    return "ResourceTypeAndJavaName{"
         + "type=" + type + ", "
         + "javaName=" + javaName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProtoResourceUsageAnalyzer.ResourceTypeAndJavaName) {
      ProtoResourceUsageAnalyzer.ResourceTypeAndJavaName that = (ProtoResourceUsageAnalyzer.ResourceTypeAndJavaName) o;
      return (this.type.equals(that.type()))
          && (this.javaName.equals(that.javaName()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= javaName.hashCode();
    return h$;
  }

}
