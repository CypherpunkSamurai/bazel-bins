

package com.google.devtools.build.android.desugar.langmodel;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MethodDeclInfo extends MethodDeclInfo {

  private final MethodKey methodKey;

  private final int ownerAccess;

  private final int memberAccess;

  private final String signature;

  private final ImmutableList<String> exceptions;

  private AutoValue_MethodDeclInfo(
      MethodKey methodKey,
      int ownerAccess,
      int memberAccess,
      @Nullable String signature,
      ImmutableList<String> exceptions) {
    this.methodKey = methodKey;
    this.ownerAccess = ownerAccess;
    this.memberAccess = memberAccess;
    this.signature = signature;
    this.exceptions = exceptions;
  }

  @Override
  public MethodKey methodKey() {
    return methodKey;
  }

  @Override
  public int ownerAccess() {
    return ownerAccess;
  }

  @Override
  public int memberAccess() {
    return memberAccess;
  }

  @Nullable
  @Override
  public String signature() {
    return signature;
  }

  @Override
  public ImmutableList<String> exceptions() {
    return exceptions;
  }

  @Override
  public String toString() {
    return "MethodDeclInfo{"
         + "methodKey=" + methodKey + ", "
         + "ownerAccess=" + ownerAccess + ", "
         + "memberAccess=" + memberAccess + ", "
         + "signature=" + signature + ", "
         + "exceptions=" + exceptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MethodDeclInfo) {
      MethodDeclInfo that = (MethodDeclInfo) o;
      return (this.methodKey.equals(that.methodKey()))
          && (this.ownerAccess == that.ownerAccess())
          && (this.memberAccess == that.memberAccess())
          && ((this.signature == null) ? (that.signature() == null) : this.signature.equals(that.signature()))
          && (this.exceptions.equals(that.exceptions()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= methodKey.hashCode();
    h$ *= 1000003;
    h$ ^= ownerAccess;
    h$ *= 1000003;
    h$ ^= memberAccess;
    h$ *= 1000003;
    h$ ^= (signature == null) ? 0 : signature.hashCode();
    h$ *= 1000003;
    h$ ^= exceptions.hashCode();
    return h$;
  }

  @Override
  public MethodDeclInfo.MethodDeclInfoBuilder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MethodDeclInfo.MethodDeclInfoBuilder {
    private MethodKey methodKey;
    private Integer ownerAccess;
    private Integer memberAccess;
    private String signature;
    private ImmutableList<String> exceptions;
    Builder() {
    }
    private Builder(MethodDeclInfo source) {
      this.methodKey = source.methodKey();
      this.ownerAccess = source.ownerAccess();
      this.memberAccess = source.memberAccess();
      this.signature = source.signature();
      this.exceptions = source.exceptions();
    }
    @Override
    public MethodDeclInfo.MethodDeclInfoBuilder setMethodKey(MethodKey methodKey) {
      if (methodKey == null) {
        throw new NullPointerException("Null methodKey");
      }
      this.methodKey = methodKey;
      return this;
    }
    @Override
    public MethodDeclInfo.MethodDeclInfoBuilder setOwnerAccess(int ownerAccess) {
      this.ownerAccess = ownerAccess;
      return this;
    }
    @Override
    public MethodDeclInfo.MethodDeclInfoBuilder setMemberAccess(int memberAccess) {
      this.memberAccess = memberAccess;
      return this;
    }
    @Override
    public MethodDeclInfo.MethodDeclInfoBuilder setSignature(String signature) {
      this.signature = signature;
      return this;
    }
    @Override
    public MethodDeclInfo.MethodDeclInfoBuilder setExceptions(ImmutableList<String> exceptions) {
      if (exceptions == null) {
        throw new NullPointerException("Null exceptions");
      }
      this.exceptions = exceptions;
      return this;
    }
    @Override
    public MethodDeclInfo build() {
      String missing = "";
      if (this.methodKey == null) {
        missing += " methodKey";
      }
      if (this.ownerAccess == null) {
        missing += " ownerAccess";
      }
      if (this.memberAccess == null) {
        missing += " memberAccess";
      }
      if (this.exceptions == null) {
        missing += " exceptions";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MethodDeclInfo(
          this.methodKey,
          this.ownerAccess,
          this.memberAccess,
          this.signature,
          this.exceptions);
    }
  }

}
