// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RectangleContainer.proto

package com.chunkmapper.protoc;

public final class RectangleContainer {
  private RectangleContainer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RectangleOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 x = 1;
    /**
     * <code>required int32 x = 1;</code>
     */
    boolean hasX();
    /**
     * <code>required int32 x = 1;</code>
     */
    int getX();

    // required int32 z = 2;
    /**
     * <code>required int32 z = 2;</code>
     */
    boolean hasZ();
    /**
     * <code>required int32 z = 2;</code>
     */
    int getZ();

    // required int32 width = 3;
    /**
     * <code>required int32 width = 3;</code>
     */
    boolean hasWidth();
    /**
     * <code>required int32 width = 3;</code>
     */
    int getWidth();

    // required int32 height = 4;
    /**
     * <code>required int32 height = 4;</code>
     */
    boolean hasHeight();
    /**
     * <code>required int32 height = 4;</code>
     */
    int getHeight();
  }
  /**
   * Protobuf type {@code Rectangle}
   */
  public static final class Rectangle extends
      com.google.protobuf.GeneratedMessage
      implements RectangleOrBuilder {
    // Use Rectangle.newBuilder() to construct.
    private Rectangle(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Rectangle(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Rectangle defaultInstance;
    public static Rectangle getDefaultInstance() {
      return defaultInstance;
    }

    public Rectangle getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Rectangle(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              x_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              z_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              width_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              height_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chunkmapper.protoc.RectangleContainer.internal_static_Rectangle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chunkmapper.protoc.RectangleContainer.internal_static_Rectangle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chunkmapper.protoc.RectangleContainer.Rectangle.class, com.chunkmapper.protoc.RectangleContainer.Rectangle.Builder.class);
    }

    public static com.google.protobuf.Parser<Rectangle> PARSER =
        new com.google.protobuf.AbstractParser<Rectangle>() {
      public Rectangle parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Rectangle(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Rectangle> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 x = 1;
    public static final int X_FIELD_NUMBER = 1;
    private int x_;
    /**
     * <code>required int32 x = 1;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 x = 1;</code>
     */
    public int getX() {
      return x_;
    }

    // required int32 z = 2;
    public static final int Z_FIELD_NUMBER = 2;
    private int z_;
    /**
     * <code>required int32 z = 2;</code>
     */
    public boolean hasZ() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 z = 2;</code>
     */
    public int getZ() {
      return z_;
    }

    // required int32 width = 3;
    public static final int WIDTH_FIELD_NUMBER = 3;
    private int width_;
    /**
     * <code>required int32 width = 3;</code>
     */
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 width = 3;</code>
     */
    public int getWidth() {
      return width_;
    }

    // required int32 height = 4;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    private int height_;
    /**
     * <code>required int32 height = 4;</code>
     */
    public boolean hasHeight() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 height = 4;</code>
     */
    public int getHeight() {
      return height_;
    }

    private void initFields() {
      x_ = 0;
      z_ = 0;
      width_ = 0;
      height_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasZ()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasWidth()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHeight()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, z_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, width_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, height_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, z_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, width_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, height_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chunkmapper.protoc.RectangleContainer.Rectangle parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chunkmapper.protoc.RectangleContainer.Rectangle prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Rectangle}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.chunkmapper.protoc.RectangleContainer.RectangleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chunkmapper.protoc.RectangleContainer.internal_static_Rectangle_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chunkmapper.protoc.RectangleContainer.internal_static_Rectangle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chunkmapper.protoc.RectangleContainer.Rectangle.class, com.chunkmapper.protoc.RectangleContainer.Rectangle.Builder.class);
      }

      // Construct using com.chunkmapper.protoc.RectangleContainer.Rectangle.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        z_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        width_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        height_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chunkmapper.protoc.RectangleContainer.internal_static_Rectangle_descriptor;
      }

      public com.chunkmapper.protoc.RectangleContainer.Rectangle getDefaultInstanceForType() {
        return com.chunkmapper.protoc.RectangleContainer.Rectangle.getDefaultInstance();
      }

      public com.chunkmapper.protoc.RectangleContainer.Rectangle build() {
        com.chunkmapper.protoc.RectangleContainer.Rectangle result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chunkmapper.protoc.RectangleContainer.Rectangle buildPartial() {
        com.chunkmapper.protoc.RectangleContainer.Rectangle result = new com.chunkmapper.protoc.RectangleContainer.Rectangle(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.z_ = z_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.width_ = width_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.height_ = height_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chunkmapper.protoc.RectangleContainer.Rectangle) {
          return mergeFrom((com.chunkmapper.protoc.RectangleContainer.Rectangle)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chunkmapper.protoc.RectangleContainer.Rectangle other) {
        if (other == com.chunkmapper.protoc.RectangleContainer.Rectangle.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasZ()) {
          setZ(other.getZ());
        }
        if (other.hasWidth()) {
          setWidth(other.getWidth());
        }
        if (other.hasHeight()) {
          setHeight(other.getHeight());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasX()) {
          
          return false;
        }
        if (!hasZ()) {
          
          return false;
        }
        if (!hasWidth()) {
          
          return false;
        }
        if (!hasHeight()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chunkmapper.protoc.RectangleContainer.Rectangle parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chunkmapper.protoc.RectangleContainer.Rectangle) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 x = 1;
      private int x_ ;
      /**
       * <code>required int32 x = 1;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public int getX() {
        return x_;
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000001;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        onChanged();
        return this;
      }

      // required int32 z = 2;
      private int z_ ;
      /**
       * <code>required int32 z = 2;</code>
       */
      public boolean hasZ() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 z = 2;</code>
       */
      public int getZ() {
        return z_;
      }
      /**
       * <code>required int32 z = 2;</code>
       */
      public Builder setZ(int value) {
        bitField0_ |= 0x00000002;
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 z = 2;</code>
       */
      public Builder clearZ() {
        bitField0_ = (bitField0_ & ~0x00000002);
        z_ = 0;
        onChanged();
        return this;
      }

      // required int32 width = 3;
      private int width_ ;
      /**
       * <code>required int32 width = 3;</code>
       */
      public boolean hasWidth() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 width = 3;</code>
       */
      public int getWidth() {
        return width_;
      }
      /**
       * <code>required int32 width = 3;</code>
       */
      public Builder setWidth(int value) {
        bitField0_ |= 0x00000004;
        width_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 width = 3;</code>
       */
      public Builder clearWidth() {
        bitField0_ = (bitField0_ & ~0x00000004);
        width_ = 0;
        onChanged();
        return this;
      }

      // required int32 height = 4;
      private int height_ ;
      /**
       * <code>required int32 height = 4;</code>
       */
      public boolean hasHeight() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 height = 4;</code>
       */
      public int getHeight() {
        return height_;
      }
      /**
       * <code>required int32 height = 4;</code>
       */
      public Builder setHeight(int value) {
        bitField0_ |= 0x00000008;
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 height = 4;</code>
       */
      public Builder clearHeight() {
        bitField0_ = (bitField0_ & ~0x00000008);
        height_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Rectangle)
    }

    static {
      defaultInstance = new Rectangle(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Rectangle)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Rectangle_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Rectangle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RectangleContainer.proto\"@\n\tRectangle\022" +
      "\t\n\001x\030\001 \002(\005\022\t\n\001z\030\002 \002(\005\022\r\n\005width\030\003 \002(\005\022\016\n\006" +
      "height\030\004 \002(\005B\030\n\026com.chunkmapper.protoc"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Rectangle_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Rectangle_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Rectangle_descriptor,
              new java.lang.String[] { "X", "Z", "Width", "Height", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}