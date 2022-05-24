

package com.google.devtools.build.android;

import com.google.common.collect.ImmutableSet;
import java.nio.file.Path;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AndroidCompiledDataDeserializer_PublicResources extends AndroidCompiledDataDeserializer.PublicResources {

  private final ImmutableSet<ResourceName> explicitlyPublicResources;

  private final ImmutableSet<Path> directoriesWithPublicResources;

  AutoValue_AndroidCompiledDataDeserializer_PublicResources(
      ImmutableSet<ResourceName> explicitlyPublicResources,
      ImmutableSet<Path> directoriesWithPublicResources) {
    if (explicitlyPublicResources == null) {
      throw new NullPointerException("Null explicitlyPublicResources");
    }
    this.explicitlyPublicResources = explicitlyPublicResources;
    if (directoriesWithPublicResources == null) {
      throw new NullPointerException("Null directoriesWithPublicResources");
    }
    this.directoriesWithPublicResources = directoriesWithPublicResources;
  }

  @Override
  ImmutableSet<ResourceName> explicitlyPublicResources() {
    return explicitlyPublicResources;
  }

  @Override
  ImmutableSet<Path> directoriesWithPublicResources() {
    return directoriesWithPublicResources;
  }

  @Override
  public String toString() {
    return "PublicResources{"
         + "explicitlyPublicResources=" + explicitlyPublicResources + ", "
         + "directoriesWithPublicResources=" + directoriesWithPublicResources
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AndroidCompiledDataDeserializer.PublicResources) {
      AndroidCompiledDataDeserializer.PublicResources that = (AndroidCompiledDataDeserializer.PublicResources) o;
      return (this.explicitlyPublicResources.equals(that.explicitlyPublicResources()))
          && (this.directoriesWithPublicResources.equals(that.directoriesWithPublicResources()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= explicitlyPublicResources.hashCode();
    h$ *= 1000003;
    h$ ^= directoriesWithPublicResources.hashCode();
    return h$;
  }

}
