// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/tools/android/java/com/google/devtools/build/android/desugar/langmodel/desugar_method_attr.proto

package com.google.devtools.build.android.desugar.langmodel;

public interface DesugarMethodInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android.desugar.DesugarMethodInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.android.desugar.DesugarMethodInfo.SyntheticReason synthetic_reason = 1;</code>
   * @return The enum numeric value on the wire for syntheticReason.
   */
  int getSyntheticReasonValue();
  /**
   * <code>.android.desugar.DesugarMethodInfo.SyntheticReason synthetic_reason = 1;</code>
   * @return The syntheticReason.
   */
  com.google.devtools.build.android.desugar.langmodel.DesugarMethodInfo.SyntheticReason getSyntheticReason();

  /**
   * <code>bool desugar_tool_ignore = 2;</code>
   * @return The desugarToolIgnore.
   */
  boolean getDesugarToolIgnore();
}
