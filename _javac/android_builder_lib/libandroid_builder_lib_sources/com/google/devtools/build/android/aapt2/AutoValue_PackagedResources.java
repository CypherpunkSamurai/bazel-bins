

package com.google.devtools.build.android.aapt2;

import java.nio.file.Path;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PackagedResources extends PackagedResources {

  private final Path apk;

  private final Path proto;

  private final Path rTxt;

  private final Path proguardConfig;

  private final Path mainDexProguard;

  private final Path javaSourceDirectory;

  private final Path resourceIds;

  private final Path attributes;

  private final Path packages;

  AutoValue_PackagedResources(
      Path apk,
      Path proto,
      Path rTxt,
      Path proguardConfig,
      Path mainDexProguard,
      Path javaSourceDirectory,
      Path resourceIds,
      Path attributes,
      Path packages) {
    if (apk == null) {
      throw new NullPointerException("Null apk");
    }
    this.apk = apk;
    if (proto == null) {
      throw new NullPointerException("Null proto");
    }
    this.proto = proto;
    if (rTxt == null) {
      throw new NullPointerException("Null rTxt");
    }
    this.rTxt = rTxt;
    if (proguardConfig == null) {
      throw new NullPointerException("Null proguardConfig");
    }
    this.proguardConfig = proguardConfig;
    if (mainDexProguard == null) {
      throw new NullPointerException("Null mainDexProguard");
    }
    this.mainDexProguard = mainDexProguard;
    if (javaSourceDirectory == null) {
      throw new NullPointerException("Null javaSourceDirectory");
    }
    this.javaSourceDirectory = javaSourceDirectory;
    if (resourceIds == null) {
      throw new NullPointerException("Null resourceIds");
    }
    this.resourceIds = resourceIds;
    if (attributes == null) {
      throw new NullPointerException("Null attributes");
    }
    this.attributes = attributes;
    if (packages == null) {
      throw new NullPointerException("Null packages");
    }
    this.packages = packages;
  }

  @Override
  public Path apk() {
    return apk;
  }

  @Override
  public Path proto() {
    return proto;
  }

  @Override
  public Path rTxt() {
    return rTxt;
  }

  @Override
  public Path proguardConfig() {
    return proguardConfig;
  }

  @Override
  public Path mainDexProguard() {
    return mainDexProguard;
  }

  @Override
  public Path javaSourceDirectory() {
    return javaSourceDirectory;
  }

  @Override
  Path resourceIds() {
    return resourceIds;
  }

  @Override
  public Path attributes() {
    return attributes;
  }

  @Override
  public Path packages() {
    return packages;
  }

  @Override
  public String toString() {
    return "PackagedResources{"
         + "apk=" + apk + ", "
         + "proto=" + proto + ", "
         + "rTxt=" + rTxt + ", "
         + "proguardConfig=" + proguardConfig + ", "
         + "mainDexProguard=" + mainDexProguard + ", "
         + "javaSourceDirectory=" + javaSourceDirectory + ", "
         + "resourceIds=" + resourceIds + ", "
         + "attributes=" + attributes + ", "
         + "packages=" + packages
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PackagedResources) {
      PackagedResources that = (PackagedResources) o;
      return (this.apk.equals(that.apk()))
          && (this.proto.equals(that.proto()))
          && (this.rTxt.equals(that.rTxt()))
          && (this.proguardConfig.equals(that.proguardConfig()))
          && (this.mainDexProguard.equals(that.mainDexProguard()))
          && (this.javaSourceDirectory.equals(that.javaSourceDirectory()))
          && (this.resourceIds.equals(that.resourceIds()))
          && (this.attributes.equals(that.attributes()))
          && (this.packages.equals(that.packages()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= apk.hashCode();
    h$ *= 1000003;
    h$ ^= proto.hashCode();
    h$ *= 1000003;
    h$ ^= rTxt.hashCode();
    h$ *= 1000003;
    h$ ^= proguardConfig.hashCode();
    h$ *= 1000003;
    h$ ^= mainDexProguard.hashCode();
    h$ *= 1000003;
    h$ ^= javaSourceDirectory.hashCode();
    h$ *= 1000003;
    h$ ^= resourceIds.hashCode();
    h$ *= 1000003;
    h$ ^= attributes.hashCode();
    h$ *= 1000003;
    h$ ^= packages.hashCode();
    return h$;
  }

}
