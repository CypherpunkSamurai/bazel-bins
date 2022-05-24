

package com.google.devtools.build.android;

import com.android.resources.ResourceType;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ResourceName extends ResourceName {

  private final String pkg;

  private final ResourceType type;

  private final String entry;

  AutoValue_ResourceName(
      String pkg,
      ResourceType type,
      String entry) {
    if (pkg == null) {
      throw new NullPointerException("Null pkg");
    }
    this.pkg = pkg;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (entry == null) {
      throw new NullPointerException("Null entry");
    }
    this.entry = entry;
  }

  @Override
  String pkg() {
    return pkg;
  }

  @Override
  ResourceType type() {
    return type;
  }

  @Override
  String entry() {
    return entry;
  }

  @Override
  public String toString() {
    return "ResourceName{"
         + "pkg=" + pkg + ", "
         + "type=" + type + ", "
         + "entry=" + entry
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ResourceName) {
      ResourceName that = (ResourceName) o;
      return (this.pkg.equals(that.pkg()))
          && (this.type.equals(that.type()))
          && (this.entry.equals(that.entry()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= pkg.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= entry.hashCode();
    return h$;
  }

}
