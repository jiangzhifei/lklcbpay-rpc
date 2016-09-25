/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.lakala.cbpay.rpc.support;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-25")
public class SuperRequest implements org.apache.thrift.TBase<SuperRequest, SuperRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SuperRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SuperRequest");

  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HEADERS_FIELD_DESC = new org.apache.thrift.protocol.TField("headers", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("body", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SuperRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SuperRequestTupleSchemeFactory());
  }

  public String path; // required
  public Map<String,String> headers; // required
  public ByteBuffer body; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PATH((short)1, "path"),
    HEADERS((short)2, "headers"),
    BODY((short)3, "body");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PATH
          return PATH;
        case 2: // HEADERS
          return HEADERS;
        case 3: // BODY
          return BODY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.BODY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HEADERS, new org.apache.thrift.meta_data.FieldMetaData("headers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BODY, new org.apache.thrift.meta_data.FieldMetaData("body", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SuperRequest.class, metaDataMap);
  }

  public SuperRequest() {
  }

  public SuperRequest(
    String path,
    Map<String,String> headers)
  {
    this();
    this.path = path;
    this.headers = headers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SuperRequest(SuperRequest other) {
    if (other.isSetPath()) {
      this.path = other.path;
    }
    if (other.isSetHeaders()) {
      Map<String,String> __this__headers = new HashMap<String,String>(other.headers);
      this.headers = __this__headers;
    }
    if (other.isSetBody()) {
      this.body = org.apache.thrift.TBaseHelper.copyBinary(other.body);
    }
  }

  public SuperRequest deepCopy() {
    return new SuperRequest(this);
  }

  @Override
  public void clear() {
    this.path = null;
    this.headers = null;
    this.body = null;
  }

  public String getPath() {
    return this.path;
  }

  public SuperRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public int getHeadersSize() {
    return (this.headers == null) ? 0 : this.headers.size();
  }

  public void putToHeaders(String key, String val) {
    if (this.headers == null) {
      this.headers = new HashMap<String,String>();
    }
    this.headers.put(key, val);
  }

  public Map<String,String> getHeaders() {
    return this.headers;
  }

  public SuperRequest setHeaders(Map<String,String> headers) {
    this.headers = headers;
    return this;
  }

  public void unsetHeaders() {
    this.headers = null;
  }

  /** Returns true if field headers is set (has been assigned a value) and false otherwise */
  public boolean isSetHeaders() {
    return this.headers != null;
  }

  public void setHeadersIsSet(boolean value) {
    if (!value) {
      this.headers = null;
    }
  }

  public byte[] getBody() {
    setBody(org.apache.thrift.TBaseHelper.rightSize(body));
    return body == null ? null : body.array();
  }

  public ByteBuffer bufferForBody() {
    return org.apache.thrift.TBaseHelper.copyBinary(body);
  }

  public SuperRequest setBody(byte[] body) {
    this.body = body == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(body, body.length));
    return this;
  }

  public SuperRequest setBody(ByteBuffer body) {
    this.body = org.apache.thrift.TBaseHelper.copyBinary(body);
    return this;
  }

  public void unsetBody() {
    this.body = null;
  }

  /** Returns true if field body is set (has been assigned a value) and false otherwise */
  public boolean isSetBody() {
    return this.body != null;
  }

  public void setBodyIsSet(boolean value) {
    if (!value) {
      this.body = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case HEADERS:
      if (value == null) {
        unsetHeaders();
      } else {
        setHeaders((Map<String,String>)value);
      }
      break;

    case BODY:
      if (value == null) {
        unsetBody();
      } else {
        setBody((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PATH:
      return getPath();

    case HEADERS:
      return getHeaders();

    case BODY:
      return getBody();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PATH:
      return isSetPath();
    case HEADERS:
      return isSetHeaders();
    case BODY:
      return isSetBody();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SuperRequest)
      return this.equals((SuperRequest)that);
    return false;
  }

  public boolean equals(SuperRequest that) {
    if (that == null)
      return false;

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_headers = true && this.isSetHeaders();
    boolean that_present_headers = true && that.isSetHeaders();
    if (this_present_headers || that_present_headers) {
      if (!(this_present_headers && that_present_headers))
        return false;
      if (!this.headers.equals(that.headers))
        return false;
    }

    boolean this_present_body = true && this.isSetBody();
    boolean that_present_body = true && that.isSetBody();
    if (this_present_body || that_present_body) {
      if (!(this_present_body && that_present_body))
        return false;
      if (!this.body.equals(that.body))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_path = true && (isSetPath());
    list.add(present_path);
    if (present_path)
      list.add(path);

    boolean present_headers = true && (isSetHeaders());
    list.add(present_headers);
    if (present_headers)
      list.add(headers);

    boolean present_body = true && (isSetBody());
    list.add(present_body);
    if (present_body)
      list.add(body);

    return list.hashCode();
  }

  @Override
  public int compareTo(SuperRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeaders()).compareTo(other.isSetHeaders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeaders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headers, other.headers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBody()).compareTo(other.isSetBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.body, other.body);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SuperRequest(");
    boolean first = true;

    sb.append("path:");
    if (this.path == null) {
      sb.append("null");
    } else {
      sb.append(this.path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("headers:");
    if (this.headers == null) {
      sb.append("null");
    } else {
      sb.append(this.headers);
    }
    first = false;
    if (isSetBody()) {
      if (!first) sb.append(", ");
      sb.append("body:");
      if (this.body == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.body, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SuperRequestStandardSchemeFactory implements SchemeFactory {
    public SuperRequestStandardScheme getScheme() {
      return new SuperRequestStandardScheme();
    }
  }

  private static class SuperRequestStandardScheme extends StandardScheme<SuperRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SuperRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HEADERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map10 = iprot.readMapBegin();
                struct.headers = new HashMap<String,String>(2*_map10.size);
                String _key11;
                String _val12;
                for (int _i13 = 0; _i13 < _map10.size; ++_i13)
                {
                  _key11 = iprot.readString();
                  _val12 = iprot.readString();
                  struct.headers.put(_key11, _val12);
                }
                iprot.readMapEnd();
              }
              struct.setHeadersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BODY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.body = iprot.readBinary();
              struct.setBodyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SuperRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.path != null) {
        oprot.writeFieldBegin(PATH_FIELD_DESC);
        oprot.writeString(struct.path);
        oprot.writeFieldEnd();
      }
      if (struct.headers != null) {
        oprot.writeFieldBegin(HEADERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.headers.size()));
          for (Map.Entry<String, String> _iter14 : struct.headers.entrySet())
          {
            oprot.writeString(_iter14.getKey());
            oprot.writeString(_iter14.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.body != null) {
        if (struct.isSetBody()) {
          oprot.writeFieldBegin(BODY_FIELD_DESC);
          oprot.writeBinary(struct.body);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SuperRequestTupleSchemeFactory implements SchemeFactory {
    public SuperRequestTupleScheme getScheme() {
      return new SuperRequestTupleScheme();
    }
  }

  private static class SuperRequestTupleScheme extends TupleScheme<SuperRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SuperRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPath()) {
        optionals.set(0);
      }
      if (struct.isSetHeaders()) {
        optionals.set(1);
      }
      if (struct.isSetBody()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPath()) {
        oprot.writeString(struct.path);
      }
      if (struct.isSetHeaders()) {
        {
          oprot.writeI32(struct.headers.size());
          for (Map.Entry<String, String> _iter15 : struct.headers.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            oprot.writeString(_iter15.getValue());
          }
        }
      }
      if (struct.isSetBody()) {
        oprot.writeBinary(struct.body);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SuperRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.path = iprot.readString();
        struct.setPathIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.headers = new HashMap<String,String>(2*_map16.size);
          String _key17;
          String _val18;
          for (int _i19 = 0; _i19 < _map16.size; ++_i19)
          {
            _key17 = iprot.readString();
            _val18 = iprot.readString();
            struct.headers.put(_key17, _val18);
          }
        }
        struct.setHeadersIsSet(true);
      }
      if (incoming.get(2)) {
        struct.body = iprot.readBinary();
        struct.setBodyIsSet(true);
      }
    }
  }

}
