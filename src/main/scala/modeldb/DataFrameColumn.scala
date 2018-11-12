/**
 * Generated by Scrooge
 *   version: 18.10.0
 *   rev: dda071e1412b53f4bfdebc19e474f584e475d475
 *   built at: 20181018-174244
 */
package modeldb

import com.twitter.io.Buf
import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob,
  ThriftException,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUtil,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport, TIOStreamTransport}
import java.io.ByteArrayInputStream
import java.nio.ByteBuffer
import java.util.Arrays
import java.util.concurrent.atomic.AtomicInteger
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object DataFrameColumn extends ValidatingThriftStructCodec3[DataFrameColumn] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("DataFrameColumn")
  val NameField: TField = new TField("name", TType.STRING, 1)
  val NameFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val TypeField: TField = new TField("type", TType.STRING, 2)
  val TypeFieldManifest: Manifest[String] = implicitly[Manifest[String]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      NameField,
      false,
      false,
      NameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      TypeField,
      false,
      false,
      TypeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: DataFrameColumn): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: DataFrameColumn): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.name)
    buf ++= validateField(item.`type`)
    buf.toList
  }

  def withoutPassthroughFields(original: DataFrameColumn): DataFrameColumn =
    new Immutable(
      name =
        {
          val field = original.name
          field
        },
      `type` =
        {
          val field = original.`type`
          field
        }
    )

  override def encode(_item: DataFrameColumn, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): DataFrameColumn = {

    var nameOffset: Int = -1
    var typeOffset: Int = -1

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                nameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'name' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                typeOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field '`type`' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      nameOffset,
      typeOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): DataFrameColumn =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): DataFrameColumn = {
    var name: String = null
    var `type`: String = null
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                name = readNameValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'name' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                `type` = readTypeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field '`type`' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      name,
      `type`,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    name: String,
    `type`: String
  ): DataFrameColumn =
    new Immutable(
      name,
      `type`
    )

  def unapply(_item: DataFrameColumn): _root_.scala.Option[_root_.scala.Tuple2[String, String]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeNameField(name_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(NameField)
    writeNameValue(name_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeNameValue(name_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(name_item)
  }

  @inline private[modeldb] def readTypeValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeTypeField(type_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TypeField)
    writeTypeValue(type_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTypeValue(type_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(type_item)
  }


  object Immutable extends ThriftStructCodec3[DataFrameColumn] {
    override def encode(_item: DataFrameColumn, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): DataFrameColumn = DataFrameColumn.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[DataFrameColumn] = DataFrameColumn.metaData
  }

  /**
   * The default read-only implementation of DataFrameColumn.  You typically should not need to
   * directly reference this class; instead, use the DataFrameColumn.apply method to construct
   * new instances.
   */
  class Immutable(
      val name: String,
      val `type`: String,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends DataFrameColumn {
    def this(
      name: String,
      `type`: String
    ) = this(
      name,
      `type`,
      Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      nameOffset: Int,
      typeOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends DataFrameColumn {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val name: String =
      if (nameOffset == -1)
        null
      else {
        _proto.decodeString(_buf, nameOffset)
      }
    lazy val `type`: String =
      if (typeOffset == -1)
        null
      else {
        _proto.decodeString(_buf, typeOffset)
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the DataFrameColumn trait with additional state or
   * behavior and implement the read-only methods from DataFrameColumn using an underlying
   * instance.
   */
  trait Proxy extends DataFrameColumn {
    protected def _underlying_DataFrameColumn: DataFrameColumn
    override def name: String = _underlying_DataFrameColumn.name
    override def `type`: String = _underlying_DataFrameColumn.`type`
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_DataFrameColumn._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.DataFrameColumn.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait DataFrameColumn
  extends ThriftStruct
  with _root_.scala.Product2[String, String]
  with ValidatingThriftStruct[DataFrameColumn]
  with java.io.Serializable
{
  import DataFrameColumn._

  def name: String
  def `type`: String

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: String = name
  def _2: String = `type`

  def toTuple: _root_.scala.Tuple2[String, String] = {
    (
      name,
      `type`
    )
  }


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (name ne null) {
                writeNameValue(name, _oprot)
                _root_.scala.Some(DataFrameColumn.NameField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (`type` ne null) {
                writeTypeValue(`type`, _oprot)
                _root_.scala.Some(DataFrameColumn.TypeField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): DataFrameColumn = {
    var name: String = this.name
    var `type`: String = this.`type`
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        name = readNameValue(_blob.read)
      case 2 =>
        `type` = readTypeValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      name,
      `type`,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): DataFrameColumn = {
    var name: String = this.name
    var `type`: String = this.`type`

    _fieldId match {
      case 1 =>
        name = null
      case 2 =>
        `type` = null
      case _ =>
    }
    new Immutable(
      name,
      `type`,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetName: DataFrameColumn = unsetField(1)

  def unsetType: DataFrameColumn = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    DataFrameColumn.validate(this)
    _oprot.writeStructBegin(Struct)
    if (name ne null) writeNameField(name, _oprot)
    if (`type` ne null) writeTypeField(`type`, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    name: String = this.name,
    `type`: String = this.`type`,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): DataFrameColumn =
    new Immutable(
      name,
      `type`,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[DataFrameColumn]

  private def _equals(x: DataFrameColumn, y: DataFrameColumn): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[DataFrameColumn])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.name
    case 1 => this.`type`
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "DataFrameColumn"

  def _codec: ValidatingThriftStructCodec3[DataFrameColumn] = DataFrameColumn
}
