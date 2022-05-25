/*
 * Copyright 2021 Google LLC
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
// source: google/datastore/admin/v1/migration.proto

package com.google.datastore.admin.v1;

public interface MigrationProgressEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.admin.v1.MigrationProgressEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The step that is starting.
   * An event with step set to `START` indicates that the migration
   * has been reverted back to the initial pre-migration state.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.MigrationStep step = 1;</code>
   *
   * @return The enum numeric value on the wire for step.
   */
  int getStepValue();
  /**
   *
   *
   * <pre>
   * The step that is starting.
   * An event with step set to `START` indicates that the migration
   * has been reverted back to the initial pre-migration state.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.MigrationStep step = 1;</code>
   *
   * @return The step.
   */
  com.google.datastore.admin.v1.MigrationStep getStep();

  /**
   *
   *
   * <pre>
   * Details for the `PREPARE` step.
   * </pre>
   *
   * <code>
   * .google.datastore.admin.v1.MigrationProgressEvent.PrepareStepDetails prepare_step_details = 2;
   * </code>
   *
   * @return Whether the prepareStepDetails field is set.
   */
  boolean hasPrepareStepDetails();
  /**
   *
   *
   * <pre>
   * Details for the `PREPARE` step.
   * </pre>
   *
   * <code>
   * .google.datastore.admin.v1.MigrationProgressEvent.PrepareStepDetails prepare_step_details = 2;
   * </code>
   *
   * @return The prepareStepDetails.
   */
  com.google.datastore.admin.v1.MigrationProgressEvent.PrepareStepDetails getPrepareStepDetails();
  /**
   *
   *
   * <pre>
   * Details for the `PREPARE` step.
   * </pre>
   *
   * <code>
   * .google.datastore.admin.v1.MigrationProgressEvent.PrepareStepDetails prepare_step_details = 2;
   * </code>
   */
  com.google.datastore.admin.v1.MigrationProgressEvent.PrepareStepDetailsOrBuilder
      getPrepareStepDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details for the `REDIRECT_WRITES` step.
   * </pre>
   *
   * <code>
   * .google.datastore.admin.v1.MigrationProgressEvent.RedirectWritesStepDetails redirect_writes_step_details = 3;
   * </code>
   *
   * @return Whether the redirectWritesStepDetails field is set.
   */
  boolean hasRedirectWritesStepDetails();
  /**
   *
   *
   * <pre>
   * Details for the `REDIRECT_WRITES` step.
   * </pre>
   *
   * <code>
   * .google.datastore.admin.v1.MigrationProgressEvent.RedirectWritesStepDetails redirect_writes_step_details = 3;
   * </code>
   *
   * @return The redirectWritesStepDetails.
   */
  com.google.datastore.admin.v1.MigrationProgressEvent.RedirectWritesStepDetails
      getRedirectWritesStepDetails();
  /**
   *
   *
   * <pre>
   * Details for the `REDIRECT_WRITES` step.
   * </pre>
   *
   * <code>
   * .google.datastore.admin.v1.MigrationProgressEvent.RedirectWritesStepDetails redirect_writes_step_details = 3;
   * </code>
   */
  com.google.datastore.admin.v1.MigrationProgressEvent.RedirectWritesStepDetailsOrBuilder
      getRedirectWritesStepDetailsOrBuilder();

  public com.google.datastore.admin.v1.MigrationProgressEvent.StepDetailsCase getStepDetailsCase();
}
