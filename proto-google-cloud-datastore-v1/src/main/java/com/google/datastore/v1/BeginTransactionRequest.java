/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 *
 *
 * <pre>
 * The request for [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.BeginTransactionRequest}
 */
public final class BeginTransactionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.BeginTransactionRequest)
    BeginTransactionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BeginTransactionRequest.newBuilder() to construct.
  private BeginTransactionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BeginTransactionRequest() {
    projectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BeginTransactionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BeginTransactionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 66:
            {
              java.lang.String s = input.readStringRequireUtf8();

              projectId_ = s;
              break;
            }
          case 82:
            {
              com.google.datastore.v1.TransactionOptions.Builder subBuilder = null;
              if (transactionOptions_ != null) {
                subBuilder = transactionOptions_.toBuilder();
              }
              transactionOptions_ =
                  input.readMessage(
                      com.google.datastore.v1.TransactionOptions.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(transactionOptions_);
                transactionOptions_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_BeginTransactionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_BeginTransactionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.BeginTransactionRequest.class,
            com.google.datastore.v1.BeginTransactionRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 8;
  private volatile java.lang.Object projectId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_OPTIONS_FIELD_NUMBER = 10;
  private com.google.datastore.v1.TransactionOptions transactionOptions_;
  /**
   *
   *
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   *
   * @return Whether the transactionOptions field is set.
   */
  @java.lang.Override
  public boolean hasTransactionOptions() {
    return transactionOptions_ != null;
  }
  /**
   *
   *
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   *
   * @return The transactionOptions.
   */
  @java.lang.Override
  public com.google.datastore.v1.TransactionOptions getTransactionOptions() {
    return transactionOptions_ == null
        ? com.google.datastore.v1.TransactionOptions.getDefaultInstance()
        : transactionOptions_;
  }
  /**
   *
   *
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   */
  @java.lang.Override
  public com.google.datastore.v1.TransactionOptionsOrBuilder getTransactionOptionsOrBuilder() {
    return getTransactionOptions();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, projectId_);
    }
    if (transactionOptions_ != null) {
      output.writeMessage(10, getTransactionOptions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, projectId_);
    }
    if (transactionOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(10, getTransactionOptions());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.datastore.v1.BeginTransactionRequest)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.BeginTransactionRequest other =
        (com.google.datastore.v1.BeginTransactionRequest) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (hasTransactionOptions() != other.hasTransactionOptions()) return false;
    if (hasTransactionOptions()) {
      if (!getTransactionOptions().equals(other.getTransactionOptions())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    if (hasTransactionOptions()) {
      hash = (37 * hash) + TRANSACTION_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.datastore.v1.BeginTransactionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request for [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.BeginTransactionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.BeginTransactionRequest)
      com.google.datastore.v1.BeginTransactionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_BeginTransactionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_BeginTransactionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.BeginTransactionRequest.class,
              com.google.datastore.v1.BeginTransactionRequest.Builder.class);
    }

    // Construct using com.google.datastore.v1.BeginTransactionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      projectId_ = "";

      if (transactionOptionsBuilder_ == null) {
        transactionOptions_ = null;
      } else {
        transactionOptions_ = null;
        transactionOptionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_BeginTransactionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.BeginTransactionRequest getDefaultInstanceForType() {
      return com.google.datastore.v1.BeginTransactionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.BeginTransactionRequest build() {
      com.google.datastore.v1.BeginTransactionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.BeginTransactionRequest buildPartial() {
      com.google.datastore.v1.BeginTransactionRequest result =
          new com.google.datastore.v1.BeginTransactionRequest(this);
      result.projectId_ = projectId_;
      if (transactionOptionsBuilder_ == null) {
        result.transactionOptions_ = transactionOptions_;
      } else {
        result.transactionOptions_ = transactionOptionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.v1.BeginTransactionRequest) {
        return mergeFrom((com.google.datastore.v1.BeginTransactionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.BeginTransactionRequest other) {
      if (other == com.google.datastore.v1.BeginTransactionRequest.getDefaultInstance())
        return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (other.hasTransactionOptions()) {
        mergeTransactionOptions(other.getTransactionOptions());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.datastore.v1.BeginTransactionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.BeginTransactionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {

      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      projectId_ = value;
      onChanged();
      return this;
    }

    private com.google.datastore.v1.TransactionOptions transactionOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.TransactionOptions,
            com.google.datastore.v1.TransactionOptions.Builder,
            com.google.datastore.v1.TransactionOptionsOrBuilder>
        transactionOptionsBuilder_;
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     *
     * @return Whether the transactionOptions field is set.
     */
    public boolean hasTransactionOptions() {
      return transactionOptionsBuilder_ != null || transactionOptions_ != null;
    }
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     *
     * @return The transactionOptions.
     */
    public com.google.datastore.v1.TransactionOptions getTransactionOptions() {
      if (transactionOptionsBuilder_ == null) {
        return transactionOptions_ == null
            ? com.google.datastore.v1.TransactionOptions.getDefaultInstance()
            : transactionOptions_;
      } else {
        return transactionOptionsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public Builder setTransactionOptions(com.google.datastore.v1.TransactionOptions value) {
      if (transactionOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transactionOptions_ = value;
        onChanged();
      } else {
        transactionOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public Builder setTransactionOptions(
        com.google.datastore.v1.TransactionOptions.Builder builderForValue) {
      if (transactionOptionsBuilder_ == null) {
        transactionOptions_ = builderForValue.build();
        onChanged();
      } else {
        transactionOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public Builder mergeTransactionOptions(com.google.datastore.v1.TransactionOptions value) {
      if (transactionOptionsBuilder_ == null) {
        if (transactionOptions_ != null) {
          transactionOptions_ =
              com.google.datastore.v1.TransactionOptions.newBuilder(transactionOptions_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          transactionOptions_ = value;
        }
        onChanged();
      } else {
        transactionOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public Builder clearTransactionOptions() {
      if (transactionOptionsBuilder_ == null) {
        transactionOptions_ = null;
        onChanged();
      } else {
        transactionOptions_ = null;
        transactionOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public com.google.datastore.v1.TransactionOptions.Builder getTransactionOptionsBuilder() {

      onChanged();
      return getTransactionOptionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public com.google.datastore.v1.TransactionOptionsOrBuilder getTransactionOptionsOrBuilder() {
      if (transactionOptionsBuilder_ != null) {
        return transactionOptionsBuilder_.getMessageOrBuilder();
      } else {
        return transactionOptions_ == null
            ? com.google.datastore.v1.TransactionOptions.getDefaultInstance()
            : transactionOptions_;
      }
    }
    /**
     *
     *
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.TransactionOptions,
            com.google.datastore.v1.TransactionOptions.Builder,
            com.google.datastore.v1.TransactionOptionsOrBuilder>
        getTransactionOptionsFieldBuilder() {
      if (transactionOptionsBuilder_ == null) {
        transactionOptionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.datastore.v1.TransactionOptions,
                com.google.datastore.v1.TransactionOptions.Builder,
                com.google.datastore.v1.TransactionOptionsOrBuilder>(
                getTransactionOptions(), getParentForChildren(), isClean());
        transactionOptions_ = null;
      }
      return transactionOptionsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.datastore.v1.BeginTransactionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.BeginTransactionRequest)
  private static final com.google.datastore.v1.BeginTransactionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.BeginTransactionRequest();
  }

  public static com.google.datastore.v1.BeginTransactionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BeginTransactionRequest> PARSER =
      new com.google.protobuf.AbstractParser<BeginTransactionRequest>() {
        @java.lang.Override
        public BeginTransactionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BeginTransactionRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BeginTransactionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BeginTransactionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.BeginTransactionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
