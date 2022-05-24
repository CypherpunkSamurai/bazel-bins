

package com.google.devtools.build.android.desugar.langmodel;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClassMemberRecord extends ClassMemberRecord {

  private final ImmutableMap<ClassMemberKey<?>, ClassMemberTrackReason> reasons;

  private AutoValue_ClassMemberRecord(
      ImmutableMap<ClassMemberKey<?>, ClassMemberTrackReason> reasons) {
    this.reasons = reasons;
  }

  @Override
  ImmutableMap<ClassMemberKey<?>, ClassMemberTrackReason> reasons() {
    return reasons;
  }

  @Override
  public String toString() {
    return "ClassMemberRecord{"
         + "reasons=" + reasons
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClassMemberRecord) {
      ClassMemberRecord that = (ClassMemberRecord) o;
      return (this.reasons.equals(that.reasons()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= reasons.hashCode();
    return h$;
  }

  static final class Builder extends ClassMemberRecord.ClassMemberRecordBuilder {
    private ImmutableMap<ClassMemberKey<?>, ClassMemberTrackReason> reasons;
    Builder() {
    }
    @Override
    ClassMemberRecord.ClassMemberRecordBuilder setReasons(Map<ClassMemberKey<?>, ClassMemberTrackReason> reasons) {
      this.reasons = ImmutableMap.copyOf(reasons);
      return this;
    }
    @Override
    ClassMemberRecord autoInternalBuild() {
      String missing = "";
      if (this.reasons == null) {
        missing += " reasons";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ClassMemberRecord(
          this.reasons);
    }
  }

}
