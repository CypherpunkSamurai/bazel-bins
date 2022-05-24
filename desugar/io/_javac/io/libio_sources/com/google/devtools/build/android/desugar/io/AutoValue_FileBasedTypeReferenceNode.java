

package com.google.devtools.build.android.desugar.io;

import com.google.devtools.build.android.desugar.langmodel.ClassName;
import java.util.function.Predicate;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FileBasedTypeReferenceNode extends FileBasedTypeReferenceNode {

  private final ClassName className;

  private final Predicate<ClassName> typeFilter;

  private final ClassFileBatchProvider classFileBatchProvider;

  AutoValue_FileBasedTypeReferenceNode(
      ClassName className,
      Predicate<ClassName> typeFilter,
      ClassFileBatchProvider classFileBatchProvider) {
    if (className == null) {
      throw new NullPointerException("Null className");
    }
    this.className = className;
    if (typeFilter == null) {
      throw new NullPointerException("Null typeFilter");
    }
    this.typeFilter = typeFilter;
    if (classFileBatchProvider == null) {
      throw new NullPointerException("Null classFileBatchProvider");
    }
    this.classFileBatchProvider = classFileBatchProvider;
  }

  @Override
  ClassName className() {
    return className;
  }

  @Override
  Predicate<ClassName> typeFilter() {
    return typeFilter;
  }

  @Override
  ClassFileBatchProvider classFileBatchProvider() {
    return classFileBatchProvider;
  }

  @Override
  public String toString() {
    return "FileBasedTypeReferenceNode{"
         + "className=" + className + ", "
         + "typeFilter=" + typeFilter + ", "
         + "classFileBatchProvider=" + classFileBatchProvider
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FileBasedTypeReferenceNode) {
      FileBasedTypeReferenceNode that = (FileBasedTypeReferenceNode) o;
      return (this.className.equals(that.className()))
          && (this.typeFilter.equals(that.typeFilter()))
          && (this.classFileBatchProvider.equals(that.classFileBatchProvider()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= className.hashCode();
    h$ *= 1000003;
    h$ ^= typeFilter.hashCode();
    h$ *= 1000003;
    h$ ^= classFileBatchProvider.hashCode();
    return h$;
  }

}
