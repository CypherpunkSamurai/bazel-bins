

package com.google.devtools.build.android;

import android.aapt.pb.internal.ResourcesInternal;
import com.android.aapt.Resources;
import com.google.common.hash.HashCode;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AndroidCompiledDataDeserializer_CompiledFileWithData extends AndroidCompiledDataDeserializer.CompiledFileWithData {

  private final ResourcesInternal.CompiledFile compiledFile;

  private final HashCode fingerprint;

  private final Resources.XmlNode rootXmlNode;

  AutoValue_AndroidCompiledDataDeserializer_CompiledFileWithData(
      ResourcesInternal.CompiledFile compiledFile,
      @Nullable HashCode fingerprint,
      @Nullable Resources.XmlNode rootXmlNode) {
    if (compiledFile == null) {
      throw new NullPointerException("Null compiledFile");
    }
    this.compiledFile = compiledFile;
    this.fingerprint = fingerprint;
    this.rootXmlNode = rootXmlNode;
  }

  @Override
  ResourcesInternal.CompiledFile compiledFile() {
    return compiledFile;
  }

  @Nullable
  @Override
  HashCode fingerprint() {
    return fingerprint;
  }

  @Nullable
  @Override
  Resources.XmlNode rootXmlNode() {
    return rootXmlNode;
  }

  @Override
  public String toString() {
    return "CompiledFileWithData{"
         + "compiledFile=" + compiledFile + ", "
         + "fingerprint=" + fingerprint + ", "
         + "rootXmlNode=" + rootXmlNode
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AndroidCompiledDataDeserializer.CompiledFileWithData) {
      AndroidCompiledDataDeserializer.CompiledFileWithData that = (AndroidCompiledDataDeserializer.CompiledFileWithData) o;
      return (this.compiledFile.equals(that.compiledFile()))
          && ((this.fingerprint == null) ? (that.fingerprint() == null) : this.fingerprint.equals(that.fingerprint()))
          && ((this.rootXmlNode == null) ? (that.rootXmlNode() == null) : this.rootXmlNode.equals(that.rootXmlNode()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= compiledFile.hashCode();
    h$ *= 1000003;
    h$ ^= (fingerprint == null) ? 0 : fingerprint.hashCode();
    h$ *= 1000003;
    h$ ^= (rootXmlNode == null) ? 0 : rootXmlNode.hashCode();
    return h$;
  }

}
