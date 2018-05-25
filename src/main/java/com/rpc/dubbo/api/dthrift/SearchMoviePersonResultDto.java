/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rpc.dubbo.api.dthrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-04-05")
public class SearchMoviePersonResultDto implements org.apache.thrift.TBase<SearchMoviePersonResultDto, SearchMoviePersonResultDto._Fields>, java.io.Serializable, Cloneable, Comparable<SearchMoviePersonResultDto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SearchMoviePersonResultDto");

  private static final org.apache.thrift.protocol.TField START_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("startIndex", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_MORE_FIELD_DESC = new org.apache.thrift.protocol.TField("hasMore", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalCount", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField MOVIE_PERSON_DATA_DTO_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("moviePersonDataDtoList", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SearchMoviePersonResultDtoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SearchMoviePersonResultDtoTupleSchemeFactory();

  public int startIndex; // optional
  public int hasMore; // optional
  public int totalCount; // optional
  public java.util.List<MoviePersonDataDto> moviePersonDataDtoList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_INDEX((short)1, "startIndex"),
    HAS_MORE((short)2, "hasMore"),
    TOTAL_COUNT((short)3, "totalCount"),
    MOVIE_PERSON_DATA_DTO_LIST((short)4, "moviePersonDataDtoList");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // START_INDEX
          return START_INDEX;
        case 2: // HAS_MORE
          return HAS_MORE;
        case 3: // TOTAL_COUNT
          return TOTAL_COUNT;
        case 4: // MOVIE_PERSON_DATA_DTO_LIST
          return MOVIE_PERSON_DATA_DTO_LIST;
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
  private static final int __STARTINDEX_ISSET_ID = 0;
  private static final int __HASMORE_ISSET_ID = 1;
  private static final int __TOTALCOUNT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.START_INDEX,_Fields.HAS_MORE,_Fields.TOTAL_COUNT,_Fields.MOVIE_PERSON_DATA_DTO_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_INDEX, new org.apache.thrift.meta_data.FieldMetaData("startIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HAS_MORE, new org.apache.thrift.meta_data.FieldMetaData("hasMore", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MOVIE_PERSON_DATA_DTO_LIST, new org.apache.thrift.meta_data.FieldMetaData("moviePersonDataDtoList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MoviePersonDataDto.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SearchMoviePersonResultDto.class, metaDataMap);
  }

  public SearchMoviePersonResultDto() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SearchMoviePersonResultDto(SearchMoviePersonResultDto other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startIndex = other.startIndex;
    this.hasMore = other.hasMore;
    this.totalCount = other.totalCount;
    if (other.isSetMoviePersonDataDtoList()) {
      java.util.List<MoviePersonDataDto> __this__moviePersonDataDtoList = new java.util.ArrayList<MoviePersonDataDto>(other.moviePersonDataDtoList.size());
      for (MoviePersonDataDto other_element : other.moviePersonDataDtoList) {
        __this__moviePersonDataDtoList.add(new MoviePersonDataDto(other_element));
      }
      this.moviePersonDataDtoList = __this__moviePersonDataDtoList;
    }
  }

  public SearchMoviePersonResultDto deepCopy() {
    return new SearchMoviePersonResultDto(this);
  }

  @Override
  public void clear() {
    setStartIndexIsSet(false);
    this.startIndex = 0;
    setHasMoreIsSet(false);
    this.hasMore = 0;
    setTotalCountIsSet(false);
    this.totalCount = 0;
    this.moviePersonDataDtoList = null;
  }

  public int getStartIndex() {
    return this.startIndex;
  }

  public SearchMoviePersonResultDto setStartIndex(int startIndex) {
    this.startIndex = startIndex;
    setStartIndexIsSet(true);
    return this;
  }

  public void unsetStartIndex() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTINDEX_ISSET_ID);
  }

  /** Returns true if field startIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetStartIndex() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTINDEX_ISSET_ID);
  }

  public void setStartIndexIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTINDEX_ISSET_ID, value);
  }

  public int getHasMore() {
    return this.hasMore;
  }

  public SearchMoviePersonResultDto setHasMore(int hasMore) {
    this.hasMore = hasMore;
    setHasMoreIsSet(true);
    return this;
  }

  public void unsetHasMore() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASMORE_ISSET_ID);
  }

  /** Returns true if field hasMore is set (has been assigned a value) and false otherwise */
  public boolean isSetHasMore() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASMORE_ISSET_ID);
  }

  public void setHasMoreIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASMORE_ISSET_ID, value);
  }

  public int getTotalCount() {
    return this.totalCount;
  }

  public SearchMoviePersonResultDto setTotalCount(int totalCount) {
    this.totalCount = totalCount;
    setTotalCountIsSet(true);
    return this;
  }

  public void unsetTotalCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID);
  }

  /** Returns true if field totalCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID);
  }

  public void setTotalCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID, value);
  }

  public int getMoviePersonDataDtoListSize() {
    return (this.moviePersonDataDtoList == null) ? 0 : this.moviePersonDataDtoList.size();
  }

  public java.util.Iterator<MoviePersonDataDto> getMoviePersonDataDtoListIterator() {
    return (this.moviePersonDataDtoList == null) ? null : this.moviePersonDataDtoList.iterator();
  }

  public void addToMoviePersonDataDtoList(MoviePersonDataDto elem) {
    if (this.moviePersonDataDtoList == null) {
      this.moviePersonDataDtoList = new java.util.ArrayList<MoviePersonDataDto>();
    }
    this.moviePersonDataDtoList.add(elem);
  }

  public java.util.List<MoviePersonDataDto> getMoviePersonDataDtoList() {
    return this.moviePersonDataDtoList;
  }

  public SearchMoviePersonResultDto setMoviePersonDataDtoList(java.util.List<MoviePersonDataDto> moviePersonDataDtoList) {
    this.moviePersonDataDtoList = moviePersonDataDtoList;
    return this;
  }

  public void unsetMoviePersonDataDtoList() {
    this.moviePersonDataDtoList = null;
  }

  /** Returns true if field moviePersonDataDtoList is set (has been assigned a value) and false otherwise */
  public boolean isSetMoviePersonDataDtoList() {
    return this.moviePersonDataDtoList != null;
  }

  public void setMoviePersonDataDtoListIsSet(boolean value) {
    if (!value) {
      this.moviePersonDataDtoList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_INDEX:
      if (value == null) {
        unsetStartIndex();
      } else {
        setStartIndex((Integer)value);
      }
      break;

    case HAS_MORE:
      if (value == null) {
        unsetHasMore();
      } else {
        setHasMore((Integer)value);
      }
      break;

    case TOTAL_COUNT:
      if (value == null) {
        unsetTotalCount();
      } else {
        setTotalCount((Integer)value);
      }
      break;

    case MOVIE_PERSON_DATA_DTO_LIST:
      if (value == null) {
        unsetMoviePersonDataDtoList();
      } else {
        setMoviePersonDataDtoList((java.util.List<MoviePersonDataDto>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_INDEX:
      return getStartIndex();

    case HAS_MORE:
      return getHasMore();

    case TOTAL_COUNT:
      return getTotalCount();

    case MOVIE_PERSON_DATA_DTO_LIST:
      return getMoviePersonDataDtoList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_INDEX:
      return isSetStartIndex();
    case HAS_MORE:
      return isSetHasMore();
    case TOTAL_COUNT:
      return isSetTotalCount();
    case MOVIE_PERSON_DATA_DTO_LIST:
      return isSetMoviePersonDataDtoList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SearchMoviePersonResultDto)
      return this.equals((SearchMoviePersonResultDto)that);
    return false;
  }

  public boolean equals(SearchMoviePersonResultDto that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_startIndex = true && this.isSetStartIndex();
    boolean that_present_startIndex = true && that.isSetStartIndex();
    if (this_present_startIndex || that_present_startIndex) {
      if (!(this_present_startIndex && that_present_startIndex))
        return false;
      if (this.startIndex != that.startIndex)
        return false;
    }

    boolean this_present_hasMore = true && this.isSetHasMore();
    boolean that_present_hasMore = true && that.isSetHasMore();
    if (this_present_hasMore || that_present_hasMore) {
      if (!(this_present_hasMore && that_present_hasMore))
        return false;
      if (this.hasMore != that.hasMore)
        return false;
    }

    boolean this_present_totalCount = true && this.isSetTotalCount();
    boolean that_present_totalCount = true && that.isSetTotalCount();
    if (this_present_totalCount || that_present_totalCount) {
      if (!(this_present_totalCount && that_present_totalCount))
        return false;
      if (this.totalCount != that.totalCount)
        return false;
    }

    boolean this_present_moviePersonDataDtoList = true && this.isSetMoviePersonDataDtoList();
    boolean that_present_moviePersonDataDtoList = true && that.isSetMoviePersonDataDtoList();
    if (this_present_moviePersonDataDtoList || that_present_moviePersonDataDtoList) {
      if (!(this_present_moviePersonDataDtoList && that_present_moviePersonDataDtoList))
        return false;
      if (!this.moviePersonDataDtoList.equals(that.moviePersonDataDtoList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStartIndex()) ? 131071 : 524287);
    if (isSetStartIndex())
      hashCode = hashCode * 8191 + startIndex;

    hashCode = hashCode * 8191 + ((isSetHasMore()) ? 131071 : 524287);
    if (isSetHasMore())
      hashCode = hashCode * 8191 + hasMore;

    hashCode = hashCode * 8191 + ((isSetTotalCount()) ? 131071 : 524287);
    if (isSetTotalCount())
      hashCode = hashCode * 8191 + totalCount;

    hashCode = hashCode * 8191 + ((isSetMoviePersonDataDtoList()) ? 131071 : 524287);
    if (isSetMoviePersonDataDtoList())
      hashCode = hashCode * 8191 + moviePersonDataDtoList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SearchMoviePersonResultDto other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartIndex()).compareTo(other.isSetStartIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startIndex, other.startIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHasMore()).compareTo(other.isSetHasMore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasMore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasMore, other.hasMore);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalCount()).compareTo(other.isSetTotalCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalCount, other.totalCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMoviePersonDataDtoList()).compareTo(other.isSetMoviePersonDataDtoList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMoviePersonDataDtoList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.moviePersonDataDtoList, other.moviePersonDataDtoList);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SearchMoviePersonResultDto(");
    boolean first = true;

    if (isSetStartIndex()) {
      sb.append("startIndex:");
      sb.append(this.startIndex);
      first = false;
    }
    if (isSetHasMore()) {
      if (!first) sb.append(", ");
      sb.append("hasMore:");
      sb.append(this.hasMore);
      first = false;
    }
    if (isSetTotalCount()) {
      if (!first) sb.append(", ");
      sb.append("totalCount:");
      sb.append(this.totalCount);
      first = false;
    }
    if (isSetMoviePersonDataDtoList()) {
      if (!first) sb.append(", ");
      sb.append("moviePersonDataDtoList:");
      if (this.moviePersonDataDtoList == null) {
        sb.append("null");
      } else {
        sb.append(this.moviePersonDataDtoList);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SearchMoviePersonResultDtoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SearchMoviePersonResultDtoStandardScheme getScheme() {
      return new SearchMoviePersonResultDtoStandardScheme();
    }
  }

  private static class SearchMoviePersonResultDtoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SearchMoviePersonResultDto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SearchMoviePersonResultDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.startIndex = iprot.readI32();
              struct.setStartIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_MORE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.hasMore = iprot.readI32();
              struct.setHasMoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalCount = iprot.readI32();
              struct.setTotalCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MOVIE_PERSON_DATA_DTO_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.moviePersonDataDtoList = new java.util.ArrayList<MoviePersonDataDto>(_list8.size);
                MoviePersonDataDto _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new MoviePersonDataDto();
                  _elem9.read(iprot);
                  struct.moviePersonDataDtoList.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setMoviePersonDataDtoListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SearchMoviePersonResultDto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetStartIndex()) {
        oprot.writeFieldBegin(START_INDEX_FIELD_DESC);
        oprot.writeI32(struct.startIndex);
        oprot.writeFieldEnd();
      }
      if (struct.isSetHasMore()) {
        oprot.writeFieldBegin(HAS_MORE_FIELD_DESC);
        oprot.writeI32(struct.hasMore);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalCount()) {
        oprot.writeFieldBegin(TOTAL_COUNT_FIELD_DESC);
        oprot.writeI32(struct.totalCount);
        oprot.writeFieldEnd();
      }
      if (struct.moviePersonDataDtoList != null) {
        if (struct.isSetMoviePersonDataDtoList()) {
          oprot.writeFieldBegin(MOVIE_PERSON_DATA_DTO_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.moviePersonDataDtoList.size()));
            for (MoviePersonDataDto _iter11 : struct.moviePersonDataDtoList)
            {
              _iter11.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SearchMoviePersonResultDtoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SearchMoviePersonResultDtoTupleScheme getScheme() {
      return new SearchMoviePersonResultDtoTupleScheme();
    }
  }

  private static class SearchMoviePersonResultDtoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SearchMoviePersonResultDto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SearchMoviePersonResultDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStartIndex()) {
        optionals.set(0);
      }
      if (struct.isSetHasMore()) {
        optionals.set(1);
      }
      if (struct.isSetTotalCount()) {
        optionals.set(2);
      }
      if (struct.isSetMoviePersonDataDtoList()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStartIndex()) {
        oprot.writeI32(struct.startIndex);
      }
      if (struct.isSetHasMore()) {
        oprot.writeI32(struct.hasMore);
      }
      if (struct.isSetTotalCount()) {
        oprot.writeI32(struct.totalCount);
      }
      if (struct.isSetMoviePersonDataDtoList()) {
        {
          oprot.writeI32(struct.moviePersonDataDtoList.size());
          for (MoviePersonDataDto _iter12 : struct.moviePersonDataDtoList)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SearchMoviePersonResultDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.startIndex = iprot.readI32();
        struct.setStartIndexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hasMore = iprot.readI32();
        struct.setHasMoreIsSet(true);
      }
      if (incoming.get(2)) {
        struct.totalCount = iprot.readI32();
        struct.setTotalCountIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.moviePersonDataDtoList = new java.util.ArrayList<MoviePersonDataDto>(_list13.size);
          MoviePersonDataDto _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new MoviePersonDataDto();
            _elem14.read(iprot);
            struct.moviePersonDataDtoList.add(_elem14);
          }
        }
        struct.setMoviePersonDataDtoListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
