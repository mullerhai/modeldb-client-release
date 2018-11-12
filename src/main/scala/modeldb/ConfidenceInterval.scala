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


object ConfidenceInterval extends ValidatingThriftStructCodec3[ConfidenceInterval] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("ConfidenceInterval")
  val FeatureIndexField: TField = new TField("featureIndex", TType.I32, 1)
  val FeatureIndexFieldManifest: Manifest[Int] = implicitly[Manifest[Int]]
  val LowField: TField = new TField("low", TType.DOUBLE, 2)
  val LowFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val HighField: TField = new TField("high", TType.DOUBLE, 3)
  val HighFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      FeatureIndexField,
      false,
      false,
      FeatureIndexFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      LowField,
      false,
      false,
      LowFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      HighField,
      false,
      false,
      HighFieldManifest,
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
  def validate(_item: ConfidenceInterval): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: ConfidenceInterval): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.featureIndex)
    buf ++= validateField(item.low)
    buf ++= validateField(item.high)
    buf.toList
  }

  def withoutPassthroughFields(original: ConfidenceInterval): ConfidenceInterval =
    new Immutable(
      featureIndex =
        {
          val field = original.featureIndex
          field
        },
      low =
        {
          val field = original.low
          field
        },
      high =
        {
          val field = original.high
          field
        }
    )

  override def encode(_item: ConfidenceInterval, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): ConfidenceInterval = {

    var featureIndex: Int = 0
    var low: Double = 0.0
    var high: Double = 0.0

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
              case TType.I32 =>
    
                featureIndex = readFeatureIndexValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'featureIndex' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.DOUBLE =>
    
                low = readLowValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'low' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.DOUBLE =>
    
                high = readHighValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'high' (expected=%s, actual=%s).".format(
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
      featureIndex,
      low,
      high,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): ConfidenceInterval =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): ConfidenceInterval = {
    var featureIndex: Int = 0
    var low: Double = 0.0
    var high: Double = 0.0
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
              case TType.I32 =>
                featureIndex = readFeatureIndexValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'featureIndex' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.DOUBLE =>
                low = readLowValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'low' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.DOUBLE =>
                high = readHighValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'high' (expected=%s, actual=%s).".format(
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
      featureIndex,
      low,
      high,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    featureIndex: Int,
    low: Double,
    high: Double
  ): ConfidenceInterval =
    new Immutable(
      featureIndex,
      low,
      high
    )

  def unapply(_item: ConfidenceInterval): _root_.scala.Option[_root_.scala.Tuple3[Int, Double, Double]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readFeatureIndexValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeFeatureIndexField(featureIndex_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(FeatureIndexField)
    writeFeatureIndexValue(featureIndex_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeFeatureIndexValue(featureIndex_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(featureIndex_item)
  }

  @inline private[modeldb] def readLowValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeLowField(low_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(LowField)
    writeLowValue(low_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeLowValue(low_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(low_item)
  }

  @inline private[modeldb] def readHighValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeHighField(high_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(HighField)
    writeHighValue(high_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeHighValue(high_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(high_item)
  }


  object Immutable extends ThriftStructCodec3[ConfidenceInterval] {
    override def encode(_item: ConfidenceInterval, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): ConfidenceInterval = ConfidenceInterval.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[ConfidenceInterval] = ConfidenceInterval.metaData
  }

  /**
   * The default read-only implementation of ConfidenceInterval.  You typically should not need to
   * directly reference this class; instead, use the ConfidenceInterval.apply method to construct
   * new instances.
   */
  class Immutable(
      val featureIndex: Int,
      val low: Double,
      val high: Double,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ConfidenceInterval {
    def this(
      featureIndex: Int,
      low: Double,
      high: Double
    ) = this(
      featureIndex,
      low,
      high,
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
      val featureIndex: Int,
      val low: Double,
      val high: Double,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends ConfidenceInterval {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
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
   * This Proxy trait allows you to extend the ConfidenceInterval trait with additional state or
   * behavior and implement the read-only methods from ConfidenceInterval using an underlying
   * instance.
   */
  trait Proxy extends ConfidenceInterval {
    protected def _underlying_ConfidenceInterval: ConfidenceInterval
    override def featureIndex: Int = _underlying_ConfidenceInterval.featureIndex
    override def low: Double = _underlying_ConfidenceInterval.low
    override def high: Double = _underlying_ConfidenceInterval.high
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_ConfidenceInterval._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.ConfidenceInterval.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait ConfidenceInterval
  extends ThriftStruct
  with _root_.scala.Product3[Int, Double, Double]
  with ValidatingThriftStruct[ConfidenceInterval]
  with java.io.Serializable
{
  import ConfidenceInterval._

  def featureIndex: Int
  def low: Double
  def high: Double

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: Int = featureIndex
  def _2: Double = low
  def _3: Double = high

  def toTuple: _root_.scala.Tuple3[Int, Double, Double] = {
    (
      featureIndex,
      low,
      high
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
              if (true) {
                writeFeatureIndexValue(featureIndex, _oprot)
                _root_.scala.Some(ConfidenceInterval.FeatureIndexField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (true) {
                writeLowValue(low, _oprot)
                _root_.scala.Some(ConfidenceInterval.LowField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (true) {
                writeHighValue(high, _oprot)
                _root_.scala.Some(ConfidenceInterval.HighField)
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
  def setField(_blob: TFieldBlob): ConfidenceInterval = {
    var featureIndex: Int = this.featureIndex
    var low: Double = this.low
    var high: Double = this.high
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        featureIndex = readFeatureIndexValue(_blob.read)
      case 2 =>
        low = readLowValue(_blob.read)
      case 3 =>
        high = readHighValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      featureIndex,
      low,
      high,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): ConfidenceInterval = {
    var featureIndex: Int = this.featureIndex
    var low: Double = this.low
    var high: Double = this.high

    _fieldId match {
      case 1 =>
        featureIndex = 0
      case 2 =>
        low = 0.0
      case 3 =>
        high = 0.0
      case _ =>
    }
    new Immutable(
      featureIndex,
      low,
      high,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetFeatureIndex: ConfidenceInterval = unsetField(1)

  def unsetLow: ConfidenceInterval = unsetField(2)

  def unsetHigh: ConfidenceInterval = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    ConfidenceInterval.validate(this)
    _oprot.writeStructBegin(Struct)
    writeFeatureIndexField(featureIndex, _oprot)
    writeLowField(low, _oprot)
    writeHighField(high, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    featureIndex: Int = this.featureIndex,
    low: Double = this.low,
    high: Double = this.high,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): ConfidenceInterval =
    new Immutable(
      featureIndex,
      low,
      high,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[ConfidenceInterval]

  private def _equals(x: ConfidenceInterval, y: ConfidenceInterval): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[ConfidenceInterval])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.featureIndex
    case 1 => this.low
    case 2 => this.high
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "ConfidenceInterval"

  def _codec: ValidatingThriftStructCodec3[ConfidenceInterval] = ConfidenceInterval
}

