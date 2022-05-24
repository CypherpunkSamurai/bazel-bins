

package com.google.devtools.build.android.desugar.nest;

import com.google.devtools.build.android.desugar.langmodel.ClassAttributeRecord;
import com.google.devtools.build.android.desugar.langmodel.ClassMemberRecord;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_NestDigest extends NestDigest {

  private final ClassMemberRecord classMemberRecord;

  private final ClassAttributeRecord classAttributeRecord;

  $AutoValue_NestDigest(
      ClassMemberRecord classMemberRecord,
      ClassAttributeRecord classAttributeRecord) {
    if (classMemberRecord == null) {
      throw new NullPointerException("Null classMemberRecord");
    }
    this.classMemberRecord = classMemberRecord;
    if (classAttributeRecord == null) {
      throw new NullPointerException("Null classAttributeRecord");
    }
    this.classAttributeRecord = classAttributeRecord;
  }

  @Override
  public ClassMemberRecord classMemberRecord() {
    return classMemberRecord;
  }

  @Override
  public ClassAttributeRecord classAttributeRecord() {
    return classAttributeRecord;
  }

  @Override
  public String toString() {
    return "NestDigest{"
         + "classMemberRecord=" + classMemberRecord + ", "
         + "classAttributeRecord=" + classAttributeRecord
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NestDigest) {
      NestDigest that = (NestDigest) o;
      return (this.classMemberRecord.equals(that.classMemberRecord()))
          && (this.classAttributeRecord.equals(that.classAttributeRecord()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= classMemberRecord.hashCode();
    h$ *= 1000003;
    h$ ^= classAttributeRecord.hashCode();
    return h$;
  }

  static final class Builder extends NestDigest.NestDigestBuilder {
    private ClassMemberRecord classMemberRecord;
    private ClassAttributeRecord classAttributeRecord;
    Builder() {
    }
    @Override
    public NestDigest.NestDigestBuilder setClassMemberRecord(ClassMemberRecord classMemberRecord) {
      if (classMemberRecord == null) {
        throw new NullPointerException("Null classMemberRecord");
      }
      this.classMemberRecord = classMemberRecord;
      return this;
    }
    @Override
    public NestDigest.NestDigestBuilder setClassAttributeRecord(ClassAttributeRecord classAttributeRecord) {
      if (classAttributeRecord == null) {
        throw new NullPointerException("Null classAttributeRecord");
      }
      this.classAttributeRecord = classAttributeRecord;
      return this;
    }
    @Override
    public NestDigest build() {
      String missing = "";
      if (this.classMemberRecord == null) {
        missing += " classMemberRecord";
      }
      if (this.classAttributeRecord == null) {
        missing += " classAttributeRecord";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_NestDigest(
          this.classMemberRecord,
          this.classAttributeRecord);
    }
  }

}
