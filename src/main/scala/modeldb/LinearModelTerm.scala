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


object LinearModelTerm extends ValidatingThriftStructCodec3[LinearModelTerm] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("LinearModelTerm")
  val CoefficientField: TField = new TField("coefficient", TType.DOUBLE, 1)
  val CoefficientFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val TStatField: TField = new TField("tStat", TType.DOUBLE, 2)
  val TStatFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val StdErrField: TField = new TField("stdErr", TType.DOUBLE, 3)
  val StdErrFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]
  val PValueField: TField = new TField("pValue", TType.DOUBLE, 4)
  val PValueFieldManifest: Manifest[Double] = implicitly[Manifest[Double]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      CoefficientField,
      false,
      false,
      CoefficientFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      TStatField,
      true,
      false,
      TStatFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      StdErrField,
      true,
      false,
      StdErrFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      PValueField,
      true,
      false,
      PValueFieldManifest,
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
  def validate(_item: LinearModelTerm): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: LinearModelTerm): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.coefficient)
    buf ++= validateField(item.tStat)
    buf ++= validateField(item.stdErr)
    buf ++= validateField(item.pValue)
    buf.toList
  }

  def withoutPassthroughFields(original: LinearModelTerm): LinearModelTerm =
    new Immutable(
      coefficient =
        {
          val field = original.coefficient
          field
        },
      tStat =
        {
          val field = original.tStat
          field.map { field =>
            field
          }
        },
      stdErr =
        {
          val field = original.stdErr
          field.map { field =>
            field
          }
        },
      pValue =
        {
          val field = original.pValue
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: LinearModelTerm, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): LinearModelTerm = {

    var coefficient: Double = 0.0
    var tStatOffset: Int = -1
    var stdErrOffset: Int = -1
    var pValueOffset: Int = -1

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
              case TType.DOUBLE =>
    
                coefficient = readCoefficientValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'coefficient' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.DOUBLE =>
                tStatOffset = _iprot.offsetSkipDouble
    
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'tStat' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.DOUBLE =>
                stdErrOffset = _iprot.offsetSkipDouble
    
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'stdErr' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.DOUBLE =>
                pValueOffset = _iprot.offsetSkipDouble
    
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'pValue' (expected=%s, actual=%s).".format(
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
      coefficient,
      tStatOffset,
      stdErrOffset,
      pValueOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): LinearModelTerm =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[modeldb] def eagerDecode(_iprot: TProtocol): LinearModelTerm = {
    var coefficient: Double = 0.0
    var tStat: _root_.scala.Option[Double] = _root_.scala.None
    var stdErr: _root_.scala.Option[Double] = _root_.scala.None
    var pValue: _root_.scala.Option[Double] = _root_.scala.None
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
              case TType.DOUBLE =>
                coefficient = readCoefficientValue(_iprot)
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'coefficient' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.DOUBLE =>
                tStat = _root_.scala.Some(readTStatValue(_iprot))
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'tStat' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.DOUBLE =>
                stdErr = _root_.scala.Some(readStdErrValue(_iprot))
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'stdErr' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.DOUBLE =>
                pValue = _root_.scala.Some(readPValueValue(_iprot))
              case _actualType =>
                val _expectedType = TType.DOUBLE
                throw new TProtocolException(
                  "Received wrong type for field 'pValue' (expected=%s, actual=%s).".format(
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
      coefficient,
      tStat,
      stdErr,
      pValue,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    coefficient: Double,
    tStat: _root_.scala.Option[Double] = _root_.scala.None,
    stdErr: _root_.scala.Option[Double] = _root_.scala.None,
    pValue: _root_.scala.Option[Double] = _root_.scala.None
  ): LinearModelTerm =
    new Immutable(
      coefficient,
      tStat,
      stdErr,
      pValue
    )

  def unapply(_item: LinearModelTerm): _root_.scala.Option[_root_.scala.Tuple4[Double, Option[Double], Option[Double], Option[Double]]] = _root_.scala.Some(_item.toTuple)


  @inline private[modeldb] def readCoefficientValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeCoefficientField(coefficient_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(CoefficientField)
    writeCoefficientValue(coefficient_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeCoefficientValue(coefficient_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(coefficient_item)
  }

  @inline private[modeldb] def readTStatValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeTStatField(tStat_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TStatField)
    writeTStatValue(tStat_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTStatValue(tStat_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(tStat_item)
  }

  @inline private[modeldb] def readStdErrValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writeStdErrField(stdErr_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(StdErrField)
    writeStdErrValue(stdErr_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeStdErrValue(stdErr_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(stdErr_item)
  }

  @inline private[modeldb] def readPValueValue(_iprot: TProtocol): Double = {
    _iprot.readDouble()
  }

  @inline private def writePValueField(pValue_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PValueField)
    writePValueValue(pValue_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePValueValue(pValue_item: Double, _oprot: TProtocol): Unit = {
    _oprot.writeDouble(pValue_item)
  }


  object Immutable extends ThriftStructCodec3[LinearModelTerm] {
    override def encode(_item: LinearModelTerm, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): LinearModelTerm = LinearModelTerm.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[LinearModelTerm] = LinearModelTerm.metaData
  }

  /**
   * The default read-only implementation of LinearModelTerm.  You typically should not need to
   * directly reference this class; instead, use the LinearModelTerm.apply method to construct
   * new instances.
   */
  class Immutable(
      val coefficient: Double,
      val tStat: _root_.scala.Option[Double],
      val stdErr: _root_.scala.Option[Double],
      val pValue: _root_.scala.Option[Double],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends LinearModelTerm {
    def this(
      coefficient: Double,
      tStat: _root_.scala.Option[Double] = _root_.scala.None,
      stdErr: _root_.scala.Option[Double] = _root_.scala.None,
      pValue: _root_.scala.Option[Double] = _root_.scala.None
    ) = this(
      coefficient,
      tStat,
      stdErr,
      pValue,
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
      val coefficient: Double,
      tStatOffset: Int,
      stdErrOffset: Int,
      pValueOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends LinearModelTerm {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val tStat: _root_.scala.Option[Double] =
      if (tStatOffset == -1)
        None
      else {
        Some(_proto.decodeDouble(_buf, tStatOffset))
      }
    lazy val stdErr: _root_.scala.Option[Double] =
      if (stdErrOffset == -1)
        None
      else {
        Some(_proto.decodeDouble(_buf, stdErrOffset))
      }
    lazy val pValue: _root_.scala.Option[Double] =
      if (pValueOffset == -1)
        None
      else {
        Some(_proto.decodeDouble(_buf, pValueOffset))
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
   * This Proxy trait allows you to extend the LinearModelTerm trait with additional state or
   * behavior and implement the read-only methods from LinearModelTerm using an underlying
   * instance.
   */
  trait Proxy extends LinearModelTerm {
    protected def _underlying_LinearModelTerm: LinearModelTerm
    override def coefficient: Double = _underlying_LinearModelTerm.coefficient
    override def tStat: _root_.scala.Option[Double] = _underlying_LinearModelTerm.tStat
    override def stdErr: _root_.scala.Option[Double] = _underlying_LinearModelTerm.stdErr
    override def pValue: _root_.scala.Option[Double] = _underlying_LinearModelTerm.pValue
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_LinearModelTerm._passthroughFields
  }
}

/**
 * Prefer the companion object's [[modeldb.LinearModelTerm.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait LinearModelTerm
  extends ThriftStruct
  with _root_.scala.Product4[Double, Option[Double], Option[Double], Option[Double]]
  with ValidatingThriftStruct[LinearModelTerm]
  with java.io.Serializable
{
  import LinearModelTerm._

  def coefficient: Double
  def tStat: _root_.scala.Option[Double]
  def stdErr: _root_.scala.Option[Double]
  def pValue: _root_.scala.Option[Double]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: Double = coefficient
  def _2: _root_.scala.Option[Double] = tStat
  def _3: _root_.scala.Option[Double] = stdErr
  def _4: _root_.scala.Option[Double] = pValue

  def toTuple: _root_.scala.Tuple4[Double, Option[Double], Option[Double], Option[Double]] = {
    (
      coefficient,
      tStat,
      stdErr,
      pValue
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
                writeCoefficientValue(coefficient, _oprot)
                _root_.scala.Some(LinearModelTerm.CoefficientField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (tStat.isDefined) {
                writeTStatValue(tStat.get, _oprot)
                _root_.scala.Some(LinearModelTerm.TStatField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (stdErr.isDefined) {
                writeStdErrValue(stdErr.get, _oprot)
                _root_.scala.Some(LinearModelTerm.StdErrField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (pValue.isDefined) {
                writePValueValue(pValue.get, _oprot)
                _root_.scala.Some(LinearModelTerm.PValueField)
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
  def setField(_blob: TFieldBlob): LinearModelTerm = {
    var coefficient: Double = this.coefficient
    var tStat: _root_.scala.Option[Double] = this.tStat
    var stdErr: _root_.scala.Option[Double] = this.stdErr
    var pValue: _root_.scala.Option[Double] = this.pValue
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        coefficient = readCoefficientValue(_blob.read)
      case 2 =>
        tStat = _root_.scala.Some(readTStatValue(_blob.read))
      case 3 =>
        stdErr = _root_.scala.Some(readStdErrValue(_blob.read))
      case 4 =>
        pValue = _root_.scala.Some(readPValueValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      coefficient,
      tStat,
      stdErr,
      pValue,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): LinearModelTerm = {
    var coefficient: Double = this.coefficient
    var tStat: _root_.scala.Option[Double] = this.tStat
    var stdErr: _root_.scala.Option[Double] = this.stdErr
    var pValue: _root_.scala.Option[Double] = this.pValue

    _fieldId match {
      case 1 =>
        coefficient = 0.0
      case 2 =>
        tStat = _root_.scala.None
      case 3 =>
        stdErr = _root_.scala.None
      case 4 =>
        pValue = _root_.scala.None
      case _ =>
    }
    new Immutable(
      coefficient,
      tStat,
      stdErr,
      pValue,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetCoefficient: LinearModelTerm = unsetField(1)

  def unsetTStat: LinearModelTerm = unsetField(2)

  def unsetStdErr: LinearModelTerm = unsetField(3)

  def unsetPValue: LinearModelTerm = unsetField(4)


  override def write(_oprot: TProtocol): Unit = {
    LinearModelTerm.validate(this)
    _oprot.writeStructBegin(Struct)
    writeCoefficientField(coefficient, _oprot)
    if (tStat.isDefined) writeTStatField(tStat.get, _oprot)
    if (stdErr.isDefined) writeStdErrField(stdErr.get, _oprot)
    if (pValue.isDefined) writePValueField(pValue.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    coefficient: Double = this.coefficient,
    tStat: _root_.scala.Option[Double] = this.tStat,
    stdErr: _root_.scala.Option[Double] = this.stdErr,
    pValue: _root_.scala.Option[Double] = this.pValue,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): LinearModelTerm =
    new Immutable(
      coefficient,
      tStat,
      stdErr,
      pValue,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[LinearModelTerm]

  private def _equals(x: LinearModelTerm, y: LinearModelTerm): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[LinearModelTerm])

  override def hashCode: Int = {
    var hash = _root_.scala.runtime.ScalaRunTime._hashCode(this)
    hash
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 4

  override def productElement(n: Int): Any = n match {
    case 0 => this.coefficient
    case 1 => this.tStat
    case 2 => this.stdErr
    case 3 => this.pValue
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "LinearModelTerm"

  def _codec: ValidatingThriftStructCodec3[LinearModelTerm] = LinearModelTerm
}

