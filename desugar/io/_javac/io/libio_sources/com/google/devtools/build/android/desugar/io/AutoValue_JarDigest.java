package com.google.devtools.build.android.desugar.io;

import com.google.common.collect.ImmutableSet;
import java.lang.Override;
import java.lang.String;
import java.util.jar.JarFile;
import javax.annotation.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_JarDigest extends $AutoValue_JarDigest {
  private volatile ImmutableSet<String> getAllClassFilePackagePrefixes;

  AutoValue_JarDigest(JarFile jarFile$) {
    super(jarFile$);
  }

  @Override
  ImmutableSet<String> getAllClassFilePackagePrefixes() {
    if (getAllClassFilePackagePrefixes == null) {
      synchronized (this) {
        if (getAllClassFilePackagePrefixes == null) {
          getAllClassFilePackagePrefixes = super.getAllClassFilePackagePrefixes();
          if (getAllClassFilePackagePrefixes == null) {
            throw new NullPointerException("getAllClassFilePackagePrefixes() cannot return null");
          }
        }
      }
    }
    return getAllClassFilePackagePrefixes;
  }
}
