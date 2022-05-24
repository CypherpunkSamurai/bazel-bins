

package com.google.devtools.build.android.desugar.retarget;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.net.URL;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ClassMemberRetargetConfig extends ClassMemberRetargetConfig {

  private final ImmutableList<URL> invocationReplacementConfigUrls;

  private final ImmutableList<MethodInvocationReplacement> inProcessReplacements;

  private final ImmutableSet<ReplacementRange> enabledInvocationReplacementRanges;

  $AutoValue_ClassMemberRetargetConfig(
      ImmutableList<URL> invocationReplacementConfigUrls,
      ImmutableList<MethodInvocationReplacement> inProcessReplacements,
      ImmutableSet<ReplacementRange> enabledInvocationReplacementRanges) {
    if (invocationReplacementConfigUrls == null) {
      throw new NullPointerException("Null invocationReplacementConfigUrls");
    }
    this.invocationReplacementConfigUrls = invocationReplacementConfigUrls;
    if (inProcessReplacements == null) {
      throw new NullPointerException("Null inProcessReplacements");
    }
    this.inProcessReplacements = inProcessReplacements;
    if (enabledInvocationReplacementRanges == null) {
      throw new NullPointerException("Null enabledInvocationReplacementRanges");
    }
    this.enabledInvocationReplacementRanges = enabledInvocationReplacementRanges;
  }

  @Override
  ImmutableList<URL> invocationReplacementConfigUrls() {
    return invocationReplacementConfigUrls;
  }

  @Override
  ImmutableList<MethodInvocationReplacement> inProcessReplacements() {
    return inProcessReplacements;
  }

  @Override
  ImmutableSet<ReplacementRange> enabledInvocationReplacementRanges() {
    return enabledInvocationReplacementRanges;
  }

  @Override
  public String toString() {
    return "ClassMemberRetargetConfig{"
         + "invocationReplacementConfigUrls=" + invocationReplacementConfigUrls + ", "
         + "inProcessReplacements=" + inProcessReplacements + ", "
         + "enabledInvocationReplacementRanges=" + enabledInvocationReplacementRanges
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClassMemberRetargetConfig) {
      ClassMemberRetargetConfig that = (ClassMemberRetargetConfig) o;
      return (this.invocationReplacementConfigUrls.equals(that.invocationReplacementConfigUrls()))
          && (this.inProcessReplacements.equals(that.inProcessReplacements()))
          && (this.enabledInvocationReplacementRanges.equals(that.enabledInvocationReplacementRanges()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= invocationReplacementConfigUrls.hashCode();
    h$ *= 1000003;
    h$ ^= inProcessReplacements.hashCode();
    h$ *= 1000003;
    h$ ^= enabledInvocationReplacementRanges.hashCode();
    return h$;
  }

  static final class Builder extends ClassMemberRetargetConfig.Builder {
    private ImmutableList.Builder<URL> invocationReplacementConfigUrlsBuilder$;
    private ImmutableList<URL> invocationReplacementConfigUrls;
    private ImmutableList.Builder<MethodInvocationReplacement> inProcessReplacementsBuilder$;
    private ImmutableList<MethodInvocationReplacement> inProcessReplacements;
    private ImmutableSet.Builder<ReplacementRange> enabledInvocationReplacementRangesBuilder$;
    private ImmutableSet<ReplacementRange> enabledInvocationReplacementRanges;
    Builder() {
    }
    @Override
    public ImmutableList.Builder<URL> invocationReplacementConfigUrlsBuilder() {
      if (invocationReplacementConfigUrlsBuilder$ == null) {
        invocationReplacementConfigUrlsBuilder$ = ImmutableList.builder();
      }
      return invocationReplacementConfigUrlsBuilder$;
    }
    @Override
    public ImmutableList.Builder<MethodInvocationReplacement> inProcessReplacementsBuilder() {
      if (inProcessReplacementsBuilder$ == null) {
        inProcessReplacementsBuilder$ = ImmutableList.builder();
      }
      return inProcessReplacementsBuilder$;
    }
    @Override
    public ImmutableSet.Builder<ReplacementRange> enabledInvocationReplacementRangesBuilder() {
      if (enabledInvocationReplacementRangesBuilder$ == null) {
        enabledInvocationReplacementRangesBuilder$ = ImmutableSet.builder();
      }
      return enabledInvocationReplacementRangesBuilder$;
    }
    @Override
    public ClassMemberRetargetConfig build() {
      if (invocationReplacementConfigUrlsBuilder$ != null) {
        this.invocationReplacementConfigUrls = invocationReplacementConfigUrlsBuilder$.build();
      } else if (this.invocationReplacementConfigUrls == null) {
        this.invocationReplacementConfigUrls = ImmutableList.of();
      }
      if (inProcessReplacementsBuilder$ != null) {
        this.inProcessReplacements = inProcessReplacementsBuilder$.build();
      } else if (this.inProcessReplacements == null) {
        this.inProcessReplacements = ImmutableList.of();
      }
      if (enabledInvocationReplacementRangesBuilder$ != null) {
        this.enabledInvocationReplacementRanges = enabledInvocationReplacementRangesBuilder$.build();
      } else if (this.enabledInvocationReplacementRanges == null) {
        this.enabledInvocationReplacementRanges = ImmutableSet.of();
      }
      return new AutoValue_ClassMemberRetargetConfig(
          this.invocationReplacementConfigUrls,
          this.inProcessReplacements,
          this.enabledInvocationReplacementRanges);
    }
  }

}
