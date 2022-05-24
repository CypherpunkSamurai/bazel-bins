package com.google.devtools.build.android.desugar.typehierarchy;

import com.google.common.collect.ImmutableList;
import com.google.devtools.build.android.desugar.langmodel.MethodDeclInfo;
import java.lang.Override;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_HierarchicalMethodQuery extends $AutoValue_HierarchicalMethodQuery {
  private volatile MethodDeclInfo methodMetaData;

  private volatile boolean methodMetaData$Memoized;

  private volatile HierarchicalMethodKey getFirstBaseClassMethod;

  private volatile boolean getFirstBaseClassMethod$Memoized;

  private volatile ImmutableList<HierarchicalMethodKey> getBaseClassMethods;

  private volatile ImmutableList<HierarchicalMethodKey> getBaseInterfaceMethods;

  private volatile ImmutableList<HierarchicalMethodKey> getBaseMethods;

  AutoValue_HierarchicalMethodQuery(HierarchicalMethodKey method$, TypeHierarchy typeHierarchy$) {
    super(method$, typeHierarchy$);
  }

  @Override
  @Nullable
  MethodDeclInfo methodMetaData() {
    if (!methodMetaData$Memoized) {
      synchronized (this) {
        if (!methodMetaData$Memoized) {
          methodMetaData = super.methodMetaData();
          methodMetaData$Memoized = true;
        }
      }
    }
    return methodMetaData;
  }

  @Override
  @Nullable
  public HierarchicalMethodKey getFirstBaseClassMethod() {
    if (!getFirstBaseClassMethod$Memoized) {
      synchronized (this) {
        if (!getFirstBaseClassMethod$Memoized) {
          getFirstBaseClassMethod = super.getFirstBaseClassMethod();
          getFirstBaseClassMethod$Memoized = true;
        }
      }
    }
    return getFirstBaseClassMethod;
  }

  @Override
  public ImmutableList<HierarchicalMethodKey> getBaseClassMethods() {
    if (getBaseClassMethods == null) {
      synchronized (this) {
        if (getBaseClassMethods == null) {
          getBaseClassMethods = super.getBaseClassMethods();
          if (getBaseClassMethods == null) {
            throw new NullPointerException("getBaseClassMethods() cannot return null");
          }
        }
      }
    }
    return getBaseClassMethods;
  }

  @Override
  public ImmutableList<HierarchicalMethodKey> getBaseInterfaceMethods() {
    if (getBaseInterfaceMethods == null) {
      synchronized (this) {
        if (getBaseInterfaceMethods == null) {
          getBaseInterfaceMethods = super.getBaseInterfaceMethods();
          if (getBaseInterfaceMethods == null) {
            throw new NullPointerException("getBaseInterfaceMethods() cannot return null");
          }
        }
      }
    }
    return getBaseInterfaceMethods;
  }

  @Override
  public ImmutableList<HierarchicalMethodKey> getBaseMethods() {
    if (getBaseMethods == null) {
      synchronized (this) {
        if (getBaseMethods == null) {
          getBaseMethods = super.getBaseMethods();
          if (getBaseMethods == null) {
            throw new NullPointerException("getBaseMethods() cannot return null");
          }
        }
      }
    }
    return getBaseMethods;
  }
}
