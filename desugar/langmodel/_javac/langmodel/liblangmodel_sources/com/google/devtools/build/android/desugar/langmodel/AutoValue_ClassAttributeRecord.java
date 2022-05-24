

package com.google.devtools.build.android.desugar.langmodel;

import com.google.common.collect.ImmutableMap;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClassAttributeRecord extends ClassAttributeRecord {

  private final ImmutableMap<ClassName, ClassAttributes> record;

  private AutoValue_ClassAttributeRecord(
      ImmutableMap<ClassName, ClassAttributes> record) {
    this.record = record;
  }

  @Override
  public ImmutableMap<ClassName, ClassAttributes> record() {
    return record;
  }

  @Override
  public String toString() {
    return "ClassAttributeRecord{"
         + "record=" + record
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClassAttributeRecord) {
      ClassAttributeRecord that = (ClassAttributeRecord) o;
      return (this.record.equals(that.record()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= record.hashCode();
    return h$;
  }

  static final class Builder extends ClassAttributeRecord.ClassAttributeRecordBuilder {
    private ImmutableMap.Builder<ClassName, ClassAttributes> recordBuilder$;
    private ImmutableMap<ClassName, ClassAttributes> record;
    Builder() {
    }
    @Override
    ClassAttributeRecord.ClassAttributeRecordBuilder setRecord(ImmutableMap<ClassName, ClassAttributes> record) {
      if (record == null) {
        throw new NullPointerException("Null record");
      }
      if (recordBuilder$ != null) {
        throw new IllegalStateException("Cannot set record after calling recordBuilder()");
      }
      this.record = record;
      return this;
    }
    @Override
    ImmutableMap.Builder<ClassName, ClassAttributes> recordBuilder() {
      if (recordBuilder$ == null) {
        if (record == null) {
          recordBuilder$ = ImmutableMap.builder();
        } else {
          recordBuilder$ = ImmutableMap.builder();
          recordBuilder$.putAll(record);
          record = null;
        }
      }
      return recordBuilder$;
    }
    @Override
    public ClassAttributeRecord build() {
      if (recordBuilder$ != null) {
        this.record = recordBuilder$.build();
      } else if (this.record == null) {
        this.record = ImmutableMap.of();
      }
      return new AutoValue_ClassAttributeRecord(
          this.record);
    }
  }

}
