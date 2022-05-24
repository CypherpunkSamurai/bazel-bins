package com.google.devtools.build.android.desugar.retarget;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.devtools.build.android.desugar.langmodel.MethodInvocationSite;
import java.lang.Override;
import java.net.URL;
import javax.annotation.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_ClassMemberRetargetConfig extends $AutoValue_ClassMemberRetargetConfig {
  private volatile MethodInvocations invocationReplacementConfigProto;

  private volatile ImmutableMap<MethodInvocationSite, MethodInvocationSite> invocationReplacements;

  AutoValue_ClassMemberRetargetConfig(ImmutableList<URL> invocationReplacementConfigUrls$,
      ImmutableList<MethodInvocationReplacement> inProcessReplacements$,
      ImmutableSet<ReplacementRange> enabledInvocationReplacementRanges$) {
    super(invocationReplacementConfigUrls$, inProcessReplacements$, enabledInvocationReplacementRanges$);
  }

  @Override
  MethodInvocations invocationReplacementConfigProto() {
    if (invocationReplacementConfigProto == null) {
      synchronized (this) {
        if (invocationReplacementConfigProto == null) {
          invocationReplacementConfigProto = super.invocationReplacementConfigProto();
          if (invocationReplacementConfigProto == null) {
            throw new NullPointerException("invocationReplacementConfigProto() cannot return null");
          }
        }
      }
    }
    return invocationReplacementConfigProto;
  }

  @Override
  public ImmutableMap<MethodInvocationSite, MethodInvocationSite> invocationReplacements() {
    if (invocationReplacements == null) {
      synchronized (this) {
        if (invocationReplacements == null) {
          invocationReplacements = super.invocationReplacements();
          if (invocationReplacements == null) {
            throw new NullPointerException("invocationReplacements() cannot return null");
          }
        }
      }
    }
    return invocationReplacements;
  }
}
