

package com.google.devtools.build.android.desugar.io;

import com.google.common.collect.ImmutableMap;
import com.google.devtools.build.android.desugar.langmodel.ClassName;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MapBasedClassFileProvider extends MapBasedClassFileProvider {

  private final String tag;

  private final ImmutableMap<ClassName, FileContentProvider<InputStream>> fileContents;

  private AutoValue_MapBasedClassFileProvider(
      String tag,
      ImmutableMap<ClassName, FileContentProvider<InputStream>> fileContents) {
    this.tag = tag;
    this.fileContents = fileContents;
  }

  @Override
  String tag() {
    return tag;
  }

  @Override
  ImmutableMap<ClassName, FileContentProvider<InputStream>> fileContents() {
    return fileContents;
  }

  @Override
  public String toString() {
    return "MapBasedClassFileProvider{"
         + "tag=" + tag + ", "
         + "fileContents=" + fileContents
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapBasedClassFileProvider) {
      MapBasedClassFileProvider that = (MapBasedClassFileProvider) o;
      return (this.tag.equals(that.tag()))
          && (this.fileContents.equals(that.fileContents()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= tag.hashCode();
    h$ *= 1000003;
    h$ ^= fileContents.hashCode();
    return h$;
  }

  static final class Builder extends MapBasedClassFileProvider.MapBasedClassFilesBuilder {
    private String tag;
    private ImmutableMap<ClassName, FileContentProvider<InputStream>> fileContents;
    Builder() {
    }
    @Override
    public MapBasedClassFileProvider.MapBasedClassFilesBuilder setTag(String tag) {
      if (tag == null) {
        throw new NullPointerException("Null tag");
      }
      this.tag = tag;
      return this;
    }
    @Override
    public MapBasedClassFileProvider.MapBasedClassFilesBuilder setFileContents(Map<ClassName, FileContentProvider<InputStream>> fileContents) {
      this.fileContents = ImmutableMap.copyOf(fileContents);
      return this;
    }
    @Override
    public MapBasedClassFileProvider build() {
      String missing = "";
      if (this.tag == null) {
        missing += " tag";
      }
      if (this.fileContents == null) {
        missing += " fileContents";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapBasedClassFileProvider(
          this.tag,
          this.fileContents);
    }
  }

}
