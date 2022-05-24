

package com.google.devtools.build.android.desugar.langmodel;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MethodInvocationSite extends MethodInvocationSite {

  private final MemberUseKind useKind;

  private final MethodKey member;

  private final boolean isInterface;

  private AutoValue_MethodInvocationSite(
      MemberUseKind useKind,
      MethodKey member,
      boolean isInterface) {
    this.useKind = useKind;
    this.member = member;
    this.isInterface = isInterface;
  }

  @Override
  public MemberUseKind useKind() {
    return useKind;
  }

  @Override
  public MethodKey member() {
    return member;
  }

  @Override
  public boolean isInterface() {
    return isInterface;
  }

  @Override
  public String toString() {
    return "MethodInvocationSite{"
         + "useKind=" + useKind + ", "
         + "member=" + member + ", "
         + "isInterface=" + isInterface
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MethodInvocationSite) {
      MethodInvocationSite that = (MethodInvocationSite) o;
      return (this.useKind.equals(that.useKind()))
          && (this.member.equals(that.member()))
          && (this.isInterface == that.isInterface());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= useKind.hashCode();
    h$ *= 1000003;
    h$ ^= member.hashCode();
    h$ *= 1000003;
    h$ ^= isInterface ? 1231 : 1237;
    return h$;
  }

  @Override
  public MethodInvocationSite.MethodInvocationSiteBuilder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MethodInvocationSite.MethodInvocationSiteBuilder {
    private MemberUseKind useKind;
    private MethodKey member;
    private Boolean isInterface;
    Builder() {
    }
    private Builder(MethodInvocationSite source) {
      this.useKind = source.useKind();
      this.member = source.member();
      this.isInterface = source.isInterface();
    }
    @Override
    MethodInvocationSite.MethodInvocationSiteBuilder setUseKind(MemberUseKind useKind) {
      if (useKind == null) {
        throw new NullPointerException("Null useKind");
      }
      this.useKind = useKind;
      return this;
    }
    @Override
    MethodInvocationSite.MethodInvocationSiteBuilder setMember(MethodKey member) {
      if (member == null) {
        throw new NullPointerException("Null member");
      }
      this.member = member;
      return this;
    }
    @Override
    public MethodInvocationSite.MethodInvocationSiteBuilder setIsInterface(boolean isInterface) {
      this.isInterface = isInterface;
      return this;
    }
    @Override
    public MethodInvocationSite build() {
      String missing = "";
      if (this.useKind == null) {
        missing += " useKind";
      }
      if (this.member == null) {
        missing += " member";
      }
      if (this.isInterface == null) {
        missing += " isInterface";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MethodInvocationSite(
          this.useKind,
          this.member,
          this.isInterface);
    }
  }

}
