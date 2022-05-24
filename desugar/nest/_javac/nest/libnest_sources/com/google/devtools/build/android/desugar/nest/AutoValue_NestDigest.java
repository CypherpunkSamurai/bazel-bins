package com.google.devtools.build.android.desugar.nest;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.devtools.build.android.desugar.langmodel.ClassAttributeRecord;
import com.google.devtools.build.android.desugar.langmodel.ClassMemberRecord;
import com.google.devtools.build.android.desugar.langmodel.ClassName;
import java.lang.Override;
import javax.annotation.Generated;
import org.objectweb.asm.ClassWriter;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_NestDigest extends $AutoValue_NestDigest {
  private volatile ImmutableList<ClassName> nestHostsWithCompanion;

  private volatile ImmutableMap<ClassName, ClassName> nestCompanionToHostMap;

  private volatile ImmutableMap<ClassName, ClassWriter> companionWriters;

  AutoValue_NestDigest(ClassMemberRecord classMemberRecord$,
      ClassAttributeRecord classAttributeRecord$) {
    super(classMemberRecord$, classAttributeRecord$);
  }

  @Override
  ImmutableList<ClassName> nestHostsWithCompanion() {
    if (nestHostsWithCompanion == null) {
      synchronized (this) {
        if (nestHostsWithCompanion == null) {
          nestHostsWithCompanion = super.nestHostsWithCompanion();
          if (nestHostsWithCompanion == null) {
            throw new NullPointerException("nestHostsWithCompanion() cannot return null");
          }
        }
      }
    }
    return nestHostsWithCompanion;
  }

  @Override
  ImmutableMap<ClassName, ClassName> nestCompanionToHostMap() {
    if (nestCompanionToHostMap == null) {
      synchronized (this) {
        if (nestCompanionToHostMap == null) {
          nestCompanionToHostMap = super.nestCompanionToHostMap();
          if (nestCompanionToHostMap == null) {
            throw new NullPointerException("nestCompanionToHostMap() cannot return null");
          }
        }
      }
    }
    return nestCompanionToHostMap;
  }

  @Override
  ImmutableMap<ClassName, ClassWriter> companionWriters() {
    if (companionWriters == null) {
      synchronized (this) {
        if (companionWriters == null) {
          companionWriters = super.companionWriters();
          if (companionWriters == null) {
            throw new NullPointerException("companionWriters() cannot return null");
          }
        }
      }
    }
    return companionWriters;
  }
}
