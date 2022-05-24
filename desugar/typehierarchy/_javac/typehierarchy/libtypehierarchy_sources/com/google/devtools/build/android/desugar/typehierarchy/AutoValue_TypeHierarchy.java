

package com.google.devtools.build.android.desugar.typehierarchy;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.devtools.build.android.desugar.langmodel.MethodDeclInfo;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TypeHierarchy extends TypeHierarchy {

  private final ImmutableMap<HierarchicalTypeKey, HierarchicalTypeKey> directSuperClassByType;

  private final ImmutableSetMultimap<HierarchicalTypeKey, HierarchicalTypeKey> directInterfacesByType;

  private final ImmutableSetMultimap<HierarchicalTypeKey, HeadlessMethodKey> headlessMethodKeysByType;

  private final ImmutableMap<HierarchicalMethodKey, MethodDeclInfo> methodMetadata;

  private final boolean requireTypeResolutionComplete;

  private AutoValue_TypeHierarchy(
      ImmutableMap<HierarchicalTypeKey, HierarchicalTypeKey> directSuperClassByType,
      ImmutableSetMultimap<HierarchicalTypeKey, HierarchicalTypeKey> directInterfacesByType,
      ImmutableSetMultimap<HierarchicalTypeKey, HeadlessMethodKey> headlessMethodKeysByType,
      ImmutableMap<HierarchicalMethodKey, MethodDeclInfo> methodMetadata,
      boolean requireTypeResolutionComplete) {
    this.directSuperClassByType = directSuperClassByType;
    this.directInterfacesByType = directInterfacesByType;
    this.headlessMethodKeysByType = headlessMethodKeysByType;
    this.methodMetadata = methodMetadata;
    this.requireTypeResolutionComplete = requireTypeResolutionComplete;
  }

  @Override
  ImmutableMap<HierarchicalTypeKey, HierarchicalTypeKey> directSuperClassByType() {
    return directSuperClassByType;
  }

  @Override
  ImmutableSetMultimap<HierarchicalTypeKey, HierarchicalTypeKey> directInterfacesByType() {
    return directInterfacesByType;
  }

  @Override
  public ImmutableSetMultimap<HierarchicalTypeKey, HeadlessMethodKey> headlessMethodKeysByType() {
    return headlessMethodKeysByType;
  }

  @Override
  public ImmutableMap<HierarchicalMethodKey, MethodDeclInfo> methodMetadata() {
    return methodMetadata;
  }

  @Override
  boolean requireTypeResolutionComplete() {
    return requireTypeResolutionComplete;
  }

  @Override
  public String toString() {
    return "TypeHierarchy{"
         + "directSuperClassByType=" + directSuperClassByType + ", "
         + "directInterfacesByType=" + directInterfacesByType + ", "
         + "headlessMethodKeysByType=" + headlessMethodKeysByType + ", "
         + "methodMetadata=" + methodMetadata + ", "
         + "requireTypeResolutionComplete=" + requireTypeResolutionComplete
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TypeHierarchy) {
      TypeHierarchy that = (TypeHierarchy) o;
      return (this.directSuperClassByType.equals(that.directSuperClassByType()))
          && (this.directInterfacesByType.equals(that.directInterfacesByType()))
          && (this.headlessMethodKeysByType.equals(that.headlessMethodKeysByType()))
          && (this.methodMetadata.equals(that.methodMetadata()))
          && (this.requireTypeResolutionComplete == that.requireTypeResolutionComplete());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= directSuperClassByType.hashCode();
    h$ *= 1000003;
    h$ ^= directInterfacesByType.hashCode();
    h$ *= 1000003;
    h$ ^= headlessMethodKeysByType.hashCode();
    h$ *= 1000003;
    h$ ^= methodMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= requireTypeResolutionComplete ? 1231 : 1237;
    return h$;
  }

  static final class Builder extends TypeHierarchy.TypeHierarchyBuilder {
    private ImmutableMap.Builder<HierarchicalTypeKey, HierarchicalTypeKey> directSuperClassByTypeBuilder$;
    private ImmutableMap<HierarchicalTypeKey, HierarchicalTypeKey> directSuperClassByType;
    private ImmutableSetMultimap.Builder<HierarchicalTypeKey, HierarchicalTypeKey> directInterfacesByTypeBuilder$;
    private ImmutableSetMultimap<HierarchicalTypeKey, HierarchicalTypeKey> directInterfacesByType;
    private ImmutableSetMultimap.Builder<HierarchicalTypeKey, HeadlessMethodKey> headlessMethodKeysByTypeBuilder$;
    private ImmutableSetMultimap<HierarchicalTypeKey, HeadlessMethodKey> headlessMethodKeysByType;
    private ImmutableMap.Builder<HierarchicalMethodKey, MethodDeclInfo> methodMetadataBuilder$;
    private ImmutableMap<HierarchicalMethodKey, MethodDeclInfo> methodMetadata;
    private Boolean requireTypeResolutionComplete;
    Builder() {
    }
    @Override
    ImmutableMap.Builder<HierarchicalTypeKey, HierarchicalTypeKey> directSuperClassByTypeBuilder() {
      if (directSuperClassByTypeBuilder$ == null) {
        directSuperClassByTypeBuilder$ = ImmutableMap.builder();
      }
      return directSuperClassByTypeBuilder$;
    }
    @Override
    ImmutableSetMultimap.Builder<HierarchicalTypeKey, HierarchicalTypeKey> directInterfacesByTypeBuilder() {
      if (directInterfacesByTypeBuilder$ == null) {
        directInterfacesByTypeBuilder$ = ImmutableSetMultimap.builder();
      }
      return directInterfacesByTypeBuilder$;
    }
    @Override
    ImmutableSetMultimap.Builder<HierarchicalTypeKey, HeadlessMethodKey> headlessMethodKeysByTypeBuilder() {
      if (headlessMethodKeysByTypeBuilder$ == null) {
        headlessMethodKeysByTypeBuilder$ = ImmutableSetMultimap.builder();
      }
      return headlessMethodKeysByTypeBuilder$;
    }
    @Override
    ImmutableMap.Builder<HierarchicalMethodKey, MethodDeclInfo> methodMetadataBuilder() {
      if (methodMetadataBuilder$ == null) {
        methodMetadataBuilder$ = ImmutableMap.builder();
      }
      return methodMetadataBuilder$;
    }
    @Override
    TypeHierarchy.TypeHierarchyBuilder setRequireTypeResolutionComplete(boolean requireTypeResolutionComplete) {
      this.requireTypeResolutionComplete = requireTypeResolutionComplete;
      return this;
    }
    @Override
    TypeHierarchy build() {
      if (directSuperClassByTypeBuilder$ != null) {
        this.directSuperClassByType = directSuperClassByTypeBuilder$.build();
      } else if (this.directSuperClassByType == null) {
        this.directSuperClassByType = ImmutableMap.of();
      }
      if (directInterfacesByTypeBuilder$ != null) {
        this.directInterfacesByType = directInterfacesByTypeBuilder$.build();
      } else if (this.directInterfacesByType == null) {
        this.directInterfacesByType = ImmutableSetMultimap.of();
      }
      if (headlessMethodKeysByTypeBuilder$ != null) {
        this.headlessMethodKeysByType = headlessMethodKeysByTypeBuilder$.build();
      } else if (this.headlessMethodKeysByType == null) {
        this.headlessMethodKeysByType = ImmutableSetMultimap.of();
      }
      if (methodMetadataBuilder$ != null) {
        this.methodMetadata = methodMetadataBuilder$.build();
      } else if (this.methodMetadata == null) {
        this.methodMetadata = ImmutableMap.of();
      }
      String missing = "";
      if (this.requireTypeResolutionComplete == null) {
        missing += " requireTypeResolutionComplete";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_TypeHierarchy(
          this.directSuperClassByType,
          this.directInterfacesByType,
          this.headlessMethodKeysByType,
          this.methodMetadata,
          this.requireTypeResolutionComplete);
    }
  }

}
