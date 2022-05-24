

package com.google.devtools.build.android.desugar.langmodel;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClassMemberTrackReason extends ClassMemberTrackReason {

  private final boolean hasDeclReason;

  private final int ownerAccess;

  private final int memberAccess;

  private final ImmutableSet<MemberUseKind> useAccesses;

  private AutoValue_ClassMemberTrackReason(
      boolean hasDeclReason,
      int ownerAccess,
      int memberAccess,
      ImmutableSet<MemberUseKind> useAccesses) {
    this.hasDeclReason = hasDeclReason;
    this.ownerAccess = ownerAccess;
    this.memberAccess = memberAccess;
    this.useAccesses = useAccesses;
  }

  @Override
  boolean hasDeclReason() {
    return hasDeclReason;
  }

  @Override
  int ownerAccess() {
    return ownerAccess;
  }

  @Override
  int memberAccess() {
    return memberAccess;
  }

  @Override
  ImmutableSet<MemberUseKind> useAccesses() {
    return useAccesses;
  }

  @Override
  public String toString() {
    return "ClassMemberTrackReason{"
         + "hasDeclReason=" + hasDeclReason + ", "
         + "ownerAccess=" + ownerAccess + ", "
         + "memberAccess=" + memberAccess + ", "
         + "useAccesses=" + useAccesses
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClassMemberTrackReason) {
      ClassMemberTrackReason that = (ClassMemberTrackReason) o;
      return (this.hasDeclReason == that.hasDeclReason())
          && (this.ownerAccess == that.ownerAccess())
          && (this.memberAccess == that.memberAccess())
          && (this.useAccesses.equals(that.useAccesses()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= hasDeclReason ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= ownerAccess;
    h$ *= 1000003;
    h$ ^= memberAccess;
    h$ *= 1000003;
    h$ ^= useAccesses.hashCode();
    return h$;
  }

  @Override
  ClassMemberTrackReason.ClassMemberTrackReasonBuilder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends ClassMemberTrackReason.ClassMemberTrackReasonBuilder {
    private Boolean hasDeclReason;
    private Integer ownerAccess;
    private Integer memberAccess;
    private ImmutableSet.Builder<MemberUseKind> useAccessesBuilder$;
    private ImmutableSet<MemberUseKind> useAccesses;
    Builder() {
    }
    private Builder(ClassMemberTrackReason source) {
      this.hasDeclReason = source.hasDeclReason();
      this.ownerAccess = source.ownerAccess();
      this.memberAccess = source.memberAccess();
      this.useAccesses = source.useAccesses();
    }
    @Override
    ClassMemberTrackReason.ClassMemberTrackReasonBuilder setHasDeclReason(boolean hasDeclReason) {
      this.hasDeclReason = hasDeclReason;
      return this;
    }
    @Override
    ClassMemberTrackReason.ClassMemberTrackReasonBuilder setOwnerAccess(int ownerAccess) {
      this.ownerAccess = ownerAccess;
      return this;
    }
    @Override
    ClassMemberTrackReason.ClassMemberTrackReasonBuilder setMemberAccess(int memberAccess) {
      this.memberAccess = memberAccess;
      return this;
    }
    @Override
    ClassMemberTrackReason.ClassMemberTrackReasonBuilder setUseAccesses(Collection<MemberUseKind> useAccesses) {
      if (useAccessesBuilder$ != null) {
        throw new IllegalStateException("Cannot set useAccesses after calling useAccessesBuilder()");
      }
      this.useAccesses = ImmutableSet.copyOf(useAccesses);
      return this;
    }
    @Override
    ImmutableSet.Builder<MemberUseKind> useAccessesBuilder() {
      if (useAccessesBuilder$ == null) {
        if (useAccesses == null) {
          useAccessesBuilder$ = ImmutableSet.builder();
        } else {
          useAccessesBuilder$ = ImmutableSet.builder();
          useAccessesBuilder$.addAll(useAccesses);
          useAccesses = null;
        }
      }
      return useAccessesBuilder$;
    }
    @Override
    ClassMemberTrackReason build() {
      if (useAccessesBuilder$ != null) {
        this.useAccesses = useAccessesBuilder$.build();
      } else if (this.useAccesses == null) {
        this.useAccesses = ImmutableSet.of();
      }
      String missing = "";
      if (this.hasDeclReason == null) {
        missing += " hasDeclReason";
      }
      if (this.ownerAccess == null) {
        missing += " ownerAccess";
      }
      if (this.memberAccess == null) {
        missing += " memberAccess";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ClassMemberTrackReason(
          this.hasDeclReason,
          this.ownerAccess,
          this.memberAccess,
          this.useAccesses);
    }
  }

}
