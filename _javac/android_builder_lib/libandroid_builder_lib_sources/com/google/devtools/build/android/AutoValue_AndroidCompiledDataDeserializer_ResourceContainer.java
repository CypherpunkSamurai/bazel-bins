

package com.google.devtools.build.android;

import com.android.aapt.Resources;
import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AndroidCompiledDataDeserializer_ResourceContainer extends AndroidCompiledDataDeserializer.ResourceContainer {

  private final ImmutableList<Resources.ResourceTable> resourceTables;

  private final ImmutableList<AndroidCompiledDataDeserializer.CompiledFileWithData> compiledFiles;

  AutoValue_AndroidCompiledDataDeserializer_ResourceContainer(
      ImmutableList<Resources.ResourceTable> resourceTables,
      ImmutableList<AndroidCompiledDataDeserializer.CompiledFileWithData> compiledFiles) {
    if (resourceTables == null) {
      throw new NullPointerException("Null resourceTables");
    }
    this.resourceTables = resourceTables;
    if (compiledFiles == null) {
      throw new NullPointerException("Null compiledFiles");
    }
    this.compiledFiles = compiledFiles;
  }

  @Override
  ImmutableList<Resources.ResourceTable> resourceTables() {
    return resourceTables;
  }

  @Override
  ImmutableList<AndroidCompiledDataDeserializer.CompiledFileWithData> compiledFiles() {
    return compiledFiles;
  }

  @Override
  public String toString() {
    return "ResourceContainer{"
         + "resourceTables=" + resourceTables + ", "
         + "compiledFiles=" + compiledFiles
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AndroidCompiledDataDeserializer.ResourceContainer) {
      AndroidCompiledDataDeserializer.ResourceContainer that = (AndroidCompiledDataDeserializer.ResourceContainer) o;
      return (this.resourceTables.equals(that.resourceTables()))
          && (this.compiledFiles.equals(that.compiledFiles()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= resourceTables.hashCode();
    h$ *= 1000003;
    h$ ^= compiledFiles.hashCode();
    return h$;
  }

}
