

package com.google.devtools.build.android.desugar.typehierarchy;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_HierarchicalMethodKey extends HierarchicalMethodKey {

  private final HierarchicalTypeKey owner;

  private final HeadlessMethodKey headlessMethod;

  AutoValue_HierarchicalMethodKey(
      HierarchicalTypeKey owner,
      HeadlessMethodKey headlessMethod) {
    if (owner == null) {
      throw new NullPointerException("Null owner");
    }
    this.owner = owner;
    if (headlessMethod == null) {
      throw new NullPointerException("Null headlessMethod");
    }
    this.headlessMethod = headlessMethod;
  }

  @Override
  public HierarchicalTypeKey owner() {
    return owner;
  }

  @Override
  public HeadlessMethodKey headlessMethod() {
    return headlessMethod;
  }

  @Override
  public String toString() {
    return "HierarchicalMethodKey{"
         + "owner=" + owner + ", "
         + "headlessMethod=" + headlessMethod
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HierarchicalMethodKey) {
      HierarchicalMethodKey that = (HierarchicalMethodKey) o;
      return (this.owner.equals(that.owner()))
          && (this.headlessMethod.equals(that.headlessMethod()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= owner.hashCode();
    h$ *= 1000003;
    h$ ^= headlessMethod.hashCode();
    return h$;
  }

}
