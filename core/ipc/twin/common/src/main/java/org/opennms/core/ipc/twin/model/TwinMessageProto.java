/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2021 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2021 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: twin-message.proto

package org.opennms.core.ipc.twin.model;

public final class TwinMessageProto {
  private TwinMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TwinRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TwinRequestProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TwinRequestProto_TracingInfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TwinRequestProto_TracingInfoEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TwinResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TwinResponseProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TwinResponseProto_TracingInfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TwinResponseProto_TracingInfoEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022twin-message.proto\"\273\001\n\020TwinRequestProt" +
      "o\022\024\n\014consumer_key\030\001 \001(\t\022\021\n\tsystem_id\030\002 \001" +
      "(\t\022\020\n\010location\030\003 \001(\t\0228\n\014tracing_info\030\004 \003" +
      "(\0132\".TwinRequestProto.TracingInfoEntry\0322" +
      "\n\020TracingInfoEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value" +
      "\030\002 \001(\t:\0028\001\"\220\002\n\021TwinResponseProto\022\024\n\014cons" +
      "umer_key\030\001 \001(\t\022\023\n\013twin_object\030\002 \001(\014\022\021\n\ts" +
      "ystem_id\030\003 \001(\t\022\020\n\010location\030\004 \001(\t\022\027\n\017is_p" +
      "atch_object\030\005 \001(\010\022\022\n\nsession_id\030\006 \001(\t\022\017\n" +
      "\007version\030\007 \001(\005\0229\n\014tracing_info\030\010 \003(\0132#.T" +
      "winResponseProto.TracingInfoEntry\0322\n\020Tra" +
      "cingInfoEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t:\0028\001B5\n\037org.opennms.core.ipc.twin.model" +
      "B\020TwinMessageProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_TwinRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TwinRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TwinRequestProto_descriptor,
        new java.lang.String[] { "ConsumerKey", "SystemId", "Location", "TracingInfo", });
    internal_static_TwinRequestProto_TracingInfoEntry_descriptor =
      internal_static_TwinRequestProto_descriptor.getNestedTypes().get(0);
    internal_static_TwinRequestProto_TracingInfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TwinRequestProto_TracingInfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_TwinResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TwinResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TwinResponseProto_descriptor,
        new java.lang.String[] { "ConsumerKey", "TwinObject", "SystemId", "Location", "IsPatchObject", "SessionId", "Version", "TracingInfo", });
    internal_static_TwinResponseProto_TracingInfoEntry_descriptor =
      internal_static_TwinResponseProto_descriptor.getNestedTypes().get(0);
    internal_static_TwinResponseProto_TracingInfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TwinResponseProto_TracingInfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
