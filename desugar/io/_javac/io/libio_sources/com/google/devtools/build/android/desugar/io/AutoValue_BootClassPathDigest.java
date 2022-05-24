package com.google.devtools.build.android.desugar.io;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.lang.Override;
import java.lang.String;
import java.nio.file.Path;
import javax.annotation.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_BootClassPathDigest extends $AutoValue_BootClassPathDigest {
  private volatile ImmutableSet<String> allResourceEntryNames;

  AutoValue_BootClassPathDigest(ImmutableList<Path> bootClassPaths$) {
    super(bootClassPaths$);
  }

  @Override
  public ImmutableSet<String> allResourceEntryNames() {
    if (allResourceEntryNames == null) {
      synchronized (this) {
        if (allResourceEntryNames == null) {
          allResourceEntryNames = super.allResourceEntryNames();
          if (allResourceEntryNames == null) {
            throw new NullPointerException("allResourceEntryNames() cannot return null");
          }
        }
      }
    }
    return allResourceEntryNames;
  }
}
