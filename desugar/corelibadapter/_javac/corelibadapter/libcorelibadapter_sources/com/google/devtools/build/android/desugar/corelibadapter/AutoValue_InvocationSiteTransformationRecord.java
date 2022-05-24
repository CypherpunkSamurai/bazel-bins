

package com.google.devtools.build.android.desugar.corelibadapter;

import com.google.common.collect.ImmutableSet;
import com.google.devtools.build.android.desugar.langmodel.MethodInvocationSite;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_InvocationSiteTransformationRecord extends InvocationSiteTransformationRecord {

  private final ImmutableSet<MethodInvocationSite> adapterReplacements;

  private final ImmutableSet<MethodInvocationSite> inlineConversions;

  private AutoValue_InvocationSiteTransformationRecord(
      ImmutableSet<MethodInvocationSite> adapterReplacements,
      ImmutableSet<MethodInvocationSite> inlineConversions) {
    this.adapterReplacements = adapterReplacements;
    this.inlineConversions = inlineConversions;
  }

  @Override
  ImmutableSet<MethodInvocationSite> adapterReplacements() {
    return adapterReplacements;
  }

  @Override
  ImmutableSet<MethodInvocationSite> inlineConversions() {
    return inlineConversions;
  }

  @Override
  public String toString() {
    return "InvocationSiteTransformationRecord{"
         + "adapterReplacements=" + adapterReplacements + ", "
         + "inlineConversions=" + inlineConversions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InvocationSiteTransformationRecord) {
      InvocationSiteTransformationRecord that = (InvocationSiteTransformationRecord) o;
      return (this.adapterReplacements.equals(that.adapterReplacements()))
          && (this.inlineConversions.equals(that.inlineConversions()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= adapterReplacements.hashCode();
    h$ *= 1000003;
    h$ ^= inlineConversions.hashCode();
    return h$;
  }

  static final class Builder extends InvocationSiteTransformationRecord.InvocationSiteTransformationRecordBuilder {
    private ImmutableSet.Builder<MethodInvocationSite> adapterReplacementsBuilder$;
    private ImmutableSet<MethodInvocationSite> adapterReplacements;
    private ImmutableSet.Builder<MethodInvocationSite> inlineConversionsBuilder$;
    private ImmutableSet<MethodInvocationSite> inlineConversions;
    Builder() {
    }
    @Override
    ImmutableSet.Builder<MethodInvocationSite> adapterReplacementsBuilder() {
      if (adapterReplacementsBuilder$ == null) {
        adapterReplacementsBuilder$ = ImmutableSet.builder();
      }
      return adapterReplacementsBuilder$;
    }
    @Override
    ImmutableSet.Builder<MethodInvocationSite> inlineConversionsBuilder() {
      if (inlineConversionsBuilder$ == null) {
        inlineConversionsBuilder$ = ImmutableSet.builder();
      }
      return inlineConversionsBuilder$;
    }
    @Override
    public InvocationSiteTransformationRecord build() {
      if (adapterReplacementsBuilder$ != null) {
        this.adapterReplacements = adapterReplacementsBuilder$.build();
      } else if (this.adapterReplacements == null) {
        this.adapterReplacements = ImmutableSet.of();
      }
      if (inlineConversionsBuilder$ != null) {
        this.inlineConversions = inlineConversionsBuilder$.build();
      } else if (this.inlineConversions == null) {
        this.inlineConversions = ImmutableSet.of();
      }
      return new AutoValue_InvocationSiteTransformationRecord(
          this.adapterReplacements,
          this.inlineConversions);
    }
  }

}
