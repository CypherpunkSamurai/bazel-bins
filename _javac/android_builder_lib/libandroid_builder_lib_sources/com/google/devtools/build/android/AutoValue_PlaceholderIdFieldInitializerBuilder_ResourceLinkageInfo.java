

package com.google.devtools.build.android;

import com.google.devtools.build.android.resources.Visibility;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PlaceholderIdFieldInitializerBuilder_ResourceLinkageInfo extends PlaceholderIdFieldInitializerBuilder.ResourceLinkageInfo {

  private final DependencyInfo dependencyInfo;

  private final Visibility visibility;

  AutoValue_PlaceholderIdFieldInitializerBuilder_ResourceLinkageInfo(
      DependencyInfo dependencyInfo,
      Visibility visibility) {
    if (dependencyInfo == null) {
      throw new NullPointerException("Null dependencyInfo");
    }
    this.dependencyInfo = dependencyInfo;
    if (visibility == null) {
      throw new NullPointerException("Null visibility");
    }
    this.visibility = visibility;
  }

  @Override
  DependencyInfo dependencyInfo() {
    return dependencyInfo;
  }

  @Override
  Visibility visibility() {
    return visibility;
  }

  @Override
  public String toString() {
    return "ResourceLinkageInfo{"
         + "dependencyInfo=" + dependencyInfo + ", "
         + "visibility=" + visibility
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PlaceholderIdFieldInitializerBuilder.ResourceLinkageInfo) {
      PlaceholderIdFieldInitializerBuilder.ResourceLinkageInfo that = (PlaceholderIdFieldInitializerBuilder.ResourceLinkageInfo) o;
      return (this.dependencyInfo.equals(that.dependencyInfo()))
          && (this.visibility.equals(that.visibility()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= dependencyInfo.hashCode();
    h$ *= 1000003;
    h$ ^= visibility.hashCode();
    return h$;
  }

}
