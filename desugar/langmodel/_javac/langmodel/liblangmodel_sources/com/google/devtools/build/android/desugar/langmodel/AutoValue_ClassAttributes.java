

package com.google.devtools.build.android.desugar.langmodel;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClassAttributes extends ClassAttributes {

  private final ClassName classBinaryName;

  private final Optional<ClassName> nestHost;

  private final ImmutableSet<ClassName> nestMembers;

  private final ImmutableSet<MethodKey> privateInstanceMethods;

  private final ImmutableSet<MethodKey> desugarIgnoredMethods;

  private AutoValue_ClassAttributes(
      ClassName classBinaryName,
      Optional<ClassName> nestHost,
      ImmutableSet<ClassName> nestMembers,
      ImmutableSet<MethodKey> privateInstanceMethods,
      ImmutableSet<MethodKey> desugarIgnoredMethods) {
    this.classBinaryName = classBinaryName;
    this.nestHost = nestHost;
    this.nestMembers = nestMembers;
    this.privateInstanceMethods = privateInstanceMethods;
    this.desugarIgnoredMethods = desugarIgnoredMethods;
  }

  @Override
  public ClassName classBinaryName() {
    return classBinaryName;
  }

  @Override
  public Optional<ClassName> nestHost() {
    return nestHost;
  }

  @Override
  public ImmutableSet<ClassName> nestMembers() {
    return nestMembers;
  }

  @Override
  public ImmutableSet<MethodKey> privateInstanceMethods() {
    return privateInstanceMethods;
  }

  @Override
  public ImmutableSet<MethodKey> desugarIgnoredMethods() {
    return desugarIgnoredMethods;
  }

  @Override
  public String toString() {
    return "ClassAttributes{"
         + "classBinaryName=" + classBinaryName + ", "
         + "nestHost=" + nestHost + ", "
         + "nestMembers=" + nestMembers + ", "
         + "privateInstanceMethods=" + privateInstanceMethods + ", "
         + "desugarIgnoredMethods=" + desugarIgnoredMethods
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClassAttributes) {
      ClassAttributes that = (ClassAttributes) o;
      return (this.classBinaryName.equals(that.classBinaryName()))
          && (this.nestHost.equals(that.nestHost()))
          && (this.nestMembers.equals(that.nestMembers()))
          && (this.privateInstanceMethods.equals(that.privateInstanceMethods()))
          && (this.desugarIgnoredMethods.equals(that.desugarIgnoredMethods()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= classBinaryName.hashCode();
    h$ *= 1000003;
    h$ ^= nestHost.hashCode();
    h$ *= 1000003;
    h$ ^= nestMembers.hashCode();
    h$ *= 1000003;
    h$ ^= privateInstanceMethods.hashCode();
    h$ *= 1000003;
    h$ ^= desugarIgnoredMethods.hashCode();
    return h$;
  }

  static final class Builder extends ClassAttributes.ClassAttributesBuilder {
    private ClassName classBinaryName;
    private Optional<ClassName> nestHost = Optional.empty();
    private ImmutableSet.Builder<ClassName> nestMembersBuilder$;
    private ImmutableSet<ClassName> nestMembers;
    private ImmutableSet.Builder<MethodKey> privateInstanceMethodsBuilder$;
    private ImmutableSet<MethodKey> privateInstanceMethods;
    private ImmutableSet.Builder<MethodKey> desugarIgnoredMethodsBuilder$;
    private ImmutableSet<MethodKey> desugarIgnoredMethods;
    Builder() {
    }
    @Override
    public ClassAttributes.ClassAttributesBuilder setClassBinaryName(ClassName classBinaryName) {
      if (classBinaryName == null) {
        throw new NullPointerException("Null classBinaryName");
      }
      this.classBinaryName = classBinaryName;
      return this;
    }
    @Override
    public ClassAttributes.ClassAttributesBuilder setNestHost(ClassName nestHost) {
      this.nestHost = Optional.of(nestHost);
      return this;
    }
    @Override
    ImmutableSet.Builder<ClassName> nestMembersBuilder() {
      if (nestMembersBuilder$ == null) {
        nestMembersBuilder$ = ImmutableSet.builder();
      }
      return nestMembersBuilder$;
    }
    @Override
    ImmutableSet.Builder<MethodKey> privateInstanceMethodsBuilder() {
      if (privateInstanceMethodsBuilder$ == null) {
        privateInstanceMethodsBuilder$ = ImmutableSet.builder();
      }
      return privateInstanceMethodsBuilder$;
    }
    @Override
    ImmutableSet.Builder<MethodKey> desugarIgnoredMethodsBuilder() {
      if (desugarIgnoredMethodsBuilder$ == null) {
        desugarIgnoredMethodsBuilder$ = ImmutableSet.builder();
      }
      return desugarIgnoredMethodsBuilder$;
    }
    @Override
    public ClassAttributes build() {
      if (nestMembersBuilder$ != null) {
        this.nestMembers = nestMembersBuilder$.build();
      } else if (this.nestMembers == null) {
        this.nestMembers = ImmutableSet.of();
      }
      if (privateInstanceMethodsBuilder$ != null) {
        this.privateInstanceMethods = privateInstanceMethodsBuilder$.build();
      } else if (this.privateInstanceMethods == null) {
        this.privateInstanceMethods = ImmutableSet.of();
      }
      if (desugarIgnoredMethodsBuilder$ != null) {
        this.desugarIgnoredMethods = desugarIgnoredMethodsBuilder$.build();
      } else if (this.desugarIgnoredMethods == null) {
        this.desugarIgnoredMethods = ImmutableSet.of();
      }
      String missing = "";
      if (this.classBinaryName == null) {
        missing += " classBinaryName";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ClassAttributes(
          this.classBinaryName,
          this.nestHost,
          this.nestMembers,
          this.privateInstanceMethods,
          this.desugarIgnoredMethods);
    }
  }

}
